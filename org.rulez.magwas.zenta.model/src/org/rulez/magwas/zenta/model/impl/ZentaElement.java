/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.ICloneable;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElement#getZentaModel <em>Zenta Model</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElement#getId <em>Id</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElement#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElement#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElement#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ZentaElement extends EObjectImpl implements IZentaElement {
    /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_EDEFAULT = null;

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
     * Adapter Map for arbitrary objects
     */
    private Map<Object, Object> fAdapterMap = new HashMap<Object, Object>();

    protected ZentaElement() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.ZENTA_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_ELEMENT__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectClass() {
		return objectClass;
	}

	public void setObjectClass(String newObjectClass) {
		String oldObjectClass = objectClass;
		objectClass = newObjectClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_ELEMENT__OBJECT_CLASS, oldObjectClass, objectClass));
		setAppearanceForDefinedElements();
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION, oldDocumentation, documentation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentaPackage.ZENTA_ELEMENT__PROPERTIES);
		}
		return properties;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EObject getCopy() {
        IZentaElement newObject = EcoreUtil.copy(this);
        newObject.setId(null); // need a new ID
        return newObject;
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
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
     * <!-- begin-user-doc -->
     * Return the Parent Zenta model
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IZentaModel getZentaModel() {
        if(eContainer() == null) {
            return null;
        }
        return ((IZentaModelElement)eContainer()).getZentaModel();
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_ELEMENT__ID, oldId, id));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.ZENTA_ELEMENT__ZENTA_MODEL:
				return getZentaModel();
			case IZentaPackage.ZENTA_ELEMENT__ID:
				return getId();
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				return getName();
			case IZentaPackage.ZENTA_ELEMENT__OBJECT_CLASS:
				return getObjectClass();
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
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
			case IZentaPackage.ZENTA_ELEMENT__ID:
				setId((String)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__OBJECT_CLASS:
				setObjectClass((String)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
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
			case IZentaPackage.ZENTA_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_ELEMENT__OBJECT_CLASS:
				setObjectClass(OBJECT_CLASS_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
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
			case IZentaPackage.ZENTA_ELEMENT__ZENTA_MODEL:
				return getZentaModel() != null;
			case IZentaPackage.ZENTA_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentaPackage.ZENTA_ELEMENT__OBJECT_CLASS:
				return OBJECT_CLASS_EDEFAULT == null ? objectClass != null : !OBJECT_CLASS_EDEFAULT.equals(objectClass);
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
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
		if (baseClass == IIdentifier.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_ELEMENT__ID: return IZentaPackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == ICloneable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == INameable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_ELEMENT__NAME: return IZentaPackage.NAMEABLE__NAME;
				case IZentaPackage.ZENTA_ELEMENT__OBJECT_CLASS: return IZentaPackage.NAMEABLE__OBJECT_CLASS;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION: return IZentaPackage.DOCUMENTABLE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_ELEMENT__PROPERTIES: return IZentaPackage.PROPERTIES__PROPERTIES;
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
		if (baseClass == IIdentifier.class) {
			switch (baseFeatureID) {
				case IZentaPackage.IDENTIFIER__ID: return IZentaPackage.ZENTA_ELEMENT__ID;
				default: return -1;
			}
		}
		if (baseClass == ICloneable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == INameable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.NAMEABLE__NAME: return IZentaPackage.ZENTA_ELEMENT__NAME;
				case IZentaPackage.NAMEABLE__OBJECT_CLASS: return IZentaPackage.ZENTA_ELEMENT__OBJECT_CLASS;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DOCUMENTABLE__DOCUMENTATION: return IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IZentaPackage.PROPERTIES__PROPERTIES: return IZentaPackage.ZENTA_ELEMENT__PROPERTIES;
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
		result.append(", documentation: "); //$NON-NLS-1$
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

    @Override
	public List<String> getPropertyNamed(String propname) {
		List<String> ret = new ArrayList<String>();
		for(IProperty  prop : getProperties())
			if(prop.getKey().equals(propname))
				ret.add(prop.getValue());
		return ret;
	}

    @Override
 	public void setAppearanceForDefinedElements() {
		IZentaModel model = getZentaModel();
		if(null == model)
			return;
		for(IDiagramModel dm : model.getDiagramModels())
			for(IDiagramModelObject dmo : dm.getChildren())
				setAppearanceOn(dmo);
	}
		private void setAppearanceOn(IDiagramModelObject dmo) {
			if(dmo instanceof IDiagramModelZentaObject) {
				IDiagramModelZentaObject dmzo = (IDiagramModelZentaObject) dmo;
				if(equals(dmzo.getZentaElement())) {
					IZentaElement definingElement = getDefiningElement();
					dmzo.setAppearanceBy(definingElement);
				}
				for(IDiagramModelObject kid : dmzo.getChildren())
					setAppearanceOn(kid);
				for(IDiagramModelConnection sc : dmzo.getSourceConnections())
					setAppearanceOnSc(sc);
			}
		}
			private void setAppearanceOnSc(IDiagramModelConnection dmo) {
				if(!(dmo instanceof IDiagramModelZentaConnection))
						return;
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) dmo;
				if(equals(dmzc.getRelationship())) {
					dmzc.setAppearanceBy(getDefiningElement());
				}
			}
			private IZentaElement getDefiningElement() {
				IZentaModel model = getZentaModel();
				IZentaElement defining = (IZentaElement) ZentaModelUtils.getObjectByID(model, objectClass);
				return defining;
			}

	public HashMap<String, EAttribute> getObjectAppearanceProperties() {
		HashMap<String, EAttribute> props = new HashMap<String, EAttribute>();
		props.put("font",IZentaPackage.eINSTANCE.getFontAttribute_Font());
		props.put("fontColor",IZentaPackage.eINSTANCE.getFontAttribute_FontColor());
		props.put("textAlignment",IZentaPackage.eINSTANCE.getFontAttribute_TextAlignment());
		props.put("fillColor",IZentaPackage.eINSTANCE.getDiagramModelObject_FillColor());
		props.put("elementShape",IZentaPackage.eINSTANCE.getDiagramModelObject_ElementShape());
		return props;
	}

} //ZentaElement
