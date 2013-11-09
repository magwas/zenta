/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.dnd;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.dnd.AbstractTransferDropTargetListener;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IZentamateModelElement;
import org.rulez.magwas.zenta.model.IDiagramModel;


/**
 * Native DnD listener
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractDiagramTransferDropTargetListener extends AbstractTransferDropTargetListener {

    public AbstractDiagramTransferDropTargetListener(EditPartViewer viewer) {
        super(viewer, LocalSelectionTransfer.getTransfer());
    }

    @Override
    protected void updateTargetRequest() {
        getNativeDropRequest().setData(getCurrentEvent().data);
        getNativeDropRequest().setDropLocation(getDropLocation());
    }
    
    @Override
    protected Request createTargetRequest() {
        return new DiagramDropRequest(LocalSelectionTransfer.getTransfer());
    }

    protected DiagramDropRequest getNativeDropRequest() {
        return (DiagramDropRequest)getTargetRequest();
    }
    
    @Override
    public boolean isEnabled(DropTargetEvent event) {
        // Iterate thru the selection and see if we have the required type for a drop
        ISelection selection =  LocalSelectionTransfer.getTransfer().getSelection();
        if(selection instanceof IStructuredSelection) {
            // Firstly check they are from the same model
            if(!isSelectionFromSameModel((IStructuredSelection)selection)) {
                return false;
            }
            
            // At least one element in the selection is allowed
            for(Object object : ((IStructuredSelection)selection).toArray()) {
                if(isEnabled(object)) {
                    return super.isEnabled(event);
                }
            }
        }
        
        return false;
    }
    
    /**
     * Whether the DND operation is enabled if element is part of the drag operation
     * @param element
     * @return true if is enabled
     */
    protected boolean isEnabled(Object element) {
        return true;
    }
    
    /**
     * @return The Target Diagram Model
     */
    protected IDiagramModel getTargetDiagramModel() {
        return (IDiagramModel)getViewer().getContents().getModel();
    }
    
    /**
     * Check that the dragged selection is being dragged into the same model
     */
    protected boolean isSelectionFromSameModel(IStructuredSelection selection) {
        IZentamateModel targetZentamateModel = getTargetDiagramModel().getZentamateModel();
        
        for(Object object : selection.toArray()) {
            if(object instanceof IZentamateModelElement) {
                IZentamateModel sourceZentamateModel = ((IZentamateModelElement)object).getZentamateModel();
                if(sourceZentamateModel != targetZentamateModel) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
