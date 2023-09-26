/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.moccml.mapping.xtext.validation;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;

public class EclJavaValidator extends AbstractEclJavaValidator {

//	@Check
//	public void removeConditionErrors(MoCCMLMappingDefCS def) {
//		
//		EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> originalErrors = def.eResource().getErrors();
//		ArrayList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> errors = new ArrayList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(originalErrors);
//		for(Resource.Diagnostic diag : errors) {
//			ICompositeNode n = NodeModelUtils.getNode(def.getCondition());
//			TreeIterator<EObject> it = def.getCondition().eAllContents();
//			while(it.hasNext()) {
//				EObject semElem = it.next();
//				if (diag instanceof AbstractDiagnostic) {
//					if (((AbstractDiagnostic)diag).getUriToProblem().fragment().contains(EcoreUtil.getURI(semElem).fragment())) {
//						originalErrors.remove(diag);
//					}
//				}
//			}
//		}
//	}

}
