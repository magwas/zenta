/**
 */
package org.rulez.magwas.metamodel.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.metamodel.metamodel.Metamodel;
import org.rulez.magwas.metamodel.metamodel.MetamodelFactory;
import org.rulez.magwas.metamodel.metamodel.MetamodelPackage;
import org.rulez.magwas.metamodel.metamodel.ObjectClass;
import org.rulez.magwas.metamodel.metamodel.RelationClass;
import org.rulez.magwas.metamodel.metamodel.Template;

/**
 * @generated
 */
public class MetamodelImpl extends EObjectImpl implements Metamodel {
	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> templates;

	protected MetamodelImpl() {
		super();
		Template builtinTemplate = MetamodelFactory.eINSTANCE.createTemplate();
		ObjectClass builtinObjectClass = MetamodelFactory.eINSTANCE.createObjectClass();
		RelationClass builtinRelationClass = MetamodelFactory.eINSTANCE.createRelationClass();
		builtinTemplate.getObjectClasses().add(builtinObjectClass);
		builtinTemplate.getRelationClasses().add(builtinRelationClass);
		getTemplates().add(builtinTemplate);
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.METAMODEL;
	}

	/**
	 * @generated
	 */
	public EList<Template> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<Template>(Template.class, this, MetamodelPackage.METAMODEL__TEMPLATES);
		}
		return templates;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				return getTemplates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends Template>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				getTemplates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				return templates != null && !templates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetamodelImpl
