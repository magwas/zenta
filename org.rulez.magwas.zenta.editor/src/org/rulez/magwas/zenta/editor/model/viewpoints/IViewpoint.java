/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.Collection;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IIdentifier;
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
    List<IBasicObject> getAllowedTypes();
    
    /**
     * @return The name of the Viewpoint
     */
    String getName();

	boolean isValidRelationshipStart(IBasicObject iZentaElement,
			IBasicRelationship relationshipType);

	List<IBasicRelationship> getValidRelationships(IBasicRelationship sourceObjectType, IBasicRelationship targetObjectType);
    
	List<IBasicRelationship> getValidRelationships(IZentaElement sourceElement,
			IZentaElement targetElement);

	List<IBasicRelationship> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject);

	List<IBasicRelationship> getRelationClasses();
	List<IBasicObject> getObjectClasses();
	List<IBasicObject> getConnectorClasses();

	IIdentifier create(IBasicObject eClass);

	ImageDescriptor getImageDescriptor(IBasicObject eClass);

	IBasicRelationship getNoteConnection();

	boolean isAllowedType(IBasicObject element);
	boolean isElementVisible(IBasicObject childObject);

	boolean isNestedConnectionTypeRelationship(IBasicRelationship relation);

	boolean isValidRelationship(IBasicObject sourceclass,
			IBasicObject targetclass, IBasicRelationship relationclass);

	List<IBasicRelationship> getSourceRelationClassesFor(IBasicObject startElement);

	List<IBasicRelationship> getTargetRelationClassesFor(
			IBasicObject targetclass);

    Collection<IBasicObject> getAllowedTargets(
            IBasicRelationship oc);

    Collection<IBasicObject> getAllowedTargets(
    		IBasicObject oc);

    IBasicObject getObjectClassOf(
            IDiagramModelZentaObject sourceDiagramModelObject);

}
