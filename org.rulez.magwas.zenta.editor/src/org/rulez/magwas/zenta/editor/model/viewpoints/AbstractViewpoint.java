/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.UnTestedException;


/**
 * Abstract Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractViewpoint implements IViewpoint {
    
    private List<referencesModelObject> fClassList;
	protected List<referencesModelObject> allowedtypes = new ArrayList<referencesModelObject>();
    
	protected Metamodel metamodel;

    public AbstractViewpoint(IDiagramModel dm) {
		metamodel = MetamodelFactory.eINSTANCE.createMetamodel(dm.getZentaModel());
	}

	@Override
    public boolean isAllowedType(referencesModelObject type) {
        if(getAllowedList() == null)
            return true;
       	if(!fClassList.contains(type))
       		return false;
       	return true;
    };
    
    /**
     * @return A list of allowed types or null
     */
    protected List<referencesModelObject> getAllowedList() {
        if(getAllowedTypes() != null && fClassList == null)
            fClassList = getAllowedTypes();
        return fClassList;
    }

	@Override
	public boolean isValidRelationshipStart(IZentaElement sourceElement,
			RelationClass relationshipType) {
		ObjectClass sc = (ObjectClass) getClassFor(sourceElement);
		return getSourceRelationClassesFor(sc).contains(relationshipType);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			ObjectClass targetObjectType, RelationClass typeRel) {
		ObjectClass sc = (ObjectClass) getClassFor(sourceElement);
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
		ObjectClass sc = (ObjectClass) getClassFor(sourceElement);
		ObjectClass tc = (ObjectClass) getClassFor(targetElement);
		return isValidRelationship(sc,tc,eClass);
	}

	@Override
	public boolean isValidRelationship(IZentaElement sourceElement,
			IZentaElement targetElement, IRelationship rel) {
		ObjectClass sc = (ObjectClass) getClassFor(sourceElement);
		ObjectClass tc = (ObjectClass) getClassFor(targetElement);
		RelationClass rc = (RelationClass) getClassFor(rel);
		return getValidRelationships(sc,tc).contains(rc);
	}

	@Override
	public List<RelationClass> getValidRelationships(
			IZentaElement sourceElement, IZentaElement targetElement) {
		ObjectClass sc = (ObjectClass) getClassFor(sourceElement);
		ObjectClass tc = (ObjectClass) getClassFor(targetElement);
		return getValidRelationships(sc,tc);
	}

	private List<RelationClass> getValidRelationships(ObjectClass sc,
			ObjectClass tc) {		
		return getRelationClasses();
	}

	@Override
	public List<RelationClass> getRelationClasses() {
		return metamodel.getRelationClasses();
	}

	@Override
	public List<RelationClass> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject) {
		IZentaElement element = sourceDiagramModelObject.getZentaElement();
		ObjectClass oc = (ObjectClass) getClassFor(element);
		return getSourceRelationClassesFor(oc);
	}
	
	@Override
	public List<RelationClass> getSourceRelationClassesFor(ObjectClass startElement) {
		return metamodel.getRelationClasses();
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
	public IIdentifier create(referencesModelObject eClass) {
		return eClass.create();
	}

	@Override
	public ImageDescriptor getImageDescriptor(referencesModelObject eClass) {
		return ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass);
	}

	@Override
	public RelationClass getNoteConnection() {
		throw new UnTestedException();
	}

	@Override
	public boolean isAllowedType(IZentaElement element) {
		referencesModelObject oc = getClassFor(element);
		return allowedtypes.contains(oc);
	}

	@Override
	public referencesModelObject getClassFor(IZentaElement element) {
		String id = element.getObjectClass();
		referencesModelObject oc = metamodel.getClassById(id);
		return oc;
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
	public List<referencesModelObject> getAllowedTypes() {
	    return allowedtypes;
	}

}