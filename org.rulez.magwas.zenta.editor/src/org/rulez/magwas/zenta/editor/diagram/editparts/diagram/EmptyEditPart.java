/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.diagram;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.gef.EditPolicy;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractBaseEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.diagram.EmptyFigure;
import org.rulez.magwas.zenta.editor.diagram.policies.PartComponentEditPolicy;
import org.rulez.magwas.zenta.model.IDiagramModelObject;


/**
 * Dead Edit Part - used in case of emergency
 * 
 * @author Phillip Beauvoir
 */
public class EmptyEditPart
extends AbstractBaseEditPart {            
    
    @Override
    protected IFigure createFigure() {
        return new EmptyFigure((IDiagramModelObject)getModel());
    }

    @Override
    protected Adapter getECoreAdapter() {
        return null;
    }

    @Override
    protected void createEditPolicies() {
        // Add a policy to handle editing the Parts (for example, deleting a part)
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new PartComponentEditPolicy());
    }
 
}