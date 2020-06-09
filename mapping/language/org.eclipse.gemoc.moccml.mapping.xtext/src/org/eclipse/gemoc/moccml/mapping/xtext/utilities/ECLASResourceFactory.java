/**
 * <copyright>
 *
 * Copyright (c) 2013, 2017 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gemoc.moccml.mapping.xtext.utilities;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactory;
import org.eclipse.ocl.pivot.internal.utilities.AS2XMIid;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.utilities.AS2XMIidVisitor;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLAS2XMIidVisitor;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLASResourceFactory;

public class ECLASResourceFactory extends CompleteOCLASResourceFactory
{
	
	private static @Nullable ECLASResourceFactory INSTANCE = null;

	public static synchronized @NonNull CompleteOCLASResourceFactory getInstance() {
		if (INSTANCE == null) {
//			ASResourceFactoryContribution asResourceRegistry = ASResourceFactoryRegistry.INSTANCE.get(ASResource.COMPLETE_OCL_CONTENT_TYPE);
//			if (asResourceRegistry != null) {
//				INSTANCE = (CompleteOCLASResourceFactory) asResourceRegistry.getASResourceFactory();	// Create the registered singleton
//			}
//			else {
				INSTANCE = new ECLASResourceFactory();											// Create our own singleton
//			}
			assert INSTANCE != null;
			INSTANCE.install(PivotConstants.OCL_FILE_EXTENSION, null);
		}
		assert INSTANCE != null;
		return INSTANCE;
	}

	public ECLASResourceFactory() {
		super();
	}

	@Override
	public @NonNull AS2XMIidVisitor createAS2XMIidVisitor(@NonNull AS2XMIid as2id) {
		return new CompleteOCLAS2XMIidVisitor(as2id);
	}

	@Override
	public @NonNull Resource createResource(URI uri) {
		assert uri != null;
		ASResource asResource = new ECLASResourceImpl(uri, this);
		configureResource(asResource);
	    return asResource;
	}

	@Override
	public @NonNull ASResourceFactory getASResourceFactory() {
		return getInstance();
	}

}