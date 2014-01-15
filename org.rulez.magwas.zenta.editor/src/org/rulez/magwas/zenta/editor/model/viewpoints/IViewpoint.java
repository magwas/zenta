/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.Collection;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaElement;

/**
 * IViewpoint
 * 
 * @author Phillip Beauvoir
 */
public interface IViewpoint {
    
    /*
     * Index numbers of Viewpoints
     */
    int TOTAL_VIEWPOINT = 0;
    int LAYERED_VIEWPOINT = 14;

    /**
     * @return The index number used when persisting the Viewpoint
     */
    int getIndex();

    /**
     * @return Allowed types
     */
    List<IReferencesModelObject> getAllowedTypes();
    
	boolean isAllowedType(IReferencesModelObject type);
    
    /**
     * @return The name of the Viewpoint
     */
    String getName();

	boolean isValidRelationshipStart(IBasicObject iZentaElement,
			IRelationClass relationshipType);
	
	boolean isValidRelationship(IBasicObject sourceElement,
			IObjectClass targetObjectType, IRelationClass typeRel);
	
	boolean isValidRelationship(IBasicObject sourceElement,
			IBasicObject targetElement, IRelationClass eClass);

	boolean isValidRelationship(IBasicObject sourceElement,
			IBasicObject targetElement, IBasicRelationship rel);

	List<IRelationClass> getValidRelationships(IObjectClass sourceObjectType, IObjectClass targetObjectType);
    
	List<IRelationClass> getValidRelationships(IZentaElement sourceElement,
			IZentaElement targetElement);

	List<IRelationClass> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject);

	List<IRelationClass> getRelationClasses();
	List<IObjectClass> getObjectClasses();
	List<IObjectClass> getConnectorClasses();

	IIdentifier create(IReferencesModelObject eClass);

	ImageDescriptor getImageDescriptor(IReferencesModelObject eClass);

	IRelationClass getNoteConnection();

	boolean isAllowedType(IBasicObject element);
	boolean isElementVisible(IBasicObject childObject);

	boolean isNestedConnectionTypeRelationship(IBasicRelationship relation);

	boolean isValidRelationship(IObjectClass sourceclass,
			IObjectClass targetclass, IRelationClass relationclass);

	List<IRelationClass> getSourceRelationClassesFor(IObjectClass startElement);

	List<IRelationClass> getTargetRelationClassesFor(
			IObjectClass targetclass);

    Collection<IObjectClass> getAllowedTargets(
            IObjectClass oc);

    IObjectClass getObjectClassOf(
            IDiagramModelZentaObject sourceDiagramModelObject);

}
