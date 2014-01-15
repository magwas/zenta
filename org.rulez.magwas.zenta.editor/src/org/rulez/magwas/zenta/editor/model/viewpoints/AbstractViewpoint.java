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
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.IAttribute.Direction;


/**
 * Abstract Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractViewpoint implements IViewpoint {
        
	protected IMetamodel metamodel;
	private IFolder folder;

    public AbstractViewpoint(IDiagramModel dm) {
		metamodel = IZentaFactory.eINSTANCE.createMetamodel(dm.getZentaModel());
		folder = (IFolder) dm.eContainer();
	}

	@Override
    public boolean isAllowedType(IReferencesModelObject type) {
        List<IReferencesModelObject> allowedList = getAllowedList();
		if(allowedList == null)
            return true;
       	if(!allowedList.contains(type))
       		return false;
       	return true;
    };
    
    /**
     * @return A list of allowed types or null
     */
    protected List<IReferencesModelObject> getAllowedList() {
        return getAllowedTypes();
    }

	@Override
	public boolean isValidRelationshipStart(IBasicObject sourceElement,
			IRelationClass relationshipType) {
		IObjectClass sc = getClassOf(sourceElement);
		return getSourceRelationClassesFor(sc).contains(relationshipType);
	}

	@Override
	public boolean isValidRelationship(IBasicObject sourceElement,
			IObjectClass targetObjectType, IRelationClass typeRel) {
		IObjectClass sc = getClassOf(sourceElement);
		return isValidRelationship(sc,targetObjectType,typeRel);
	}

	@Override
	public boolean isValidRelationship(IObjectClass sourceclass,
			IObjectClass targetclass, IRelationClass relationclass) {
		return	getSourceRelationClassesFor(sourceclass).contains(relationclass) &&
				getTargetRelationClassesFor(targetclass).contains(relationclass);
	}

	@Override
	public boolean isValidRelationship(IBasicObject sourceElement,
			IBasicObject targetElement, IRelationClass eClass) {
		IObjectClass sc = getClassOf(sourceElement);
		IObjectClass tc = getClassOf(targetElement);
		return isValidRelationship(sc,tc,eClass);
	}

	@Override
	public boolean isValidRelationship(IBasicObject sourceElement,
			IBasicObject targetElement, IBasicRelationship rel) {
		IObjectClass sc = getClassOf(sourceElement);
		IObjectClass tc = getClassOf(targetElement);
		IRelationClass rc = (IRelationClass) metamodel.getObjectClassReferencing(rel);
		return getValidRelationships(sc,tc).contains(rc);
	}

	@Override
	public List<IRelationClass> getValidRelationships(
			IZentaElement sourceElement, IZentaElement targetElement) {
		IObjectClass sc = getClassOf((IBasicObject) sourceElement);
		IObjectClass tc = getClassOf((IBasicObject) targetElement);
		return getValidRelationships(sc,tc);
	}

	@Override
	public List<IRelationClass> getValidRelationships(IObjectClass sc,
			IObjectClass tc) {
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
	public Collection<IObjectClass> getAllowedTargets(IObjectClass oc) {
        List<IRelationClass> allowedRelations = oc.getAllowedRelations().get(Direction.SOURCE);
        List<IObjectClass> canConnectTo = new ArrayList<IObjectClass>();
        for(IRelationClass rel : allowedRelations)
            for(IObjectClass targetclass : metamodel.getObjectClasses()) {
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
		IObjectClass oc = getObjectClassOf(sourceDiagramModelObject);
		return getSourceRelationClassesFor(oc);
	}

	private IObjectClass getClassOf(IBasicObject element) {
		return (IObjectClass) metamodel.getClassOf(element);
	}


	@Override
    public IObjectClass getObjectClassOf(
            IDiagramModelZentaObject sourceDiagramModelObject) {
        IBasicObject element = (IBasicObject) sourceDiagramModelObject.getZentaElement();
		IObjectClass oc = getClassOf(element);
        return oc;
    }
	
	@Override
	public List<IRelationClass> getSourceRelationClassesFor(IObjectClass startElement) {
		return startElement.getAllowedRelations().get(Direction.SOURCE);
	}

	@Override
	public List<IRelationClass> getTargetRelationClassesFor(
			IObjectClass targetclass) {
		return metamodel.getRelationClasses();
	}


	@Override
	public List<IObjectClass> getObjectClasses() {
		return metamodel.getObjectClasses();
	}

	@Override
	public List<IObjectClass> getConnectorClasses() {
		return new ArrayList<IObjectClass>();//FIXME what to do with connectors
	}

	@Override
	public IIdentifier create(IReferencesModelObject eClass) {
		return eClass.create(folder);
	}

	@Override
	public ImageDescriptor getImageDescriptor(IReferencesModelObject eClass) {
		return ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass);
	}

	@Override
	public IRelationClass getNoteConnection() {
		throw new UnTestedException();
	}

	@Override
	public boolean isAllowedType(IBasicObject element) {
		IReferencesModelObject oc = metamodel.getClassOf(element);
		return getAllowedTypes().contains(oc);
	}

	@Override
	public boolean isElementVisible(IBasicObject childObject) {
		return true;
	}

	@Override
	public boolean isNestedConnectionTypeRelationship(IBasicRelationship relation) {
		return true;
	}

	@Override
	public List<IReferencesModelObject> getAllowedTypes() {
		List<IReferencesModelObject> allowedtypes = new ArrayList<IReferencesModelObject>();
		for(ITemplate template : metamodel.getTemplates()) {
			for(IObjectClass oc : template.getObjectClasses())
				allowedtypes.add((IReferencesModelObject) oc);
			for(IRelationClass rc : template.getRelationClasses())
				allowedtypes.add((IReferencesModelObject) rc);
		}
	    return allowedtypes;
	}

}