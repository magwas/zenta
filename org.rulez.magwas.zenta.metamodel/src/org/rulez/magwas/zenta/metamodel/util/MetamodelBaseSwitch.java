/**
 */
package org.rulez.magwas.zenta.metamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.rulez.magwas.zenta.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.metamodel.IMetamodelPackage
 * @generated
 */
public class MetamodelBaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelBaseSwitch() {
		if (modelPackage == null) {
			modelPackage = IMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IMetamodelPackage.METAMODEL_BASE: {
				IMetamodel metamodelBase = (IMetamodel)theEObject;
				T result = caseMetamodelBase(metamodelBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IMetamodelPackage.TEMPLATE_BASE: {
				ITemplate templateBase = (ITemplate)theEObject;
				T result = caseTemplateBase(templateBase);
				if (result == null) result = caseReferencesModelObjectBase(templateBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IMetamodelPackage.REFERENCES_MODEL_OBJECT_BASE: {
				IReferencesModelObject referencesModelObjectBase = (IReferencesModelObject)theEObject;
				T result = caseReferencesModelObjectBase(referencesModelObjectBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IMetamodelPackage.OBJECT_CLASS_BASE: {
				IObjectClass objectClassBase = (IObjectClass)theEObject;
				T result = caseObjectClassBase(objectClassBase);
				if (result == null) result = caseReferencesModelObjectBase(objectClassBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IMetamodelPackage.ATTRIBUTE_BASE: {
				IAttribute attributeBase = (IAttribute)theEObject;
				T result = caseAttributeBase(attributeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IMetamodelPackage.RELATION_CLASS_BASE: {
				IRelationClass relationClassBase = (IRelationClass)theEObject;
				T result = caseRelationClassBase(relationClassBase);
				if (result == null) result = caseReferencesModelObjectBase(relationClassBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MetamodelBase Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MetamodelBase Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelBase(IMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITemplate Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITemplate Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateBase(ITemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References Model Object Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References Model Object Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesModelObjectBase(IReferencesModelObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectClassBase(IObjectClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AttributeBase Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AttributeBase Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeBase(IAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Class Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Class Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationClassBase(IRelationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetamodelBaseSwitch
