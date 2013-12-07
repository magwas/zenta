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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.zenta.metamodel.MetamodelBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBasePackage;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase;
import org.rulez.magwas.zenta.metamodel.RelationClassBase;
import org.rulez.magwas.zenta.metamodel.TemplateBase;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.UnTestedException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl#getObjectClasses <em>Object Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBaseImpl extends EObjectImpl implements TemplateBase {
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
	 * The cached value of the '{@link #getObjectClasses() <em>Object Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectClassBase> objectClasses;

	/**
	 * The cached value of the '{@link #getRelationClasses() <em>Relation Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationClassBase> relationClasses;

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
	protected TemplateBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelBasePackage.Literals.TEMPLATE_BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.TEMPLATE_BASE__REFERENCE, oldReference, reference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.TEMPLATE_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectClassBase> getObjectClasses() {
		if (objectClasses == null) {
			objectClasses = new EObjectContainmentWithInverseEList<ObjectClassBase>(ObjectClassBase.class, this, MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES, MetamodelBasePackage.OBJECT_CLASS_BASE__TEMPLATE);
		}
		return objectClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClassBase> getRelationClasses() {
		if (relationClasses == null) {
			relationClasses = new EObjectContainmentWithInverseEList<RelationClassBase>(RelationClassBase.class, this, MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES, MetamodelBasePackage.RELATION_CLASS_BASE__TEMPLATE);
		}
		return relationClasses;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.TEMPLATE_BASE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelBase getMetamodel() {
		if (eContainerFeatureID() != MetamodelBasePackage.TEMPLATE_BASE__METAMODEL) return null;
		return (MetamodelBase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(MetamodelBase newMetamodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMetamodel, MetamodelBasePackage.TEMPLATE_BASE__METAMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(MetamodelBase newMetamodel) {
		if (newMetamodel != eInternalContainer() || (eContainerFeatureID() != MetamodelBasePackage.TEMPLATE_BASE__METAMODEL && newMetamodel != null)) {
			if (EcoreUtil.isAncestor(this, newMetamodel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, MetamodelBasePackage.METAMODEL_BASE__TEMPLATES, MetamodelBase.class, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelBasePackage.TEMPLATE_BASE__METAMODEL, newMetamodel, newMetamodel));
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
			case MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectClasses()).basicAdd(otherEnd, msgs);
			case MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationClasses()).basicAdd(otherEnd, msgs);
			case MetamodelBasePackage.TEMPLATE_BASE__METAMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMetamodel((MetamodelBase)otherEnd, msgs);
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
			case MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES:
				return ((InternalEList<?>)getObjectClasses()).basicRemove(otherEnd, msgs);
			case MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES:
				return ((InternalEList<?>)getRelationClasses()).basicRemove(otherEnd, msgs);
			case MetamodelBasePackage.TEMPLATE_BASE__METAMODEL:
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
			case MetamodelBasePackage.TEMPLATE_BASE__METAMODEL:
				return eInternalContainer().eInverseRemove(this, MetamodelBasePackage.METAMODEL_BASE__TEMPLATES, MetamodelBase.class, msgs);
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
			case MetamodelBasePackage.TEMPLATE_BASE__REFERENCE:
				return getReference();
			case MetamodelBasePackage.TEMPLATE_BASE__NAME:
				return getName();
			case MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES:
				return getObjectClasses();
			case MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES:
				return getRelationClasses();
			case MetamodelBasePackage.TEMPLATE_BASE__PATH:
				return getPath();
			case MetamodelBasePackage.TEMPLATE_BASE__METAMODEL:
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
			case MetamodelBasePackage.TEMPLATE_BASE__REFERENCE:
				setReference((IIdentifier)newValue);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__NAME:
				setName((String)newValue);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES:
				getObjectClasses().clear();
				getObjectClasses().addAll((Collection<? extends ObjectClassBase>)newValue);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES:
				getRelationClasses().clear();
				getRelationClasses().addAll((Collection<? extends RelationClassBase>)newValue);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__PATH:
				setPath((String)newValue);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__METAMODEL:
				setMetamodel((MetamodelBase)newValue);
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
			case MetamodelBasePackage.TEMPLATE_BASE__REFERENCE:
				setReference((IIdentifier)null);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES:
				getObjectClasses().clear();
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES:
				getRelationClasses().clear();
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case MetamodelBasePackage.TEMPLATE_BASE__METAMODEL:
				setMetamodel((MetamodelBase)null);
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
			case MetamodelBasePackage.TEMPLATE_BASE__REFERENCE:
				return reference != null;
			case MetamodelBasePackage.TEMPLATE_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetamodelBasePackage.TEMPLATE_BASE__OBJECT_CLASSES:
				return objectClasses != null && !objectClasses.isEmpty();
			case MetamodelBasePackage.TEMPLATE_BASE__RELATION_CLASSES:
				return relationClasses != null && !relationClasses.isEmpty();
			case MetamodelBasePackage.TEMPLATE_BASE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case MetamodelBasePackage.TEMPLATE_BASE__METAMODEL:
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
	public TemplateBase getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public void removeClass(ReferencesModelObjectBase oc) {
		if(oc instanceof ObjectClassBase) {
			getObjectClasses().remove(oc);
		}
		else if(oc instanceof RelationClassBase)
			getRelationClasses().remove(oc);
	}

} //TemplateBaseImpl
