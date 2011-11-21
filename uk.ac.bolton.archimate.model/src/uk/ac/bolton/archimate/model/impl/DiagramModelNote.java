/**
 * Copyright (c) 2010 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IDiagramModelNote;
import uk.ac.bolton.archimate.model.ITextContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelNote#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelNote extends DiagramModelObject implements IDiagramModelNote {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelNote() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.DIAGRAM_MODEL_NOTE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getContent() {
		return (String)eGet(IArchimatePackage.Literals.TEXT_CONTENT__CONTENT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContent(String newContent) {
		eSet(IArchimatePackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}
    
    /** 
     * Left Justified
     */
    @Override
    public int getDefaultTextAlignment() {
        return TEXT_ALIGNMENT_LEFT;
    }
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITextContent.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.DIAGRAM_MODEL_NOTE__CONTENT: return IArchimatePackage.TEXT_CONTENT__CONTENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITextContent.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.TEXT_CONTENT__CONTENT: return IArchimatePackage.DIAGRAM_MODEL_NOTE__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiagramModelNote
