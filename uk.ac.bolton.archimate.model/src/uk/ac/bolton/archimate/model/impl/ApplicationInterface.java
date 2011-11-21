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
import uk.ac.bolton.archimate.model.IApplicationInterface;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IInterfaceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ApplicationInterface#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationInterface extends ArchimateElement implements IApplicationInterface {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ApplicationInterface() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.APPLICATION_INTERFACE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getInterfaceType() {
		return (Integer)eGet(IArchimatePackage.Literals.INTERFACE_ELEMENT__INTERFACE_TYPE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInterfaceType(int newInterfaceType) {
		eSet(IArchimatePackage.Literals.INTERFACE_ELEMENT__INTERFACE_TYPE, newInterfaceType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IInterfaceElement.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE: return IArchimatePackage.INTERFACE_ELEMENT__INTERFACE_TYPE;
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
		if (baseClass == IInterfaceElement.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.INTERFACE_ELEMENT__INTERFACE_TYPE: return IArchimatePackage.APPLICATION_INTERFACE__INTERFACE_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ApplicationInterface
