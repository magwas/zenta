/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.technology;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BusinessInterfaceEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.technology.TechnologyInfrastructureInterfaceFigure;


/**
 * Technology Infrastructure Interface Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class TechnologyInfrastructureInterfaceEditPart
extends BusinessInterfaceEditPart {            
    
    @Override
    protected IFigure createFigure() {
        return new TechnologyInfrastructureInterfaceFigure(getModel());
    }
}