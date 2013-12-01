/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getZentaElement()
 * @model abstract="true"
 * @generated
 */
public interface IZentaElement extends IZentaModelElement, IIdentifier, ICloneable, INameable, IDocumentable, IProperties {

	Map<String, EAttribute> getObjectAppearanceProperties();

	List<String> getPropertyNamed(String propname);

	void setAppearanceForDefinedElements();

	IDiagramModelZentaObject getElementFromDiagramModel(IDiagramModel dm);

	void setPropsFromDiagramObject(IDiagramModelObject dmo);

} // IZentaElement
