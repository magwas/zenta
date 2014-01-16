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
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
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
    public boolean isAllowedType(IBasicObject type) {
        List<IBasicObject> allowedList = getAllowedList();
		if(allowedList == null)
            return true;
       	if(!allowedList.contains(type))
       		return false;
       	return true;
    };
    
	/**
     * @return A list of allowed types or null
     */
    protected List<IBasicObject> getAllowedList() {
        return getAllowedTypes();
    }

	@Override
	public boolean isValidRelationshipStart(IBasicObject sourceElement,
			IBasicRelationship relationshipType) {
		return getSourceRelationClassesFor(sourceElement).contains(relationshipType);
	}



	@Override
	public boolean isValidRelationship(IBasicObject sourceElement,
			IBasicObject targetElement, IBasicRelationship eClass) {
		return isValidRelationship(sourceElement,targetElement,eClass);
	}

	@Override
	public List<IBasicRelationship> getValidRelationships(
			IZentaElement sourceElement, IZentaElement targetElement) {
		IBasicObject sc = (IBasicObject) sourceElement;
		IBasicObject tc = (IBasicObject) targetElement;
		return getValidRelationships(sc.getDefiningElement(),tc.getDefiningElement());
	}

	@Override
	public List<IBasicRelationship> getValidRelationships(IBasicRelationship sc,
			IBasicRelationship tc) {
		List<IBasicRelationship> sourcerels = sc.getAllowedRelations().get(Direction.SOURCE);
		List<IBasicRelationship> destrels = tc.getAllowedRelations().get(Direction.TARGET);
		List<IBasicRelationship> ret = new ArrayList<IBasicRelationship>();
		for(IBasicRelationship rel : sourcerels) {
			if(destrels.contains(rel) && !ret.contains(rel))
				ret.add(rel);
		}
		return ret;
	}

	@Override
	public Collection<IBasicObject> getAllowedTargets(IBasicRelationship oc) {
        List<IBasicRelationship> allowedRelations = oc.getAllowedRelations().get(Direction.SOURCE);
        List<IBasicObject> canConnectTo = new ArrayList<IBasicObject>();
        for(IBasicRelationship rel : allowedRelations)
            for(IBasicObject targetclass : metamodel.getObjectClasses()) {
                boolean alreadyContains = canConnectTo.contains(targetclass);
                if(!alreadyContains &&
                   ((IBasicRelationship)targetclass).getAllowedRelations().get(Direction.TARGET).contains(rel))
                    canConnectTo.add(targetclass);
            }
        return canConnectTo;
    }

    @Override
	public List<IBasicRelationship> getRelationClasses() {
		return metamodel.getRelationClasses();
	}

	@Override
	public List<IBasicRelationship> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject) {
		IBasicObject oc = getObjectClassOf(sourceDiagramModelObject);
		return getSourceRelationClassesFor(oc);
	}

	@Override
    public IBasicObject getObjectClassOf(
            IDiagramModelZentaObject sourceDiagramModelObject) {
        IBasicObject element = (IBasicObject) sourceDiagramModelObject.getZentaElement();
		IBasicObject oc = element.getDefiningElement();
        return oc;
    }
	
	@Override
	public List<IBasicRelationship> getSourceRelationClassesFor(IBasicObject startElement) {
		return startElement.getAllowedRelations().get(Direction.SOURCE);
	}

	@Override
	public List<IBasicRelationship> getTargetRelationClassesFor(
			IBasicObject targetclass) {
		return metamodel.getRelationClasses();
	}


	@Override
	public List<IBasicObject> getObjectClasses() {
		return metamodel.getObjectClasses();
	}

	@Override
	public List<IBasicObject> getConnectorClasses() {
		return new ArrayList<IBasicObject>();//FIXME what to do with connectors
	}

	@Override
	public IIdentifier create(IBasicObject eClass) {
		return eClass.create(folder);
	}

	@Override
	public ImageDescriptor getImageDescriptor(IBasicObject eClass) {
		return ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass);
	}

	@Override
	public IBasicRelationship getNoteConnection() {
		throw new UnTestedException();
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
	public List<IBasicObject> getAllowedTypes() {
		List<IBasicObject> allowedtypes = new ArrayList<IBasicObject>();
		for(ITemplate template : metamodel.getTemplates()) {
			for(IBasicObject oc : template.getObjectClasses())
				allowedtypes.add((IBasicObject) oc);
			for(IBasicRelationship rc : template.getRelationClasses())
				allowedtypes.add((IBasicObject) rc);
		}
	    return allowedtypes;
	}

}