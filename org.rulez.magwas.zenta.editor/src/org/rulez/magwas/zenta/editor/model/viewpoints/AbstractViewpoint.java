/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.metamodel.Attribute.Direction;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.RelationClassBase;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.TemplateBase;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.UnTestedException;


/**
 * Abstract Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractViewpoint implements IViewpoint {
        
	protected Metamodel metamodel;
	private IFolder folder;

    public AbstractViewpoint(IDiagramModel dm) {
		metamodel = MetamodelFactory.eINSTANCE.createMetamodel(dm.getZentaModel());
		folder = (IFolder) dm.eContainer();
	}

	@Override
    public boolean isAllowedType(ReferencesModelObject type) {
        List<ReferencesModelObject> allowedList = getAllowedList();
		if(allowedList == null)
            return true;
       	if(!allowedList.contains(type))
       		return false;
       	return true;
    };
    
    /**
     * @return A list of allowed types or null
     */
    protected List<ReferencesModelObject> getAllowedList() {
        return getAllowedTypes();
    }

	@Override
	public boolean isValidRelationshipStart(IZentaElement sourceElement,
			RelationClass relationshipType) {
		ObjectClass sc = (ObjectClass) metamodel.getObjectClassReferencing(sourceElement);
		return getSourceRelationClassesFor(sc).contains(relationshipType);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			ObjectClass targetObjectType, RelationClass typeRel) {
		ObjectClass sc = (ObjectClass) metamodel.getObjectClassReferencing(sourceElement);
		return isValidRelationship(sc,targetObjectType,typeRel);
	}

	@Override
	public boolean isValidRelationship(ObjectClass sourceclass,
			ObjectClass targetclass, RelationClass relationclass) {
		return	getSourceRelationClassesFor(sourceclass).contains(relationclass) &&
				getTargetRelationClassesFor(targetclass).contains(relationclass);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			IZentaElement targetElement, RelationClass eClass) {
		ObjectClass sc = (ObjectClass) metamodel.getObjectClassReferencing(sourceElement);
		ObjectClass tc = (ObjectClass) metamodel.getObjectClassReferencing(targetElement);
		return isValidRelationship(sc,tc,eClass);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			IZentaElement targetElement, IRelationship rel) {
		ObjectClass sc = (ObjectClass) metamodel.getObjectClassReferencing(sourceElement);
		ObjectClass tc = (ObjectClass) metamodel.getObjectClassReferencing(targetElement);
		RelationClass rc = (RelationClass) metamodel.getObjectClassReferencing(rel);
		return getValidRelationships(sc,tc).contains(rc);
	}

	@Override
	public List<RelationClass> getValidRelationships(
			IZentaElement sourceElement, IZentaElement targetElement) {
		ObjectClass sc = (ObjectClass) metamodel.getObjectClassReferencing(sourceElement);
		ObjectClass tc = (ObjectClass) metamodel.getObjectClassReferencing(targetElement);
		return getValidRelationships(sc,tc);
	}

	private List<RelationClass> getValidRelationships(ObjectClass sc,
			ObjectClass tc) {
		List<RelationClass> sourcerels = sc.getAllowedRelations().get(Direction.SOURCE);
		List<RelationClass> destrels = tc.getAllowedRelations().get(Direction.TARGET);
		List<RelationClass> ret = new ArrayList<RelationClass>();
		for(RelationClass rel : sourcerels) {
			if(destrels.contains(rel) && !ret.contains(rel))
				ret.add(rel);
		}
		return ret;
	}

	@Override
	public List<RelationClass> getRelationClasses() {
		return metamodel.getRelationClasses();
	}

	@Override
	public List<RelationClass> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject) {
		IZentaElement element = sourceDiagramModelObject.getZentaElement();
		ObjectClass oc = (ObjectClass) metamodel.getObjectClassReferencing(element);
		return getSourceRelationClassesFor(oc);
	}
	
	@Override
	public List<RelationClass> getSourceRelationClassesFor(ObjectClass startElement) {
		return startElement.getAllowedRelations().get(Direction.SOURCE);
	}

	@Override
	public List<RelationClass> getTargetRelationClassesFor(
			ObjectClass targetclass) {
		return metamodel.getRelationClasses();
	}


	@Override
	public List<ObjectClass> getObjectClasses() {
		return metamodel.getObjectClasses();
	}

	@Override
	public List<ObjectClass> getConnectorClasses() {
		return new ArrayList<ObjectClass>();//FIXME what to do with connectors
	}

	@Override
	public IIdentifier create(ReferencesModelObject eClass) {
		return eClass.create(folder);
	}

	@Override
	public ImageDescriptor getImageDescriptor(ReferencesModelObject eClass) {
		return ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass);
	}

	@Override
	public RelationClass getNoteConnection() {
		throw new UnTestedException();
	}

	@Override
	public boolean isAllowedType(IZentaElement element) {
		ReferencesModelObject oc = metamodel.getClassOf(element);
		return getAllowedTypes().contains(oc);
	}

	@Override
	public boolean isElementVisible(IZentaElement childObject) {
		return true;
	}

	@Override
	public boolean isNestedConnectionTypeRelationship(IRelationship relation) {
		return true;
	}

	@Override
	public List<ReferencesModelObject> getAllowedTypes() {
		List<ReferencesModelObject> allowedtypes = new ArrayList<ReferencesModelObject>();
		for(TemplateBase template : metamodel.getTemplates()) {
			for(ObjectClassBase oc : template.getObjectClasses())
				allowedtypes.add((ReferencesModelObject) oc);
			for(RelationClassBase rc : template.getRelationClasses())
				allowedtypes.add((ReferencesModelObject) rc);
		}
	    return allowedtypes;
	}

}