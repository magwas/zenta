/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.ModelConsistencyException;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.handmade.util.Util;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelReferenceBase#getReferencedModel <em>Referenced Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramModelReferenceBase extends DiagramModelObjectBase implements IDiagramModelReference {
    /**
	 * The cached value of the '{@link #getReferencedModel() <em>Referenced Model</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferencedModel()
	 * @generated
	 * @ordered
	 */
    protected IDiagramModel referencedModel;
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelReferenceBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_REFERENCE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public IDiagramModel getReferencedModel() {
		return Util.verifyNonNull(referencedModel);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public void setReferencedModel(IDiagramModel newReferencedModel) {
    	if (isChecked())
    		checkReferencedModel(newReferencedModel);
		IDiagramModel oldReferencedModel = referencedModel;
		referencedModel = newReferencedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL, oldReferencedModel, referencedModel));
	}

    @Override
    public String getName() {
            return getReferencedModel().getName();
    }
    
    @Override
    public void setName(String name) {
    	throw new ModelConsistencyException("you do not set the name of a diagram reference", this);
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL:
				return getReferencedModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL:
				setReferencedModel((IDiagramModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL:
				setReferencedModel((IDiagramModel)null);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL:
				return referencedModel != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramModelReference
