/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.viewpoints;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.handmade.util.Util;


/**
 * Abstract Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractViewpoint implements IViewpoint {
        
	protected IMetamodel metamodel;
	private IFolder folder;

    public AbstractViewpoint(IDiagramModel dm) {
		IZentaModel model = dm.getZentaModel();
		metamodel = IZentaFactory.eINSTANCE.createMetamodel(Util.assertNonNull(model));
		folder = (IFolder) dm.eContainer();
	}

	@Override
    public boolean isAllowedType(IBasicObject type) {
        List<IBasicObject> allowedList = getAllowedList();
		if(allowedList == null)
            return true;
       	if(!allowedList.contains(type.getDefiningElement()))
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
			IBasicObject targetElement, IBasicRelationship relation) {
		return (getValidRelationships(sourceElement,targetElement).contains(relation));
	}

	@Override
	public List<IBasicRelationship> getValidRelationships(
			IZentaElement sourceElement, IZentaElement targetElement) {
		IBasicObject sc = (IBasicObject) sourceElement;
		IBasicObject tc = (IBasicObject) targetElement;
		return getValidRelationshipsByClass(sc.getDefiningElement(),tc.getDefiningElement());
	}

	@Override
	public List<IBasicRelationship> getValidRelationshipsByClass(IBasicObject sc,
			IBasicObject tc) {
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
		return eClass.create(Util.assertNonNull(folder));
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
	public Collection<IBasicObject> getAllowedTargets(IBasicObject oc) {
		List<IBasicObject> ret = new ArrayList<IBasicObject>();
		Map<Direction, List<IBasicRelationship>> rels = oc.getAllowedRelations();
		for(IBasicRelationship rel : rels.get(Direction.SOURCE)) {
			for(IBasicObject target: rel.getAllowedTargets())
				if(!ret.contains(target))
					ret.add(target);
		}
		return ret;
	}

}