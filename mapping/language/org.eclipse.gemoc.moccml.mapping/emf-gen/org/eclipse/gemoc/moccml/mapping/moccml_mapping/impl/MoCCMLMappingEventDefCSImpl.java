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
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.MoCCMLMappingVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.completeoclcs.impl.DefPropertyCSImpl;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mo CCML Mapping Event Def CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingEventDefCSImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingEventDefCSImpl#getFuture <em>Future</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingEventDefCSImpl#getDsaResultName <em>Dsa Result Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoCCMLMappingEventDefCSImpl extends MoCCMLMappingDefCSImpl implements MoCCMLMappingEventDefCS
{
	/**
	 * The number of structural features of the '<em>Mo CCML Mapping Event Def CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MO_CCML_MAPPING_EVENT_DEF_CS_FEATURE_COUNT = MoCCMLMappingDefCSImpl.MO_CCML_MAPPING_DEF_CS_FEATURE_COUNT + 3;


	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected DSAFeedback feedback;

	/**
	 * The cached value of the '{@link #getFuture() <em>Future</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuture()
	 * @generated
	 * @ordered
	 */
	protected ExpCS future;

	/**
	 * The default value of the '{@link #getDsaResultName() <em>Dsa Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsaResultName()
	 * @generated
	 * @ordered
	 */
	protected static final String DSA_RESULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDsaResultName() <em>Dsa Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsaResultName()
	 * @generated
	 * @ordered
	 */
	protected String dsaResultName = DSA_RESULT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoCCMLMappingEventDefCSImpl()
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
		return MoCCMLmappingPackage.Literals.MO_CCML_MAPPING_EVENT_DEF_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAFeedback getFeedback()
	{
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedback(DSAFeedback newFeedback, NotificationChain msgs)
	{
		DSAFeedback oldFeedback = feedback;
		feedback = newFeedback;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2, oldFeedback, newFeedback);
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
	public void setFeedback(DSAFeedback newFeedback)
	{
		if (newFeedback != feedback)
		{
			NotificationChain msgs = null;
			if (feedback != null)
				msgs = ((InternalEObject)feedback).eInverseRemove(this, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1, DSAFeedback.class, msgs);
			if (newFeedback != null)
				msgs = ((InternalEObject)newFeedback).eInverseAdd(this, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1, DSAFeedback.class, msgs);
			msgs = basicSetFeedback(newFeedback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2, newFeedback, newFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpCS getFuture()
	{
		return future;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuture(ExpCS newFuture, NotificationChain msgs)
	{
		ExpCS oldFuture = future;
		future = newFuture;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3, oldFuture, newFuture);
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
	public void setFuture(ExpCS newFuture)
	{
		if (newFuture != future)
		{
			NotificationChain msgs = null;
			if (future != null)
				msgs = ((InternalEObject)future).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3), null, msgs);
			if (newFuture != null)
				msgs = ((InternalEObject)newFuture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3), null, msgs);
			msgs = basicSetFuture(newFuture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3, newFuture, newFuture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDsaResultName()
	{
		return dsaResultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDsaResultName(String newDsaResultName)
	{
		String oldDsaResultName = dsaResultName;
		dsaResultName = newDsaResultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 4, oldDsaResultName, dsaResultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor)
	{
		return (R) visitor.getAdapter(MoCCMLMappingVisitor.class).visitMoCCMLMappingEventDefCS(this);
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2:
				if (feedback != null)
					msgs = ((InternalEObject)feedback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2), null, msgs);
				return basicSetFeedback((DSAFeedback)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
				return basicSetFeedback(null, msgs);
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				return basicSetFuture(null, msgs);
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
				return getFeedback();
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				return getFuture();
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 4:
				return getDsaResultName();
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
				setFeedback((DSAFeedback)newValue);
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				setFuture((ExpCS)newValue);
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 4:
				setDsaResultName((String)newValue);
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
				setFeedback((DSAFeedback)null);
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				setFuture((ExpCS)null);
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 4:
				setDsaResultName(DSA_RESULT_NAME_EDEFAULT);
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
				return feedback != null;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 3:
				return future != null;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 4:
				return DSA_RESULT_NAME_EDEFAULT == null ? dsaResultName != null : !DSA_RESULT_NAME_EDEFAULT.equals(dsaResultName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dsaResultName: ");
		result.append(dsaResultName);
		result.append(')');
		return result.toString();
	}



} //MoCCMLMappingEventDefCSImpl
