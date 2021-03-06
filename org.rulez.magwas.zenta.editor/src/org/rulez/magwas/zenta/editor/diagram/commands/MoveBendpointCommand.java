/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.draw2d.geometry.Dimension;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IDiagramModelBendpoint;


/**
 * Move Bendpoint Command
 * 
 * @author Phillip Beauvoir
 */
public class MoveBendpointCommand extends BendpointCommand implements IAnimatableCommand {

    private IDiagramModelBendpoint fOldBendpoint, fNewBendpoint;
    
    public MoveBendpointCommand() {
        super(Messages.MoveBendpointCommand_0);
    }

    @Override
    public void execute() {
        fOldBendpoint = getDiagramModelConnection().getBendpoints().get(getIndex());
        
        fNewBendpoint = IZentaFactory.eINSTANCE.createDiagramModelBendpoint();
        
        Dimension dim1 = getFirstRelativeDimension();
        fNewBendpoint.setStartX(dim1.width);
        fNewBendpoint.setStartY(dim1.height);
        
        Dimension dim2 = getSecondRelativeDimension();
        fNewBendpoint.setEndX(dim2.width);
        fNewBendpoint.setEndY(dim2.height);
        
        redo();
    }

    @Override
    public void undo() {
        getDiagramModelConnection().getBendpoints().set(getIndex(), fOldBendpoint);
    }

    @Override
    public void redo() {
        getDiagramModelConnection().getBendpoints().set(getIndex(), fNewBendpoint);
    }
}
