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
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.MoCCMLMappingVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.impl.ExpCSImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mo CCML Mapping Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingPriorityImpl#getHigher <em>Higher</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.MoCCMLMappingPriorityImpl#getLower <em>Lower</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoCCMLMappingPriorityImpl extends ExpCSImpl implements MoCCMLMappingPriority {
	/**
	 * The cached value of the '{@link #getHigher() <em>Higher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigher()
	 * @generated
	 * @ordered
	 */
	protected ExpCS higher;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected ExpCS lower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoCCMLMappingPriorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoCCMLmappingPackage.Literals.MO_CCML_MAPPING_PRIORITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getHigher() {
		return higher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigher(ExpCS newHigher, NotificationChain msgs) {
		ExpCS oldHigher = higher;
		higher = newHigher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER, oldHigher, newHigher);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigher(ExpCS newHigher) {
		if (newHigher != higher) {
			NotificationChain msgs = null;
			if (higher != null)
				msgs = ((InternalEObject) higher).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER, null, msgs);
			if (newHigher != null)
				msgs = ((InternalEObject) newHigher).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER, null, msgs);
			msgs = basicSetHigher(newHigher, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER,
					newHigher, newHigher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(ExpCS newLower, NotificationChain msgs) {
		ExpCS oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER, oldLower, newLower);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(ExpCS newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject) lower).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject) newLower).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER,
					newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor) {
		return (R) visitor.getAdapter(MoCCMLMappingVisitor.class).visitMoCCMLMappingPriority(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER:
			return basicSetHigher(null, msgs);
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER:
			return basicSetLower(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER:
			return getHigher();
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER:
			return getLower();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER:
			setHigher((ExpCS) newValue);
			return;
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER:
			setLower((ExpCS) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER:
			setHigher((ExpCS) null);
			return;
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER:
			setLower((ExpCS) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__HIGHER:
			return higher != null;
		case MoCCMLmappingPackage.MO_CCML_MAPPING_PRIORITY__LOWER:
			return lower != null;
		}
		return super.eIsSet(featureID);
	}

} //MoCCMLMappingPriorityImpl
