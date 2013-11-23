package org.rulez.magwas.zenta.metamodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;

public class MetamodelSwitch<T> extends Switch<T> {
	protected static MetamodelPackage modelPackage;

	public MetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetamodelPackage.REFERENCES_MODEL_OBJECT: {
				referencesModelObject referencesModelObject = (referencesModelObject)theEObject;
				T result = casereferencesModelObject(referencesModelObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.METAMODEL: {
				Metamodel metamodel = (Metamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = casereferencesModelObject(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.OBJECT_CLASS: {
				ObjectClass objectClass = (ObjectClass)theEObject;
				T result = caseObjectClass(objectClass);
				if (result == null) result = casereferencesModelObject(objectClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetamodelPackage.RELATION_CLASS: {
				RelationClass relationClass = (RelationClass)theEObject;
				T result = caseRelationClass(relationClass);
				if (result == null) result = casereferencesModelObject(relationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	public T casereferencesModelObject(referencesModelObject object) {
		return null;
	}

	public T caseMetamodel(Metamodel object) {
		return null;
	}

	public T caseTemplate(Template object) {
		return null;
	}

	public T caseObjectClass(ObjectClass object) {
		return null;
	}

	public T caseAttribute(Attribute object) {
		return null;
	}

	public T caseRelationClass(RelationClass object) {
		return null;
	}

	@Override
	public T defaultCase(EObject object) {
		return null;
	}
}
