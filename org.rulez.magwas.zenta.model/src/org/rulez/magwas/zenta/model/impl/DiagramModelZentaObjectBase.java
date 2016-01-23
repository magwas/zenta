/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.UnTestedException;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Zenta Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase#getZentaElement <em>Zenta Element</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelZentaObjectBase extends DiagramModelObjectBase implements IDiagramModelZentaObject {
    
	private static final String DEFAULT_SHAPE = "rectangleElementShape";
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
    protected EList<IDiagramModelObject> children;
    /**
	 * The cached value of the '{@link #getZentaElement() <em>Zenta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZentaElement()
	 * @generated
	 * @ordered
	 */
	protected IZentaElement zentaElement;
				/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected static final int TYPE_EDEFAULT = 0;
    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected int type = TYPE_EDEFAULT;
 
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelZentaObjectBase() {
		super();
	}
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_ZENTA_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IDiagramModelObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<IDiagramModelObject>(IDiagramModelObject.class, this, IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN);
		}
		return children;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IZentaElement getZentaElement() {
		return zentaElement;
	}
				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZentaElement(IZentaElement newZentaElement, NotificationChain msgs) {
		IZentaElement oldZentaElement = zentaElement;
		zentaElement = newZentaElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT, oldZentaElement, newZentaElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZentaElement(IZentaElement newZentaElement) {
		if (newZentaElement != zentaElement) {
			NotificationChain msgs = null;
			if (zentaElement != null)
				msgs = ((InternalEObject)zentaElement).eInverseRemove(this, IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS, IZentaElement.class, msgs);
			if (newZentaElement != null)
				msgs = ((InternalEObject)newZentaElement).eInverseAdd(this, IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS, IZentaElement.class, msgs);
			msgs = basicSetZentaElement(newZentaElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT, newZentaElement, newZentaElement));
	}
	
	@Override
    public String getName() {
        if(getZentaElement() != null) {
            return getZentaElement().getName();
        }
        else {
            return super.getName();
        }
    }
    
    @Override
    public void setName(String newName) {
        if(getZentaElement() != null) {
            getZentaElement().setName(newName);
        }
    }


    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(int newType) {
		int oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__TYPE, oldType, type));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addZentaElementToModel(IFolder parent) {
        IZentaElement element = getZentaElement();
        if(element != null && element.eContainer() == null) {
            // If parent is null use default folder
            if(parent == null) {
            	throw new UnTestedException();
            }
            parent.getElements().add(element);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void removeZentaElementFromModel() {
        IZentaElement element = getZentaElement();
        if(element != null) {
            IFolder folder = (IFolder)element.eContainer();
            if(folder != null) {
                folder.getElements().remove(element);
            }
        }
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT:
				if (zentaElement != null)
					msgs = ((InternalEObject)zentaElement).eInverseRemove(this, IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS, IZentaElement.class, msgs);
				return basicSetZentaElement((IZentaElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
				@Override
    public EObject getCopy() {
        IDiagramModelZentaObject newObject = (IDiagramModelZentaObject)super.getCopy();
        
        IZentaElement element = (IZentaElement)getZentaElement().getCopy();
        newObject.setZentaElement(element);
        
        // Clear children
        newObject.getChildren().clear();
        
        return newObject;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT:
				return basicSetZentaElement(null, msgs);
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN:
				return getChildren();
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT:
				return getZentaElement();
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__TYPE:
				return getType();
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IDiagramModelObject>)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT:
				setZentaElement((IZentaElement)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__TYPE:
				setType((Integer)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN:
				getChildren().clear();
				return;
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT:
				setZentaElement((IZentaElement)null);
				return;
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN:
				return children != null && !children.isEmpty();
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT:
				return zentaElement != null;
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__TYPE:
				return type != TYPE_EDEFAULT;
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
		if (baseClass == IDiagramModelContainer.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN: return IZentaPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
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
		if (baseClass == IDiagramModelContainer.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(" element: ");
		result.append(getZentaElement());
		result.append(')');
		return result.toString();
	}
    
	@Override
	public String getFinalFillColor() {
		String myColor = getFillColor();
		if(null != myColor)
			return myColor;
        return getDefaultString("fillColor", null);
	}
	
	@Override
	public String getFinalFontColor() {
		String myColor = getFontColor();
		if(null != myColor)
			return myColor;
        return getDefaultString("fontColor", null);
	}
	
	@Override
	public int getFinalTextAlignment() {
		int myAlignment = getTextAlignment();
		if(TEXT_ALIGNMENT_NONE != myAlignment)
			return myAlignment;
        return getDefaultInt("textAlignment", TEXT_ALIGNMENT_CENTER);
	}
	
	@Override
	public String getFinalElementShape() {
		String myShape = elementShape;
		if(null != myShape)
			return myShape;
        return getDefaultString("elementShape", DEFAULT_SHAPE);
	}
	
	@Override
	public String getFinalFont() {
		String myFont = font;
		if(null != myFont)
			return myFont;
        return getDefaultString("font", null);
	}
	
    private int getDefaultInt(String propname, int defaultShape) {
        IZentaElement definingElement = getDefiningElement();
        if(null == definingElement)
            return defaultShape;
        List<String> props = definingElement.getPropertyNamed(propname);
        if(props.size()>0) {
            String props0 = props.get(0);
            if(null == props0)
                return defaultShape;
            return new Integer(props0);
        }
        return defaultShape;
    }
    
    private String getDefaultString(String propname, String defaultresult) {
    	IBasicObject definingElement = getDefiningElement();
        if(null == definingElement)
            return null;
        List<String> props = definingElement.getPropertyNamed(propname);
        if(props.size()>0) {
            String props0 = props.get(0);
            if(null == props0)
                return defaultresult;
            return props0;
        }
        return defaultresult;
    }
    
    private IBasicObject getDefiningElement() {
    	IBasicObject element = (IBasicObject) getZentaElement();
        return element.getDefiningElement();
    }
}