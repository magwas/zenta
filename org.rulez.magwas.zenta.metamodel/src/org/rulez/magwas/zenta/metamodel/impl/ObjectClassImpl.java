package org.rulez.magwas.zenta.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.model.impl.BusinessObject;

public class ObjectClassImpl extends ReferencesModelObject implements ObjectClass {
	
	protected EObject reference;

	protected EList<Attribute> attributes;

	protected ObjectClass ancestor;

	protected EList<ObjectClass> children;

	protected ObjectClassImpl() {
		super();
	}

	public ObjectClassImpl(BusinessObject reference) {
		super();
		this.setReference(reference);
	}

	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.OBJECT_CLASS;
	}

	public EObject getReference() {
		return reference;
	}

	public void setReference(EObject newReference) {
		EObject oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.OBJECT_CLASS__REFERENCE, oldReference, reference));
	}

	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, MetamodelPackage.OBJECT_CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	public ObjectClass getAncestor() {
		return ancestor;
	}

	public NotificationChain basicSetAncestor(ObjectClass newAncestor, NotificationChain msgs) {
		ObjectClass oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.OBJECT_CLASS__ANCESTOR, oldAncestor, newAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	public void setAncestor(ObjectClass newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelPackage.OBJECT_CLASS__CHILDREN, ObjectClass.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(this, MetamodelPackage.OBJECT_CLASS__CHILDREN, ObjectClass.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.OBJECT_CLASS__ANCESTOR, newAncestor, newAncestor));
	}

	public EList<ObjectClass> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseEList<ObjectClass>(ObjectClass.class, this, MetamodelPackage.OBJECT_CLASS__CHILDREN, MetamodelPackage.OBJECT_CLASS__ANCESTOR);
		}
		return children;
	}

	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.OBJECT_CLASS__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(this, MetamodelPackage.OBJECT_CLASS__CHILDREN, ObjectClass.class, msgs);
				return basicSetAncestor((ObjectClass)otherEnd, msgs);
			case MetamodelPackage.OBJECT_CLASS__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.OBJECT_CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.OBJECT_CLASS__ANCESTOR:
				return basicSetAncestor(null, msgs);
			case MetamodelPackage.OBJECT_CLASS__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.OBJECT_CLASS__REFERENCE:
				return getReference();
			case MetamodelPackage.OBJECT_CLASS__ATTRIBUTES:
				return getAttributes();
			case MetamodelPackage.OBJECT_CLASS__ANCESTOR:
				return getAncestor();
			case MetamodelPackage.OBJECT_CLASS__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.OBJECT_CLASS__REFERENCE:
				setReference((EObject)newValue);
				return;
			case MetamodelPackage.OBJECT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MetamodelPackage.OBJECT_CLASS__ANCESTOR:
				setAncestor((ObjectClass)newValue);
				return;
			case MetamodelPackage.OBJECT_CLASS__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ObjectClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelPackage.OBJECT_CLASS__REFERENCE:
				setReference((EObject)null);
				return;
			case MetamodelPackage.OBJECT_CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MetamodelPackage.OBJECT_CLASS__ANCESTOR:
				setAncestor((ObjectClass)null);
				return;
			case MetamodelPackage.OBJECT_CLASS__CHILDREN:
				getChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.OBJECT_CLASS__REFERENCE:
				return reference != null;
			case MetamodelPackage.OBJECT_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case MetamodelPackage.OBJECT_CLASS__ANCESTOR:
				return ancestor != null;
			case MetamodelPackage.OBJECT_CLASS__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
