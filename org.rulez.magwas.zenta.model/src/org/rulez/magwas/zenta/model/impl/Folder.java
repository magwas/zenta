/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
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
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.FolderType;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IZentamateModelElement;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IFolderContainer;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getZentamateModel <em>Zentamate Model</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getFolders <em>Folders</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getId <em>Id</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getElements <em>Elements</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Folder#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Folder extends EObjectImpl implements IFolder {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
    protected EList<EObject> elements;

    /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected static final FolderType TYPE_EDEFAULT = FolderType.USER;
    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected FolderType type = TYPE_EDEFAULT;
    
    /**
     * Adapter Map for arbitrary objects
     */
    private Map<Object, Object> fAdapterMap = new HashMap<Object, Object>();

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected Folder() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentamatePackage.Literals.FOLDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentamatePackage.FOLDER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentamatePackage.FOLDER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentamatePackage.FOLDER__DOCUMENTATION, oldDocumentation, documentation));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentamatePackage.FOLDER__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<EObject>(EObject.class, this, IZentamatePackage.FOLDER__ELEMENTS);
		}
		return elements;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FolderType getType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(FolderType newType) {
		FolderType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentamatePackage.FOLDER__TYPE, oldType, type));
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
    public IZentamateModel getZentamateModel() {
        if(eContainer() == null) {
            return null;
        }
        return ((IZentamateModelElement)eContainer()).getZentamateModel();
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IFolder> getFolders() {
		if (folders == null) {
			folders = new EObjectContainmentEList<IFolder>(IFolder.class, this, IZentamatePackage.FOLDER__FOLDERS);
		}
		return folders;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentamatePackage.FOLDER__FOLDERS:
				return ((InternalEList<?>)getFolders()).basicRemove(otherEnd, msgs);
			case IZentamatePackage.FOLDER__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case IZentamatePackage.FOLDER__ELEMENTS:
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
			case IZentamatePackage.FOLDER__ARCHIMATE_MODEL:
				return getZentamateModel();
			case IZentamatePackage.FOLDER__FOLDERS:
				return getFolders();
			case IZentamatePackage.FOLDER__NAME:
				return getName();
			case IZentamatePackage.FOLDER__ID:
				return getId();
			case IZentamatePackage.FOLDER__DOCUMENTATION:
				return getDocumentation();
			case IZentamatePackage.FOLDER__PROPERTIES:
				return getProperties();
			case IZentamatePackage.FOLDER__ELEMENTS:
				return getElements();
			case IZentamatePackage.FOLDER__TYPE:
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
			case IZentamatePackage.FOLDER__FOLDERS:
				getFolders().clear();
				getFolders().addAll((Collection<? extends IFolder>)newValue);
				return;
			case IZentamatePackage.FOLDER__NAME:
				setName((String)newValue);
				return;
			case IZentamatePackage.FOLDER__ID:
				setId((String)newValue);
				return;
			case IZentamatePackage.FOLDER__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IZentamatePackage.FOLDER__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends IProperty>)newValue);
				return;
			case IZentamatePackage.FOLDER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case IZentamatePackage.FOLDER__TYPE:
				setType((FolderType)newValue);
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
			case IZentamatePackage.FOLDER__FOLDERS:
				getFolders().clear();
				return;
			case IZentamatePackage.FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentamatePackage.FOLDER__ID:
				setId(ID_EDEFAULT);
				return;
			case IZentamatePackage.FOLDER__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IZentamatePackage.FOLDER__PROPERTIES:
				getProperties().clear();
				return;
			case IZentamatePackage.FOLDER__ELEMENTS:
				getElements().clear();
				return;
			case IZentamatePackage.FOLDER__TYPE:
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
			case IZentamatePackage.FOLDER__ARCHIMATE_MODEL:
				return getZentamateModel() != null;
			case IZentamatePackage.FOLDER__FOLDERS:
				return folders != null && !folders.isEmpty();
			case IZentamatePackage.FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentamatePackage.FOLDER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IZentamatePackage.FOLDER__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IZentamatePackage.FOLDER__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case IZentamatePackage.FOLDER__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case IZentamatePackage.FOLDER__TYPE:
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
		if (baseClass == IFolderContainer.class) {
			switch (derivedFeatureID) {
				case IZentamatePackage.FOLDER__FOLDERS: return IZentamatePackage.FOLDER_CONTAINER__FOLDERS;
				default: return -1;
			}
		}
		if (baseClass == INameable.class) {
			switch (derivedFeatureID) {
				case IZentamatePackage.FOLDER__NAME: return IZentamatePackage.NAMEABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (derivedFeatureID) {
				case IZentamatePackage.FOLDER__ID: return IZentamatePackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (derivedFeatureID) {
				case IZentamatePackage.FOLDER__DOCUMENTATION: return IZentamatePackage.DOCUMENTABLE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IZentamatePackage.FOLDER__PROPERTIES: return IZentamatePackage.PROPERTIES__PROPERTIES;
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
		if (baseClass == IFolderContainer.class) {
			switch (baseFeatureID) {
				case IZentamatePackage.FOLDER_CONTAINER__FOLDERS: return IZentamatePackage.FOLDER__FOLDERS;
				default: return -1;
			}
		}
		if (baseClass == INameable.class) {
			switch (baseFeatureID) {
				case IZentamatePackage.NAMEABLE__NAME: return IZentamatePackage.FOLDER__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (baseFeatureID) {
				case IZentamatePackage.IDENTIFIER__ID: return IZentamatePackage.FOLDER__ID;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (baseFeatureID) {
				case IZentamatePackage.DOCUMENTABLE__DOCUMENTATION: return IZentamatePackage.FOLDER__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IZentamatePackage.PROPERTIES__PROPERTIES: return IZentamatePackage.FOLDER__PROPERTIES;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", documentation: "); //$NON-NLS-1$
		result.append(documentation);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //Folder