/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZentaDiagramModelBase extends DiagramModelBase implements IZentaDiagramModel {
    /**
	 * The default value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
    protected static final int VIEWPOINT_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
    protected int viewpoint = VIEWPOINT_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ZentaDiagramModelBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.ZENTA_DIAGRAM_MODEL;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getViewpoint() {
		return viewpoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setViewpoint(int newViewpoint) {
		int oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_DIAGRAM_MODEL__VIEWPOINT, oldViewpoint, viewpoint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.ZENTA_DIAGRAM_MODEL__VIEWPOINT:
				return getViewpoint();
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
			case IZentaPackage.ZENTA_DIAGRAM_MODEL__VIEWPOINT:
				if (null == newValue)
					throw new IllegalArgumentException("viewPoint ID cannot be null");
				setViewpoint((Integer)newValue);
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
			case IZentaPackage.ZENTA_DIAGRAM_MODEL__VIEWPOINT:
				setViewpoint(VIEWPOINT_EDEFAULT);
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
			case IZentaPackage.ZENTA_DIAGRAM_MODEL__VIEWPOINT:
				return viewpoint != VIEWPOINT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (viewpoint: ");
		result.append(viewpoint);
		result.append(')');
		return result.toString();
	}

    @Override
    public boolean isTemplate() {
        return getPropertyNamed("Template").size() > 0;
    }
        private List<String> getPropertyNamed(String string) {
            List<String> ret = new ArrayList<String>();
            for(IProperty prop : this.getProperties())
                if(prop.getKey().equals(string))
                    ret.add(prop.getValue());
            return ret;
        }
} //ZentaDiagramModel
