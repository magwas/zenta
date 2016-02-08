/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Zenta Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelZentaConnection#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelZentaConnection()
 * @model extendedMetaData="name='Connection'"
 * @generated
 */
public interface IDiagramModelZentaConnection extends IDiagramModelConnection {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IBasicRelationship#getDiagConnections <em>Diag Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(IBasicRelationship)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelZentaConnection_Relationship()
	 * @see org.rulez.magwas.zenta.model.IBasicRelationship#getDiagConnections
	 * @model opposite="diagConnections" resolveProxies="false"
	 * @generated
	 */
	
	IBasicRelationship getRelationship();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaConnection#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(IBasicRelationship value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addRelationshipToModel(IFolder parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRelationshipFromModel();

	IBasicRelationship getDefiningElement();

	String getFinalLineDecoration();

} // IDiagramModelZentaConnection
