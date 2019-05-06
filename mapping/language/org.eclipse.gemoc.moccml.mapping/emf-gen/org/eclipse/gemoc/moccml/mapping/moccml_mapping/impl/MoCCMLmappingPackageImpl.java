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

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.BasicTypePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingFactory;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.TimeModelPackage;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ClockExpressionAndRelationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoCCMLmappingPackageImpl extends EPackageImpl implements MoCCMLmappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsaFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLMappingDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLMappingDefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseCSVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLMappingEventDefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLMappingBlockDefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLMappingTimeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moCCMLMappingPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedBackKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MoCCMLmappingPackageImpl() {
		super(eNS_URI, MoCCMLmappingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MoCCMLmappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MoCCMLmappingPackage init() {
		if (isInited)
			return (MoCCMLmappingPackage) EPackage.Registry.INSTANCE.getEPackage(MoCCMLmappingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMoCCMLmappingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MoCCMLmappingPackageImpl theMoCCMLmappingPackage = registeredMoCCMLmappingPackage instanceof MoCCMLmappingPackageImpl
				? (MoCCMLmappingPackageImpl) registeredMoCCMLmappingPackage
				: new MoCCMLmappingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BaseCSPackage.eINSTANCE.eClass();
		CompleteOCLCSPackage.eINSTANCE.eClass();
		EssentialOCLCSPackage.eINSTANCE.eClass();
		PivotPackage.eINSTANCE.eClass();
		TimeModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMoCCMLmappingPackage.createPackageContents();

		// Initialize created meta-data
		theMoCCMLmappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMoCCMLmappingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MoCCMLmappingPackage.eNS_URI, theMoCCMLmappingPackage);
		return theMoCCMLmappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventType() {
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_ReferedElement() {
		return (EAttribute) eventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Name() {
		return (EAttribute) eventTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAFeedback() {
		return dsaFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSAFeedback_Cases() {
		return (EReference) dsaFeedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSAFeedback_Owner() {
		return (EReference) dsaFeedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Condition() {
		return (EReference) caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_EventToForce() {
		return (EReference) caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_On() {
		return (EReference) caseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_KindOfFeedback() {
		return (EAttribute) caseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLMappingDocument() {
		return moCCMLMappingDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingDocument_Imports() {
		return (EReference) moCCMLMappingDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLRelation() {
		return moCCMLRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLRelation_Type() {
		return (EReference) moCCMLRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLRelation_Parameters() {
		return (EReference) moCCMLRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoCCMLRelation_IsAnAssertion() {
		return (EAttribute) moCCMLRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportStatement() {
		return importStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportStatement_ImportURI() {
		return (EAttribute) importStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLExpression() {
		return moCCMLExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLExpression_Type() {
		return (EReference) moCCMLExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLExpression_Parameters() {
		return (EReference) moCCMLExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLMappingDefCS() {
		return moCCMLMappingDefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingDefCS_Condition() {
		return (EReference) moCCMLMappingDefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoCCMLMappingDefCS_Visibility() {
		return (EAttribute) moCCMLMappingDefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseCSVisitor() {
		return baseCSVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockType() {
		return blockTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockType_Name() {
		return (EAttribute) blockTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLMappingEventDefCS() {
		return moCCMLMappingEventDefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingEventDefCS_Feedback() {
		return (EReference) moCCMLMappingEventDefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingEventDefCS_Future() {
		return (EReference) moCCMLMappingEventDefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoCCMLMappingEventDefCS_DsaResultName() {
		return (EAttribute) moCCMLMappingEventDefCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLMappingBlockDefCS() {
		return moCCMLMappingBlockDefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingBlockDefCS_EnterWhen() {
		return (EReference) moCCMLMappingBlockDefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingBlockDefCS_LeaveWhen() {
		return (EReference) moCCMLMappingBlockDefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLMappingTimeBase() {
		return moCCMLMappingTimeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoCCMLMappingTimeBase_Name() {
		return (EAttribute) moCCMLMappingTimeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingTimeBase_TimeBase() {
		return (EReference) moCCMLMappingTimeBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoCCMLMappingPriority() {
		return moCCMLMappingPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingPriority_Higher() {
		return (EReference) moCCMLMappingPriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoCCMLMappingPriority_Lower() {
		return (EReference) moCCMLMappingPriorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventKind() {
		return eventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeedBackKind() {
		return feedBackKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingFactory getMoCCMLmappingFactory() {
		return (MoCCMLmappingFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eventTypeEClass = createEClass(EVENT_TYPE);
		createEAttribute(eventTypeEClass, EVENT_TYPE__REFERED_ELEMENT);
		createEAttribute(eventTypeEClass, EVENT_TYPE__NAME);

		dsaFeedbackEClass = createEClass(DSA_FEEDBACK);
		createEReference(dsaFeedbackEClass, DSA_FEEDBACK__CASES);
		createEReference(dsaFeedbackEClass, DSA_FEEDBACK__OWNER);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__CONDITION);
		createEReference(caseEClass, CASE__EVENT_TO_FORCE);
		createEReference(caseEClass, CASE__ON);
		createEAttribute(caseEClass, CASE__KIND_OF_FEEDBACK);

		moCCMLMappingDocumentEClass = createEClass(MO_CCML_MAPPING_DOCUMENT);
		createEReference(moCCMLMappingDocumentEClass, MO_CCML_MAPPING_DOCUMENT__IMPORTS);

		moCCMLRelationEClass = createEClass(MO_CCML_RELATION);
		createEReference(moCCMLRelationEClass, MO_CCML_RELATION__TYPE);
		createEReference(moCCMLRelationEClass, MO_CCML_RELATION__PARAMETERS);
		createEAttribute(moCCMLRelationEClass, MO_CCML_RELATION__IS_AN_ASSERTION);

		importStatementEClass = createEClass(IMPORT_STATEMENT);
		createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_URI);

		moCCMLExpressionEClass = createEClass(MO_CCML_EXPRESSION);
		createEReference(moCCMLExpressionEClass, MO_CCML_EXPRESSION__TYPE);
		createEReference(moCCMLExpressionEClass, MO_CCML_EXPRESSION__PARAMETERS);

		moCCMLMappingDefCSEClass = createEClass(MO_CCML_MAPPING_DEF_CS);
		createEReference(moCCMLMappingDefCSEClass, MO_CCML_MAPPING_DEF_CS__CONDITION);
		createEAttribute(moCCMLMappingDefCSEClass, MO_CCML_MAPPING_DEF_CS__VISIBILITY);

		baseCSVisitorEClass = createEClass(BASE_CS_VISITOR);

		blockTypeEClass = createEClass(BLOCK_TYPE);
		createEAttribute(blockTypeEClass, BLOCK_TYPE__NAME);

		moCCMLMappingEventDefCSEClass = createEClass(MO_CCML_MAPPING_EVENT_DEF_CS);
		createEReference(moCCMLMappingEventDefCSEClass, MO_CCML_MAPPING_EVENT_DEF_CS__FEEDBACK);
		createEReference(moCCMLMappingEventDefCSEClass, MO_CCML_MAPPING_EVENT_DEF_CS__FUTURE);
		createEAttribute(moCCMLMappingEventDefCSEClass, MO_CCML_MAPPING_EVENT_DEF_CS__DSA_RESULT_NAME);

		moCCMLMappingBlockDefCSEClass = createEClass(MO_CCML_MAPPING_BLOCK_DEF_CS);
		createEReference(moCCMLMappingBlockDefCSEClass, MO_CCML_MAPPING_BLOCK_DEF_CS__ENTER_WHEN);
		createEReference(moCCMLMappingBlockDefCSEClass, MO_CCML_MAPPING_BLOCK_DEF_CS__LEAVE_WHEN);

		moCCMLMappingTimeBaseEClass = createEClass(MO_CCML_MAPPING_TIME_BASE);
		createEAttribute(moCCMLMappingTimeBaseEClass, MO_CCML_MAPPING_TIME_BASE__NAME);
		createEReference(moCCMLMappingTimeBaseEClass, MO_CCML_MAPPING_TIME_BASE__TIME_BASE);

		moCCMLMappingPriorityEClass = createEClass(MO_CCML_MAPPING_PRIORITY);
		createEReference(moCCMLMappingPriorityEClass, MO_CCML_MAPPING_PRIORITY__HIGHER);
		createEReference(moCCMLMappingPriorityEClass, MO_CCML_MAPPING_PRIORITY__LOWER);

		// Create enums
		eventKindEEnum = createEEnum(EVENT_KIND);
		visibilityEEnum = createEEnum(VISIBILITY);
		feedBackKindEEnum = createEEnum(FEED_BACK_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BaseCSPackage theBaseCSPackage = (BaseCSPackage) EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
		PivotPackage thePivotPackage = (PivotPackage) EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);
		CompleteOCLCSPackage theCompleteOCLCSPackage = (CompleteOCLCSPackage) EPackage.Registry.INSTANCE
				.getEPackage(CompleteOCLCSPackage.eNS_URI);
		EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage) EPackage.Registry.INSTANCE
				.getEPackage(EssentialOCLCSPackage.eNS_URI);
		ClockExpressionAndRelationPackage theClockExpressionAndRelationPackage = (ClockExpressionAndRelationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ClockExpressionAndRelationPackage.eNS_URI);
		BasicTypePackage theBasicTypePackage = (BasicTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(BasicTypePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(baseCSVisitorEClass, "R");

		// Set bounds for type parameters

		// Add supertypes to classes
		eventTypeEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		eventTypeEClass.getESuperTypes().add(thePivotPackage.getNameable());
		dsaFeedbackEClass.getESuperTypes().add(theCompleteOCLCSPackage.getDefPropertyCS());
		caseEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		moCCMLMappingDocumentEClass.getESuperTypes().add(theCompleteOCLCSPackage.getCompleteOCLDocumentCS());
		moCCMLRelationEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		importStatementEClass.getESuperTypes().add(theBaseCSPackage.getImportCS());
		moCCMLExpressionEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		moCCMLMappingDefCSEClass.getESuperTypes().add(theCompleteOCLCSPackage.getDefPropertyCS());
		blockTypeEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		blockTypeEClass.getESuperTypes().add(thePivotPackage.getNameable());
		moCCMLMappingEventDefCSEClass.getESuperTypes().add(this.getMoCCMLMappingDefCS());
		moCCMLMappingBlockDefCSEClass.getESuperTypes().add(this.getMoCCMLMappingDefCS());
		moCCMLMappingTimeBaseEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		moCCMLMappingTimeBaseEClass.getESuperTypes().add(thePivotPackage.getNameable());
		moCCMLMappingPriorityEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());

		// Initialize classes and features; add operations and parameters
		initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventType_ReferedElement(), this.getEventKind(), "referedElement", null, 0, 1,
				EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(eventTypeEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "R");
		EGenericType g1 = createEGenericType(this.getBaseCSVisitor());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(dsaFeedbackEClass, DSAFeedback.class, "DSAFeedback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSAFeedback_Cases(), this.getCase(), null, "cases", null, 0, -1, DSAFeedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSAFeedback_Owner(), this.getMoCCMLMappingEventDefCS(),
				this.getMoCCMLMappingEventDefCS_Feedback(), "owner", null, 1, 1, DSAFeedback.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(dsaFeedbackEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Condition(), theEssentialOCLCSPackage.getExpCS(), null, "condition", null, 0, 1,
				Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_EventToForce(), theEssentialOCLCSPackage.getExpCS(), null, "eventToForce", null, 0, 1,
				Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_On(), theEssentialOCLCSPackage.getExpCS(), null, "on", null, 0, 1, Case.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase_KindOfFeedback(), this.getFeedBackKind(), "kindOfFeedback", null, 1, 1, Case.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(caseEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLMappingDocumentEClass, MoCCMLMappingDocument.class, "MoCCMLMappingDocument", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoCCMLMappingDocument_Imports(), this.getImportStatement(), null, "imports", null, 0, -1,
				MoCCMLMappingDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLMappingDocumentEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLRelationEClass, MoCCMLRelation.class, "MoCCMLRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoCCMLRelation_Type(), theClockExpressionAndRelationPackage.getRelationDeclaration(), null,
				"type", null, 1, 1, MoCCMLRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoCCMLRelation_Parameters(), theEssentialOCLCSPackage.getExpCS(), null, "parameters", null, 1,
				-1, MoCCMLRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoCCMLRelation_IsAnAssertion(), ecorePackage.getEBoolean(), "isAnAssertion", "false", 0, 1,
				MoCCMLRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLRelationEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1,
				ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(importStatementEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLExpressionEClass, MoCCMLExpression.class, "MoCCMLExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoCCMLExpression_Type(), theClockExpressionAndRelationPackage.getExpressionDeclaration(),
				null, "type", null, 1, 1, MoCCMLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoCCMLExpression_Parameters(), theEssentialOCLCSPackage.getExpCS(), null, "parameters", null,
				1, -1, MoCCMLExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLExpressionEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLMappingDefCSEClass, MoCCMLMappingDefCS.class, "MoCCMLMappingDefCS", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoCCMLMappingDefCS_Condition(), theEssentialOCLCSPackage.getExpCS(), null, "condition", null,
				0, 1, MoCCMLMappingDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoCCMLMappingDefCS_Visibility(), this.getVisibility(), "visibility", null, 1, 1,
				MoCCMLMappingDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLMappingDefCSEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(baseCSVisitorEClass, BaseCSVisitor.class, "BaseCSVisitor", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockTypeEClass, BlockType.class, "BlockType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockType_Name(), ecorePackage.getEString(), "name", null, 0, 1, BlockType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(blockTypeEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLMappingEventDefCSEClass, MoCCMLMappingEventDefCS.class, "MoCCMLMappingEventDefCS",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoCCMLMappingEventDefCS_Feedback(), this.getDSAFeedback(), this.getDSAFeedback_Owner(),
				"feedback", null, 0, 1, MoCCMLMappingEventDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoCCMLMappingEventDefCS_Future(), theEssentialOCLCSPackage.getExpCS(), null, "future", null,
				0, 1, MoCCMLMappingEventDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoCCMLMappingEventDefCS_DsaResultName(), ecorePackage.getEString(), "dsaResultName", null, 0,
				1, MoCCMLMappingEventDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLMappingEventDefCSEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLMappingBlockDefCSEClass, MoCCMLMappingBlockDefCS.class, "MoCCMLMappingBlockDefCS",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoCCMLMappingBlockDefCS_EnterWhen(), theEssentialOCLCSPackage.getExpCS(), null, "enterWhen",
				null, 0, 1, MoCCMLMappingBlockDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoCCMLMappingBlockDefCS_LeaveWhen(), theEssentialOCLCSPackage.getExpCS(), null, "leaveWhen",
				null, 0, 1, MoCCMLMappingBlockDefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLMappingBlockDefCSEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLMappingTimeBaseEClass, MoCCMLMappingTimeBase.class, "MoCCMLMappingTimeBase", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoCCMLMappingTimeBase_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MoCCMLMappingTimeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoCCMLMappingTimeBase_TimeBase(), theBasicTypePackage.getDenseClockType(), null, "timeBase",
				null, 0, 1, MoCCMLMappingTimeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLMappingTimeBaseEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(moCCMLMappingPriorityEClass, MoCCMLMappingPriority.class, "MoCCMLMappingPriority", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoCCMLMappingPriority_Higher(), theEssentialOCLCSPackage.getExpCS(), null, "higher", null, 1,
				1, MoCCMLMappingPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoCCMLMappingPriority_Lower(), theEssentialOCLCSPackage.getExpCS(), null, "lower", null, 1, 1,
				MoCCMLMappingPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(moCCMLMappingPriorityEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getBaseCSVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		// Initialize enums and add enum literals
		initEEnum(eventKindEEnum, EventKind.class, "EventKind");
		addEEnumLiteral(eventKindEEnum, EventKind.UNDEFINED);
		addEEnumLiteral(eventKindEEnum, EventKind.START);
		addEEnumLiteral(eventKindEEnum, EventKind.FINISH);
		addEEnumLiteral(eventKindEEnum, EventKind.SEND);
		addEEnumLiteral(eventKindEEnum, EventKind.RECEIVE);
		addEEnumLiteral(eventKindEEnum, EventKind.CONSUME);
		addEEnumLiteral(eventKindEEnum, EventKind.PRODUCE);
		addEEnumLiteral(eventKindEEnum, EventKind.CREATE);
		addEEnumLiteral(eventKindEEnum, EventKind.DESTROY);
		addEEnumLiteral(eventKindEEnum, EventKind.SUSPEND);
		addEEnumLiteral(eventKindEEnum, EventKind.RESUME);
		addEEnumLiteral(eventKindEEnum, EventKind.CALL);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

		initEEnum(feedBackKindEEnum, FeedBackKind.class, "FeedBackKind");
		addEEnumLiteral(feedBackKindEEnum, FeedBackKind.FORCE);
		addEEnumLiteral(feedBackKindEEnum, FeedBackKind.FORBID);

		// Create resource
		createResource(eNS_URI);
	}

} //MoCCMLmappingPackageImpl
