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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.MoCCMLMappingVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.completeoclcs.impl.DefPropertyCSImpl;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mo CCML Mapping Block Def CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingBlockDefCSImpl#getEnterWhen <em>Enter When</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingBlockDefCSImpl#getLeaveWhen <em>Leave When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoCCMLMappingBlockDefCSImpl extends MoCCMLMappingDefCSImpl implements MoCCMLMappingBlockDefCS
{
	/**
	 * The number of structural features of the '<em>Mo CCML Mapping Block Def CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MO_CCML_MAPPING_BLOCK_DEF_CS_FEATURE_COUNT = MoCCMLMappingDefCSImpl.MO_CCML_MAPPING_DEF_CS_FEATURE_COUNT + 2;


	/**
	 * The cached value of the '{@link #getEnterWhen() <em>Enter When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterWhen()
	 * @generated
	 * @ordered
	 */
	protected ExpCS enterWhen;

	/**
	 * The cached value of the '{@link #getLeaveWhen() <em>Leave When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaveWhen()
	 * @generated
	 * @ordered
	 */
	protected ExpCS leaveWhen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoCCMLMappingBlockDefCSImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MoCCMLmappingPackage.Literals.MO_CCML_MAPPING_BLOCK_DEF_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpCS getEnterWhen()
	{
		return enterWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterWhen(ExpCS newEnterWhen, NotificationChain msgs)
	{
		ExpCS oldEnterWhen = enterWhen;
		enterWhen = newEnterWhen;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2, oldEnterWhen, newEnterWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnterWhen(ExpCS newEnterWhen)
	{
		if (newEnterWhen != enterWhen)
		{
			NotificationChain msgs = null;
			if (enterWhen != null)
				msgs = ((InternalEObject)enterWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2), null, msgs);
			if (newEnterWhen != null)
				msgs = ((InternalEObject)newEnterWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2), null, msgs);
			msgs = basicSetEnterWhen(newEnterWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2, newEnterWhen, newEnterWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpCS getLeaveWhen()
	{
		return leaveWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeaveWhen(ExpCS newLeaveWhen, NotificationChain msgs)
	{
		ExpCS oldLeaveWhen = leaveWhen;
		leaveWhen = newLeaveWhen;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3, oldLeaveWhen, newLeaveWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaveWhen(ExpCS newLeaveWhen)
	{
		if (newLeaveWhen != leaveWhen)
		{
			NotificationChain msgs = null;
			if (leaveWhen != null)
				msgs = ((InternalEObject)leaveWhen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3), null, msgs);
			if (newLeaveWhen != null)
				msgs = ((InternalEObject)newLeaveWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3), null, msgs);
			msgs = basicSetLeaveWhen(newLeaveWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3, newLeaveWhen, newLeaveWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor)
	{
		return (R) visitor.getAdapter(MoCCMLMappingVisitor.class).visitMoCCMLMappingBlockDefCS(this);
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2:
				return basicSetEnterWhen(null, msgs);
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				return basicSetLeaveWhen(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2:
				return getEnterWhen();
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				return getLeaveWhen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2:
				setEnterWhen((ExpCS)newValue);
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				setLeaveWhen((ExpCS)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2:
				setEnterWhen((ExpCS)null);
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				setLeaveWhen((ExpCS)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2:
				return enterWhen != null;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				return leaveWhen != null;
		}
		return super.eIsSet(featureID);
	}



} //MoCCMLMappingBlockDefCSImpl
