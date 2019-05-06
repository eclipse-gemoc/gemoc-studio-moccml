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
package org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoCCMLmappingFactoryImpl extends EFactoryImpl implements MoCCMLmappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoCCMLmappingFactory init() {
		try {
			MoCCMLmappingFactory theMoCCMLmappingFactory = (MoCCMLmappingFactory) EPackage.Registry.INSTANCE
					.getEFactory(MoCCMLmappingPackage.eNS_URI);
			if (theMoCCMLmappingFactory != null) {
				return theMoCCMLmappingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MoCCMLmappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MoCCMLmappingPackage.EVENT_TYPE:
			return createEventType();
		case MoCCMLmappingPackage.DSA_FEEDBACK:
			return createDSAFeedback();
		case MoCCMLmappingPackage.CASE:
			return createCase();
		case MoCCMLmappingPackage.MO_CCML_MAPPING_DOCUMENT:
			return createMoCCMLMappingDocument();
		case MoCCMLmappingPackage.MO_CCML_RELATION:
			return createMoCCMLRelation();
		case MoCCMLmappingPackage.IMPORT_STATEMENT:
			return createImportStatement();
		case MoCCMLmappingPackage.MO_CCML_EXPRESSION:
			return createMoCCMLExpression();
		case MoCCMLmappingPackage.BLOCK_TYPE:
			return createBlockType();
		case MoCCMLmappingPackage.MO_CCML_MAPPING_EVENT_DEF_CS:
			return createMoCCMLMappingEventDefCS();
		case MoCCMLmappingPackage.MO_CCML_MAPPING_BLOCK_DEF_CS:
			return createMoCCMLMappingBlockDefCS();
		case MoCCMLmappingPackage.MO_CCML_MAPPING_TIME_BASE:
			return createMoCCMLMappingTimeBase();
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY:
			return createMoCCMLMappingPriority();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MoCCMLmappingPackage.EVENT_KIND:
			return createEventKindFromString(eDataType, initialValue);
		case MoCCMLmappingPackage.VISIBILITY:
			return createVisibilityFromString(eDataType, initialValue);
		case MoCCMLmappingPackage.FEED_BACK_KIND:
			return createFeedBackKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MoCCMLmappingPackage.EVENT_KIND:
			return convertEventKindToString(eDataType, instanceValue);
		case MoCCMLmappingPackage.VISIBILITY:
			return convertVisibilityToString(eDataType, instanceValue);
		case MoCCMLmappingPackage.FEED_BACK_KIND:
			return convertFeedBackKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAFeedback createDSAFeedback() {
		DSAFeedbackImpl dsaFeedback = new DSAFeedbackImpl();
		return dsaFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLMappingDocument createMoCCMLMappingDocument() {
		MoCCMLMappingDocumentImpl moCCMLMappingDocument = new MoCCMLMappingDocumentImpl();
		return moCCMLMappingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLRelation createMoCCMLRelation() {
		MoCCMLRelationImpl moCCMLRelation = new MoCCMLRelationImpl();
		return moCCMLRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportStatement createImportStatement() {
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLExpression createMoCCMLExpression() {
		MoCCMLExpressionImpl moCCMLExpression = new MoCCMLExpressionImpl();
		return moCCMLExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockType createBlockType() {
		BlockTypeImpl blockType = new BlockTypeImpl();
		return blockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLMappingEventDefCS createMoCCMLMappingEventDefCS() {
		MoCCMLMappingEventDefCSImpl moCCMLMappingEventDefCS = new MoCCMLMappingEventDefCSImpl();
		return moCCMLMappingEventDefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLMappingBlockDefCS createMoCCMLMappingBlockDefCS() {
		MoCCMLMappingBlockDefCSImpl moCCMLMappingBlockDefCS = new MoCCMLMappingBlockDefCSImpl();
		return moCCMLMappingBlockDefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLMappingTimeBase createMoCCMLMappingTimeBase() {
		MoCCMLMappingTimeBaseImpl moCCMLMappingTimeBase = new MoCCMLMappingTimeBaseImpl();
		return moCCMLMappingTimeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLMappingPriority createMoCCMLMappingPriority() {
		MoCCMLMappingPriorityImpl moCCMLMappingPriority = new MoCCMLMappingPriorityImpl();
		return moCCMLMappingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKindFromString(EDataType eDataType, String initialValue) {
		EventKind result = EventKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedBackKind createFeedBackKindFromString(EDataType eDataType, String initialValue) {
		FeedBackKind result = FeedBackKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedBackKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingPackage getMoCCMLmappingPackage() {
		return (MoCCMLmappingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MoCCMLmappingPackage getPackage() {
		return MoCCMLmappingPackage.eINSTANCE;
	}

} //MoCCMLmappingFactoryImpl
