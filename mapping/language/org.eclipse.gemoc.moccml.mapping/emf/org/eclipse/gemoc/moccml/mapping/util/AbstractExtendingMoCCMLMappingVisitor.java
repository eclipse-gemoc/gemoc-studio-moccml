/**
 * <copyright>
 *
 * Copyright (c) 2010,2017 E.D.Willink and others.
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
 * This code is auto-generated
 * from: /org.eclipse.ocl.examples.xtext.completeocl/model/CompleteOCLCST.ecore
 * by: org.eclipse.ocl.examples.build.acceleo.GenerateVisitor
 * defined by: org.eclipse.ocl.examples.build.acceleo.generateVisitors.mtl
 * invoked by: org.eclipse.ocl.examples.build.utilities.*
 * from: org.eclipse.ocl.examples.build.*.mwe2
 *
 * Do not edit it.
 *
 * $Id$
 */
package	org.eclipse.gemoc.moccml.mapping.util;

import org.eclipse.gemoc.moccml.mapping.moccml_mapping.BlockType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventKind;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingBlockDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLMappingEventDefCS;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation;

/**
 * An AbstractExtendingMoCCMLMappingVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingMoCCMLMappingVisitor<R, C>
	extends org.eclipse.ocl.xtext.completeoclcs.util.AbstractExtendingCompleteOCLCSVisitor<R, C>
	implements MoCCMLMappingVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractExtendingMoCCMLMappingVisitor(C context) {
	    super(context);
	}
	
	@Override
	public R visitEventType(EventType object) {
		return null;//visitExpCS(object.getReferedElement());
	}

	@Override
	public R visitBlockType(BlockType object) {
		return null;//visitExpCS(object.getReferedElement());
	}
	
	@Override
	public R visitMoCCMLMappingDocument(MoCCMLMappingDocument object) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public R visitEventKind(EventKind eventKind) {
		return null;
	}

	@Override
	public R visitMoCCMLRelation(MoCCMLRelation relation)
	{
		return null;
	}

	@Override
	public R visitImportStatement(ImportStatement importStatement)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public R visitMoCCMLExpression(MoCCMLExpression eclExpression) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public R visitMoCCMLMappingDefCS(MoCCMLMappingDefCS eclDefCS) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public R visitMoCCMLMappingEventDefCS(MoCCMLMappingEventDefCS eclDefCS) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public R visitMoCCMLMappingBlockDefCS(MoCCMLMappingBlockDefCS eclDefCS) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
