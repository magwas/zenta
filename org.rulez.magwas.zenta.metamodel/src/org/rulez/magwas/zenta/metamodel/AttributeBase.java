/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AttributeBase Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getConnectedObject <em>Connected Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getAttributeBase()
 * @model
 * @generated
 */
public interface AttributeBase extends EObject {
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
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getAttributeBase_MinOccurs()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinOccurs();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getMinOccurs <em>Min Occurs</em>}' attribute.
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
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getAttributeBase_MaxOccurs()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMaxOccurs();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getMaxOccurs <em>Max Occurs</em>}' attribute.
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
	 * @see #setRelation(IRelationClass)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getAttributeBase_Relation()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	IRelationClass getRelation();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(IRelationClass value);

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
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getAttributeBase_ConnectedObject()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	ObjectClass getConnectedObject();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getConnectedObject <em>Connected Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Object</em>' reference.
	 * @see #getConnectedObject()
	 * @generated
	 */
	void setConnectedObject(ObjectClass value);

	public enum Direction {
		SOURCE,TARGET
	}

	Direction getDirection();


} // AttributeBase
