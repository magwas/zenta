/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelContainer#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDiagramModelContainer extends IDiagramModelComponent {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IDiagramModelObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelContainer_Children()
	 * @model containment="true"
	 *        extendedMetaData="name='child' kind='element'"
	 * @generated
	 */
	EList<IDiagramModelObject> getChildren();

	default IFolder getParentFolder() {
		EObject parent = eContainer();
		if (parent instanceof IFolder)
			return (IFolder) parent;
		if(null == parent)
			throw new IllegalArgumentException("no parent");
		return ((IDiagramModelContainer) parent).getParentFolder();
	}



} // IDiagramModelContainer
