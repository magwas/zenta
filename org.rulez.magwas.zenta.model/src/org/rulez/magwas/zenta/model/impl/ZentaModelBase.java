/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.io.File;
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
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.UndoState;
import org.rulez.magwas.zenta.model.handmade.util.IDAdapter;
import org.rulez.magwas.zenta.model.handmade.util.Util;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getFolders <em>Folders</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getId <em>Id</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getZentaModel <em>Zenta Model</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getElements <em>Elements</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getFile <em>File</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZentaModelBase extends EObjectImpl implements IZentaModel {
    /**
	 * The cached value of the '{@link #getFolders() <em>Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFolders()
	 * @generated
	 * @ordered
	 */
    protected EList<IFolder> folders;
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
    protected EList<IProperty> properties;
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<INameable> elements;
				/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
    protected static final File FILE_EDEFAULT = null;
    /**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
    protected File file = FILE_EDEFAULT;
    
    /**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected static final String VERSION_EDEFAULT = ""; //$NON-NLS-1$
    /**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected String version = VERSION_EDEFAULT;
    /**
     * Adapter Map for arbitrary objects
     */
    private Map<Object, Object> fAdapterMap = new HashMap<Object, Object>();
    
    /**
     * ID Adapter
     */
    private IDAdapter fIDAdapter = new IDAdapter();


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    protected ZentaModelBase() {
        super();
        eAdapters().add(fIDAdapter);
        setDefaults();
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
     * Return the first diagram model or null
     * <!-- end-user-doc -->
     * @generated NOT
     */
    
    public IDiagramModel getDefaultDiagramModel() {
        NonNullList<IDiagramModel> list = getDiagramModels();
        return list.size() > 0 ? list.get(0) : createDefaultDiagramModel();
    }
		private  IZentaDiagramModel createDefaultDiagramModel() {
			IZentaDiagramModel dm = IZentaFactory.eINSTANCE.createZentaDiagramModel();
			getElements().add(dm);
			dm.setName("Default Diagram Model");
			return dm;
		}

    /**
     * <!-- begin-user-doc -->
     * Return the Diagram Models - could be empty list
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public  NonNullList<IDiagramModel> getDiagramModels() {
    	NonNullList<IDiagramModel> list = new NonNullArrayList<IDiagramModel>();
        _getDiagramModels(this, list);
        
        return list;
    }
    
    private void _getDiagramModels(IFolder folder, NonNullList<IDiagramModel> list) {
        for(EObject object : folder.getElements()) {
            if(object instanceof IDiagramModel) {
                list.add((IDiagramModel)object);
            }
        }
        for(IFolder f : folder.getFolders()) {
            _getDiagramModels(f, list);
        }
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.ZENTA_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_MODEL__ID, oldId, id));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    
    public IZentaModel getZentaModel() {
        return this;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
	
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentaPackage.ZENTA_MODEL__PROPERTIES);
		}
		return properties;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_MODEL__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	public EList<INameable> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<INameable>(INameable.class, this, IZentaPackage.ZENTA_MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
	public  EList<IFolder> getFolders() {
		if (folders == null) {
			folders = new EObjectContainmentEList<IFolder>(IFolder.class, this, IZentaPackage.ZENTA_MODEL__FOLDERS);
		}
		return folders;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public File getFile() {
		return file;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_MODEL__FILE, oldFile, file));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getVersion() {
		return version;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.ZENTA_MODEL__VERSION, oldVersion, version));
	}

    private void setDefaults() {
        // Element has no ID so allocate one
        String id = getId();
		if(id == null) {
            setId(fIDAdapter.getNewID());
        }
        else {
            fIDAdapter.registerID(id);
        }
    }
    
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IFolder getDefaultFolderForElement(EObject element) {
		return (IFolder) this;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.ZENTA_MODEL__FOLDERS:
				return ((InternalEList<?>)getFolders()).basicRemove(otherEnd, msgs);
			case IZentaPackage.ZENTA_MODEL__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case IZentaPackage.ZENTA_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case IZentaPackage.ZENTA_MODEL__FOLDERS:
				return getFolders();
			case IZentaPackage.ZENTA_MODEL__NAME:
				return getName();
			case IZentaPackage.ZENTA_MODEL__ID:
				return getId();
			case IZentaPackage.ZENTA_MODEL__ZENTA_MODEL:
				return getZentaModel();
			case IZentaPackage.ZENTA_MODEL__PROPERTIES:
				return getProperties();
			case IZentaPackage.ZENTA_MODEL__DOCUMENTATION:
				return getDocumentation();
			case IZentaPackage.ZENTA_MODEL__ELEMENTS:
				return getElements();
			case IZentaPackage.ZENTA_MODEL__FILE:
				return getFile();
			case IZentaPackage.ZENTA_MODEL__VERSION:
				return getVersion();
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
			case IZentaPackage.ZENTA_MODEL__FOLDERS:
				getFolders().clear();
				getFolders().addAll((Collection<? extends IFolder>)newValue);
				return;
			case IZentaPackage.ZENTA_MODEL__NAME:
				setName((String)newValue);
				return;
			case IZentaPackage.ZENTA_MODEL__ID:
				setId((String)newValue);
				return;
			case IZentaPackage.ZENTA_MODEL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends IProperty>)newValue);
				return;
			case IZentaPackage.ZENTA_MODEL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IZentaPackage.ZENTA_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends INameable>)newValue);
				return;
			case IZentaPackage.ZENTA_MODEL__FILE:
				setFile((File)newValue);
				return;
			case IZentaPackage.ZENTA_MODEL__VERSION:
				setVersion((String)newValue);
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
			case IZentaPackage.ZENTA_MODEL__FOLDERS:
				getFolders().clear();
				return;
			case IZentaPackage.ZENTA_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_MODEL__PROPERTIES:
				getProperties().clear();
				return;
			case IZentaPackage.ZENTA_MODEL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_MODEL__ELEMENTS:
				getElements().clear();
				return;
			case IZentaPackage.ZENTA_MODEL__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case IZentaPackage.ZENTA_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case IZentaPackage.ZENTA_MODEL__FOLDERS:
				return folders != null && !folders.isEmpty();
			case IZentaPackage.ZENTA_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentaPackage.ZENTA_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IZentaPackage.ZENTA_MODEL__ZENTA_MODEL:
				return getZentaModel() != null;
			case IZentaPackage.ZENTA_MODEL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case IZentaPackage.ZENTA_MODEL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IZentaPackage.ZENTA_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case IZentaPackage.ZENTA_MODEL__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case IZentaPackage.ZENTA_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
				case IZentaPackage.ZENTA_MODEL__NAME: return IZentaPackage.NAMEABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_MODEL__ID: return IZentaPackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == IAdapter.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IZentaModelElement.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_MODEL__ZENTA_MODEL: return IZentaPackage.ZENTA_MODEL_ELEMENT__ZENTA_MODEL;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_MODEL__PROPERTIES: return IZentaPackage.PROPERTIES__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_MODEL__DOCUMENTATION: return IZentaPackage.DOCUMENTABLE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IFolder.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.ZENTA_MODEL__ELEMENTS: return IZentaPackage.FOLDER__ELEMENTS;
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
				case IZentaPackage.NAMEABLE__NAME: return IZentaPackage.ZENTA_MODEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (baseFeatureID) {
				case IZentaPackage.IDENTIFIER__ID: return IZentaPackage.ZENTA_MODEL__ID;
				default: return -1;
			}
		}
		if (baseClass == IAdapter.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IZentaModelElement.class) {
			switch (baseFeatureID) {
				case IZentaPackage.ZENTA_MODEL_ELEMENT__ZENTA_MODEL: return IZentaPackage.ZENTA_MODEL__ZENTA_MODEL;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IZentaPackage.PROPERTIES__PROPERTIES: return IZentaPackage.ZENTA_MODEL__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DOCUMENTABLE__DOCUMENTATION: return IZentaPackage.ZENTA_MODEL__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IFolder.class) {
			switch (baseFeatureID) {
				case IZentaPackage.FOLDER__ELEMENTS: return IZentaPackage.ZENTA_MODEL__ELEMENTS;
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
		result.append(", file: ");
		result.append(file);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

	@Override
	public IMetamodel getMetamodel() {
		return IZentaFactory.eINSTANCE.getMetamodelFor(this);
	}

	@Override
	public boolean hasDiagramReferences() {
		return false;
	}
	@Override
	public boolean isDeleted() {
		return null == eContainer();
	}

	@Override
	public UndoState delete() {
		throw new IllegalArgumentException();
	}

	@Override
	public UndoState delete(UndoState state) {
		throw new IllegalArgumentException();
	}

	@Override
	public UndoState prepareDelete() {
		throw new IllegalArgumentException();
	}



} //ZentaModel
