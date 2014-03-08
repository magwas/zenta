/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;


/**
 * Viewpoint Filter for EditParts
 * 
 * This will query the current viewpoint (if any) as to whether the child object is
 * to be shown in the parent EditPart.
 * 
 * @author Phillip Beauvoir
 */
public class ViewpointEditPartFilter implements IChildEditPartFilter, IConnectionEditPartFilter {
    
    @Override
    public boolean isChildElementVisible(EditPart parentEditPart, Object childObject) {
        IViewpoint viewPoint = null;
        
        if(childObject instanceof IDiagramModelObject) {
            IZentaDiagramModel dm = (IZentaDiagramModel)((IDiagramModelObject)childObject).getDiagramModel();
            viewPoint = ViewpointsManager.INSTANCE.getViewpoint(dm);
        }
        
        if(viewPoint != null) {
            return viewPoint.isElementVisible((IBasicObject) childObject);
        }
        
        return true;
    }

    @Override
    public boolean isConnectionVisible(EditPart editPart, IDiagramModelConnection connection) {
        // This ensures that there are no dangling connections if this filter has removed an editpart
        return isChildElementVisible(editPart, connection.getSource()) && isChildElementVisible(editPart, connection.getTarget());
    }
}