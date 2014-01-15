/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.metamodel.AttributeBase.Direction;
import org.rulez.magwas.zenta.metamodel.MetamodelBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBaseFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.ITemplate;
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
        
	protected MetamodelBase metamodel;
	private IFolder folder;

    public AbstractViewpoint(IDiagramModel dm) {
		metamodel = MetamodelBaseFactory.eINSTANCE.createMetamodel(dm.getZentaModel());
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
			IRelationClass relationshipType) {
		ObjectClass sc = getClassOf(sourceElement);
		return getSourceRelationClassesFor(sc).contains(relationshipType);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			ObjectClass targetObjectType, IRelationClass typeRel) {
		ObjectClass sc = getClassOf(sourceElement);
		return isValidRelationship(sc,targetObjectType,typeRel);
	}

	@Override
	public boolean isValidRelationship(ObjectClass sourceclass,
			ObjectClass targetclass, IRelationClass relationclass) {
		return	getSourceRelationClassesFor(sourceclass).contains(relationclass) &&
				getTargetRelationClassesFor(targetclass).contains(relationclass);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			IZentaElement targetElement, IRelationClass eClass) {
		ObjectClass sc = getClassOf(sourceElement);
		ObjectClass tc = getClassOf(targetElement);
		return isValidRelationship(sc,tc,eClass);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			IZentaElement targetElement, IRelationship rel) {
		ObjectClass sc = getClassOf(sourceElement);
		ObjectClass tc = getClassOf(targetElement);
		IRelationClass rc = (IRelationClass) metamodel.getObjectClassReferencing(rel);
		return getValidRelationships(sc,tc).contains(rc);
	}

	@Override
	public List<IRelationClass> getValidRelationships(
			IZentaElement sourceElement, IZentaElement targetElement) {
		ObjectClass sc = getClassOf(sourceElement);
		ObjectClass tc = getClassOf(targetElement);
		return getValidRelationships(sc,tc);
	}

	@Override
	public List<IRelationClass> getValidRelationships(ObjectClass sc,
			ObjectClass tc) {
		List<IRelationClass> sourcerels = sc.getAllowedRelations().get(Direction.SOURCE);
		List<IRelationClass> destrels = tc.getAllowedRelations().get(Direction.TARGET);
		List<IRelationClass> ret = new ArrayList<IRelationClass>();
		for(IRelationClass rel : sourcerels) {
			if(destrels.contains(rel) && !ret.contains(rel))
				ret.add(rel);
		}
		return ret;
	}

	@Override
	public Collection<ObjectClass> getAllowedTargets(ObjectClass oc) {
        List<IRelationClass> allowedRelations = oc.getAllowedRelations().get(Direction.SOURCE);
        List<ObjectClass> canConnectTo = new ArrayList<ObjectClass>();
        for(IRelationClass rel : allowedRelations)
            for(ObjectClass targetclass : metamodel.getObjectClasses()) {
                boolean alreadyContains = canConnectTo.contains(targetclass);
                if(!alreadyContains &&
                   targetclass.getAllowedRelations().get(Direction.TARGET).contains(rel))
                    canConnectTo.add(targetclass);
            }
        return canConnectTo;
    }

    @Override
	public List<IRelationClass> getRelationClasses() {
		return metamodel.getRelationClasses();
	}

	@Override
	public List<IRelationClass> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject) {
		ObjectClass oc = getObjectClassOf(sourceDiagramModelObject);
		return getSourceRelationClassesFor(oc);
	}

	private ObjectClass getClassOf(IZentaElement element) {
		return (ObjectClass) metamodel.getClassOf(element);
	}


	@Override
    public ObjectClass getObjectClassOf(
            IDiagramModelZentaObject sourceDiagramModelObject) {
        IZentaElement element = sourceDiagramModelObject.getZentaElement();
		ObjectClass oc = getClassOf(element);
        return oc;
    }
	
	@Override
	public List<IRelationClass> getSourceRelationClassesFor(ObjectClass startElement) {
		return startElement.getAllowedRelations().get(Direction.SOURCE);
	}

	@Override
	public List<IRelationClass> getTargetRelationClassesFor(
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
	public IRelationClass getNoteConnection() {
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
		for(ITemplate template : metamodel.getTemplates()) {
			for(ObjectClass oc : template.getObjectClasses())
				allowedtypes.add((ReferencesModelObject) oc);
			for(IRelationClass rc : template.getRelationClasses())
				allowedtypes.add((ReferencesModelObject) rc);
		}
	    return allowedtypes;
	}

}