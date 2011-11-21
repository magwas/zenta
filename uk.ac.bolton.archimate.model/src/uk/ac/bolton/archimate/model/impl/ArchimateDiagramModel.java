/**
 * Copyright (c) 2010-2011 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.bolton.archimate.model.IArchimateDiagramModel;
import uk.ac.bolton.archimate.model.IArchimatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateDiagramModel#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchimateDiagramModel extends DiagramModel implements IArchimateDiagramModel {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ArchimateDiagramModel() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.ARCHIMATE_DIAGRAM_MODEL;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getViewpoint() {
		return (Integer)eGet(IArchimatePackage.Literals.ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setViewpoint(int newViewpoint) {
		eSet(IArchimatePackage.Literals.ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT, newViewpoint);
	}

} //ArchimateDiagramModel
