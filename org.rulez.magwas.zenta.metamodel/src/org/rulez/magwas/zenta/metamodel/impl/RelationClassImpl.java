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
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IRelationship;

public class RelationClassImpl extends ReferencesModelObject implements RelationClass {

	protected EObject reference;

	protected RelationClass ancestor;

	protected EList<RelationClass> children;

	private Template template;

	protected RelationClassImpl(IRelationship referenced, Template template) {
		super();
		this.template = template;
		this.setReference(referenced);
	}

	protected RelationClassImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.RELATION_CLASS;
	}

	public EObject getReference() {
		return reference;
	}

	public void setReference(EObject newReference) {
		EObject oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RELATION_CLASS__REFERENCE, oldReference, reference));
	}

	public RelationClass getAncestor() {
		return ancestor;
	}

	public NotificationChain basicSetAncestor(RelationClass newAncestor, NotificationChain msgs) {
		RelationClass oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired())
			msgs = notifyAboutAncestorChange(newAncestor, msgs, oldAncestor);
		return msgs;
	}

	private NotificationChain notifyAboutAncestorChange(
			RelationClass newAncestor, NotificationChain msgs,
			RelationClass oldAncestor) {
		ENotificationImpl notification =
				new ENotificationImpl(
						this,
						Notification.SET,
						MetamodelPackage.RELATION_CLASS__ANCESTOR, oldAncestor, newAncestor);
		if (msgs == null)
			msgs = notification;
		else
			msgs.add(notification);
		return msgs;
	}

	public void setAncestor(RelationClass newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(
						this,
						MetamodelPackage.RELATION_CLASS__CHILDREN,
						RelationClass.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(
						this,
						MetamodelPackage.RELATION_CLASS__CHILDREN,
						RelationClass.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					MetamodelPackage.RELATION_CLASS__ANCESTOR,
					newAncestor,
					newAncestor));
	}

	public EList<RelationClass> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseEList<RelationClass>(
					RelationClass.class,
					this,
					MetamodelPackage.RELATION_CLASS__CHILDREN,
					MetamodelPackage.RELATION_CLASS__ANCESTOR);
		}
		return children;
	}

	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.RELATION_CLASS__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(
							this,
							MetamodelPackage.RELATION_CLASS__CHILDREN,
							RelationClass.class,
							msgs);
				return basicSetAncestor((RelationClass)otherEnd, msgs);
			case MetamodelPackage.RELATION_CLASS__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(
						otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

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

	public Template getTemplate() {
		return template;
	}

}
