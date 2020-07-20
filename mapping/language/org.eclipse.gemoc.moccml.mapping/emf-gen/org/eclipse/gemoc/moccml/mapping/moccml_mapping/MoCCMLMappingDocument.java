/**
 * /*******************************************************************************
 *  * Copyright (c) 2015, 2017  I3S Laboratory  and others.
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  *
 *  * Contributors:
 *  *     I3S Laboratory - initial API and implementation
 *  *******************************************************************************
 */
package org.eclipse.gemoc.moccml.mapping.moccml_mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mo CCML Mapping Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getMoCCMLMappingDocument()
 * @model
 * @generated
 */
public interface MoCCMLMappingDocument extends CompleteOCLDocumentCS
{
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getMoCCMLMappingDocument_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportStatement> getImports();

} // MoCCMLMappingDocument
