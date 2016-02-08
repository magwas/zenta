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
import org.rulez.magwas.zenta.model.IFontAttribute;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ISketchModelSticky;
import org.rulez.magwas.zenta.model.ITextContent;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sketch Model Sticky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.SketchModelStickyBase#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.SketchModelStickyBase#getContent <em>Content</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.SketchModelStickyBase#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SketchModelStickyBase extends DiagramModelObjectBase implements ISketchModelSticky {
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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
    protected static final String CONTENT_EDEFAULT = ""; //$NON-NLS-1$

    /**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
    protected String content = CONTENT_EDEFAULT;

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
	 * @generated NOT
	 */
    protected SketchModelStickyBase() {
		super();
		setTextAlignment(getDefaultTextAlignment());
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.SKETCH_MODEL_STICKY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IDiagramModelObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<IDiagramModelObject>(IDiagramModelObject.class, this, IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN);
		}
		return children;
	}

    @Override
    public int getDefaultTextAlignment() {
		return IFontAttribute.TEXT_ALIGNMENT_LEFT;
    }
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getContent() {
		return content;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.SKETCH_MODEL_STICKY__CONTENT, oldContent, content));
	}
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
	
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES);
		}
		return properties;
	}


    @Override
    public EObject getCopy() {
        ISketchModelSticky newObject = (ISketchModelSticky)super.getCopy();
        //newObject.setContent(getContent());
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
			case IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES:
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
			case IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN:
				return getChildren();
			case IZentaPackage.SKETCH_MODEL_STICKY__CONTENT:
				return getContent();
			case IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES:
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
			case IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IDiagramModelObject>)newValue);
				return;
			case IZentaPackage.SKETCH_MODEL_STICKY__CONTENT:
				setContent((String)newValue);
				return;
			case IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES:
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
			case IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN:
				getChildren().clear();
				return;
			case IZentaPackage.SKETCH_MODEL_STICKY__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES:
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
			case IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN:
				return children != null && !children.isEmpty();
			case IZentaPackage.SKETCH_MODEL_STICKY__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES:
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
		if (baseClass == IDiagramModelContainer.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN: return IZentaPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == ITextContent.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.SKETCH_MODEL_STICKY__CONTENT: return IZentaPackage.TEXT_CONTENT__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES: return IZentaPackage.PROPERTIES__PROPERTIES;
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
				case IZentaPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return IZentaPackage.SKETCH_MODEL_STICKY__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == ITextContent.class) {
			switch (baseFeatureID) {
				case IZentaPackage.TEXT_CONTENT__CONTENT: return IZentaPackage.SKETCH_MODEL_STICKY__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IZentaPackage.PROPERTIES__PROPERTIES: return IZentaPackage.SKETCH_MODEL_STICKY__PROPERTIES;
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
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //SketchModelSticky
