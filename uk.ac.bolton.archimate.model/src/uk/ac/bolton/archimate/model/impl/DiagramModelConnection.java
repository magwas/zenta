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
import uk.ac.bolton.archimate.model.IDiagramModelBendpoint;
import uk.ac.bolton.archimate.model.IDiagramModelConnection;
import uk.ac.bolton.archimate.model.IDiagramModelObject;
import uk.ac.bolton.archimate.model.IDocumentable;
import uk.ac.bolton.archimate.model.IFontAttribute;
import uk.ac.bolton.archimate.model.IProperties;
import uk.ac.bolton.archimate.model.IProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getFont <em>Font</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getProperties <em>Properties</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getText <em>Text</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelConnection extends DiagramModelComponent implements IDiagramModelConnection {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelConnection() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION;
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
    public String getDocumentation() {
		return (String)eGet(IArchimatePackage.Literals.DOCUMENTABLE__DOCUMENTATION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocumentation(String newDocumentation) {
		eSet(IArchimatePackage.Literals.DOCUMENTABLE__DOCUMENTATION, newDocumentation);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getText() {
		return (String)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TEXT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setText(String newText) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TEXT, newText);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getTextPosition() {
		return (Integer)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTextPosition(int newTextPosition) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION, newTextPosition);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelObject getSource() {
		return (IDiagramModelObject)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__SOURCE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSource(IDiagramModelObject newSource) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__SOURCE, newSource);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelObject getTarget() {
		return (IDiagramModelObject)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TARGET, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTarget(IDiagramModelObject newTarget) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TARGET, newTarget);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
				public EList<IDiagramModelBendpoint> getBendpoints() {
		return (EList<IDiagramModelBendpoint>)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__BENDPOINTS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getLineWidth() {
		return (Integer)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLineWidth(int newLineWidth) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH, newLineWidth);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLineColor() {
		return (String)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__LINE_COLOR, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLineColor(String newLineColor) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__LINE_COLOR, newLineColor);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getType() {
		return (String)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TYPE, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(String newType) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_CONNECTION__TYPE, newType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void connect(IDiagramModelObject source, IDiagramModelObject target) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void disconnect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void reconnect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getDefaultTextAlignment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

    @Override
    public EObject getCopy() {
        IDiagramModelConnection newConnection = (IDiagramModelConnection)super.getCopy();
        newConnection.setSource(null);
        newConnection.setTarget(null);
        return newConnection;
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
				case IArchimatePackage.DIAGRAM_MODEL_CONNECTION__FONT: return IArchimatePackage.FONT_ATTRIBUTE__FONT;
				case IArchimatePackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR: return IArchimatePackage.FONT_ATTRIBUTE__FONT_COLOR;
				case IArchimatePackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT: return IArchimatePackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES: return IArchimatePackage.PROPERTIES__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (derivedFeatureID) {
				case IArchimatePackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION: return IArchimatePackage.DOCUMENTABLE__DOCUMENTATION;
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
				case IArchimatePackage.FONT_ATTRIBUTE__FONT: return IArchimatePackage.DIAGRAM_MODEL_CONNECTION__FONT;
				case IArchimatePackage.FONT_ATTRIBUTE__FONT_COLOR: return IArchimatePackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR;
				case IArchimatePackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT: return IArchimatePackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.PROPERTIES__PROPERTIES: return IArchimatePackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (baseFeatureID) {
				case IArchimatePackage.DOCUMENTABLE__DOCUMENTATION: return IArchimatePackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiagramModelConnection
