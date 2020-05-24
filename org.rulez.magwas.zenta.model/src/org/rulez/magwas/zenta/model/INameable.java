/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nameable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.INameable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getNameable()
 * @model interface="true" abstract="true"
 * @extends ZentaObject
 * @generated
 */
public interface INameable extends ZentaObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getNameable_Name()
	 * @model default=""
	 * @generated
	 */
	
	String getName();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.INameable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	UndoState delete();
	UndoState prepareDelete();
	UndoState delete(UndoState state);
	boolean hasDiagramReferences();
	boolean isDeleted();

	void move(IFolder fOldParent, IFolder fNewParent);
	
	@Deprecated // BasicRelationshipCheckService
	default void checkName(String value) {
		if ( value == null )
			throw new ModelConsistencyException("name cannot be null", this);
	}
} // INameable
