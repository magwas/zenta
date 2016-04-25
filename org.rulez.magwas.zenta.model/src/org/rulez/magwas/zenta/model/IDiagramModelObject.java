/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getElementShape <em>Element Shape</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelObject()
 * @model abstract="true"
 * @generated
 */
public interface IDiagramModelObject extends IDiagramModelComponent, IFontAttribute {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(IBounds)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelObject_Bounds()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IBounds getBounds();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(IBounds value);

	/**
	 * Returns the value of the '<em><b>Source Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IDiagramModelConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connections</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelObject_SourceConnections()
	 * @model containment="true"
	 *        extendedMetaData="name='sourceConnection' kind='element'"
	 * @generated
	 */
	EList<IDiagramModelConnection> getSourceConnections();

	/**
	 * Returns the value of the '<em><b>Target Connections</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IDiagramModelConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connections</em>' reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelObject_TargetConnections()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<IDiagramModelConnection> getTargetConnections();

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #setFillColor(String)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelObject_FillColor()
	 * @model
	 * @generated
	 */
	String getFillColor();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(String value);

	/**
	 * Returns the value of the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Shape</em>' attribute.
	 * @see #setElementShape(String)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelObject_ElementShape()
	 * @model
	 * @generated
	 */
	String getElementShape();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getElementShape <em>Element Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Shape</em>' attribute.
	 * @see #getElementShape()
	 * @generated
	 */
	void setElementShape(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addConnection(IDiagramModelConnection connection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeConnection(IDiagramModelConnection connection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBounds(int x, int y, int width, int height);

	String getFinalFillColor();

	String getFinalFontColor();

	int getFinalTextAlignment();

	String getFinalFont();

	default void checkBounds(IBounds bounds) {
		if ( bounds == null )
			throw new ModelConsistencyException("bounds cannot be null", this);
	}


} // IDiagramModelObject
