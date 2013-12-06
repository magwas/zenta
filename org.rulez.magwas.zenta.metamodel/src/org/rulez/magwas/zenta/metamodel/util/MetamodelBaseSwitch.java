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
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage
 * @generated
 */
public class MetamodelBaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelBasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelBaseSwitch() {
		if (modelPackage == null) {
			modelPackage = MetamodelBasePackage.eINSTANCE;
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
			case MetamodelBasePackage.METAMODEL_BASE: {
				MetamodelBase metamodelBase = (MetamodelBase)theEObject;
				T result = caseMetamodelBase(metamodelBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelBasePackage.TEMPLATE_BASE: {
				TemplateBase templateBase = (TemplateBase)theEObject;
				T result = caseTemplateBase(templateBase);
				if (result == null) result = caseReferencesModelObjectBase(templateBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelBasePackage.REFERENCES_MODEL_OBJECT_BASE: {
				ReferencesModelObjectBase referencesModelObjectBase = (ReferencesModelObjectBase)theEObject;
				T result = caseReferencesModelObjectBase(referencesModelObjectBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelBasePackage.OBJECT_CLASS_BASE: {
				ObjectClassBase objectClassBase = (ObjectClassBase)theEObject;
				T result = caseObjectClassBase(objectClassBase);
				if (result == null) result = caseReferencesModelObjectBase(objectClassBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelBasePackage.ATTRIBUTE_BASE: {
				AttributeBase attributeBase = (AttributeBase)theEObject;
				T result = caseAttributeBase(attributeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelBasePackage.RELATION_CLASS_BASE: {
				RelationClassBase relationClassBase = (RelationClassBase)theEObject;
				T result = caseRelationClassBase(relationClassBase);
				if (result == null) result = caseReferencesModelObjectBase(relationClassBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelBase(MetamodelBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateBase(TemplateBase object) {
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
	public T caseReferencesModelObjectBase(ReferencesModelObjectBase object) {
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
	public T caseObjectClassBase(ObjectClassBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeBase(AttributeBase object) {
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
	public T caseRelationClassBase(RelationClassBase object) {
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
