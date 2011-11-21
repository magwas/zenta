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

import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IDiagramModelContainer;
import uk.ac.bolton.archimate.model.IDiagramModelObject;
import uk.ac.bolton.archimate.model.IProperties;
import uk.ac.bolton.archimate.model.IProperty;
import uk.ac.bolton.archimate.model.ISketchModelSticky;
import uk.ac.bolton.archimate.model.ITextContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sketch Model Sticky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.SketchModelSticky#getChildren <em>Children</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.SketchModelSticky#getContent <em>Content</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.SketchModelSticky#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SketchModelSticky extends DiagramModelObject implements ISketchModelSticky {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SketchModelSticky() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.SKETCH_MODEL_STICKY;
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

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getContent() {
		return (String)eGet(IArchimatePackage.Literals.TEXT_CONTENT__CONTENT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContent(String newContent) {
		eSet(IArchimatePackage.Literals.TEXT_CONTENT__CONTENT, newContent);
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
     * Left Justified
     */
    @Override
    public int getDefaultTextAlignment() {
        return TEXT_ALIGNMENT_LEFT;
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
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IDiagramModelContainer.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.SKETCH_MODEL_STICKY__CHILDREN: return IArchimatePackage.DIAGRAM_MODEL_CONTAINER__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == ITextContent.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.SKETCH_MODEL_STICKY__CONTENT: return IArchimatePackage.TEXT_CONTENT__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.SKETCH_MODEL_STICKY__PROPERTIES: return IArchimatePackage.PROPERTIES__PROPERTIES;
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
				case IArchimatePackage.DIAGRAM_MODEL_CONTAINER__CHILDREN: return IArchimatePackage.SKETCH_MODEL_STICKY__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == ITextContent.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.TEXT_CONTENT__CONTENT: return IArchimatePackage.SKETCH_MODEL_STICKY__CONTENT;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.PROPERTIES__PROPERTIES: return IArchimatePackage.SKETCH_MODEL_STICKY__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SketchModelSticky
