/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
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
    List<ReferencesModelObject> getAllowedTypes();
    
	boolean isAllowedType(ReferencesModelObject type);
    
    /**
     * @return The name of the Viewpoint
     */
    String getName();

	boolean isValidRelationshipStart(IZentaElement iZentaElement,
			RelationClass relationshipType);
	
	boolean isValidRelationship(IZentaElement sourceElement,
			ObjectClass targetObjectType, RelationClass typeRel);
	
	boolean isValidRelationship(IZentaElement sourceElement,
			IZentaElement targetElement, RelationClass eClass);

	boolean isValidRelationship(IZentaElement sourceElement,
			IZentaElement targetElement, IRelationship rel);

	List<RelationClass> getValidRelationships(IZentaElement sourceElement,
			IZentaElement targetElement);

	List<RelationClass> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject);

	List<RelationClass> getRelationClasses();
	List<ObjectClass> getObjectClasses();
	List<ObjectClass> getConnectorClasses();

	IIdentifier create(ReferencesModelObject eClass);

	ImageDescriptor getImageDescriptor(ReferencesModelObject eClass);

	RelationClass getNoteConnection();

	boolean isAllowedType(IZentaElement element);
	boolean isElementVisible(IZentaElement childObject);

	boolean isNestedConnectionTypeRelationship(IRelationship relation);

	ReferencesModelObject getClassFor(IZentaElement element);

	boolean isValidRelationship(ObjectClass sourceclass,
			ObjectClass targetclass, RelationClass relationclass);

	List<RelationClass> getSourceRelationClassesFor(ObjectClass startElement);

	List<RelationClass> getTargetRelationClassesFor(
			ObjectClass targetclass);
}
