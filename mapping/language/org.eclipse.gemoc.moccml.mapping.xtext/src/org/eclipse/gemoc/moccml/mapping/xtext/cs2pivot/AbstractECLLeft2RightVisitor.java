/**
wçyumuù$ * <copyright>
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
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCSLeft2RightVisitor;
import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS;

public class AbstractECLLeft2RightVisitor
	extends CompleteOCLCSLeft2RightVisitor implements MoCCMLMappingVisitor<Element>
{	
	//
	//	This file is maintained by copying from AbstractExtendingCompleteOCLCSVisitor and changing R to Element.
	//
	protected AbstractECLLeft2RightVisitor(CS2ASConversion context) {
        super(context);
    }

	public Element visitEventType(EventType object) {
		return super.visitTypedRefCS(object);
	}

	public Element visitMoCCMLMappingDocument(MoCCMLMappingDocument object) {
		return visitCompleteOCLDocumentCS((CompleteOCLDocumentCS)object);
	}


	public Element visitEventKind(EventKind eventKind) {
		return null;
	}

	public Element visitMoCCMLMappingRelation(MoCCMLRelation relation)
	{
		return visitExpCS(relation);
	}

	public Element visitImportStatement(ImportStatement importStatement)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Element visitMoCCMLMappingExpression(MoCCMLExpression eclExpression) {
		return visitExpCS(eclExpression);
	}

	public Element visitMoCCMLMappingDefCS(MoCCMLMappingDefCS eclDefCS) {
		return null;
	}

	
	public Element visitDSAFeedBack(DSAFeedback dsaFeedback) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Element visitCase(Case itsCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element visitBlockType(BlockType blockType) {
		return super.visitTypedRefCS(blockType);
	}

	@Override
	public Element visitMoCCMLMappingBlockDefCS(MoCCMLMappingBlockDefCS eclBlockDefCS) {
		return visitMoCCMLMappingDefCS(eclBlockDefCS);
	}

	@Override
	public Element visitMoCCMLMappingEventDefCS(MoCCMLMappingEventDefCS eclEventDefCS) {
		return visitMoCCMLMappingDefCS(eclEventDefCS);
	}

	@Override
	public Element visitMoCCMLRelation(MoCCMLRelation relation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element visitMoCCMLExpression(MoCCMLExpression eclExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element visitMoCCMLMappingPriority(MoCCMLMappingPriority moccMLMappingPriority) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element visitMoCCMLMappingTimeBase(MoCCMLMappingTimeBase moCCMLMappingTimeBase) {
		// TODO Auto-generated method stub
		return null;
	}

}