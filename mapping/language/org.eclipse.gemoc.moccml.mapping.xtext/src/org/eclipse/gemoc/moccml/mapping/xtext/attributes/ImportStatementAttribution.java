/**
 * <copyright>
 *
 * Copyright (c) 2010,2017 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: CompleteOCLDocumentAttribution.java,v 1.11 2011/05/21 19:04:14 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.internal.compatibility.EMF_2_9;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
//import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
//import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.pivot.internal.messages.PivotMessagesInternal;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.xtext.base.cs2as.ValidationDiagnostic;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.osgi.util.NLS;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;


public class ImportStatementAttribution extends AbstractAttribution// implements UnresolvedProxyMessageProvider
{
	public static final ImportStatementAttribution INSTANCE = new ImportStatementAttribution();

		private static class ImportAdapter extends AdapterImpl
		{
			private URI uri = null;
			private Element importedElement = null;
			private Throwable throwable = null;
		
			public ScopeView computeLookup(ImportStatement targetElement, EnvironmentView environmentView, ScopeView scopeView) {
				String name = environmentView.getName();
				if (name != null) {				// Looking for a specific name
					importModel(targetElement, environmentView);
					Element importedElement2 = importedElement;
					if (importedElement2 != null) {
						Resource importedResource = importedElement2.eResource();
						List<Resource.Diagnostic> errors = importedResource.getErrors();
						if (errors.size() == 0) {
							environmentView.addElement(name, importedElement2);		// The name we imported must be a good name for the element
						}
					}
				}
				else {							// looking for all possible names
					Map<String, URI> ePackageNsURIToGenModelLocationMap = EMF_2_9.EcorePlugin.getEPackageNsURIToGenModelLocationMap(false);
					for (String key : ePackageNsURIToGenModelLocationMap.keySet()) {
						environmentView.addElement(key, environmentView.getEnvironmentFactory().getMetamodelManager().getOclType("void"));
					}
				}
				return null;
			}
		
			public String getMessage() {
				return throwable != null ? throwable.getMessage() : null;
			}
		
			protected void importModel(ImportStatement target, EnvironmentView environmentView) {
				String name = target.getImportURI();
				if (name == null) {
					return;
				}
				BaseCSResource csResource = (BaseCSResource) target.eResource();
				 URI uri2;
				try {
					@SuppressWarnings("null")  URI newURI = URI.createURI(name);
					newURI = csResource.resolve(newURI);
					if (newURI.equals(uri)) {
						return;
					}
					uri2 = uri = newURI;					// Lock out recursive attempt from EcoreUtil.resolveProxy
					importedElement = null;
					throwable = null;
				} catch (WrappedException e) {
					throwable = e.exception();
					return;
				} catch (Exception e) {
					throwable = e;
					return;
				}
				try {
					MetamodelManager metaModelManager = environmentView.getEnvironmentFactory().getMetamodelManager();
					importedElement = ((PivotMetamodelManager) metaModelManager).loadResource(uri2, uri2.lastSegment(), null);				
					Resource importedResource = importedElement.eResource();
					List<Resource.Diagnostic> warnings = importedResource.getWarnings();
					if (warnings.size() > 0) {
						INode node = NodeModelUtils.getNode(target);
						String errorMessage = PivotUtil.formatResourceDiagnostics(warnings, PivotMessagesInternal.WarningsInURI+uri, "\n\t");
						Resource.Diagnostic resourceDiagnostic = new ValidationDiagnostic(node, errorMessage);
						csResource.getWarnings().add(resourceDiagnostic);
					}
					List<Resource.Diagnostic> errors = importedResource.getErrors();
					if (errors.size() > 0) {
						INode node = NodeModelUtils.getNode(target);
						String errorMessage = PivotUtil.formatResourceDiagnostics(errors, PivotMessagesInternal.ErrorsInURI+uri, "\n\t");
						Resource.Diagnostic resourceDiagnostic = new ValidationDiagnostic(node, errorMessage);
						csResource.getErrors().add(resourceDiagnostic);
					}
				} catch (WrappedException e) {
					throwable = e.exception();
				} catch (Exception e) {
					throwable = e;
				}
			}

			@Override
			public boolean isAdapterForType(Object type) {
				return type == ImportAdapter.class;
			}
		}

		@Override
		public ScopeView computeLookup( EObject target,  EnvironmentView environmentView,  ScopeView scopeView) {
			for (ImportStatement targetElement : ((MoCCMLMappingDocument)target).getImports()) {
				ImportAdapter adapter = ClassUtil.getAdapter(ImportAdapter.class, targetElement);
				if (adapter == null) {
					adapter = new ImportAdapter();
					targetElement.eAdapters().add(adapter);
				}
				scopeView = adapter.computeLookup(targetElement, environmentView, scopeView);
			}
			return scopeView;
		}

		public EReference getEReference() {
			@SuppressWarnings("null")  EReference importCsNamespace = BaseCSPackage.Literals.IMPORT_CS__REFERRED_NAMESPACE;
			return importCsNamespace;
		}

		public String getMessage( EObject context,  String linkText) {
			ImportAdapter adapter = ClassUtil.getAdapter(ImportAdapter.class, context);
			if (adapter != null) {
				String message = adapter.getMessage();
				return NLS.bind(PivotMessagesInternal.UnresolvedImport_ERROR_, linkText, message);
			}
			return null;
		}
	}
