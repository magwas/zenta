package org.rulez.magwas.zenta.metamodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
import org.rulez.magwas.zenta.metamodel.Attribute.Direction;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ObjectClassImpl extends ReferencesModelObject implements ObjectClass {

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EObject reference;
	protected EList<Attribute> attributes;

	protected ObjectClass ancestor;

	protected EList<ObjectClass> children;

	private Template template;

	protected ObjectClassImpl() {
		super();
	}

	protected ObjectClassImpl(IZentaElement reference, Template template) {
		super();
		this.template = template;
		this.setReference(reference);
		template.getObjectClasses().add(this);
		String refClassId = reference.getObjectClass();
		String referenceId = reference.getId();
		Metamodel metamodel = getMetamodel();
		if(!referenceId.equals(refClassId))
			ancestor=metamodel.getObjectClassReferencing((IZentaElement) ZentaModelUtils.getObjectByID(metamodel.getModel(), refClassId));
		if(ancestor == null)
			ancestor=metamodel.getBuiltinObjectClass();
		reference.setObjectClass(referenceId);
	}

	private Metamodel getMetamodel() {
		return this.template.getMetamodel();
	}
	
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.OBJECT_CLASS;
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
				setReference((IIdentifier)newValue);
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
				setReference((IIdentifier)null);
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

	@Override
	public Template getTemplate() {
		return template;
	}

	@Override
	public IZentaElement create(IFolder folder) {
		IBasicObject obj = IZentaFactory.eINSTANCE.createBasicObject();
		obj.setObjectClass(this.getId());
		postCreate(obj,folder);
		return obj;
	}

	@Override
	public boolean isAllowedRelation(RelationClass relclass, Direction direction) {
		List<RelationClass> alloweds = getAllowedRelations().get(direction);
		System.out.printf("dir = %s %s\n", direction,alloweds );
		if(alloweds.contains(relclass))
			return true;
		return false;
	}
	
	@Override
	public Map<Direction,List<RelationClass>> getAllowedRelations() {
		Map<Direction,List<RelationClass>> ret = new HashMap<Direction,List<RelationClass>>();
		ret.put(Direction.SOURCE, new ArrayList<RelationClass>());
		ret.put(Direction.TARGET, new ArrayList<RelationClass>());
		//ret.get(Direction.SOURCE).add(this.getMetamodel().getBuiltinRelationClass());
		//ret.get(Direction.TARGET).add(this.getMetamodel().getBuiltinRelationClass());
		for(Attribute att : getAttributes()) {
			addParents(ret.get(att.getDirection()),att.getRelation());
		}
		return ret;
	}

	private void addParents(List<RelationClass> list, RelationClass relation) {
		if(!list.contains(relation))
			list.add(relation);
		RelationClass ancestor = relation.getAncestor();
		System.out.printf("ancestor for %s is %s\n", relation.getName(), ancestor);
		if(ancestor != null)
			addParents(list,ancestor);
	}


}
