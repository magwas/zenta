/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicObject#getObjectClass <em>Object Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicObject()
 * @model
 * @generated
 */
public interface IBasicObject extends IZentaElement {

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute.
	 * @see #setObjectClass(String)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicObject_ObjectClass()
	 * @model
	 * @generated
	 */
	String getObjectClass();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IBasicObject#getObjectClass <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' attribute.
	 * @see #getObjectClass()
	 * @generated
	 */
	void setObjectClass(String value);
	
	IBasicObject getDefiningElement(
			DiagramModelZentaObjectBase diagramModelZentaObjectBase);

	IBasicRelationship getDefiningElement(
			DiagramModelZentaConnectionBase diagramModelZentaConnectionBase);

	boolean isTemplate();
	

} // IBasicObject
