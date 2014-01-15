/**
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Class Base</b></em>'.
 * @extends IHelpHintProvider
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IRelationClass#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IRelationClass#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IRelationClass#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getRelationClass()
 * @model
 * @generated
 */
public interface IRelationClass extends IReferencesModelObject, IHelpHintProvider {
	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IRelationClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(IRelationClass)
	 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getRelationClass_Ancestor()
	 * @see org.rulez.magwas.zenta.model.IRelationClass#getChildren
	 * @model opposite="children" resolveProxies="false" required="true"
	 * @generated
	 */
	IRelationClass getAncestor();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IRelationClass#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(IRelationClass value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IRelationClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IRelationClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getRelationClass_Children()
	 * @see org.rulez.magwas.zenta.model.IRelationClass#getAncestor
	 * @model opposite="ancestor" resolveProxies="false" derived="true"
	 * @generated
	 */
	EList<IRelationClass> getChildren();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.ITemplate#getRelationClasses <em>Relation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(ITemplate)
	 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getRelationClass_Template()
	 * @see org.rulez.magwas.zenta.model.ITemplate#getRelationClasses
	 * @model opposite="relationClasses" transient="false"
	 * @generated
	 */
	ITemplate getTemplate();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IRelationClass#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(ITemplate value);

} // RelationClassBase
