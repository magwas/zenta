/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getObjectClassBase()
 * @model
 * @generated
 */
public interface ObjectClassBase extends ReferencesModelObjectBase {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.AttributeBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getObjectClassBase_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeBase> getAttributes();

	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(ObjectClassBase)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getObjectClassBase_Ancestor()
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase#getChildren
	 * @model opposite="children" resolveProxies="false" required="true"
	 * @generated
	 */
	ObjectClassBase getAncestor();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(ObjectClassBase value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.ObjectClassBase}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getObjectClassBase_Children()
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAncestor
	 * @model opposite="ancestor" resolveProxies="false" derived="true"
	 * @generated
	 */
	EList<ObjectClassBase> getChildren();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getObjectClasses <em>Object Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateBase)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getObjectClassBase_Template()
	 * @see org.rulez.magwas.zenta.metamodel.TemplateBase#getObjectClasses
	 * @model opposite="objectClasses" transient="false"
	 * @generated
	 */
	TemplateBase getTemplate();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateBase value);

} // ObjectClassBase
