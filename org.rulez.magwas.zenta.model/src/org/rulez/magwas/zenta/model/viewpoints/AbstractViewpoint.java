/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.viewpoints;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
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
	private IDiagramModel dm;

    public AbstractViewpoint(IDiagramModel dm) {
    	this.setDm(dm);
		IZentaModel model = dm.getZentaModel();
		metamodel = IZentaFactory.eINSTANCE.getMetamodelFor(Util.verifyNonNull(model));
		folder = (IFolder) dm.eContainer();
	}

	@Override
    public boolean isAllowedType(EObject type) {
        List<EObject> allowedList = getAllowedList();
		if(allowedList == null)
            return true;
		if(type instanceof IObjectClass) {
	       	if(!allowedList.contains(((IObjectClass) type).getDefiningElement()))
	       		return false;
		} else
			if(!allowedList.contains(type))
				return false;
	       
       	return true;
    };
    
	/**
     * @return A list of allowed types or null
     */
    protected List<EObject> getAllowedList() {
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
	public @NonNull NonNullList<IBasicRelationship> getValidRelationships(
			IZentaElement sourceElement, IZentaElement targetElement) {
		IBasicObject sc = (IBasicObject) sourceElement;
		IBasicObject tc = (IBasicObject) targetElement;
		return getValidRelationshipsByClass(sc.getDefiningElement(),tc.getDefiningElement());
	}

	@Override
	public @NonNull NonNullList<IBasicRelationship> getValidRelationshipsByClass(IBasicObject sc,
			IBasicObject tc) {
		NonNullList<IBasicRelationship> sourcerels = sc.getAllowedRelations().get(Direction.SOURCE);
		NonNullList<IBasicRelationship> destrels = tc.getAllowedRelations().get(Direction.TARGET);
		NonNullList<IBasicRelationship> ret = new NonNullArrayList<IBasicRelationship>();
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
	public NonNullList<IBasicRelationship> getSourceRelationClassesFor(IBasicObject startElement) {
		return startElement.getAllowedRelations().get(Direction.SOURCE);
	}

	@Override
	public NonNullList<IBasicRelationship> getTargetRelationClassesFor(
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
		return eClass.create(Util.verifyNonNull(folder));
	}

	@Override
	public IBasicRelationship getNoteConnection() {
		throw new UnTestedException();
	}

	@Override
	public boolean isElementVisible(IDiagramModelObject childObject) {
		if(childObject instanceof IDiagramModelZentaObject) {
			IDiagramModelZentaObject asDMO = (IDiagramModelZentaObject) childObject;
			if(!isElementVisible(asDMO.getZentaElement())) 
				return false;
		}
		EObject parent = childObject.eContainer();
		if(parent instanceof IDiagramModelZentaObject) {
			return isElementVisible((IDiagramModelObject) parent);
		}
		return true;
	}

	@Override
	public boolean isElementVisible(IZentaElement element) {
		return null != element;
	}

	@Override
	public boolean isNestedConnectionTypeRelationship(IBasicRelationship relation) {
		return true;
	}

	@Override
	public List<EObject> getAllowedTypes() {
		List<EObject> allowedtypes = new ArrayList<EObject>();
		for(ITemplate template : metamodel.getTemplates()) {
			for(IBasicObject oc : template.getObjectClasses())
				allowedtypes.add((IBasicObject) oc);
			for(IBasicRelationship rc : template.getRelationClasses())
				allowedtypes.add((IBasicObject) rc);
		}
	    return allowedtypes;
	}

	@Override
	public NonNullList<IBasicObject> getAllowedTargets(IBasicRelationship oc) {
	    List<IBasicRelationship> allowedRelations = oc.getAllowedRelations().get(Direction.SOURCE);
	    NonNullList<IBasicObject> canConnectTo = new NonNullArrayList<IBasicObject>();
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
	public NonNullList<IBasicObject> getAllowedTargets(IBasicObject oc) {
		NonNullList<IBasicObject> ret = new NonNullArrayList<IBasicObject>();
		Map<Direction, NonNullList<IBasicRelationship>> rels = oc.getAllowedRelations();
		for(IBasicRelationship rel : rels.get(Direction.SOURCE)) {
			for(IBasicObject target: rel.getAllowedTargets())
				if(!ret.contains(target))
					ret.add(target);
		}
		return ret;
	}

	@Override
	public IDiagramModel getDm() {
		return dm;
	}

	@Override
	public void setDm(IDiagramModel dm) {
		this.dm = dm;
	}

}