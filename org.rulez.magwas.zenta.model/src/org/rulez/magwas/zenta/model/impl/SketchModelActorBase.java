/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ISketchModelActor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sketch Model Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.SketchModelActorBase#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.SketchModelActorBase#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SketchModelActorBase extends DiagramModelObjectBase implements ISketchModelActor {
    /**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
    protected static final String DOCUMENTATION_EDEFAULT = ""; //$NON-NLS-1$
    /**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
    protected String documentation = DOCUMENTATION_EDEFAULT;

    /**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
    protected EList<IProperty> properties;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SketchModelActorBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.SKETCH_MODEL_ACTOR;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDocumentation() {
		return documentation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.SKETCH_MODEL_ACTOR__DOCUMENTATION, oldDocumentation, documentation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
	
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.SKETCH_MODEL_ACTOR__DOCUMENTATION:
				return getDocumentation();
			case IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IZentaPackage.SKETCH_MODEL_ACTOR__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends IProperty>)newValue);
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
			case IZentaPackage.SKETCH_MODEL_ACTOR__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES:
				getProperties().clear();
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
			case IZentaPackage.SKETCH_MODEL_ACTOR__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IDocumentable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.SKETCH_MODEL_ACTOR__DOCUMENTATION: return IZentaPackage.DOCUMENTABLE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES: return IZentaPackage.PROPERTIES__PROPERTIES;
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
		if (baseClass == IDocumentable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DOCUMENTABLE__DOCUMENTATION: return IZentaPackage.SKETCH_MODEL_ACTOR__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IZentaPackage.PROPERTIES__PROPERTIES: return IZentaPackage.SKETCH_MODEL_ACTOR__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //SketchModelActor
