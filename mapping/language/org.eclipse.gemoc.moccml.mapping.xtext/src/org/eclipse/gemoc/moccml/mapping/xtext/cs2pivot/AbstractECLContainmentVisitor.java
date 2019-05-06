/**
 * <copyright>
 *
 * Copyright (c) 2010, 2017 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: CompleteOCLPreOrderVisitor.java,v 1.11 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.cs2pivot;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.Case;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.DSAFeedback;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingPriority;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingTimeBase;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation;
import org.eclipse.gemoc.moccml.mapping.util.MoCCMLMappingVisitor;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSContainmentVisitor;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

public class AbstractECLContainmentVisitor
	extends CompleteOCLCSContainmentVisitor implements MoCCMLMappingVisitor<Continuation<?>>
{	
	//
	//	This file is maintained by copying from AbstractExtendingCompleteOCLCSVisitor and changing R to Continuation<?>.
	//
	protected AbstractECLContainmentVisitor(CS2ASConversion context) {
	    super(context);
	}

	public Continuation<?> visitECLDocument(MoCCMLMappingDocument object) {
		return visitCompleteOCLDocumentCS((CompleteOCLDocumentCS)object);
	}

	public Continuation<?> visitEventType(EventType object) {
		return visitTypedRefCS(object);
	}



	public Continuation<?> visitEventKind(EventKind eventKind) {
		// TODO Auto-generated method stub
		return null;
	}

	public Continuation<?> visitMoCCMLMappingRelation(MoCCMLRelation relation) {
		// TODO Auto-generated method stub
		return visitExpCS(relation);
	}

	public Continuation<?> visitImportStatement(ImportStatement importStatement) {
	//	return visitImportStatement(importStatement);
		return null;
	}

	public Continuation<?> visitMoCCMLMappingExpression(MoCCMLExpression eclExpression) {
		// TODO Auto-generated method stub
		return visitExpCS(eclExpression);
	}

	public Continuation<?> visitMoCCMLMappingDefCS(
			MoCCMLMappingDefCS eclDefCS) {
		return visitDefCS(eclDefCS);
	}

	
	public Continuation<?> visitDSAFeedBack(DSAFeedback dsaFeedback) {
		return visitModelElementCS(dsaFeedback);
	}

	
	public Continuation<?> visitCase(Case itsCase) {
		// TODO Auto-generated method stub
		return visitModelElementCS(itsCase);
	}

	@Override
	public Continuation<?> visitBlockType(BlockType blockType) {
		return visitTypedRefCS(blockType);

	}

	@Override
	public Continuation<?> visitMoCCMLMappingBlockDefCS(MoCCMLMappingBlockDefCS eclBlockDefCS) {
		return visitDefCS(eclBlockDefCS);

	}

	@Override
	public Continuation<?> visitMoCCMLMappingEventDefCS(MoCCMLMappingEventDefCS eclEventDefCS) {
		return visitDefCS(eclEventDefCS);

	}

	@Override
	public Continuation<?> visitMoCCMLMappingDocument(MoCCMLMappingDocument object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Continuation<?> visitMoCCMLRelation(MoCCMLRelation relation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Continuation<?> visitMoCCMLExpression(MoCCMLExpression eclExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Continuation<?> visitMoCCMLMappingPriority(MoCCMLMappingPriority moccMLMappingPriorityImpl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Continuation<?> visitMoCCMLMappingTimeBase(MoCCMLMappingTimeBase moCCMLMappingTimeBaseImpl) {
		// TODO Auto-generated method stub
		return null;
	}	
}