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
	
    IZentaModel getModel();
    
    ReferencesModelObject getClassById(String classId);
	ObjectClass getBuiltinObjectClass();
	RelationClass getBuiltinRelationClass();
	
    BuiltinTemplate getBuiltinTemplate();
    Template getTemplateFor(IDiagramModel dm);
    Template getTemplateFor(IDiagramModelComponent element);
    
    ReferencesModelObject getClassOf(IIdentifier rel);
    ReferencesModelObject getClassReferencing(IIdentifier modelElement);
    ObjectClass getObjectClassReferencing(IZentaElement element);
    RelationClass getRelationClassReferencing(IRelationship relation);
	boolean hasRelationClassReferencing(IRelationship relation);
	boolean hasObjectClassReferencing(IZentaElement elementToAdd);

	List<ObjectClass> getObjectClasses();
	List<RelationClass> getRelationClasses();
	List<ObjectClass> getConnectorClasses();
	
	Collection<RelationClass> getRelationships(IZentaElement object);
	List<RelationClass> getWeaklist();
	boolean isValidRelationship(IZentaElement element1, IZentaElement element2,
			RelationClass relationshipClass);

} 
