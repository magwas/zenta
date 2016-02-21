/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 *
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.ICloneable;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.UndoState;
import org.rulez.magwas.zenta.model.handmade.util.Util;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getZentaModel <em>Zenta Model</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getId <em>Id</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getDiagramModel <em>Diagram Model</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase#getConnectionRouterType <em>Connection Router Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramModelBase extends EObjectImpl implements IDiagramModel {
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
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

				/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

				/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_COLOR_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected String lineColor = LINE_COLOR_EDEFAULT;

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
	 * The default value of the '{@link #getConnectionRouterType() <em>Connection Router Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConnectionRouterType()
	 * @generated
	 * @ordered
	 */
    protected static final int CONNECTION_ROUTER_TYPE_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getConnectionRouterType() <em>Connection Router Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConnectionRouterType()
	 * @generated
	 * @ordered
	 */
    protected int connectionRouterType = CONNECTION_ROUTER_TYPE_EDEFAULT;

    /**
     * Adapter Map for arbitrary objects
     */
    private Map<Object, Object> fAdapterMap = new HashMap<Object, Object>();

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public String getName() {
		return Util.verifyNonNull(name);
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL__NAME, oldName, name));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IDiagramModel getDiagramModel() {
        return this;
    }
    
    @Override
    public IDiagramModel findDiagramModel() {
        return this;
    }
    

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL__LINE_WIDTH, oldLineWidth, lineWidth));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineColor() {
		return lineColor;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(String newLineColor) {
		String oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL__LINE_COLOR, oldLineColor, lineColor));
	}

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IZentaModel getZentaModel() {
        IZentaModelElement container = (IZentaModelElement)eContainer();
		return container.getZentaModel();
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL__ID, oldId, id));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IDiagramModelObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<IDiagramModelObject>(IDiagramModelObject.class, this, IZentaPackage.DIAGRAM_MODEL__CHILDREN);
		}
		return children;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getConnectionRouterType() {
		return connectionRouterType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConnectionRouterType(int newConnectionRouterType) {
		int oldConnectionRouterType = connectionRouterType;
		connectionRouterType = newConnectionRouterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE, oldConnectionRouterType, connectionRouterType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL__DOCUMENTATION, oldDocumentation, documentation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentaPackage.DIAGRAM_MODEL__PROPERTIES);
		}
		return properties;
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
        IDiagramModel newDiagramModel = EcoreUtil.copy(this);
        newDiagramModel.setId(null); // need a new ID
        newDiagramModel.getChildren().clear(); // need to do this!
        return newDiagramModel;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case IZentaPackage.DIAGRAM_MODEL__PROPERTIES:
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
			case IZentaPackage.DIAGRAM_MODEL__ZENTA_MODEL:
				return getZentaModel();
			case IZentaPackage.DIAGRAM_MODEL__NAME:
				return getName();
			case IZentaPackage.DIAGRAM_MODEL__ID:
				return getId();
			case IZentaPackage.DIAGRAM_MODEL__DIAGRAM_MODEL:
				return getDiagramModel();
			case IZentaPackage.DIAGRAM_MODEL__LINE_WIDTH:
				return getLineWidth();
			case IZentaPackage.DIAGRAM_MODEL__LINE_COLOR:
				return getLineColor();
			case IZentaPackage.DIAGRAM_MODEL__CHILDREN:
				return getChildren();
			case IZentaPackage.DIAGRAM_MODEL__DOCUMENTATION:
				return getDocumentation();
			case IZentaPackage.DIAGRAM_MODEL__PROPERTIES:
				return getProperties();
			case IZentaPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				return getConnectionRouterType();
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
			case IZentaPackage.DIAGRAM_MODEL__NAME:
				setName((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL__ID:
				setId((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL__LINE_COLOR:
				setLineColor((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IDiagramModelObject>)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends IProperty>)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				setConnectionRouterType((Integer)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL__CHILDREN:
				getChildren().clear();
				return;
			case IZentaPackage.DIAGRAM_MODEL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case IZentaPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				setConnectionRouterType(CONNECTION_ROUTER_TYPE_EDEFAULT);
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
			case IZentaPackage.DIAGRAM_MODEL__ZENTA_MODEL:
				return getZentaModel() != null;
			case IZentaPackage.DIAGRAM_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentaPackage.DIAGRAM_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IZentaPackage.DIAGRAM_MODEL__DIAGRAM_MODEL:
				return getDiagramModel() != null;
			case IZentaPackage.DIAGRAM_MODEL__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case IZentaPackage.DIAGRAM_MODEL__LINE_COLOR:
				return LINE_COLOR_EDEFAULT == null ? lineColor != null : !LINE_COLOR_EDEFAULT.equals(lineColor);
			case IZentaPackage.DIAGRAM_MODEL__CHILDREN:
				return children != null && !children.isEmpty();
			case IZentaPackage.DIAGRAM_MODEL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IZentaPackage.DIAGRAM_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case IZentaPackage.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE:
				return connectionRouterType != CONNECTION_ROUTER_TYPE_EDEFAULT;
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
		if (baseClass == INameable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL__NAME: return IZentaPackage.NAMEABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL__ID: return IZentaPackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == ICloneable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IDiagramModelComponent.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL__DIAGRAM_MODEL: return IZentaPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;
				case IZentaPackage.DIAGRAM_MODEL__LINE_WIDTH: return IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH;
				case IZentaPackage.DIAGRAM_MODEL__LINE_COLOR: return IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_COLOR;
				default: return -1;
			}
		}
		if (baseClass == IDiagramModelContainer.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL__CHILDREN: return IZentaPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL__DOCUMENTATION: return IZentaPackage.DOCUMENTABLE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL__PROPERTIES: return IZentaPackage.PROPERTIES__PROPERTIES;
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
		if (baseClass == INameable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.NAMEABLE__NAME: return IZentaPackage.DIAGRAM_MODEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (baseFeatureID) {
				case IZentaPackage.IDENTIFIER__ID: return IZentaPackage.DIAGRAM_MODEL__ID;
				default: return -1;
			}
		}
		if (baseClass == ICloneable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IDiagramModelComponent.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL: return IZentaPackage.DIAGRAM_MODEL__DIAGRAM_MODEL;
				case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH: return IZentaPackage.DIAGRAM_MODEL__LINE_WIDTH;
				case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_COLOR: return IZentaPackage.DIAGRAM_MODEL__LINE_COLOR;
				default: return -1;
			}
		}
		if (baseClass == IDiagramModelContainer.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return IZentaPackage.DIAGRAM_MODEL__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DOCUMENTABLE__DOCUMENTATION: return IZentaPackage.DIAGRAM_MODEL__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IZentaPackage.PROPERTIES__PROPERTIES: return IZentaPackage.DIAGRAM_MODEL__PROPERTIES;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineColor: ");
		result.append(lineColor);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", connectionRouterType: ");
		result.append(connectionRouterType);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean hasDiagramReferences() {
		return false;
	}
	@Override
	public boolean isDeleted() {
		return null == eContainer();
	}
	
	private class ElementState implements UndoState {
		public IFolder folder;
		public IDiagramModel element;
		public int index;
		public void undelete() {
	        folder.getElements().add(index, element);
		}
		@Override
		public INameable getElement() {
			return element;
		}
	}

	@Override
	public UndoState delete() {
		UndoState state = prepareDelete();
		delete(state);
		return state;
	}

	@Override
	public UndoState delete(UndoState save) {
		ElementState state = (ElementState) save;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.REMOVE, IZentaPackage.DIAGRAM_MODEL, this, this));
		state.folder.getElements().remove(this);
		return state;
	}

	@Override
	public UndoState prepareDelete() {
		ElementState state = new ElementState();
		state.element = this;
		state.folder = (IFolder) eContainer();
		return state;
	}

	@Override
	public void move(IFolder oldParent, IFolder newParent){
		if (oldParent != this.eContainer)
			throw new IllegalArgumentException();
		this.eContainer = (InternalEObject) newParent;
	}


} //DiagramModel
