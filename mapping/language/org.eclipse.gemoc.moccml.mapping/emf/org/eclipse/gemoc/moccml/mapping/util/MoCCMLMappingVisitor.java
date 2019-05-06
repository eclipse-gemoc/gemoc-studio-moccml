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

/**
 */
public interface MoCCMLMappingVisitor<R> extends org.eclipse.ocl.xtext.completeoclcs.util.CompleteOCLCSVisitor<R>
{
	R visitMoCCMLMappingDocument(MoCCMLMappingDocument object);
	R visitEventType(EventType object);
	R visitEventKind(EventKind eventKind);
	R visitMoCCMLRelation(MoCCMLRelation relation);
	R visitImportStatement(ImportStatement importStatement);
	R visitMoCCMLExpression(MoCCMLExpression eclExpression);
	R visitMoCCMLMappingDefCS(MoCCMLMappingDefCS eclDefCS);
	R visitDSAFeedBack(DSAFeedback dsaFeedback);
	R visitCase(Case itsCase);
	R visitBlockType(BlockType blockType);
	R visitMoCCMLMappingBlockDefCS(MoCCMLMappingBlockDefCS eclBlockDefCS);
	R visitMoCCMLMappingEventDefCS(MoCCMLMappingEventDefCS eclEventDefCS);
	R visitMoCCMLMappingPriority(MoCCMLMappingPriority moccMLMappingPriority);
	R visitMoCCMLMappingTimeBase(MoCCMLMappingTimeBase moCCMLMappingTimeBase);
}
