/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getObjectClass()
 * @model
 * @generated
 */
public interface ObjectClass extends referencesModelObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getObjectClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(ObjectClass)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getObjectClass_Ancestor()
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass#getChildren
	 * @model opposite="children" resolveProxies="false" required="true"
	 * @generated
	 */
	ObjectClass getAncestor();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(ObjectClass value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.ObjectClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getObjectClass_Children()
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass#getAncestor
	 * @model opposite="ancestor" resolveProxies="false" derived="true"
	 * @generated
	 */
	EList<ObjectClass> getChildren();

} // ObjectClass
