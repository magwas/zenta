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
import java.util.Map.Entry;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.ICloneable;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.UndoState;
import org.rulez.magwas.zenta.model.handmade.util.Util;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase#getZentaModel <em>Zenta Model</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase#getId <em>Id</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase#getDiagObjects <em>Diag Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ZentaElementBase extends EObjectImpl implements IZentaElement {
	
    private static final int SOURCE_RELATIONSHIPS = 1;
	private static final int TARGET_RELATIONSHIPS = 2;


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
	 * The cached value of the '{@link #getDiagObjects() <em>Diag Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<IDiagramModelZentaObject> diagObjects;

				/**
     * Adapter Map for arbitrary objects
     */
    private Map<Object, Object> fAdapterMap = new HashMap<Object, Object>();

    protected ZentaElementBase() {
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
	 * @generated NOT
	 */
    @NonNull
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_ELEMENT__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

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
    
	@NonNull
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentaPackage.ZENTA_ELEMENT__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    
	@NonNull
	public EList<IDiagramModelZentaObject> getDiagObjects() {
		if (diagObjects == null) {
			diagObjects = new EObjectWithInverseResolvingEList<IDiagramModelZentaObject>(IDiagramModelZentaObject.class, this, IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS, IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT);
		}
		return diagObjects;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagObjects()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS:
				return ((InternalEList<?>)getDiagObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
     * <!-- begin-user-doc -->
     * Return the Parent Zenta model
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @NonNull
    public IZentaModel getZentaModel() {
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
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				return getName();
			case IZentaPackage.ZENTA_ELEMENT__ID:
				return getId();
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
				return getProperties();
			case IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS:
				return getDiagObjects();
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
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__ID:
				setId((String)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends IProperty>)newValue);
				return;
			case IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS:
				getDiagObjects().clear();
				getDiagObjects().addAll((Collection<? extends IDiagramModelZentaObject>)newValue);
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
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
				getProperties().clear();
				return;
			case IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS:
				getDiagObjects().clear();
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
			case IZentaPackage.ZENTA_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentaPackage.ZENTA_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IZentaPackage.ZENTA_ELEMENT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IZentaPackage.ZENTA_ELEMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case IZentaPackage.ZENTA_ELEMENT__DIAG_OBJECTS:
				return diagObjects != null && !diagObjects.isEmpty();
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
				case IZentaPackage.ZENTA_ELEMENT__NAME: return IZentaPackage.NAMEABLE__NAME;
				default: return -1;
			}
		}
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
		if (baseClass == INameable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.NAMEABLE__NAME: return IZentaPackage.ZENTA_ELEMENT__NAME;
				default: return -1;
			}
		}
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", documentation: ");
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


	public HashMap<String, EAttribute> getObjectAppearanceProperties() {
		HashMap<String, EAttribute> props = new HashMap<String, EAttribute>();
		props.put("font",IZentaPackage.eINSTANCE.getFontAttribute_Font());
		props.put("fontColor",IZentaPackage.eINSTANCE.getFontAttribute_FontColor());
		props.put("textAlignment",IZentaPackage.eINSTANCE.getFontAttribute_TextAlignment());
		props.put("fillColor",IZentaPackage.eINSTANCE.getDiagramModelObject_FillColor());
		props.put("elementShape",IZentaPackage.eINSTANCE.getDiagramModelObject_ElementShape());
		return props;
	}


	@Override
	public void setPropsFromDiagramObject(IDiagramModelComponent dmo) {
		Map<String, EAttribute> props = getObjectAppearanceProperties();
		for(Entry<String, EAttribute> e : props.entrySet()) {
			addOrUpateProp(dmo, e);
		}
	}
		private void addOrUpateProp(IDiagramModelComponent dmo, Entry<String, EAttribute> e) {
			String key = e.getKey();
			String value = getValueForEntry(dmo, e);
			addOrUpdateProperty(key, value);
		}
		private String getValueForEntry(IDiagramModelComponent dmo,
				Entry<String, EAttribute> e) {
			EAttribute feat = e.getValue();
			Object value = dmo.eGet(feat);
			String v;
			if(null == value) 
				v = null;
			else
				v = value.toString();
			return v;
		}

	@Override
	public void addOrUpdateProperty(String key, String value) {
		boolean found = false;
		EList<IProperty> propertiess = getProperties();
		for(IProperty theprop : propertiess)
			if(theprop.getKey().equals(key)) {
				theprop.setValue(value);
				found = true;
			}
		if(!found)
			addProp(propertiess, key, value);
	}
			private void addProp(EList<IProperty> propertiess, String key, String value) {
				IProperty prop;
				prop = IZentaFactory.eINSTANCE.createProperty();
				prop.setKey(key);
				prop.setValue(value);
				propertiess.add(prop);
			}

		public class ElementState implements UndoState {
			public IFolder folder;
			public IZentaElement element;
			public int index;
			public List<UndoState> diagobjs;
			public ArrayList<UndoState> relationStates;
			public void undelete() {
		        folder.getElements().add(index, element);
				for(UndoState dmost : diagobjs)
					dmost.undelete();
				for(UndoState rs : relationStates)
					rs.undelete();
			}
			@Override
			public INameable getElement() {
				return element;
			}
		}

		@Override
		public UndoState delete() {
			ElementState state = prepareDelete();
			delete(state);
			return state;
		}

		@Override
		public ElementState prepareDelete() {
			ElementState state = new ElementState();
			prepareUndoState(state);
			return state;
		}

		protected void prepareUndoState(ElementState state) {
			state.element = this;
			state.folder = (IFolder) eContainer();
		}

		@Override
		public boolean isDeleted() {
			return null == eContainer();
		}
		@Override
		public UndoState delete(UndoState st) {
			ElementState state = (ElementState) st;
			state.diagobjs = new ArrayList<UndoState>();
			state.index = state.folder.getElements().indexOf(this); 
			deleteDiagramObjects(state);
			state.relationStates = new ArrayList<UndoState>();
			NonNullList<IBasicRelationship> relationships = getRelationships();
			for(IZentaElement rel : relationships) {
				if(!rel.isDeleted())
					state.relationStates.add(rel.delete());
			}
			if(state.index != -1) { 
			    state.folder.getElements().remove(this);
			}
			return state;
		}
		
			protected void deleteDiagramObjects(@NonNull ElementState state) {
				List<IDiagramModelComponent> dmos = new ArrayList<IDiagramModelComponent>();
				dmos.addAll(getDiagComponents());
				for(IDiagramModelComponent dmo : dmos)
		        	state.diagobjs.add(dmo.delete());
			}

		
		@Override
		@NonNull
		public EList<? extends IDiagramModelComponent> getDiagComponents() {
			return getDiagObjects();
		}

		@Override
		public boolean hasDiagramReferences() {
			return !getDiagComponents().isEmpty();
		}

		@Override
		@NonNull
	    public NonNullList<IBasicRelationship> getRelationships() {
	        return __getRelationships(SOURCE_RELATIONSHIPS | TARGET_RELATIONSHIPS);
	    }
	    
		@Override
		@NonNull
	    public NonNullList<IBasicRelationship> getSourceRelationships() {
	        return __getRelationships(SOURCE_RELATIONSHIPS);
	    }
	    
		@Override
		@NonNull
		public NonNullList<IBasicRelationship> getTargetRelationships() {
	        return __getRelationships(TARGET_RELATIONSHIPS);
	    }

		@NonNull
		private NonNullList<IBasicRelationship> __getRelationships(int type) {
	        NonNullList<IBasicRelationship> relationships = new NonNullArrayList<IBasicRelationship>();
	        
	    	List<IFolder> folders = new ArrayList<IFolder>();
			folders.add(getZentaModel());
			childFolders(this, type, relationships, folders);
	        
	        return relationships;
	    }

			
			private void childFolders(IZentaElement element, int type, 
					List<IBasicRelationship> relationships, List<IFolder> folders) {
				for (@NonNull IFolder  folder : folders) {
					__getRelationshipsForElement(folder, element, type, relationships);
				}
			}

		private void __getRelationshipsForElement(IFolder folder, IZentaElement element, int type, List<IBasicRelationship> relationships) {
	        
	        for(EObject object : folder.getElements()) {
	            if(object instanceof IBasicRelationship) {
	                IBasicRelationship relationship = (IBasicRelationship)object;
	                if((type & SOURCE_RELATIONSHIPS) != 0) {
	                    if(relationship.getSource() == element && !relationships.contains(relationship)) {
	                        relationships.add(relationship);
	                    }
	                }
	                if((type & TARGET_RELATIONSHIPS) != 0) {
	                    if(relationship.getTarget() == element && !relationships.contains(relationship)) {
	                        relationships.add(relationship);
	                    }
	                }
	            }
	        }
	        
	        // Child folders
	        EList<IFolder> folders = folder.getFolders();
			childFolders(element, type, relationships, folders);
	    }


}
