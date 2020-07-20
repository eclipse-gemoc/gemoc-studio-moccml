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
 * $Id: ExpSpecificationCSAttribution.java,v 1.2 2011/04/20 19:02:15 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLRelation;
import org.eclipse.ocl.pivot.IteratorExp;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.utilities.PivotUtil;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.NamedElement;


public class ECLExpressionAttribution extends AbstractAttribution
{
	public static final ECLExpressionAttribution INSTANCE = new ECLExpressionAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		NamedElement theDeclaration = null;
		for(NamedElement eo : ECLAttribution.INSTANCE.ListOfImportedDeclaration) {
			if (eo.getName().equals(environmentView.getName())){
				theDeclaration = eo;
				environmentView.addElement(eo.getName(), eo);
			}
		}
		if(target instanceof MoCCMLRelation){
			MoCCMLRelation r = (MoCCMLRelation)target;
			
			OperationCallExp pivot = PivotUtil.getPivot(OperationCallExp.class, r);
			if (pivot != null) {
				
				for(OCLExpression paramPivot : pivot.getOwnedArguments()){
					if (paramPivot instanceof IteratorExp) {
						Type t = paramPivot.getType();
						environmentView.addElementsOfScope(t, scopeView);
						environmentView.addNamedElement(t);
						for (Variable iterator : ((IteratorExp)paramPivot).getOwnedIterators()) {
							if (iterator.isIsImplicit()) {
								environmentView.addElementsOfScope(iterator.getType(), scopeView);
							}
							else {
								environmentView.addNamedElement(iterator);
							}
//							if (environmentView.hasFinalResult()) {
//								return null;
//							}
						}
					}
				}
			}
		}
		else //instance of eclExpression
			{
			MoCCMLExpression eclExpr = (MoCCMLExpression)target;
				OperationCallExp pivot = PivotUtil.getPivot(OperationCallExp.class, eclExpr);
				if (pivot != null) {
					for(OCLExpression paramPivot : pivot.getOwnedArguments()){
						if (paramPivot instanceof IteratorExp) {
							Type t = paramPivot.getType();
							environmentView.addElementsOfScope(t, scopeView);
							environmentView.addNamedElement(t);
							for (Variable iterator : ((IteratorExp)paramPivot).getOwnedIterators()) {
								if (iterator.isIsImplicit()) {
									environmentView.addElementsOfScope(iterator.getType(), scopeView);
								}
								else {
									environmentView.addNamedElement(iterator);
								}
//								if (environmentView.hasFinalResult()) {
//									return null;
//								}
							}
						}
					}
				}
			}
		return scopeView.getParent();
	}
}
