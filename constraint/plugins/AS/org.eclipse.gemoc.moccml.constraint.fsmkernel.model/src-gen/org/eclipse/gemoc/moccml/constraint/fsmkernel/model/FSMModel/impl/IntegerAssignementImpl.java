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
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.impl;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClassicalExpression.impl.BinaryIntegerExpressionImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.FSMModelPackage;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.IntegerAssignement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntegerAssignementImpl extends BinaryIntegerExpressionImpl implements IntegerAssignement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerAssignementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FSMModelPackage.Literals.INTEGER_ASSIGNEMENT;
	}

} //IntegerAssignementImpl
