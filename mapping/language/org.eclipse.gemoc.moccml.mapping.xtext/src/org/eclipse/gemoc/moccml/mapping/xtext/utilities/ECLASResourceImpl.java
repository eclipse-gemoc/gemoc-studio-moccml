/*******************************************************************************
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.moccml.mapping.xtext.utilities;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactory;
import org.eclipse.ocl.pivot.internal.resource.ASResourceImpl;
import org.eclipse.ocl.pivot.internal.utilities.AS2XMIid;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;

public class ECLASResourceImpl extends ASResourceImpl
{
	public ECLASResourceImpl(@NonNull URI uri, @NonNull ASResourceFactory asResourceFactory) {
		super(uri, asResourceFactory);
	}
//
//	@Override
//	public EObject getEObject(String uriFragment) {
//		if (idToEObjectMap == null) {
//			AS2XMIid as2id = new AS2XMIid();
//			as2id.assignIds(this, null);
//		}
//		return super.getEObject(uriFragment);
//	}
//
//	@Override
//	public String getURIFragment(EObject eObject) {
//		if (idToEObjectMap == null) {
//			AS2XMIid as2id = new AS2XMIid();
//			as2id.assignIds(this, null);
//		}
//		return super.getURIFragment(eObject);
//	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		@NonNull URI oclURI = uri.trimFileExtension();
		EnvironmentFactoryInternal environmentFactory = PivotUtilInternal.getEnvironmentFactory(this);
		BaseCSResource csResource = (BaseCSResource) environmentFactory.getResourceSet().createResource(oclURI);
		assert csResource != null;
		csResource.getCS2AS(environmentFactory, this);
		csResource.load(null);
		super.load(options);
	}
}