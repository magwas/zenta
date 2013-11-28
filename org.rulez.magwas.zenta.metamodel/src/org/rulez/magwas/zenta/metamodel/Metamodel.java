/**
 */
package org.rulez.magwas.zenta.metamodel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.impl.BuiltinTemplate;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;


public interface Metamodel extends EObject {
	
	EList<Template> getTemplates();

	ObjectClass getBuiltinObjectClass();

	RelationClass getBuiltinRelationClass();
	
	BuiltinTemplate getBuiltinTemplate();

	Template getTemplateFor(IDiagramModel dm);

	ObjectClass getObjectClassReferencing(IZentaElement element);

	RelationClass getRelatioClassReferencing(IRelationship relation);

	boolean hasRelationClassReferencing(IRelationship relation);

	boolean hasObjectClassReferencing(IZentaElement elementToAdd);

	Template getTemplateForDiagram(IDiagramModel diagramModel);

	List<ObjectClass> getObjectClasses();

	List<RelationClass> getRelationClasses();

	Collection<RelationClass> getRelationships(IZentaElement object);

	referencesModelObject getClassById(String id);

} 
