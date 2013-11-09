/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Zentamate Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelZentamateObject#getZentamateElement <em>Zentamate Element</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelZentamateObject#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentamatePackage#getDiagramModelZentamateObject()
 * @model extendedMetaData="name='DiagramObject'"
 * @generated
 */
public interface IDiagramModelZentamateObject extends IDiagramModelObject, IDiagramModelContainer {
	/**
	 * Returns the value of the '<em><b>Zentamate Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zentamate Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zentamate Element</em>' reference.
	 * @see #setZentamateElement(IZentamateElement)
	 * @see org.rulez.magwas.zenta.model.IZentamatePackage#getDiagramModelZentamateObject_ZentamateElement()
	 * @model resolveProxies="false" volatile="true"
	 * @generated
	 */
	IZentamateElement getZentamateElement();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelZentamateObject#getZentamateElement <em>Zentamate Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zentamate Element</em>' reference.
	 * @see #getZentamateElement()
	 * @generated
	 */
	void setZentamateElement(IZentamateElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see org.rulez.magwas.zenta.model.IZentamatePackage#getDiagramModelZentamateObject_Type()
	 * @model default="0"
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelZentamateObject#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addZentamateElementToModel(IFolder parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeZentamateElementFromModel();

} // IDiagramModelZentamateObject