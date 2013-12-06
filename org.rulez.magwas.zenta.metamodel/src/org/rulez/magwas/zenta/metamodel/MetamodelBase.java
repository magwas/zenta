/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.MetamodelBase#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getMetamodelBase()
 * @model
 * @generated
 */
public interface MetamodelBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.TemplateBase}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getMetamodelBase_Templates()
	 * @see org.rulez.magwas.zenta.metamodel.TemplateBase#getMetamodel
	 * @model opposite="metamodel" containment="true"
	 * @generated
	 */
	EList<TemplateBase> getTemplates();

} // MetamodelBase
