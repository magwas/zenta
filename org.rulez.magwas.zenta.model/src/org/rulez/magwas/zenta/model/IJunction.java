/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Junction</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getJunction()
 * @model
 * @generated
 */
public interface IJunction extends IJunctionElement {
	default void check() {
		checkDocumentation(getDocumentation());
		checkId(getId());
		checkName(getName());
		setChecked(true);
	}

} // IJunction
