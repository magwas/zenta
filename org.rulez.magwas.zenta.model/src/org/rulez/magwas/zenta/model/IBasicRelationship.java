/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.nonnul.NonNullList;

import com.kodekonveyor.zenta.model.BasicRelationshipCheckService;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Relationship</b></em>'.
 * @extends IRelationClass
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IBasicRelationship#getDiagConnections <em>Diag Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicRelationship()
 * @model
 */
abstract public interface IBasicRelationship extends IBasicObject, IRelationClass {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IZentaElement)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicRelationship_Source()
	 * @model resolveProxies="false"
	 * @generated
	 */
	IZentaElement getSource();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IBasicRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IZentaElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IZentaElement)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicRelationship_Target()
	 * @model resolveProxies="false"
	 * @generated
	 */
	IZentaElement getTarget();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IBasicRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IZentaElement value);

	/**
	 * Returns the value of the '<em><b>Diag Connections</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IDiagramModelZentaConnection}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaConnection#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diag Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diag Connections</em>' reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getBasicRelationship_DiagConnections()
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaConnection#getRelationship
	 * @model opposite="relationship" transient="true" derived="true"
	 * @generated
	 */
	EList<IDiagramModelZentaConnection> getDiagConnections();

	NonNullList<IBasicObject> getAllowedTargets();
	IBasicRelationship create(IFolder folder);
	
	boolean isConnected();
	
	default void check() {
		BasicRelationshipCheckService.call(this);
	}


	default void checkDiagConnections() {
		for(IDiagramModelZentaConnection i : getDiagConnections()) {
			i.check();
		}
	}

} // IBasicRelationship
