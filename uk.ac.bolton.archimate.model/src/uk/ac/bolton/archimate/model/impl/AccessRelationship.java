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
import uk.ac.bolton.archimate.model.IAccessRelationship;
import uk.ac.bolton.archimate.model.IArchimatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.AccessRelationship#getAccessType <em>Access Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessRelationship extends Relationship implements IAccessRelationship {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AccessRelationship() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.ACCESS_RELATIONSHIP;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getAccessType() {
		return (Integer)eGet(IArchimatePackage.Literals.ACCESS_RELATIONSHIP__ACCESS_TYPE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAccessType(int newAccessType) {
		eSet(IArchimatePackage.Literals.ACCESS_RELATIONSHIP__ACCESS_TYPE, newAccessType);
	}

} //AccessRelationship
