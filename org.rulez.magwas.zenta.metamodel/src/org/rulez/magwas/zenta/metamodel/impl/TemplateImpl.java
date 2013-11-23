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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateImpl#getObjectClasses <em>Object Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateImpl#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.impl.TemplateImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends ReferencesModelObject implements Template {
	protected EObject reference;

	protected EList<ObjectClass> objectClasses;

	protected EList<RelationClass> relationClasses;

	protected static final String PATH_EDEFAULT = null;

	protected String path = PATH_EDEFAULT;

	protected TemplateImpl() {
		super();
	}

	public TemplateImpl(ZentaDiagramModel reference) {
		super();
		setReference(reference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TEMPLATE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectClass> getObjectClasses() {
		if (objectClasses == null) {
			objectClasses = new EObjectContainmentEList<ObjectClass>(ObjectClass.class, this, MetamodelPackage.TEMPLATE__OBJECT_CLASSES);
		}
		return objectClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationClass> getRelationClasses() {
		if (relationClasses == null) {
			relationClasses = new EObjectContainmentEList<RelationClass>(RelationClass.class, this, MetamodelPackage.TEMPLATE__RELATION_CLASSES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TEMPLATE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				return ((InternalEList<?>)getObjectClasses()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				return ((InternalEList<?>)getRelationClasses()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.TEMPLATE__REFERENCE:
				return getReference();
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				return getObjectClasses();
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				return getRelationClasses();
			case MetamodelPackage.TEMPLATE__PATH:
				return getPath();
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
			case MetamodelPackage.TEMPLATE__REFERENCE:
				setReference((EObject)newValue);
				return;
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				getObjectClasses().clear();
				getObjectClasses().addAll((Collection<? extends ObjectClass>)newValue);
				return;
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				getRelationClasses().clear();
				getRelationClasses().addAll((Collection<? extends RelationClass>)newValue);
				return;
			case MetamodelPackage.TEMPLATE__PATH:
				setPath((String)newValue);
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
			case MetamodelPackage.TEMPLATE__REFERENCE:
				setReference((EObject)null);
				return;
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				getObjectClasses().clear();
				return;
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				getRelationClasses().clear();
				return;
			case MetamodelPackage.TEMPLATE__PATH:
				setPath(PATH_EDEFAULT);
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
			case MetamodelPackage.TEMPLATE__REFERENCE:
				return reference != null;
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				return objectClasses != null && !objectClasses.isEmpty();
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				return relationClasses != null && !relationClasses.isEmpty();
			case MetamodelPackage.TEMPLATE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}


  @Override
  public String getName() {
      return super.getName();
  }
} //TemplateImpl
