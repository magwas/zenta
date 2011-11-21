/**
 * Copyright (c) 2010 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.impl;

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

import uk.ac.bolton.archimate.model.IArchimateElement;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IDiagramModelArchimateObject;
import uk.ac.bolton.archimate.model.IDiagramModelContainer;
import uk.ac.bolton.archimate.model.IDiagramModelObject;
import uk.ac.bolton.archimate.model.IFolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Archimate Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelArchimateObject#getChildren <em>Children</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelArchimateObject#getArchimateElement <em>Archimate Element</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelArchimateObject#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelArchimateObject extends DiagramModelObject implements IDiagramModelArchimateObject {
    
    /**
     * Wrapped Archimate Element
     */
    private IArchimateElement fArchimateElement;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelArchimateObject() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.DIAGRAM_MODEL_ARCHIMATE_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
				public EList<IDiagramModelObject> getChildren() {
		return (EList<IDiagramModelObject>)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONTAINER__CHILDREN, true);
	}

    @Override
    public String getName() {
        if(getArchimateElement() != null) {
            return getArchimateElement().getName();
        }
        else {
            return super.getName();
        }
    }
    
    @Override
    public void setName(String newName) {
        if(getArchimateElement() != null) {
            getArchimateElement().setName(newName);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IArchimateElement getArchimateElement() {
        return fArchimateElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setArchimateElement(IArchimateElement archimateElement) {
        fArchimateElement = archimateElement;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getType() {
		return (Integer)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(int newType) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE, newType);
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addArchimateElementToModel(IFolder parent) {
        IArchimateElement element = getArchimateElement();
        if(element != null && element.eContainer() == null) {
            // If parent is null use default folder
            if(parent == null) {
                parent = getDiagramModel().getArchimateModel().getDefaultFolderForElement(element);
            }
            parent.getElements().add(element);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void removeArchimateElementFromModel() {
        IArchimateElement element = getArchimateElement();
        if(element != null) {
            IFolder folder = (IFolder)element.eContainer();
            if(folder != null) {
                folder.getElements().remove(element);
            }
        }
    }

    @Override
    public EObject getCopy() {
        IDiagramModelArchimateObject newObject = (IDiagramModelArchimateObject)super.getCopy();
        
        IArchimateElement element = (IArchimateElement)getArchimateElement().getCopy();
        newObject.setArchimateElement(element);
        
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
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IDiagramModelContainer.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN: return IArchimatePackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
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
				case IArchimatePackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiagramModelArchimateObject
