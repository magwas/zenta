/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.controller.IZentaImages;



/**
 * Editor Input for a Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class DiagramEditorInput 
implements IEditorInput, IPersistableElement {
    
    /**
     * Model
     */
    protected IDiagramModel fModel;
    
    public DiagramEditorInput(IDiagramModel model) {
        fModel = model;
    }
    
    public IDiagramModel getDiagramModel() {
        return fModel;
    }
    
    public boolean exists() {
        return fModel != null;
    }

    public ImageDescriptor getImageDescriptor() {
        return IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_DIAGRAM_16);
    }

    public String getName() {
        return fModel.getZentaModel().getName() + ": " + fModel.getName(); //$NON-NLS-1$
    }

    public String getToolTipText() {
        return getName();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Object getAdapter(Class adapter) {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        
        if(!(obj instanceof DiagramEditorInput)) {
            return false;
        }
        
        if(fModel != null && ((DiagramEditorInput)obj).fModel != null) {
            return fModel.equals(((DiagramEditorInput)obj).fModel);
        }
        
        return false;
    }

    public IPersistableElement getPersistable() {
        
        // Not saved, or a new file based on a template
    	if (fModel == null || fModel.eContainer() == null)
    		return null;
        IZentaModel zentaModel = fModel.getZentaModel();
		if((zentaModel == null) || (zentaModel.getFile() == null)) {
            return null;
        }
        
        /*
         * If the user creates a new diagram (in a saved model) and that diagram is open when the user
         * closes the application without saving the model again, then Eclipse tries to restore it again next time.
         * So we don't persist the state of the diagram if the diagram view is not marked as saved.
         */
        if(fModel.getAdapter(IEditorModelManager.ADAPTER_PROPERTY_MODEL_SAVED) == null) {
            return null;
        }
        
        // OK, we'll handle it
        return this;
    }

    @Override
    public String getFactoryId() {
        return DiagramEditorInputFactory.ID_FACTORY;
    }

    @Override
    public void saveState(IMemento memento) {
        DiagramEditorInputFactory.saveState(memento, this);
    }
}
