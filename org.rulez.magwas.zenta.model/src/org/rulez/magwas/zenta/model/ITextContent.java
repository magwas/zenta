/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.ITextContent#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getTextContent()
 * @model interface="true" abstract="true"
 * @extends ZentaObject
 * @generated
 */
public interface ITextContent extends ZentaObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getTextContent_Content()
	 * @model default=""
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.ITextContent#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // ITextContent
