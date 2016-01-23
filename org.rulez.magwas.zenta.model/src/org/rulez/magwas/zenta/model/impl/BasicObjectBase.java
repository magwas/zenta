/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.UndoState;
import org.rulez.magwas.zenta.model.handmade.RootObjectClass;
import org.rulez.magwas.zenta.model.handmade.RootRelationClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BasicObjectBase#getObjectClass <em>Object Class</em>}</li>
 * </ul>
 * </p>
 *
 */
abstract public class BasicObjectBase extends ZentaElementBase implements IBasicObject {
    /**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<IAttribute> attributes;
	/**
	 * The cached value of the '{@link #getAncestor() <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestor()
	 * @generated
	 * @ordered
	 */
	protected IBasicObject ancestor;
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<IBasicObject> children;

				/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected ITemplate template;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BasicObjectBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.BASIC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    
	public EList<IAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<IAttribute>(IAttribute.class, this, IZentaPackage.BASIC_OBJECT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBasicObject getAncestor() {
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAncestor(IBasicObject newAncestor, NotificationChain msgs) {
		IBasicObject oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IZentaPackage.BASIC_OBJECT__ANCESTOR, oldAncestor, newAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncestor(IBasicObject newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(this, IZentaPackage.BASIC_OBJECT__CHILDREN, IBasicObject.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(this, IZentaPackage.BASIC_OBJECT__CHILDREN, IBasicObject.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.BASIC_OBJECT__ANCESTOR, newAncestor, newAncestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IBasicObject> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseEList<IBasicObject>(IBasicObject.class, this, IZentaPackage.BASIC_OBJECT__CHILDREN, IZentaPackage.BASIC_OBJECT__ANCESTOR);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITemplate getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (ITemplate)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IZentaPackage.BASIC_OBJECT__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITemplate basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTemplate(ITemplate newTemplate, NotificationChain msgs) {
		ITemplate oldTemplate = template;
		setAncestorByNewTemplate(newTemplate);
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IZentaPackage.BASIC_OBJECT__TEMPLATE, oldTemplate, newTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	public void setAncestorByNewTemplate(ITemplate newTemplate) {
		if(this instanceof RootObjectClass)
			return;
		if(this instanceof RootRelationClass)
			return;
		if(null == getAncestor() && null != newTemplate)
			if(isObject())
				setAncestor(newTemplate.getMetamodel().getBuiltinObjectClass());
			else
				setAncestor(newTemplate.getMetamodel().getBuiltinRelationClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(ITemplate newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, IZentaPackage.TEMPLATE__CLASSES, ITemplate.class, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, IZentaPackage.TEMPLATE__CLASSES, ITemplate.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.BASIC_OBJECT__TEMPLATE, newTemplate, newTemplate));
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
			case IZentaPackage.BASIC_OBJECT__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(this, IZentaPackage.BASIC_OBJECT__CHILDREN, IBasicObject.class, msgs);
				return basicSetAncestor((IBasicObject)otherEnd, msgs);
			case IZentaPackage.BASIC_OBJECT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case IZentaPackage.BASIC_OBJECT__TEMPLATE:
				if (template != null)
					msgs = ((InternalEObject)template).eInverseRemove(this, IZentaPackage.TEMPLATE__CLASSES, ITemplate.class, msgs);
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
			case IZentaPackage.BASIC_OBJECT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case IZentaPackage.BASIC_OBJECT__ANCESTOR:
				return basicSetAncestor(null, msgs);
			case IZentaPackage.BASIC_OBJECT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case IZentaPackage.BASIC_OBJECT__TEMPLATE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.BASIC_OBJECT__ATTRIBUTES:
				return getAttributes();
			case IZentaPackage.BASIC_OBJECT__ANCESTOR:
				return getAncestor();
			case IZentaPackage.BASIC_OBJECT__CHILDREN:
				return getChildren();
			case IZentaPackage.BASIC_OBJECT__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
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
			case IZentaPackage.BASIC_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends IAttribute>)newValue);
				return;
			case IZentaPackage.BASIC_OBJECT__ANCESTOR:
				setAncestor((IBasicObject)newValue);
				return;
			case IZentaPackage.BASIC_OBJECT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IBasicObject>)newValue);
				return;
			case IZentaPackage.BASIC_OBJECT__TEMPLATE:
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
			case IZentaPackage.BASIC_OBJECT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case IZentaPackage.BASIC_OBJECT__ANCESTOR:
				setAncestor((IBasicObject)null);
				return;
			case IZentaPackage.BASIC_OBJECT__CHILDREN:
				getChildren().clear();
				return;
			case IZentaPackage.BASIC_OBJECT__TEMPLATE:
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
			case IZentaPackage.BASIC_OBJECT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case IZentaPackage.BASIC_OBJECT__ANCESTOR:
				return ancestor != null;
			case IZentaPackage.BASIC_OBJECT__CHILDREN:
				return children != null && !children.isEmpty();
			case IZentaPackage.BASIC_OBJECT__TEMPLATE:
				return template != null;
		}
		return super.eIsSet(featureID);
	}

	private class BasicObjectDeleteState extends ElementState {
		public ArrayList<IBasicObject> kids = new ArrayList<IBasicObject>();

		public void undelete() {
			super.undelete();
			for(IBasicObject kid : kids) {
				kid.setAncestor((IBasicObject) element);
			}
		}

	}
	@Override
	public UndoState delete() {
		BasicObjectDeleteState state = prepareDelete();
		delete(state);
		return state;
	}

	@Override
	public BasicObjectDeleteState prepareDelete() {
		BasicObjectDeleteState state = new BasicObjectDeleteState();
		prepareUndoState(state);
		return state;
	}
	
	@Override
	public UndoState delete(UndoState st) {
		BasicObjectDeleteState state = (BasicObjectDeleteState) st;
		state.kids.addAll(this.getChildren());
		for(IBasicObject kid : state.kids) {
			kid.setAncestor(getAncestor());
		}
		super.delete(state);
		return state;
	}
} //BasicObject
