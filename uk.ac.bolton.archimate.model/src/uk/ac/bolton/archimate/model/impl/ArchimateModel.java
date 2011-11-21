/**
 * Copyright (c) 2010 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.impl;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.bolton.archimate.model.FolderType;
import uk.ac.bolton.archimate.model.IAdapter;
import uk.ac.bolton.archimate.model.IApplicationLayerElement;
import uk.ac.bolton.archimate.model.IArchimateFactory;
import uk.ac.bolton.archimate.model.IArchimateModel;
import uk.ac.bolton.archimate.model.IArchimateModelElement;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IBusinessLayerElement;
import uk.ac.bolton.archimate.model.IDiagramModel;
import uk.ac.bolton.archimate.model.IFolder;
import uk.ac.bolton.archimate.model.IIdentifier;
import uk.ac.bolton.archimate.model.IJunctionElement;
import uk.ac.bolton.archimate.model.INameable;
import uk.ac.bolton.archimate.model.IProperties;
import uk.ac.bolton.archimate.model.IProperty;
import uk.ac.bolton.archimate.model.IRelationship;
import uk.ac.bolton.archimate.model.ITechnologyLayerElement;
import uk.ac.bolton.archimate.model.util.IDAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getFolders <em>Folders</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getId <em>Id</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getArchimateModel <em>Archimate Model</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getProperties <em>Properties</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getFile <em>File</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.ArchimateModel#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchimateModel extends CDOObjectImpl implements IArchimateModel {
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
    protected ArchimateModel() {
        super();
        eAdapters().add(fIDAdapter);
    }
    
    /**
     * Add any default folders
     */
    protected void addDefaultFolders() {
        if(getFolder(FolderType.BUSINESS) == null) {
            IFolder folder = IArchimateFactory.eINSTANCE.createFolder();
            folder.setName("Business");
            folder.setType(FolderType.BUSINESS);
            getFolders().add(0, folder);
        }

        if(getFolder(FolderType.APPLICATION) == null) {
            IFolder folder = IArchimateFactory.eINSTANCE.createFolder();
            folder.setName("Application");
            folder.setType(FolderType.APPLICATION);
            getFolders().add(1, folder);
        }

        if(getFolder(FolderType.TECHNOLOGY) == null) {
            IFolder folder = IArchimateFactory.eINSTANCE.createFolder();
            folder.setName("Technology");
            folder.setType(FolderType.TECHNOLOGY);
            getFolders().add(2, folder);
        }

        if(getFolder(FolderType.CONNECTORS) == null) {
            IFolder folder = IArchimateFactory.eINSTANCE.createFolder();
            folder.setName("Connectors");
            folder.setType(FolderType.CONNECTORS);
            getFolders().add(3, folder);
        }

        if(getFolder(FolderType.RELATIONS) == null) {
            IFolder folder = IArchimateFactory.eINSTANCE.createFolder();
            folder.setName("Relations");
            folder.setType(FolderType.RELATIONS);
            getFolders().add(4, folder);
        }

        if(getFolder(FolderType.DIAGRAMS) == null) {
            IFolder folder = IArchimateFactory.eINSTANCE.createFolder();
            folder.setName("Views");
            folder.setType(FolderType.DIAGRAMS);
            getFolders().add(getFolders().size(), folder); // Make sure this is last
        }
    }
    
    /**
     * <!-- begin-user-doc -->
     * This folder is optional so we add it as needed
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IFolder addDerivedRelationsFolder() {
        addDefaultFolders(); // Check they haven't been deleted
        
        IFolder folder = IArchimateFactory.eINSTANCE.createFolder();
        folder.setName("Derived Relations");
        folder.setType(FolderType.DERIVED);
        int index = getFolders().indexOf(getFolder(FolderType.RELATIONS)) + 1;
        getFolders().add(index, folder);
        
        return folder;
    }
    
    /**
     * <!-- begin-user-doc -->
     * This folder is optional so we add it as needed
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void removeDerivedRelationsFolder() {
        IFolder folder = getFolder(FolderType.DERIVED);
        if(folder != null) {
            getFolders().remove(folder);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IFolder getDefaultFolderForElement(EObject element) {
        addDefaultFolders(); // Check they haven't been deleted
        
        if(element instanceof IBusinessLayerElement) {
            return getFolder(FolderType.BUSINESS);
        }
        if(element instanceof IApplicationLayerElement) {
            return getFolder(FolderType.APPLICATION);
        }
        if(element instanceof ITechnologyLayerElement) {
            return getFolder(FolderType.TECHNOLOGY);
        }
        if(element instanceof IJunctionElement) {
            return getFolder(FolderType.CONNECTORS);
        }
        if(element instanceof IRelationship) {
            return getFolder(FolderType.RELATIONS);
        }
        if(element instanceof IDiagramModel) {
            return getFolder(FolderType.DIAGRAMS);
        }
        
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IFolder getFolder(FolderType type) {
        for(IFolder folder : getFolders()) {
            if(folder.getType().equals(type)) {
                return folder;
            }
        }
        
        return null;
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
        EList<IDiagramModel> list = getDiagramModels();
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * <!-- begin-user-doc -->
     * Return the Diagram Models - could be empty list
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EList<IDiagramModel> getDiagramModels() {
        EList<IDiagramModel> list = new BasicEList<IDiagramModel>();
        
        EList<IFolder> fl = this.getFolders();
        for(IFolder folder: fl) {
            if(folder != null) {
                _getDiagramModels(folder, list);
            }        	
        }
        
        return list;
    }
    
    private void _getDiagramModels(IFolder folder, EList<IDiagramModel> list) {
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
		return IArchimatePackage.Literals.ARCHIMATE_MODEL;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return (String)eGet(IArchimatePackage.Literals.NAMEABLE__NAME, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		eSet(IArchimatePackage.Literals.NAMEABLE__NAME, newName);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getId() {
		return (String)eGet(IArchimatePackage.Literals.IDENTIFIER__ID, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setId(String newId) {
		eSet(IArchimatePackage.Literals.IDENTIFIER__ID, newId);
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IArchimateModel getArchimateModel() {
        return this;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
				public EList<IProperty> getProperties() {
		return (EList<IProperty>)eGet(IArchimatePackage.Literals.PROPERTIES__PROPERTIES, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getPurpose() {
		return (String)eGet(IArchimatePackage.Literals.ARCHIMATE_MODEL__PURPOSE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPurpose(String newPurpose) {
		eSet(IArchimatePackage.Literals.ARCHIMATE_MODEL__PURPOSE, newPurpose);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
				public EList<IFolder> getFolders() {
		return (EList<IFolder>)eGet(IArchimatePackage.Literals.FOLDER_CONTAINER__FOLDERS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public File getFile() {
		return (File)eGet(IArchimatePackage.Literals.ARCHIMATE_MODEL__FILE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFile(File newFile) {
		eSet(IArchimatePackage.Literals.ARCHIMATE_MODEL__FILE, newFile);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getVersion() {
		return (String)eGet(IArchimatePackage.Literals.ARCHIMATE_MODEL__VERSION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVersion(String newVersion) {
		eSet(IArchimatePackage.Literals.ARCHIMATE_MODEL__VERSION, newVersion);
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setDefaults() {
        // Element has no ID so allocate one
        if(getId() == null) {
            setId(fIDAdapter.getNewID());
        }
        else {
            fIDAdapter.registerID(getId());
        }

        addDefaultFolders();
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
				case IArchimatePackage.ARCHIMATE_MODEL__NAME: return IArchimatePackage.NAMEABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.ARCHIMATE_MODEL__ID: return IArchimatePackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == IAdapter.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IArchimateModelElement.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.ARCHIMATE_MODEL__ARCHIMATE_MODEL: return IArchimatePackage.ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.ARCHIMATE_MODEL__PROPERTIES: return IArchimatePackage.PROPERTIES__PROPERTIES;
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
				case IArchimatePackage.NAMEABLE__NAME: return IArchimatePackage.ARCHIMATE_MODEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == IIdentifier.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.IDENTIFIER__ID: return IArchimatePackage.ARCHIMATE_MODEL__ID;
				default: return -1;
			}
		}
		if (baseClass == IAdapter.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IArchimateModelElement.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL: return IArchimatePackage.ARCHIMATE_MODEL__ARCHIMATE_MODEL;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.PROPERTIES__PROPERTIES: return IArchimatePackage.ARCHIMATE_MODEL__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ArchimateModel
