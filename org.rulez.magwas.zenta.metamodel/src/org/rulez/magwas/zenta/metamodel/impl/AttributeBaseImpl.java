/**
 */
package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBasePackage;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.metamodel.RelationClassBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl#getConnectedObject <em>Connected Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeBaseImpl extends EObjectImpl implements AttributeBase {
	/**
	 * The default value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_OCCURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected int minOccurs = MIN_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_OCCURS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected int maxOccurs = MAX_OCCURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected RelationClassBase relation;

	/**
	 * The cached value of the '{@link #getConnectedObject() <em>Connected Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassBase connectedObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelBasePackage.Literals.ATTRIBUTE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinOccurs() {
		return minOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOccurs(int newMinOccurs) {
		int oldMinOccurs = minOccurs;
		minOccurs = newMinOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.ATTRIBUTE_BASE__MIN_OCCURS, oldMinOccurs, minOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxOccurs() {
		return maxOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurs(int newMaxOccurs) {
		int oldMaxOccurs = maxOccurs;
		maxOccurs = newMaxOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.ATTRIBUTE_BASE__MAX_OCCURS, oldMaxOccurs, maxOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationClassBase getRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(RelationClassBase newRelation) {
		RelationClassBase oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.ATTRIBUTE_BASE__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassBase getConnectedObject() {
		return connectedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedObject(ObjectClassBase newConnectedObject) {
		ObjectClassBase oldConnectedObject = connectedObject;
		connectedObject = newConnectedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.ATTRIBUTE_BASE__CONNECTED_OBJECT, oldConnectedObject, connectedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelBasePackage.ATTRIBUTE_BASE__MIN_OCCURS:
				return getMinOccurs();
			case MetamodelBasePackage.ATTRIBUTE_BASE__MAX_OCCURS:
				return getMaxOccurs();
			case MetamodelBasePackage.ATTRIBUTE_BASE__RELATION:
				return getRelation();
			case MetamodelBasePackage.ATTRIBUTE_BASE__CONNECTED_OBJECT:
				return getConnectedObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelBasePackage.ATTRIBUTE_BASE__MIN_OCCURS:
				setMinOccurs((Integer)newValue);
				return;
			case MetamodelBasePackage.ATTRIBUTE_BASE__MAX_OCCURS:
				setMaxOccurs((Integer)newValue);
				return;
			case MetamodelBasePackage.ATTRIBUTE_BASE__RELATION:
				setRelation((RelationClassBase)newValue);
				return;
			case MetamodelBasePackage.ATTRIBUTE_BASE__CONNECTED_OBJECT:
				setConnectedObject((ObjectClassBase)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelBasePackage.ATTRIBUTE_BASE__MIN_OCCURS:
				setMinOccurs(MIN_OCCURS_EDEFAULT);
				return;
			case MetamodelBasePackage.ATTRIBUTE_BASE__MAX_OCCURS:
				setMaxOccurs(MAX_OCCURS_EDEFAULT);
				return;
			case MetamodelBasePackage.ATTRIBUTE_BASE__RELATION:
				setRelation((RelationClassBase)null);
				return;
			case MetamodelBasePackage.ATTRIBUTE_BASE__CONNECTED_OBJECT:
				setConnectedObject((ObjectClassBase)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelBasePackage.ATTRIBUTE_BASE__MIN_OCCURS:
				return minOccurs != MIN_OCCURS_EDEFAULT;
			case MetamodelBasePackage.ATTRIBUTE_BASE__MAX_OCCURS:
				return maxOccurs != MAX_OCCURS_EDEFAULT;
			case MetamodelBasePackage.ATTRIBUTE_BASE__RELATION:
				return relation != null;
			case MetamodelBasePackage.ATTRIBUTE_BASE__CONNECTED_OBJECT:
				return connectedObject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minOccurs: ");
		result.append(minOccurs);
		result.append(", maxOccurs: ");
		result.append(maxOccurs);
		result.append(')');
		return result.toString();
	}

} //AttributeBaseImpl
