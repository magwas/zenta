/**
 */
package org.rulez.magwas.metamodel.metamodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.metamodel.metamodel.RelationClass#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.metamodel.metamodel.RelationClass#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.metamodel.metamodel.MetamodelPackage#getRelationClass()
 * @model
 * @generated
 */
public interface RelationClass extends referencesModelObject {
	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.metamodel.metamodel.RelationClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(RelationClass)
	 * @see org.rulez.magwas.metamodel.metamodel.MetamodelPackage#getRelationClass_Ancestor()
	 * @see org.rulez.magwas.metamodel.metamodel.RelationClass#getChildren
	 * @model opposite="children" resolveProxies="false" required="true"
	 * @generated
	 */
	RelationClass getAncestor();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.metamodel.metamodel.RelationClass#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(RelationClass value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.metamodel.metamodel.RelationClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.metamodel.metamodel.RelationClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.rulez.magwas.metamodel.metamodel.MetamodelPackage#getRelationClass_Children()
	 * @see org.rulez.magwas.metamodel.metamodel.RelationClass#getAncestor
	 * @model opposite="ancestor" resolveProxies="false" derived="true"
	 * @generated
	 */
	EList<RelationClass> getChildren();

} // RelationClass
