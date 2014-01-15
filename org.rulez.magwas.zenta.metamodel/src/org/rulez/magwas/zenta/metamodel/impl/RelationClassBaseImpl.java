/**
 */
package org.rulez.magwas.zenta.metamodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.zenta.metamodel.MetamodelBasePackage;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.model.IIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Class Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl#getTemplate <em>ITemplate</em>}</li>
 * </ul>
 * </p>
 *
 */
abstract public class RelationClassBaseImpl extends EObjectImpl implements IRelationClass {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected IIdentifier reference;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAncestor() <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestor()
	 * @generated
	 * @ordered
	 */
	protected IRelationClass ancestor;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<IRelationClass> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationClassBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelBasePackage.Literals.RELATION_CLASS_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIdentifier getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(IIdentifier newReference) {
		IIdentifier oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.RELATION_CLASS_BASE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.RELATION_CLASS_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRelationClass getAncestor() {
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAncestor(IRelationClass newAncestor, NotificationChain msgs) {
		IRelationClass oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR, oldAncestor, newAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncestor(IRelationClass newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN, IRelationClass.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(this, MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN, IRelationClass.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR, newAncestor, newAncestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IRelationClass> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseEList<IRelationClass>(IRelationClass.class, this, MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN, MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITemplate getTemplate() {
		if (eContainerFeatureID() != MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE) return null;
		return (ITemplate)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(ITemplate newTemplate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplate, MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(ITemplate newTemplate) {
		if (newTemplate != eInternalContainer() || (eContainerFeatureID() != MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES, ITemplate.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE, newTemplate, newTemplate));
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
			case MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN, IRelationClass.class, msgs);
				return basicSetAncestor((IRelationClass)otherEnd, msgs);
			case MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((ITemplate)otherEnd, msgs);
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
			case MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR:
				return basicSetAncestor(null, msgs);
			case MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE:
				return basicSetTemplate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE:
				return eInternalContainer().eInverseRemove(this, MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES, ITemplate.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelBasePackage.RELATION_CLASS_BASE__REFERENCE:
				return getReference();
			case MetamodelBasePackage.RELATION_CLASS_BASE__NAME:
				return getName();
			case MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR:
				return getAncestor();
			case MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN:
				return getChildren();
			case MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE:
				return getTemplate();
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
			case MetamodelBasePackage.RELATION_CLASS_BASE__REFERENCE:
				setReference((IIdentifier)newValue);
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__NAME:
				setName((String)newValue);
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR:
				setAncestor((IRelationClass)newValue);
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IRelationClass>)newValue);
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE:
				setTemplate((ITemplate)newValue);
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
			case MetamodelBasePackage.RELATION_CLASS_BASE__REFERENCE:
				setReference((IIdentifier)null);
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR:
				setAncestor((IRelationClass)null);
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN:
				getChildren().clear();
				return;
			case MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE:
				setTemplate((ITemplate)null);
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
			case MetamodelBasePackage.RELATION_CLASS_BASE__REFERENCE:
				return reference != null;
			case MetamodelBasePackage.RELATION_CLASS_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelBasePackage.RELATION_CLASS_BASE__ANCESTOR:
				return ancestor != null;
			case MetamodelBasePackage.RELATION_CLASS_BASE__CHILDREN:
				return children != null && !children.isEmpty();
			case MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE:
				return getTemplate() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelationClassBaseImpl
