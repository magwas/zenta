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
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.bolton.archimate.model.IArchimateFactory;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IBounds;
import uk.ac.bolton.archimate.model.IDiagramModelConnection;
import uk.ac.bolton.archimate.model.IDiagramModelObject;
import uk.ac.bolton.archimate.model.IFontAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject#getFont <em>Font</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject#getBounds <em>Bounds</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramModelObject extends DiagramModelComponent implements IDiagramModelObject {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelObject() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.DIAGRAM_MODEL_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBounds getBounds() {
		return (IBounds)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_OBJECT__BOUNDS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBounds(IBounds newBounds) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_OBJECT__BOUNDS, newBounds);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
				public EList<IDiagramModelConnection> getSourceConnections() {
		return (EList<IDiagramModelConnection>)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
				public EList<IDiagramModelConnection> getTargetConnections() {
		return (EList<IDiagramModelConnection>)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getFillColor() {
		return (String)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_OBJECT__FILL_COLOR, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFillColor(String newFillColor) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_OBJECT__FILL_COLOR, newFillColor);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getFont() {
		return (String)eGet(IArchimatePackage.Literals.FONT_ATTRIBUTE__FONT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFont(String newFont) {
		eSet(IArchimatePackage.Literals.FONT_ATTRIBUTE__FONT, newFont);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getFontColor() {
		return (String)eGet(IArchimatePackage.Literals.FONT_ATTRIBUTE__FONT_COLOR, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFontColor(String newFontColor) {
		eSet(IArchimatePackage.Literals.FONT_ATTRIBUTE__FONT_COLOR, newFontColor);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getTextAlignment() {
		return (Integer)eGet(IArchimatePackage.Literals.FONT_ATTRIBUTE__TEXT_ALIGNMENT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTextAlignment(int newTextAlignment) {
		eSet(IArchimatePackage.Literals.FONT_ATTRIBUTE__TEXT_ALIGNMENT, newTextAlignment);
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addConnection(IDiagramModelConnection connection) {
        if(connection == null) {
            throw new IllegalArgumentException("Connection was null");
        }
        if(connection.getSource() == connection.getTarget()) {
            //throw new IllegalArgumentException("Connection source is same as target!");
        }
        
        // This used to be "if/else if". This way it is possible for source == target (recursive) - just in case!
        if(connection.getSource() == this) {
            getSourceConnections().add(connection);
        }
        
        if(connection.getTarget() == this) {
            getTargetConnections().add(connection);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void removeConnection(IDiagramModelConnection connection) {
        if(connection == null) {
            throw new IllegalArgumentException();
        }
        
        if(connection.getSource() == this) {
            getSourceConnections().remove(connection);
        } 
        
        if(connection.getTarget() == this) {
            getTargetConnections().remove(connection);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setBounds(int x, int y, int width, int height) {
        IBounds bounds = IArchimateFactory.eINSTANCE.createBounds(x, y, width, height);
        setBounds(bounds);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public int getDefaultTextAlignment() {
        return TEXT_ALIGNMENT_CENTER;
    }

    @Override
    public EObject getCopy() {
        IDiagramModelObject newObject = (IDiagramModelObject)super.getCopy();
        
        newObject.getSourceConnections().clear();
        newObject.getTargetConnections().clear();
        
        return newObject;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IFontAttribute.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.DIAGRAM_MODEL_OBJECT__FONT: return IArchimatePackage.FONT_ATTRIBUTE__FONT;
				case IArchimatePackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR: return IArchimatePackage.FONT_ATTRIBUTE__FONT_COLOR;
				case IArchimatePackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT: return IArchimatePackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT;
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
		if (baseClass == IFontAttribute.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.FONT_ATTRIBUTE__FONT: return IArchimatePackage.DIAGRAM_MODEL_OBJECT__FONT;
				case IArchimatePackage.FONT_ATTRIBUTE__FONT_COLOR: return IArchimatePackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR;
				case IArchimatePackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT: return IArchimatePackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiagramModelObject
