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
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IFolder#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getFolder()
 * @model
 * @generated
 */
public interface IFolder extends IZentaModelElement, IFolderContainer, INameable, IIdentifier, IDocumentable, IProperties {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.INameable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getFolder_Elements()
	 * @model containment="true"
	 *        extendedMetaData="name='element' kind='element'"
	 * @generated
	 */
	EList<INameable> getElements();

	default void check() {
		checkId(getId());
		checkName(getName());
		checkDocumentation(getDocumentation());
		checkElements();
		setChecked(true);
	}

	default void checkElements() {
		for(INameable element: getElements()){
			element.check();
		}
	}

	default void checkFolders() {
		for ( INameable e : getFolders()) {
			e.check();
		}
	}

} // IFolder
