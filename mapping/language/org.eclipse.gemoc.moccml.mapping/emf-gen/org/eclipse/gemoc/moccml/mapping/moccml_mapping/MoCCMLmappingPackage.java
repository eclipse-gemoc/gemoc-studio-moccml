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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingFactory
 * @model kind="package"
 * @generated
 */
public interface MoCCMLmappingPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moccml_mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.gemoc.moccml.mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.gemoc.moccml.mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoCCMLmappingPackage eINSTANCE = org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl.init();



	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl <em>DSA Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getDSAFeedback()
	 * @generated
	 */
	int DSA_FEEDBACK = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDocumentImpl <em>Mo CCML Mapping Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDocumentImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingDocument()
	 * @generated
	 */
	int MO_CCML_MAPPING_DOCUMENT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLRelationImpl <em>Mo CCML Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLRelationImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLRelation()
	 * @generated
	 */
	int MO_CCML_RELATION = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl <em>Import Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getImportStatement()
	 * @generated
	 */
	int IMPORT_STATEMENT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLExpressionImpl <em>Mo CCML Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLExpressionImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLExpression()
	 * @generated
	 */
	int MO_CCML_EXPRESSION = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDefCSImpl <em>Mo CCML Mapping Def CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDefCSImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingDefCS()
	 * @generated
	 */
	int MO_CCML_MAPPING_DEF_CS = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor <em>Base CS Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBaseCSVisitor()
	 * @generated
	 */
	int BASE_CS_VISITOR = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl <em>Block Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBlockType()
	 * @generated
	 */
	int BLOCK_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingEventDefCSImpl <em>Mo CCML Mapping Event Def CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingEventDefCSImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingEventDefCS()
	 * @generated
	 */
	int MO_CCML_MAPPING_EVENT_DEF_CS = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingBlockDefCSImpl <em>Mo CCML Mapping Block Def CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingBlockDefCSImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingBlockDefCS()
	 * @generated
	 */
	int MO_CCML_MAPPING_BLOCK_DEF_CS = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingTimeBaseImpl <em>Mo CCML Mapping Time Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingTimeBaseImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingTimeBase()
	 * @generated
	 */
	int MO_CCML_MAPPING_TIME_BASE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingPriorityImpl <em>Mo CCML Mapping Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingPriorityImpl
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingPriority()
	 * @generated
	 */
	int MO_CCML_MAPPING_PRIORITY = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind <em>Event Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventKind()
	 * @generated
	 */
	int EVENT_KIND = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind <em>Feed Back Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getFeedBackKind()
	 * @generated
	 */
	int FEED_BACK_KIND = 16;



	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getReferedElement <em>Refered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refered Element</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getReferedElement()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_ReferedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback <em>DSA Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSA Feedback</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback
	 * @generated
	 */
	EClass getDSAFeedback();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getCases()
	 * @see #getDSAFeedback()
	 * @generated
	 */
	EReference getDSAFeedback_Cases();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback#getOwner()
	 * @see #getDSAFeedback()
	 * @generated
	 */
	EReference getDSAFeedback_Owner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getCondition()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getEventToForce <em>Event To Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event To Force</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getEventToForce()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_EventToForce();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getOn()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_On();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getKindOfFeedback <em>Kind Of Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Feedback</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case#getKindOfFeedback()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_KindOfFeedback();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument <em>Mo CCML Mapping Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Mapping Document</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument
	 * @generated
	 */
	EClass getMoCCMLMappingDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument#getImports()
	 * @see #getMoCCMLMappingDocument()
	 * @generated
	 */
	EReference getMoCCMLMappingDocument_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation <em>Mo CCML Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Relation</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation
	 * @generated
	 */
	EClass getMoCCMLRelation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation#getType()
	 * @see #getMoCCMLRelation()
	 * @generated
	 */
	EReference getMoCCMLRelation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation#getParameters()
	 * @see #getMoCCMLRelation()
	 * @generated
	 */
	EReference getMoCCMLRelation_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation#isIsAnAssertion <em>Is An Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is An Assertion</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation#isIsAnAssertion()
	 * @see #getMoCCMLRelation()
	 * @generated
	 */
	EAttribute getMoCCMLRelation_IsAnAssertion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement <em>Import Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Statement</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement
	 * @generated
	 */
	EClass getImportStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement#getImportURI()
	 * @see #getImportStatement()
	 * @generated
	 */
	EAttribute getImportStatement_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression <em>Mo CCML Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Expression</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression
	 * @generated
	 */
	EClass getMoCCMLExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression#getType()
	 * @see #getMoCCMLExpression()
	 * @generated
	 */
	EReference getMoCCMLExpression_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression#getParameters()
	 * @see #getMoCCMLExpression()
	 * @generated
	 */
	EReference getMoCCMLExpression_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS <em>Mo CCML Mapping Def CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Mapping Def CS</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS
	 * @generated
	 */
	EClass getMoCCMLMappingDefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS#getCondition()
	 * @see #getMoCCMLMappingDefCS()
	 * @generated
	 */
	EReference getMoCCMLMappingDefCS_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS#getVisibility()
	 * @see #getMoCCMLMappingDefCS()
	 * @generated
	 */
	EAttribute getMoCCMLMappingDefCS_Visibility();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor <em>Base CS Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base CS Visitor</em>'.
	 * @see org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor
	 * @model instanceClass="org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor" typeParameters="R"
	 * @generated
	 */
	EClass getBaseCSVisitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Type</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType
	 * @generated
	 */
	EClass getBlockType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType#getName()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS <em>Mo CCML Mapping Event Def CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Mapping Event Def CS</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS
	 * @generated
	 */
	EClass getMoCCMLMappingEventDefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS#getFeedback()
	 * @see #getMoCCMLMappingEventDefCS()
	 * @generated
	 */
	EReference getMoCCMLMappingEventDefCS_Feedback();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS#getFuture <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Future</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS#getFuture()
	 * @see #getMoCCMLMappingEventDefCS()
	 * @generated
	 */
	EReference getMoCCMLMappingEventDefCS_Future();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS#getDsaResultName <em>Dsa Result Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dsa Result Name</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS#getDsaResultName()
	 * @see #getMoCCMLMappingEventDefCS()
	 * @generated
	 */
	EAttribute getMoCCMLMappingEventDefCS_DsaResultName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS <em>Mo CCML Mapping Block Def CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Mapping Block Def CS</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS
	 * @generated
	 */
	EClass getMoCCMLMappingBlockDefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS#getEnterWhen <em>Enter When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enter When</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS#getEnterWhen()
	 * @see #getMoCCMLMappingBlockDefCS()
	 * @generated
	 */
	EReference getMoCCMLMappingBlockDefCS_EnterWhen();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS#getLeaveWhen <em>Leave When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leave When</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS#getLeaveWhen()
	 * @see #getMoCCMLMappingBlockDefCS()
	 * @generated
	 */
	EReference getMoCCMLMappingBlockDefCS_LeaveWhen();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase <em>Mo CCML Mapping Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Mapping Time Base</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase
	 * @generated
	 */
	EClass getMoCCMLMappingTimeBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase#getName()
	 * @see #getMoCCMLMappingTimeBase()
	 * @generated
	 */
	EAttribute getMoCCMLMappingTimeBase_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase#getTimeBase <em>Time Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Base</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase#getTimeBase()
	 * @see #getMoCCMLMappingTimeBase()
	 * @generated
	 */
	EReference getMoCCMLMappingTimeBase_TimeBase();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority <em>Mo CCML Mapping Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo CCML Mapping Priority</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority
	 * @generated
	 */
	EClass getMoCCMLMappingPriority();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority#getHigher <em>Higher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Higher</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority#getHigher()
	 * @see #getMoCCMLMappingPriority()
	 * @generated
	 */
	EReference getMoCCMLMappingPriority_Higher();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority#getLower()
	 * @see #getMoCCMLMappingPriority()
	 * @generated
	 */
	EReference getMoCCMLMappingPriority_Lower();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Kind</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
	 * @generated
	 */
	EEnum getEventKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind <em>Feed Back Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feed Back Kind</em>'.
	 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
	 * @generated
	 */
	EEnum getFeedBackKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MoCCMLmappingFactory getMoCCMLmappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.EventTypeImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Refered Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__REFERED_ELEMENT = eINSTANCE.getEventType_ReferedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__NAME = eINSTANCE.getEventType_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl <em>DSA Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getDSAFeedback()
		 * @generated
		 */
		EClass DSA_FEEDBACK = eINSTANCE.getDSAFeedback();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSA_FEEDBACK__CASES = eINSTANCE.getDSAFeedback_Cases();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSA_FEEDBACK__OWNER = eINSTANCE.getDSAFeedback_Owner();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.CaseImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONDITION = eINSTANCE.getCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Event To Force</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__EVENT_TO_FORCE = eINSTANCE.getCase_EventToForce();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ON = eINSTANCE.getCase_On();

		/**
		 * The meta object literal for the '<em><b>Kind Of Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__KIND_OF_FEEDBACK = eINSTANCE.getCase_KindOfFeedback();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDocumentImpl <em>Mo CCML Mapping Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDocumentImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingDocument()
		 * @generated
		 */
		EClass MO_CCML_MAPPING_DOCUMENT = eINSTANCE.getMoCCMLMappingDocument();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_DOCUMENT__IMPORTS = eINSTANCE.getMoCCMLMappingDocument_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLRelationImpl <em>Mo CCML Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLRelationImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLRelation()
		 * @generated
		 */
		EClass MO_CCML_RELATION = eINSTANCE.getMoCCMLRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_RELATION__TYPE = eINSTANCE.getMoCCMLRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_RELATION__PARAMETERS = eINSTANCE.getMoCCMLRelation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is An Assertion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_CCML_RELATION__IS_AN_ASSERTION = eINSTANCE.getMoCCMLRelation_IsAnAssertion();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl <em>Import Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.ImportStatementImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getImportStatement()
		 * @generated
		 */
		EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_STATEMENT__IMPORT_URI = eINSTANCE.getImportStatement_ImportURI();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLExpressionImpl <em>Mo CCML Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLExpressionImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLExpression()
		 * @generated
		 */
		EClass MO_CCML_EXPRESSION = eINSTANCE.getMoCCMLExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_EXPRESSION__TYPE = eINSTANCE.getMoCCMLExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_EXPRESSION__PARAMETERS = eINSTANCE.getMoCCMLExpression_Parameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDefCSImpl <em>Mo CCML Mapping Def CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingDefCSImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingDefCS()
		 * @generated
		 */
		EClass MO_CCML_MAPPING_DEF_CS = eINSTANCE.getMoCCMLMappingDefCS();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_DEF_CS__CONDITION = eINSTANCE.getMoCCMLMappingDefCS_Condition();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_CCML_MAPPING_DEF_CS__VISIBILITY = eINSTANCE.getMoCCMLMappingDefCS_Visibility();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor <em>Base CS Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBaseCSVisitor()
		 * @generated
		 */
		EClass BASE_CS_VISITOR = eINSTANCE.getBaseCSVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl <em>Block Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.BlockTypeImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getBlockType()
		 * @generated
		 */
		EClass BLOCK_TYPE = eINSTANCE.getBlockType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_TYPE__NAME = eINSTANCE.getBlockType_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingEventDefCSImpl <em>Mo CCML Mapping Event Def CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingEventDefCSImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingEventDefCS()
		 * @generated
		 */
		EClass MO_CCML_MAPPING_EVENT_DEF_CS = eINSTANCE.getMoCCMLMappingEventDefCS();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_EVENT_DEF_CS__FEEDBACK = eINSTANCE.getMoCCMLMappingEventDefCS_Feedback();

		/**
		 * The meta object literal for the '<em><b>Future</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_EVENT_DEF_CS__FUTURE = eINSTANCE.getMoCCMLMappingEventDefCS_Future();

		/**
		 * The meta object literal for the '<em><b>Dsa Result Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_CCML_MAPPING_EVENT_DEF_CS__DSA_RESULT_NAME = eINSTANCE.getMoCCMLMappingEventDefCS_DsaResultName();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingBlockDefCSImpl <em>Mo CCML Mapping Block Def CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingBlockDefCSImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingBlockDefCS()
		 * @generated
		 */
		EClass MO_CCML_MAPPING_BLOCK_DEF_CS = eINSTANCE.getMoCCMLMappingBlockDefCS();

		/**
		 * The meta object literal for the '<em><b>Enter When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_BLOCK_DEF_CS__ENTER_WHEN = eINSTANCE.getMoCCMLMappingBlockDefCS_EnterWhen();

		/**
		 * The meta object literal for the '<em><b>Leave When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_BLOCK_DEF_CS__LEAVE_WHEN = eINSTANCE.getMoCCMLMappingBlockDefCS_LeaveWhen();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingTimeBaseImpl <em>Mo CCML Mapping Time Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingTimeBaseImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingTimeBase()
		 * @generated
		 */
		EClass MO_CCML_MAPPING_TIME_BASE = eINSTANCE.getMoCCMLMappingTimeBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_CCML_MAPPING_TIME_BASE__NAME = eINSTANCE.getMoCCMLMappingTimeBase_Name();

		/**
		 * The meta object literal for the '<em><b>Time Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_TIME_BASE__TIME_BASE = eINSTANCE.getMoCCMLMappingTimeBase_TimeBase();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingPriorityImpl <em>Mo CCML Mapping Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingPriorityImpl
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getMoCCMLMappingPriority()
		 * @generated
		 */
		EClass MO_CCML_MAPPING_PRIORITY = eINSTANCE.getMoCCMLMappingPriority();

		/**
		 * The meta object literal for the '<em><b>Higher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_PRIORITY__HIGHER = eINSTANCE.getMoCCMLMappingPriority_Higher();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_CCML_MAPPING_PRIORITY__LOWER = eINSTANCE.getMoCCMLMappingPriority_Lower();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind <em>Event Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getEventKind()
		 * @generated
		 */
		EEnum EVENT_KIND = eINSTANCE.getEventKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.Visibility
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind <em>Feed Back Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.FeedBackKind
		 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLmappingPackageImpl#getFeedBackKind()
		 * @generated
		 */
		EEnum FEED_BACK_KIND = eINSTANCE.getFeedBackKind();

	}

} //MoCCMLmappingPackage
