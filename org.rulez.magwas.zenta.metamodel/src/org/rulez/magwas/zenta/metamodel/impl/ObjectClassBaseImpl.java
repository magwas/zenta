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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBasePackage;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.metamodel.TemplateBase;
import org.rulez.magwas.zenta.model.IIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Class Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectClassBaseImpl extends EObjectImpl implements ObjectClassBase {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeBase> attributes;

	/**
	 * The cached value of the '{@link #getAncestor() <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestor()
	 * @generated
	 * @ordered
	 */
	protected ObjectClassBase ancestor;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectClassBase> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectClassBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelBasePackage.Literals.OBJECT_CLASS_BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.OBJECT_CLASS_BASE__REFERENCE, oldReference, reference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.OBJECT_CLASS_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeBase> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeBase>(AttributeBase.class, this, MetamodelBasePackage.OBJECT_CLASS_BASE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassBase getAncestor() {
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAncestor(ObjectClassBase newAncestor, NotificationChain msgs) {
		ObjectClassBase oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR, oldAncestor, newAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncestor(ObjectClassBase newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN, ObjectClassBase.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(this, MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN, ObjectClassBase.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR, newAncestor, newAncestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectClassBase> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseEList<ObjectClassBase>(ObjectClassBase.class, this, MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN, MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBase getTemplate() {
		if (eContainerFeatureID() != MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE) return null;
		return (TemplateBase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateBase newTemplate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplate, MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateBase newTemplate) {
		if (newTemplate != eInternalContainer() || (eContainerFeatureID() != MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES, TemplateBase.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE, newTemplate, newTemplate));
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
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN, ObjectClassBase.class, msgs);
				return basicSetAncestor((ObjectClassBase)otherEnd, msgs);
			case MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateBase)otherEnd, msgs);
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
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR:
				return basicSetAncestor(null, msgs);
			case MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE:
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
			case MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE:
				return eInternalContainer().eInverseRemove(this, MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES, TemplateBase.class, msgs);
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
			case MetamodelBasePackage.OBJECT_CLASS_BASE__REFERENCE:
				return getReference();
			case MetamodelBasePackage.OBJECT_CLASS_BASE__NAME:
				return getName();
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ATTRIBUTES:
				return getAttributes();
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR:
				return getAncestor();
			case MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN:
				return getChildren();
			case MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE:
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
			case MetamodelBasePackage.OBJECT_CLASS_BASE__REFERENCE:
				setReference((IIdentifier)newValue);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__NAME:
				setName((String)newValue);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeBase>)newValue);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR:
				setAncestor((ObjectClassBase)newValue);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ObjectClassBase>)newValue);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE:
				setTemplate((TemplateBase)newValue);
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
			case MetamodelBasePackage.OBJECT_CLASS_BASE__REFERENCE:
				setReference((IIdentifier)null);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR:
				setAncestor((ObjectClassBase)null);
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN:
				getChildren().clear();
				return;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE:
				setTemplate((TemplateBase)null);
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
			case MetamodelBasePackage.OBJECT_CLASS_BASE__REFERENCE:
				return reference != null;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case MetamodelBasePackage.OBJECT_CLASS_BASE__ANCESTOR:
				return ancestor != null;
			case MetamodelBasePackage.OBJECT_CLASS_BASE__CHILDREN:
				return children != null && !children.isEmpty();
			case MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE:
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

} //ObjectClassBaseImpl
