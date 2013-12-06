/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IZentaModel#getFile <em>File</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IZentaModel#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaModel()
 * @model extendedMetaData="name='model'"
 * @generated
 */
public interface IZentaModel extends IFolderContainer, INameable, IIdentifier, IZentaModelElement, IProperties, IDocumentable {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(File)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaModel_File()
	 * @model dataType="org.rulez.magwas.zenta.model.File" transient="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IZentaModel#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaModel_Version()
	 * @model default=""
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IZentaModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDefaults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IFolder addDerivedRelationsFolder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDerivedRelationsFolder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementRequired="true"
	 * @generated
	 */
	IFolder getDefaultFolderForElement(EObject element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	IDiagramModel getDefaultDiagramModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<IDiagramModel> getDiagramModels();

} // IZentaModel
