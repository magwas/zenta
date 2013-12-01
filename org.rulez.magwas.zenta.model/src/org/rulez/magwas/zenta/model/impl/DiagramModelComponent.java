/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.ICloneable;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.INameable;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponent#getId <em>Id</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponent#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponent#getDiagramModel <em>Diagram Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramModelComponent extends EObjectImpl implements IDiagramModelComponent {

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_EDEFAULT = null;

    protected static Object getValueFromStringForFeature(EAttribute feature,
			String valuestring) {
				Class<?> type = feature.getEType().getInstanceClass();
				Object value;
				if(type.equals(int.class)) {
					value = Integer.parseInt(valuestring);
				} else if (type.equals(String.class)) {
					value = valuestring;
				} else {
					throw new UnknownEAttributeType();
				}
				return value;
			}
		    public static class UnknownEAttributeType extends RuntimeException {
				private static final long serialVersionUID = 1L;
			}


	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected String id = ID_EDEFAULT;

    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_CLASS_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected String objectClass = OBJECT_CLASS_EDEFAULT;

				/**
     * Adapter Map for arbitrary objects
     */
    private Map<Object, Object> fAdapterMap = new HashMap<Object, Object>();

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelComponent() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_COMPONENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getId() {
		return id;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID, oldId, id));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectClass() {
		return objectClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectClass(String newObjectClass) {
		String oldObjectClass = objectClass;
		objectClass = newObjectClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_COMPONENT__OBJECT_CLASS, oldObjectClass, objectClass));
	}

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IDiagramModel getDiagramModel() {
        if(eContainer() == null) {
            return null;
        }
        return ((IDiagramModelComponent)eContainer()).getDiagramModel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Object getAdapter(Object adapter) {
        if(!fAdapterMap.containsKey(adapter) && eContainer() instanceof IAdapter) {
            return ((IAdapter)eContainer()).getAdapter(adapter);
        }
        
        return fAdapterMap.get(adapter);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setAdapter(Object adapter, Object object) {
        fAdapterMap.put(adapter, object);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EObject getCopy() {
        IDiagramModelComponent newObject = EcoreUtil.copy(this);
        newObject.setId(null); // need a new ID
        return newObject;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				return getId();
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				return getName();
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__OBJECT_CLASS:
				return getObjectClass();
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL:
				return getDiagramModel();
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
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				setId((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__OBJECT_CLASS:
				setObjectClass((String)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__OBJECT_CLASS:
				setObjectClass(OBJECT_CLASS_EDEFAULT);
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
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__OBJECT_CLASS:
				return OBJECT_CLASS_EDEFAULT == null ? objectClass != null : !OBJECT_CLASS_EDEFAULT.equals(objectClass);
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL:
				return getDiagramModel() != null;
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
		if (baseClass == ICloneable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IAdapter.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == INameable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME: return IZentaPackage.NAMEABLE__NAME;
				case IZentaPackage.DIAGRAM_MODEL_COMPONENT__OBJECT_CLASS: return IZentaPackage.NAMEABLE__OBJECT_CLASS;
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
		if (baseClass == ICloneable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IAdapter.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == INameable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.NAMEABLE__NAME: return IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME;
				case IZentaPackage.NAMEABLE__OBJECT_CLASS: return IZentaPackage.DIAGRAM_MODEL_COMPONENT__OBJECT_CLASS;
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", objectClass: "); //$NON-NLS-1$
		result.append(objectClass);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setAppearanceBy(IZentaElement reference) {
		if(null == reference) {
			return;
		}
		for(IProperty prop : reference.getProperties())
			setProperty(prop,reference);
	}

	void setProperty(IProperty prop, IZentaElement reference) {
		String key = prop.getKey();
		String valuestring = prop.getValue();
		Map<String, EAttribute> oaprops = reference.getObjectAppearanceProperties();
		if(oaprops.containsKey(key)) {
			EAttribute feature = oaprops.get(key);
			Object value = DiagramModelZentaObject.getValueFromStringForFeature(feature,
					valuestring);
			eSet(feature, value);
		}
	}

} //DiagramModelComponent
