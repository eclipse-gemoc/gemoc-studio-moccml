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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage
 * @generated
 */
public interface MoCCMLmappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoCCMLmappingFactory eINSTANCE = org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Type</em>'.
	 * @generated
	 */
	EventType createEventType();

	/**
	 * Returns a new object of class '<em>DSA Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSA Feedback</em>'.
	 * @generated
	 */
	DSAFeedback createDSAFeedback();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns a new object of class '<em>Mo CCML Mapping Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CCML Mapping Document</em>'.
	 * @generated
	 */
	MoCCMLMappingDocument createMoCCMLMappingDocument();

	/**
	 * Returns a new object of class '<em>Mo CCML Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CCML Relation</em>'.
	 * @generated
	 */
	MoCCMLRelation createMoCCMLRelation();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns a new object of class '<em>Mo CCML Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CCML Expression</em>'.
	 * @generated
	 */
	MoCCMLExpression createMoCCMLExpression();

	/**
	 * Returns a new object of class '<em>Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Type</em>'.
	 * @generated
	 */
	BlockType createBlockType();

	/**
	 * Returns a new object of class '<em>Mo CCML Mapping Event Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CCML Mapping Event Def CS</em>'.
	 * @generated
	 */
	MoCCMLMappingEventDefCS createMoCCMLMappingEventDefCS();

	/**
	 * Returns a new object of class '<em>Mo CCML Mapping Block Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CCML Mapping Block Def CS</em>'.
	 * @generated
	 */
	MoCCMLMappingBlockDefCS createMoCCMLMappingBlockDefCS();

	/**
	 * Returns a new object of class '<em>Mo CCML Mapping Time Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CCML Mapping Time Base</em>'.
	 * @generated
	 */
	MoCCMLMappingTimeBase createMoCCMLMappingTimeBase();

	/**
	 * Returns a new object of class '<em>Mo CCML Mapping Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mo CCML Mapping Priority</em>'.
	 * @generated
	 */
	MoCCMLMappingPriority createMoCCMLMappingPriority();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MoCCMLmappingPackage getMoCCMLmappingPackage();

} //MoCCMLmappingFactory
