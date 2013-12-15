/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.common.util.EList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IZentaElement#getDiagObjects <em>Diag Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaElement()
 * @model abstract="true"
 * @generated
 */
public interface IZentaElement extends IZentaModelElement, IIdentifier, ICloneable, INameable, IDocumentable, IProperties {

	/**
	 * Returns the value of the '<em><b>Diag Objects</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getZentaElement <em>Zenta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diag Objects</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diag Objects</em>' reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaElement_DiagObjects()
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getZentaElement
	 * @model opposite="zentaElement" transient="true" derived="true"
	 * @generated
	 */
	EList<IDiagramModelZentaObject> getDiagObjects();

	Map<String, EAttribute> getObjectAppearanceProperties();

	List<String> getPropertyNamed(String propname);
	
	void setPropsFromDiagramObject(IDiagramModelComponent dmo);
	
	void addOrUpdateProperty(String key, String value);

} // IZentaElement
