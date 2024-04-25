/**
 * Copyright (c) 2012-2017 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.impl;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClassicalExpression.impl.BinaryIntegerExpressionImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.EditionExtensionPackage;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.editionextension.IntSelfMultiplyAssignement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Self Multiply Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntSelfMultiplyAssignementImpl extends BinaryIntegerExpressionImpl implements IntSelfMultiplyAssignement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntSelfMultiplyAssignementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditionExtensionPackage.Literals.INT_SELF_MULTIPLY_ASSIGNEMENT;
	}

} //IntSelfMultiplyAssignementImpl
