/**
 */
package org.rulez.magwas.zenta.metamodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.impl.AssociationRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassImpl#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationClassImpl extends ReferencesModelObject implements RelationClass {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EObject reference;

	/**
	 * The cached value of the '{@link #getAncestor() <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestor()
	 * @generated
	 * @ordered
	 */
	protected RelationClass ancestor;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClass> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param referenced 
	 * @generated
	 */
	protected RelationClassImpl(AssociationRelationship referenced) {
		super();
		this.setReference(referenced);
	}

	protected RelationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.RELATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(EObject newReference) {
		EObject oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RELATION_CLASS__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationClass getAncestor() {
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAncestor(RelationClass newAncestor, NotificationChain msgs) {
		RelationClass oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.RELATION_CLASS__ANCESTOR, oldAncestor, newAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncestor(RelationClass newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelPackage.RELATION_CLASS__CHILDREN, RelationClass.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(this, MetamodelPackage.RELATION_CLASS__CHILDREN, RelationClass.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RELATION_CLASS__ANCESTOR, newAncestor, newAncestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseEList<RelationClass>(RelationClass.class, this, MetamodelPackage.RELATION_CLASS__CHILDREN, MetamodelPackage.RELATION_CLASS__ANCESTOR);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.RELATION_CLASS__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelPackage.RELATION_CLASS__CHILDREN, RelationClass.class, msgs);
				return basicSetAncestor((RelationClass)otherEnd, msgs);
			case MetamodelPackage.RELATION_CLASS__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.RELATION_CLASS__ANCESTOR:
				return basicSetAncestor(null, msgs);
			case MetamodelPackage.RELATION_CLASS__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.RELATION_CLASS__REFERENCE:
				return getReference();
			case MetamodelPackage.RELATION_CLASS__ANCESTOR:
				return getAncestor();
			case MetamodelPackage.RELATION_CLASS__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.RELATION_CLASS__REFERENCE:
				setReference((EObject)newValue);
				return;
			case MetamodelPackage.RELATION_CLASS__ANCESTOR:
				setAncestor((RelationClass)newValue);
				return;
			case MetamodelPackage.RELATION_CLASS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends RelationClass>)newValue);
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
			case MetamodelPackage.RELATION_CLASS__REFERENCE:
				setReference((EObject)null);
				return;
			case MetamodelPackage.RELATION_CLASS__ANCESTOR:
				setAncestor((RelationClass)null);
				return;
			case MetamodelPackage.RELATION_CLASS__CHILDREN:
				getChildren().clear();
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
			case MetamodelPackage.RELATION_CLASS__REFERENCE:
				return reference != null;
			case MetamodelPackage.RELATION_CLASS__ANCESTOR:
				return ancestor != null;
			case MetamodelPackage.RELATION_CLASS__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationClassImpl
