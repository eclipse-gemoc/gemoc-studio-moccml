/**
 * <copyright>
 *
 * Copyright (c) 2012, 2017 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import java.util.ArrayList;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.BooleanLiteralExp;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PrimitiveType;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.base.cs2as.ValidationDiagnostic;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;
import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpSpecificationCS;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class ECLContainmentVisitor extends AbstractECLContainmentVisitor
{


	public ECLContainmentVisitor(CS2ASConversion context) {
		super(context);
	}


	
	
	@Override
	public Continuation<?> visitMoCCMLMappingDocument(MoCCMLMappingDocument object) {
		Continuation<?> cont = visitCompleteOCLDocumentCS((CompleteOCLDocumentCS)object);
		return cont;
	}
	
	@Override
	public Continuation<?> visitDSAFeedBack(DSAFeedback dsaFeedback) {
	
		return null;
	}

	@Override
	public Continuation<?> visitCase(Case itsCase) {

		return null;
	}	
	@Override
	public Continuation<?> visitMoCCMLMappingEventDefCS(MoCCMLMappingEventDefCS object) {
	//	super.visitDefCS(object);
		
		
		
		@NonNull Property contextProperty = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, object);
		contextProperty.setIsDerived(true);
		contextProperty.setIsReadOnly(true);
		contextProperty.setIsTransient(true);
		contextProperty.setIsVolatile(true);
		contextProperty.setIsResolveProxies(false);
		ExpressionInOCL pivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getOwnedSpecification());
		contextProperty.setOwnedExpression(pivotSpecification);

		contextProperty.setType(context.getStandardLibrary().getOclAnyType());
		
//		@Nullable
//		ExpressionInOCL pivotCond = context.refreshModelElement(ExpressionInOCL.class, PivotPackage.Literals.EXPRESSION_IN_OCL, object.getCondition());
//		pivotCond.setOwningConstraint(pivotSpecification.getOwningConstraint());
//		
//		//PivotUtil.getPivot(ExpressionInOCL.class, object.getCondition());
////		object.getCondition().setPivot(pivotCond);
//		context.installPivotUsage(object.getCondition(),pivotCond);
////		@NonNull
////		ExpressionInOCL conditionElement = context.refreshModelElement(ExpressionInOCL.class, PivotPackage.Literals.EXPRESSION_IN_OCL, object.getCondition());
////		context.refreshContextVariable(object.getCondition(), pivotCond);
//		//		visitExpCS(object.getCondition());
		
		
		@NonNull
		BooleanLiteralExp pivotCond = context.refreshModelElement(BooleanLiteralExp.class, PivotPackage.Literals.BOOLEAN_LITERAL_EXP, object.getCondition());
		context.installPivotUsage(object.getCondition(),pivotCond);
		//visitContextCS((ContextCS) object.getCondition());

		
		if (object instanceof MoCCMLMappingEventDefCS){
				visitMoCCMLMappingEventContainment((MoCCMLMappingEventDefCS) object);
				visitMoCCMLMappingTimeBaseContainment((MoCCMLMappingEventDefCS) object);
		}
		
		return null;
	}

	@Override
	public Continuation<?> visitMoCCMLMappingBlockDefCS(MoCCMLMappingBlockDefCS object) {
		@NonNull Property contextProperty = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, object);
		contextProperty.setIsDerived(true);
		contextProperty.setIsReadOnly(true);
		contextProperty.setIsTransient(true);
		contextProperty.setIsVolatile(true);
		contextProperty.setIsResolveProxies(false);
		ExpressionInOCL pivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getOwnedSpecification());
		contextProperty.setOwnedExpression(pivotSpecification);
		
		
		if (object instanceof MoCCMLMappingBlockDefCS){
			visitMoCCMLMappingBlockContainment((MoCCMLMappingBlockDefCS) object);
		}
		
		return null;
	}


	private void visitMoCCMLMappingEventContainment(MoCCMLMappingEventDefCS object) {
		if (object.getDsaResultName() != null && object.getFeedback() != null){
			
			Property resultProperty = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, object.getFeedback());
			resultProperty.setIsDerived(true);
			resultProperty.setIsReadOnly(true);
			resultProperty.setIsTransient(true);
			resultProperty.setIsVolatile(true);
			resultProperty.setIsResolveProxies(false);
			resultProperty.setName(object.getDsaResultName());

//			ClassifierContextDeclCS cs_resultClassifierContextDecl = object.getOwningClassifierContextDecl();
//			Type resultModelClassifier = cs_resultClassifierContextDecl.getClassifier();
//			if (resultModelClassifier != null) {
//				registerProperty(resultModelClassifier, resultProperty);
//			}
			
			context.refreshName(resultProperty, object.getDsaResultName());
			context.installPivotUsage(object.getFeedback(), resultProperty);
			
//			ExpressionInOCL resultPivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getDsaResultName());
//
//			resultProperty.setDefaultExpression(pivotSpecification);	
		}
	}
	
	private void visitMoCCMLMappingTimeBaseContainment(MoCCMLMappingEventDefCS object) {
		if (object.getOwnedType() instanceof MoCCMLMappingTimeBase){
			ExpSpecificationCS specMagnitude = object.getOwnedSpecification();
			MoCCMLMappingTimeBase type = (MoCCMLMappingTimeBase) object.getOwnedType();
			System.out.println("TimeBase #\n#\n !");
		}
	}
	
	
	private void visitMoCCMLMappingBlockContainment(MoCCMLMappingBlockDefCS object) {
//		if (object.getEnterWhen() != null){
//			ExpressionInOCL enterWhenpivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getEnterWhen());
//			context.installPivotUsage(object.getEnterWhen(), enterWhenpivotSpecification);
//			context.refreshName(enterWhenpivotSpecification, object.getName()+"enterWhen");
//			context.installPivotUsage(object.getEnterWhen(), enterWhenpivotSpecification);		
//		}
//		if (object.getLeaveWhen() != null){
//			ExpressionInOCL leaveWhenpivotSpecification = PivotUtil.getPivot(ExpressionInOCL.class, object.getLeaveWhen());
//			context.installPivotUsage(object.getEnterWhen(), leaveWhenpivotSpecification);
//			context.refreshName(leaveWhenpivotSpecification, object.getName()+"enterWhen");
//			context.installPivotUsage(object.getEnterWhen(), leaveWhenpivotSpecification);		
//		}
	}
	
	@Override
	public Continuation<?> visitEventType(EventType csElement) {

		return null;
		
	}
	

}
