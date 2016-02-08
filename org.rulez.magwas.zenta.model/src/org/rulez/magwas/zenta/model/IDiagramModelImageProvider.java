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
 * A representation of the model object '<em><b>Diagram Model Image Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelImageProvider#getImagePath <em>Image Path</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelImageProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDiagramModelImageProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelImageProvider_ImagePath()
	 * @model
	 * @generated NOT
	 */
	String getImagePathOrNull();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelImageProvider#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePathOrNull()
	 * @generated NOT
	 */
	void setImagePath(String value);

} // IDiagramModelImageProvider
