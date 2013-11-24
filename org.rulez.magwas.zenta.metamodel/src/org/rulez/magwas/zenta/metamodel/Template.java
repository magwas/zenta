package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

public interface Template extends referencesModelObject {
	EList<ObjectClass> getObjectClasses();

	EList<RelationClass> getRelationClasses();

	String getPath();

	void setPath(String value);

	ObjectClass getObjectClassReferencingElement(IZentaElement reference);

	RelationClass getRelationClassReferencingElement(IRelationship referenced);

} 