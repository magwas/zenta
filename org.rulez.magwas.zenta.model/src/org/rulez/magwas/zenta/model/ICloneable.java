/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloneable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getCloneable()
 * @model interface="true" abstract="true"
 * @extends ZentaObject
 * @generated
 */
public interface ICloneable extends ZentaObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EObject getCopy();

} // ICloneable
