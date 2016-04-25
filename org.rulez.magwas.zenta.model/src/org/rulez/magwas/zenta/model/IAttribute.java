/**
 */
package org.rulez.magwas.zenta.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AttributeBase Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IAttribute#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IAttribute#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IAttribute#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IAttribute#getConnectedObject <em>Connected Object</em>}</li>
 * </ul>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getAttribute()
 * @model
 * @extends ZentaObject
 * @generated
 */
public interface IAttribute extends ZentaObject {
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
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getAttribute_MinOccurs()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinOccurs();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IAttribute#getMinOccurs <em>Min Occurs</em>}' attribute.
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
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getAttribute_MaxOccurs()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getMaxOccurs();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IAttribute#getMaxOccurs <em>Max Occurs</em>}' attribute.
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
	 * @see #setRelation(IBasicRelationship)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getAttribute_Relation()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	IBasicRelationship getRelation();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IAttribute#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(IBasicRelationship value);

	/**
	 * Returns the value of the '<em><b>Connected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Object</em>' reference.
	 * @see #setConnectedObject(IBasicObject)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getAttribute_ConnectedObject()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	IBasicObject getConnectedObject();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IAttribute#getConnectedObject <em>Connected Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Object</em>' reference.
	 * @see #getConnectedObject()
	 * @generated
	 */
	void setConnectedObject(IBasicObject value);

	public enum Direction {
		SOURCE,TARGET
	}

	Direction getDirection();
	void setDirection(Direction dir);

	default void checkRelation(IBasicRelationship relation) {
		if(relation == null)
			throw new ModelConsistencyException("relation cannot be null", this);
	}

	default void checkDirection(Direction direction) {
		if(direction == null)
			throw new ModelConsistencyException("direction cannot be null", this);
	}

	default void checkConnectedObject(IBasicObject direction) {
		if(direction == null)
			throw new ModelConsistencyException("direction cannot be null", this);
	}

	default void check() {
		checkRelation(getRelation());
		checkDirection(getDirection());
		checkConnectedObject(getConnectedObject());
		setChecked(true);
	}

} // AttributeBase
