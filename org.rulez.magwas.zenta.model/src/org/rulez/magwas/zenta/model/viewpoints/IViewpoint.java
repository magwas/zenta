/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.viewpoints;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
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

    /**
     * @return The index number used when persisting the Viewpoint
     */
    int getIndex();

    /**
     * @return Allowed types
     */
    List<EObject> getAllowedTypes();
    
    /**
     * @return The name of the Viewpoint
     */
    String getName();

	boolean isValidRelationshipStart(IBasicObject iZentaElement,
			IBasicRelationship relationshipType);

	List<IBasicRelationship> getValidRelationshipsByClass(IBasicObject sourceObjectType, IBasicObject targetObjectType);
    
	NonNullList<IBasicRelationship> getValidRelationships(IZentaElement sourceElement,
			IZentaElement targetElement);

	List<IBasicRelationship> getSourceRelationClassesFor(
			IDiagramModelZentaObject sourceDiagramModelObject);

	NonNullList<IBasicRelationship> getSourceRelationClassesFor(IBasicObject startElement);

	List<IBasicRelationship> getRelationClasses();
	List<IBasicObject> getObjectClasses();
	List<IBasicObject> getConnectorClasses();

	IIdentifier create(IBasicObject eClass);

	IBasicRelationship getNoteConnection();

	boolean isAllowedType(EObject element);
	boolean isElementVisible(IZentaElement element);
	boolean isElementVisible(IDiagramModelObject dmo);

	boolean isNestedConnectionTypeRelationship(IBasicRelationship relation);

	boolean isValidRelationship(IBasicObject sourceclass,
			IBasicObject targetclass, IBasicRelationship relationclass);

	NonNullList<IBasicRelationship> getTargetRelationClassesFor(
			IBasicObject targetclass);

    NonNullList<IBasicObject> getAllowedTargets(
            IBasicRelationship oc);

    NonNullList<IBasicObject> getAllowedTargets(
    		IBasicObject oc);

    IBasicObject getObjectClassOf(
            IDiagramModelZentaObject sourceDiagramModelObject);

	IDiagramModel getDm();

	void setDm(IDiagramModel dm);

}
