/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.rulez.magwas.zenta.canvas.model.ICanvasModel;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelBlock;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelConnection;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelSticky;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.DiagramImageEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.EmptyEditPart;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IDiagramModelReference;


/**
 * Factory for creating Edit Parts based on graphical domain model objects
 * 
 * @author Phillip Beauvoir
 */
public class CanvasModelEditPartFactory
implements EditPartFactory {
    
    public EditPart createEditPart(EditPart context, Object model) {
        EditPart child = null;
        
        if(model == null) {
            return null;
        }
        
        // Main Diagram Edit Part
        if(model instanceof ICanvasModel) {
            child = new CanvasDiagramPart();
        }
        
        // Block
        else if(model instanceof ICanvasModelBlock) {
            child = new CanvasBlockEditPart();
        }
        
        // Image
        else if(model instanceof IDiagramModelImage) {
            child = new DiagramImageEditPart();
        }

        // Sticky
        else if(model instanceof ICanvasModelSticky) {
            child = new CanvasStickyEditPart();
        }
        
        // Diagram Model Reference
        else if(model instanceof IDiagramModelReference) {
            child = new CanvasDiagramModelReferenceEditPart();
        }
        
        // Connections
        else if(model instanceof ICanvasModelConnection) {
            child = new CanvasLineConnectionEditPart();
        }
        
        /*
         * It's better to return an Empty Edit Part in case of a corrupt model.
         * Returning null is disastrous and means the Diagram View won't open.
         */
        else {
            child = new EmptyEditPart();
        }
        
        // Set the Model in the Edit part
        child.setModel(model);
        
        return child;
    }

}
