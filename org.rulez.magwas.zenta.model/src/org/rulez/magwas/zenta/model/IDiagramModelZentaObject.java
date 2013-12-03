/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Zenta Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getZentaElement <em>Zenta Element</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelZentaObject()
 * @model extendedMetaData="name='DiagramObject'"
 * @generated
 */
public interface IDiagramModelZentaObject extends IDiagramModelObject, IDiagramModelContainer {
	/**
	 * Returns the value of the '<em><b>Zenta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zenta Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zenta Element</em>' reference.
	 * @see #setZentaElement(IZentaElement)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelZentaObject_ZentaElement()
	 * @model resolveProxies="false" volatile="true"
	 * @generated
	 */
	IZentaElement getZentaElement();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getZentaElement <em>Zenta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zenta Element</em>' reference.
	 * @see #getZentaElement()
	 * @generated
	 */
	void setZentaElement(IZentaElement value);

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
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelZentaObject_Type()
	 * @model default="0"
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getType <em>Type</em>}' attribute.
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
	void addZentaElementToModel(IFolder parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeZentaElementFromModel();

	IZentaElement getDefiningElement();

	String getFinalElementShape();

} // IDiagramModelZentaObject
