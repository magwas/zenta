/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.diagram.DiagramEditorFactoryExtensionHandler;
import org.rulez.magwas.zenta.editor.diagram.DiagramEditorInput;
import org.rulez.magwas.zenta.editor.diagram.IZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.IDiagramEditorFactory;
import org.rulez.magwas.zenta.editor.diagram.IDiagramModelEditor;
import org.rulez.magwas.zenta.editor.diagram.sketch.ISketchEditor;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;



/**
 * Editor Manager
 * 
 * @author Phillip Beauvoir
 */
public class EditorManager {
    
    /**
     * Open an Editor
     * 
     * @param input
     * @param editorID
     */
    public static IEditorPart openEditor(IEditorInput input, String editorID) {
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        try {
			return Util.verifyNonNull(page.openEditor(input, editorID));
		} catch (PartInitException e) {
			throw new RuntimeException(e);
		}
    }

    /**
     * Open the Diagram Editor for a given DiagramModel Model
     * @param name
     */
    public static IDiagramModelEditor openDiagramEditor( IDiagramModel model) {
        if(model == null || model.eContainer() == null)
        	throw new IllegalArgumentException();

        String id = null;
        IEditorInput editorInput = null;
        
        if(model instanceof IZentaDiagramModel) {
            id = IZentaDiagramEditor.ID;
            editorInput = new DiagramEditorInput(model);
        }
        else if(model instanceof ISketchModel) {
            id = ISketchEditor.ID;
            editorInput = new DiagramEditorInput(model);
        }
        else {
            IDiagramEditorFactory factory = DiagramEditorFactoryExtensionHandler.INSTANCE.getFactory(model);
            if(factory != null) {
                id = factory.getEditorID();
                editorInput = factory.createEditorInput(model);
            }
        }

        if(id == null || editorInput == null) {
            throw new RuntimeException("Unsupported model type"); //$NON-NLS-1$
        }
        
        IEditorPart part = openEditor(editorInput, id);
        
        // Check it actually is IDiagramModelEditor, it could be an org.eclipse.ui.internal.ErrorEditorPart if an error occurs
        return (IDiagramModelEditor) part;
    }
    
    /**
     * Close open Diagram Editor Part for a model
     * @param model
     */
    public static void closeDiagramEditor(IDiagramModel diagramModel) {
        if(diagramModel == null) {
            return;
        }
        
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        for(IEditorReference ref : page.getEditorReferences()) {
            try {
                IEditorInput input = ref.getEditorInput();
                if(input instanceof DiagramEditorInput && ((DiagramEditorInput)input).getDiagramModel() == diagramModel) {
                    page.closeEditors(new IEditorReference[] {ref}, false);
                }
            }
            catch(PartInitException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    /**
     * Close open Diagram Editor Parts for a model
     * @param model
     */
    public static void closeDiagramEditors(IZentaModel model) {
        if(model == null) {
            return;
        }
        
        List<IEditorReference> list = new ArrayList<IEditorReference>();
        
        IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        for(IEditorReference ref : page.getEditorReferences()) {
            try {
                IEditorInput input = ref.getEditorInput();
                if(input instanceof DiagramEditorInput && ((DiagramEditorInput)input).getDiagramModel().getZentaModel() == model) {
                    list.add(ref);
                }
            }
            catch(PartInitException ex) {
                throw new RuntimeException(ex);
            }
        }
        
        if(!list.isEmpty()) {
            IEditorReference[] refs = list.toArray(new IEditorReference[list.size()]);
            page.closeEditors(refs, false);
        }
    }
}
