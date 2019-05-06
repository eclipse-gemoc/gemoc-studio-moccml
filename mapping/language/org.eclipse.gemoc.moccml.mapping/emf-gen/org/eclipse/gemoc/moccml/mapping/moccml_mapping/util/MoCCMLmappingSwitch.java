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
package org.eclipse.gemoc.moccml.mapping.moccml_mapping.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.*;

import org.eclipse.ocl.pivot.utilities.Nameable;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ElementRefCS;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.NamespaceCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.RootCS;
import org.eclipse.ocl.xtext.basecs.TypeRefCS;
import org.eclipse.ocl.xtext.basecs.TypedElementCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;

import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;

import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;
import org.eclipse.ocl.xtext.completeoclcs.DefCS;
import org.eclipse.ocl.xtext.completeoclcs.DefPropertyCS;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage
 * @generated
 */
public class MoCCMLmappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MoCCMLmappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoCCMLmappingSwitch() {
		if (modelPackage == null) {
			modelPackage = MoCCMLmappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MoCCMLmappingPackage.EVENT_TYPE: {
			EventType eventType = (EventType) theEObject;
			T result = caseEventType(eventType);
			if (result == null)
				result = caseTypedRefCS(eventType);
			if (result == null)
				result = caseNameable(eventType);
			if (result == null)
				result = caseTypeRefCS(eventType);
			if (result == null)
				result = caseElementRefCS(eventType);
			if (result == null)
				result = casePivotableElementCS(eventType);
			if (result == null)
				result = caseElementCS(eventType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.DSA_FEEDBACK: {
			DSAFeedback dsaFeedback = (DSAFeedback) theEObject;
			T result = caseDSAFeedback(dsaFeedback);
			if (result == null)
				result = caseDefPropertyCS(dsaFeedback);
			if (result == null)
				result = caseDefCS(dsaFeedback);
			if (result == null)
				result = caseTypedElementCS(dsaFeedback);
			if (result == null)
				result = caseNamedElementCS(dsaFeedback);
			if (result == null)
				result = caseModelElementCS(dsaFeedback);
			if (result == null)
				result = casePivotableElementCS(dsaFeedback);
			if (result == null)
				result = caseElementCS(dsaFeedback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.CASE: {
			Case case_ = (Case) theEObject;
			T result = caseCase(case_);
			if (result == null)
				result = caseExpCS(case_);
			if (result == null)
				result = caseModelElementCS(case_);
			if (result == null)
				result = casePivotableElementCS(case_);
			if (result == null)
				result = caseElementCS(case_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_MAPPING_DOCUMENT: {
			MoCCMLMappingDocument moCCMLMappingDocument = (MoCCMLMappingDocument) theEObject;
			T result = caseMoCCMLMappingDocument(moCCMLMappingDocument);
			if (result == null)
				result = caseCompleteOCLDocumentCS(moCCMLMappingDocument);
			if (result == null)
				result = caseNamespaceCS(moCCMLMappingDocument);
			if (result == null)
				result = caseRootCS(moCCMLMappingDocument);
			if (result == null)
				result = caseNamedElementCS(moCCMLMappingDocument);
			if (result == null)
				result = caseModelElementCS(moCCMLMappingDocument);
			if (result == null)
				result = casePivotableElementCS(moCCMLMappingDocument);
			if (result == null)
				result = caseElementCS(moCCMLMappingDocument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_RELATION: {
			MoCCMLRelation moCCMLRelation = (MoCCMLRelation) theEObject;
			T result = caseMoCCMLRelation(moCCMLRelation);
			if (result == null)
				result = caseExpCS(moCCMLRelation);
			if (result == null)
				result = caseModelElementCS(moCCMLRelation);
			if (result == null)
				result = casePivotableElementCS(moCCMLRelation);
			if (result == null)
				result = caseElementCS(moCCMLRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.IMPORT_STATEMENT: {
			ImportStatement importStatement = (ImportStatement) theEObject;
			T result = caseImportStatement(importStatement);
			if (result == null)
				result = caseImportCS(importStatement);
			if (result == null)
				result = caseNamespaceCS(importStatement);
			if (result == null)
				result = caseNamedElementCS(importStatement);
			if (result == null)
				result = caseModelElementCS(importStatement);
			if (result == null)
				result = casePivotableElementCS(importStatement);
			if (result == null)
				result = caseElementCS(importStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_EXPRESSION: {
			MoCCMLExpression moCCMLExpression = (MoCCMLExpression) theEObject;
			T result = caseMoCCMLExpression(moCCMLExpression);
			if (result == null)
				result = caseExpCS(moCCMLExpression);
			if (result == null)
				result = caseModelElementCS(moCCMLExpression);
			if (result == null)
				result = casePivotableElementCS(moCCMLExpression);
			if (result == null)
				result = caseElementCS(moCCMLExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_MAPPING_DEF_CS: {
			MoCCMLMappingDefCS moCCMLMappingDefCS = (MoCCMLMappingDefCS) theEObject;
			T result = caseMoCCMLMappingDefCS(moCCMLMappingDefCS);
			if (result == null)
				result = caseDefPropertyCS(moCCMLMappingDefCS);
			if (result == null)
				result = caseDefCS(moCCMLMappingDefCS);
			if (result == null)
				result = caseTypedElementCS(moCCMLMappingDefCS);
			if (result == null)
				result = caseNamedElementCS(moCCMLMappingDefCS);
			if (result == null)
				result = caseModelElementCS(moCCMLMappingDefCS);
			if (result == null)
				result = casePivotableElementCS(moCCMLMappingDefCS);
			if (result == null)
				result = caseElementCS(moCCMLMappingDefCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.BASE_CS_VISITOR: {
			BaseCSVisitor<?> baseCSVisitor = (BaseCSVisitor<?>) theEObject;
			T result = caseBaseCSVisitor(baseCSVisitor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.BLOCK_TYPE: {
			BlockType blockType = (BlockType) theEObject;
			T result = caseBlockType(blockType);
			if (result == null)
				result = caseTypedRefCS(blockType);
			if (result == null)
				result = caseNameable(blockType);
			if (result == null)
				result = caseTypeRefCS(blockType);
			if (result == null)
				result = caseElementRefCS(blockType);
			if (result == null)
				result = casePivotableElementCS(blockType);
			if (result == null)
				result = caseElementCS(blockType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_MAPPING_EVENT_DEF_CS: {
			MoCCMLMappingEventDefCS moCCMLMappingEventDefCS = (MoCCMLMappingEventDefCS) theEObject;
			T result = caseMoCCMLMappingEventDefCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = caseMoCCMLMappingDefCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = caseDefPropertyCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = caseDefCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = caseTypedElementCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = caseNamedElementCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = caseModelElementCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = casePivotableElementCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = caseElementCS(moCCMLMappingEventDefCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_MAPPING_BLOCK_DEF_CS: {
			MoCCMLMappingBlockDefCS moCCMLMappingBlockDefCS = (MoCCMLMappingBlockDefCS) theEObject;
			T result = caseMoCCMLMappingBlockDefCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = caseMoCCMLMappingDefCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = caseDefPropertyCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = caseDefCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = caseTypedElementCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = caseNamedElementCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = caseModelElementCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = casePivotableElementCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = caseElementCS(moCCMLMappingBlockDefCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_MAPPING_TIME_BASE: {
			MoCCMLMappingTimeBase moCCMLMappingTimeBase = (MoCCMLMappingTimeBase) theEObject;
			T result = caseMoCCMLMappingTimeBase(moCCMLMappingTimeBase);
			if (result == null)
				result = caseTypedRefCS(moCCMLMappingTimeBase);
			if (result == null)
				result = caseNameable(moCCMLMappingTimeBase);
			if (result == null)
				result = caseTypeRefCS(moCCMLMappingTimeBase);
			if (result == null)
				result = caseElementRefCS(moCCMLMappingTimeBase);
			if (result == null)
				result = casePivotableElementCS(moCCMLMappingTimeBase);
			if (result == null)
				result = caseElementCS(moCCMLMappingTimeBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY: {
			MoCCMLMappingPriority moCCMLMappingPriority = (MoCCMLMappingPriority) theEObject;
			T result = caseMoCCMLMappingPriority(moCCMLMappingPriority);
			if (result == null)
				result = caseExpCS(moCCMLMappingPriority);
			if (result == null)
				result = caseModelElementCS(moCCMLMappingPriority);
			if (result == null)
				result = casePivotableElementCS(moCCMLMappingPriority);
			if (result == null)
				result = caseElementCS(moCCMLMappingPriority);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSA Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSA Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSAFeedback(DSAFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Mapping Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Mapping Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLMappingDocument(MoCCMLMappingDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLRelation(MoCCMLRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportStatement(ImportStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLExpression(MoCCMLExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Mapping Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Mapping Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLMappingDefCS(MoCCMLMappingDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base CS Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base CS Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R> T caseBaseCSVisitor(BaseCSVisitor<R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockType(BlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Mapping Event Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Mapping Event Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLMappingEventDefCS(MoCCMLMappingEventDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Mapping Block Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Mapping Block Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLMappingBlockDefCS(MoCCMLMappingBlockDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Mapping Time Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Mapping Time Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLMappingTimeBase(MoCCMLMappingTimeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mo CCML Mapping Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mo CCML Mapping Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoCCMLMappingPriority(MoCCMLMappingPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCS(ElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotableElementCS(PivotableElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRefCS(ElementRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRefCS(TypeRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedRefCS(TypedRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementCS(ModelElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementCS(NamedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElementCS(TypedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefCS(DefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Property CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefPropertyCS(DefPropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpCS(ExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceCS(NamespaceCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootCS(RootCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete OCL Document CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete OCL Document CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteOCLDocumentCS(CompleteOCLDocumentCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportCS(ImportCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MoCCMLmappingSwitch
