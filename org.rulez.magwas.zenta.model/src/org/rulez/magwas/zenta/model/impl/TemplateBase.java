/**
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.UnTestedException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITemplate Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getObjectClasses <em>Object Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getPath <em>Path</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getMetamodel <em>MetamodelBase</em>}</li>
 * </ul>
 * </p>
 *
 */
abstract public class TemplateBase extends EObjectImpl implements ITemplate {
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
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<IObjectClass> classes;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IZentaPackage.Literals.TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.TEMPLATE__REFERENCE, oldReference, reference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IObjectClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<IObjectClass>(IObjectClass.class, this, IZentaPackage.TEMPLATE__CLASSES, IZentaPackage.OBJECT_CLASS__TEMPLATE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.TEMPLATE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodel getMetamodel() {
		if (eContainerFeatureID() != IZentaPackage.TEMPLATE__METAMODEL) return null;
		return (IMetamodel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(IMetamodel newMetamodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMetamodel, IZentaPackage.TEMPLATE__METAMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(IMetamodel newMetamodel) {
		if (newMetamodel != eInternalContainer() || (eContainerFeatureID() != IZentaPackage.TEMPLATE__METAMODEL && newMetamodel != null)) {
			if (EcoreUtil.isAncestor(this, newMetamodel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, IZentaPackage.METAMODEL__TEMPLATES, IMetamodel.class, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.TEMPLATE__METAMODEL, newMetamodel, newMetamodel));
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
			case IZentaPackage.TEMPLATE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case IZentaPackage.TEMPLATE__METAMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMetamodel((IMetamodel)otherEnd, msgs);
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
			case IZentaPackage.TEMPLATE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case IZentaPackage.TEMPLATE__METAMODEL:
				return basicSetMetamodel(null, msgs);
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
			case IZentaPackage.TEMPLATE__METAMODEL:
				return eInternalContainer().eInverseRemove(this, IZentaPackage.METAMODEL__TEMPLATES, IMetamodel.class, msgs);
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
			case IZentaPackage.TEMPLATE__REFERENCE:
				return getReference();
			case IZentaPackage.TEMPLATE__NAME:
				return getName();
			case IZentaPackage.TEMPLATE__CLASSES:
				return getClasses();
			case IZentaPackage.TEMPLATE__PATH:
				return getPath();
			case IZentaPackage.TEMPLATE__METAMODEL:
				return getMetamodel();
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
			case IZentaPackage.TEMPLATE__REFERENCE:
				setReference((IIdentifier)newValue);
				return;
			case IZentaPackage.TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case IZentaPackage.TEMPLATE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends IObjectClass>)newValue);
				return;
			case IZentaPackage.TEMPLATE__PATH:
				setPath((String)newValue);
				return;
			case IZentaPackage.TEMPLATE__METAMODEL:
				setMetamodel((IMetamodel)newValue);
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
			case IZentaPackage.TEMPLATE__REFERENCE:
				setReference((IIdentifier)null);
				return;
			case IZentaPackage.TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentaPackage.TEMPLATE__CLASSES:
				getClasses().clear();
				return;
			case IZentaPackage.TEMPLATE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case IZentaPackage.TEMPLATE__METAMODEL:
				setMetamodel((IMetamodel)null);
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
			case IZentaPackage.TEMPLATE__REFERENCE:
				return reference != null;
			case IZentaPackage.TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentaPackage.TEMPLATE__CLASSES:
				return classes != null && !classes.isEmpty();
			case IZentaPackage.TEMPLATE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case IZentaPackage.TEMPLATE__METAMODEL:
				return getMetamodel() != null;
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
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

	@Override
	public ITemplate getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public void removeClass(IReferencesModelObject oc) {
		getClasses().remove(oc);
	}

} //TemplateBaseImpl
