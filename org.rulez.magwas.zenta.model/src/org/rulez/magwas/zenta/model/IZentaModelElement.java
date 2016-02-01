/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IZentaModelElement#getZentaModel <em>Zenta Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaModelElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IZentaModelElement extends IAdapter {
	/**
	 * Returns the value of the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zenta Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zenta Model</em>' reference.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaModelElement_ZentaModel()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	
	IZentaModel getZentaModel();

} // IZentaModelElement
