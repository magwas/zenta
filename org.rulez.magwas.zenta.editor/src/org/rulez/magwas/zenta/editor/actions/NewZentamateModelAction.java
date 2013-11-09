/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.editor.ui.services.UIRequestManager;
import org.rulez.magwas.zenta.editor.views.tree.TreeEditElementRequest;
import org.rulez.magwas.zenta.model.IZentamateModel;


/**
 * New ZentaMate Model Action
 * 
 * @author Phillip Beauvoir
 */
public class NewZentamateModelAction
extends Action
implements IWorkbenchAction
{
    
    public NewZentamateModelAction() {
        setImageDescriptor(IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_NEW_FILE_16));
        setText(Messages.NewZentamateModelAction_0);
        setToolTipText(Messages.NewZentamateModelAction_1);
        setId("org.rulez.magwas.zenta.editor.action.newModel"); //$NON-NLS-1$
        setActionDefinitionId(getId()); // register key binding
    }
    
    @Override
    public void run() {
        // Create new Model
        IZentamateModel model = IEditorModelManager.INSTANCE.createNewModel();
        
        // Open Diagram Editor
        EditorManager.openDiagramEditor(model.getDefaultDiagramModel());
        
        // Edit in-place in Tree
        UIRequestManager.INSTANCE.fireRequest(new TreeEditElementRequest(this, model));
    }

    public void dispose() {
    } 
}