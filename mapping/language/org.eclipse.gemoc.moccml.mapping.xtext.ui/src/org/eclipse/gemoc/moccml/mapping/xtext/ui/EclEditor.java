/*******************************************************************************
 * Copyright (c) 2013, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.moccml.mapping.xtext.ui;

import org.eclipse.gemoc.moccml.mapping.xtext.ui.internal.ECLActivator;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.xtext.completeocl.ui.CompleteOCLEditor;

public class EclEditor extends CompleteOCLEditor
{
	public static final String EDITOR_ID = ECLActivator.ORG_ECLIPSE_GEMOC_MOCCML_MAPPING_XTEXT_ECL;
	public EclEditor() {
		super();
	}
	@Override
	public @NonNull String getMarkerId() {
		return EclUiModule.MARKER_ID;
	}
	@Override
	protected void initializeEditor() {
		super.initializeEditor();
		setEditorContextMenuId("#CompleteOCLEditorContext"); //$NON-NLS-1$
		setRulerContextMenuId("#CompleteOCLRulerContext"); //$NON-NLS-1$
		//		setHelpContextId(ITextEditorHelpContextIds.TEXT_EDITOR);
	}
}