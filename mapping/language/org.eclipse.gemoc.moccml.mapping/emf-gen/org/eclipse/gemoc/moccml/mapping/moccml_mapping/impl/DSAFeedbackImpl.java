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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage;
import org.eclipse.gemoc.moccml.mapping.util.MoCCMLMappingVisitor;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.completeoclcs.impl.DefPropertyCSImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSA Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.eclipse.gemoc.moccml.mapping.moccml_mapping.impl.DSAFeedbackImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSAFeedbackImpl extends DefPropertyCSImpl implements DSAFeedback
{
	/**
	 * The number of structural features of the '<em>DSA Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DSA_FEEDBACK_FEATURE_COUNT = DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2;


	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> cases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSAFeedbackImpl()
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
		return MoCCMLmappingPackage.Literals.DSA_FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Case> getCases()
	{
		if (cases == null)
		{
			cases = new EObjectContainmentEList<Case>(Case.class, this, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 0);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLMappingEventDefCS getOwner()
	{
		if (eContainerFeatureID() != (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1)) return null;
		return (MoCCMLMappingEventDefCS)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(MoCCMLMappingEventDefCS newOwner, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newOwner, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(MoCCMLMappingEventDefCS newOwner)
	{
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != (DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1) && newOwner != null))
		{
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2, MoCCMLMappingEventDefCS.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1, newOwner, newOwner));
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> R accept(final BaseCSVisitor<R> visitor)
	{
		return (R) visitor.getAdapter(MoCCMLMappingVisitor.class).visitDSAFeedBack(this);
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
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((MoCCMLMappingEventDefCS)otherEnd, msgs);
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
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 0:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1:
				return eInternalContainer().eInverseRemove(this, DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 2, MoCCMLMappingEventDefCS.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 0:
				return getCases();
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1:
				return getOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 0:
				getCases().clear();
				getCases().addAll((Collection<? extends Case>)newValue);
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1:
				setOwner((MoCCMLMappingEventDefCS)newValue);
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
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 0:
				getCases().clear();
				return;
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1:
				setOwner((MoCCMLMappingEventDefCS)null);
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
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 0:
				return cases != null && !cases.isEmpty();
			case DefPropertyCSImpl.DEF_PROPERTY_CS_FEATURE_COUNT + 1:
				return getOwner() != null;
		}
		return super.eIsSet(featureID);
	}



} //DSAFeedbackImpl
