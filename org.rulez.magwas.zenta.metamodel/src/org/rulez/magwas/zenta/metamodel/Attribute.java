/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.Attribute#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.Attribute#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.Attribute#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.Attribute#getConnectedObject <em>Connected Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	public enum Direction {
		SOURCE,TARGET
	}

	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see #setMinOccurs(int)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getAttribute_MinOccurs()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinOccurs();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.Attribute#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(int value);

	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #setMaxOccurs(int)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getAttribute_MaxOccurs()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMaxOccurs();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.Attribute#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(int value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(RelationClass)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getAttribute_Relation()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	RelationClass getRelation();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.Attribute#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(RelationClass value);

	/**
	 * Returns the value of the '<em><b>Connected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Object</em>' reference.
	 * @see #setConnectedObject(ObjectClass)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getAttribute_ConnectedObject()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	ObjectClass getConnectedObject();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.Attribute#getConnectedObject <em>Connected Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Object</em>' reference.
	 * @see #getConnectedObject()
	 * @generated
	 */
	void setConnectedObject(ObjectClass value);

	Direction getDirection();

} // Attribute
