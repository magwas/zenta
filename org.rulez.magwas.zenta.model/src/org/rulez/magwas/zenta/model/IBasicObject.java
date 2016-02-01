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
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * @extends IObjectClass
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicObject#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicObject#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicObject#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicObject()
 * @model
 * @generated
 */
public interface IBasicObject extends IZentaElement, IObjectClass {

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicObject_Attributes()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<IAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IBasicObject#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(IBasicObject)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicObject_Ancestor()
	 * @see org.rulez.magwas.zenta.model.IBasicObject#getChildren
	 * @model opposite="children" resolveProxies="false" required="true"
	 * @generated
	 */
	IBasicObject getAncestor();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IBasicObject#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(IBasicObject value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IBasicObject}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IBasicObject#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicObject_Children()
	 * @see org.rulez.magwas.zenta.model.IBasicObject#getAncestor
	 * @model opposite="ancestor" resolveProxies="false" derived="true"
	 * @generated
	 */
	EList<IBasicObject> getChildren();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.ITemplate#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(ITemplate)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicObject_Template()
	 * @see org.rulez.magwas.zenta.model.ITemplate#getClasses
	 * @model opposite="classes" transient="true"
	 * @generated
	 */
	ITemplate getTemplate();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IBasicObject#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(ITemplate value);

	String getDefiningName();
	
	IZentaModel getZentaModel();


} // IBasicObject
