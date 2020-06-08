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
public class MoCCMLmappingFactoryImpl extends EFactoryImpl implements MoCCMLmappingFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoCCMLmappingFactory init()
	{
		try
		{
			MoCCMLmappingFactory theMoCCMLmappingFactory = (MoCCMLmappingFactory)EPackage.Registry.INSTANCE.getEFactory(MoCCMLmappingPackage.eNS_URI);
			if (theMoCCMLmappingFactory != null)
			{
				return theMoCCMLmappingFactory;
			}
		}
		catch (Exception exception)
		{
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
	public MoCCMLmappingFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case 0: return createEventType();
			case 1: return createDSAFeedback();
			case 2: return createCase();
			case 3: return createMoCCMLMappingDocument();
			case 4: return createMoCCMLRelation();
			case 5: return createImportStatement();
			case 6: return createMoCCMLExpression();
			case 9: return createBlockType();
			case 10: return createMoCCMLMappingEventDefCS();
			case 11: return createMoCCMLMappingBlockDefCS();
			case 12: return createMoCCMLMappingTimeBase();
			case 13: return createMoCCMLMappingPriority();
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
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case 14:
				return createEventKindFromString(eDataType, initialValue);
			case 15:
				return createVisibilityFromString(eDataType, initialValue);
			case 16:
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
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case 14:
				return convertEventKindToString(eDataType, instanceValue);
			case 15:
				return convertVisibilityToString(eDataType, instanceValue);
			case 16:
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
	@Override
	public EventType createEventType()
	{
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAFeedback createDSAFeedback()
	{
		DSAFeedbackImpl dsaFeedback = new DSAFeedbackImpl();
		return dsaFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Case createCase()
	{
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLMappingDocument createMoCCMLMappingDocument()
	{
		MoCCMLMappingDocumentImpl moCCMLMappingDocument = new MoCCMLMappingDocumentImpl();
		return moCCMLMappingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLRelation createMoCCMLRelation()
	{
		MoCCMLRelationImpl moCCMLRelation = new MoCCMLRelationImpl();
		return moCCMLRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportStatement createImportStatement()
	{
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLExpression createMoCCMLExpression()
	{
		MoCCMLExpressionImpl moCCMLExpression = new MoCCMLExpressionImpl();
		return moCCMLExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockType createBlockType()
	{
		BlockTypeImpl blockType = new BlockTypeImpl();
		return blockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLMappingEventDefCS createMoCCMLMappingEventDefCS()
	{
		MoCCMLMappingEventDefCSImpl moCCMLMappingEventDefCS = new MoCCMLMappingEventDefCSImpl();
		return moCCMLMappingEventDefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLMappingBlockDefCS createMoCCMLMappingBlockDefCS()
	{
		MoCCMLMappingBlockDefCSImpl moCCMLMappingBlockDefCS = new MoCCMLMappingBlockDefCSImpl();
		return moCCMLMappingBlockDefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLMappingTimeBase createMoCCMLMappingTimeBase()
	{
		MoCCMLMappingTimeBaseImpl moCCMLMappingTimeBase = new MoCCMLMappingTimeBaseImpl();
		return moCCMLMappingTimeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLMappingPriority createMoCCMLMappingPriority()
	{
		MoCCMLMappingPriorityImpl moCCMLMappingPriority = new MoCCMLMappingPriorityImpl();
		return moCCMLMappingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKindFromString(EDataType eDataType, String initialValue)
	{
		EventKind result = EventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
	{
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedBackKind createFeedBackKindFromString(EDataType eDataType, String initialValue)
	{
		FeedBackKind result = FeedBackKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedBackKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoCCMLmappingPackage getMoCCMLmappingPackage()
	{
		return (MoCCMLmappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MoCCMLmappingPackage getPackage()
	{
		return MoCCMLmappingPackage.eINSTANCE;
	}

} //MoCCMLmappingFactoryImpl
