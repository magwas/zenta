/**
 */
package org.rulez.magwas.zenta.metamodel;

import java.util.Collection;
import java.util.List;

import org.rulez.magwas.zenta.metamodel.handmade.BuiltinTemplate;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;


public interface Metamodel extends MetamodelBase {
	
	BuiltinTemplate getBuiltinTemplate();

	Template getTemplateFor(IDiagramModel dm);

	ObjectClass getBuiltinObjectClass();

	RelationClass getBuiltinRelationClass();
	
	ObjectClass getObjectClassReferencing(IZentaElement element);

	RelationClass getRelationClassReferencing(IRelationship relation);

	boolean hasRelationClassReferencing(IRelationship relation);

	boolean hasObjectClassReferencing(IZentaElement elementToAdd);

	Template getTemplateForDiagram(IDiagramModel diagramModel);

	List<ObjectClass> getObjectClasses();

	List<RelationClass> getRelationClasses();
	
	List<ObjectClass> getConnectorClasses();

	Collection<RelationClass> getRelationships(IZentaElement object);

	ReferencesModelObject getClassById(String id);

	List<RelationClass> getWeaklist();

	ReferencesModelObjectBase getClassFor(IIdentifier rel);

	boolean isValidRelationship(IZentaElement element1, IZentaElement element2,
			RelationClass relationshipClass);

	Template getTemplateFor(IDiagramModelComponent element);

	IZentaModel getModel();

} 
