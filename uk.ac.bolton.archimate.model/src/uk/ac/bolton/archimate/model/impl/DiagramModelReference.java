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
import uk.ac.bolton.archimate.model.IDiagramModel;
import uk.ac.bolton.archimate.model.IDiagramModelReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelReference#getReferencedModel <em>Referenced Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelReference extends DiagramModelObject implements IDiagramModelReference {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelReference() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.DIAGRAM_MODEL_REFERENCE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModel getReferencedModel() {
		return (IDiagramModel)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReferencedModel(IDiagramModel newReferencedModel) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL, newReferencedModel);
	}

    @Override
    public String getName() {
        if(getReferencedModel() != null) {
            return getReferencedModel().getName();
        }
        else {
            return "";
        }
    }

} //DiagramModelReference
