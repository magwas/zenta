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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IFolder;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Zentamate Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentamateObject#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentamateObject#getZentamateElement <em>Zentamate Element</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentamateObject#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelZentamateObject extends DiagramModelObject implements IDiagramModelZentamateObject {
    
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
     * Wrapped Zentamate Element
     */
    private IZentamateElement fZentamateElement;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelZentamateObject() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentamatePackage.Literals.DIAGRAM_MODEL_ARCHIMATE_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IDiagramModelObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<IDiagramModelObject>(IDiagramModelObject.class, this, IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN);
		}
		return children;
	}

    @Override
    public String getName() {
        if(getZentamateElement() != null) {
            return getZentamateElement().getName();
        }
        else {
            return super.getName();
        }
    }
    
    @Override
    public void setName(String newName) {
        if(getZentamateElement() != null) {
            getZentamateElement().setName(newName);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IZentamateElement getZentamateElement() {
        return fZentamateElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setZentamateElement(IZentamateElement zentaElement) {
        fZentamateElement = zentaElement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE, oldType, type));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addZentamateElementToModel(IFolder parent) {
        IZentamateElement element = getZentamateElement();
        if(element != null && element.eContainer() == null) {
            // If parent is null use default folder
            if(parent == null) {
                parent = getDiagramModel().getZentamateModel().getDefaultFolderForElement(element);
            }
            parent.getElements().add(element);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void removeZentamateElementFromModel() {
        IZentamateElement element = getZentamateElement();
        if(element != null) {
            IFolder folder = (IFolder)element.eContainer();
            if(folder != null) {
                folder.getElements().remove(element);
            }
        }
    }

    @Override
    public EObject getCopy() {
        IDiagramModelZentamateObject newObject = (IDiagramModelZentamateObject)super.getCopy();
        
        IZentamateElement element = (IZentamateElement)getZentamateElement().getCopy();
        newObject.setZentamateElement(element);
        
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
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				return getChildren();
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				return getZentamateElement();
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
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
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IDiagramModelObject>)newValue);
				return;
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				setZentamateElement((IZentamateElement)newValue);
				return;
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
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
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				getChildren().clear();
				return;
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				setZentamateElement((IZentamateElement)null);
				return;
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
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
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN:
				return children != null && !children.isEmpty();
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT:
				return getZentamateElement() != null;
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE:
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
				case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN: return IZentamatePackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
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
				case IZentamatePackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN;
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
		result.append(" (type: "); //$NON-NLS-1$
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DiagramModelZentamateObject
