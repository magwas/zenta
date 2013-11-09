/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.help.cheatsheets;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.editor.ui.services.ViewManager;
import org.rulez.magwas.zenta.editor.views.tree.ITreeModelView;
import org.rulez.magwas.zenta.model.IZentamateDiagramModel;
import org.rulez.magwas.zenta.model.IZentamateFactory;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IFolder;



/**
 * Action to programmatically create a Map View
 * 
 * @author Phillip Beauvoir
 */
public class CreateMapViewCheatSheetAction
extends Action
implements ICheatSheetAction {
    
    public void run(String[] params, ICheatSheetManager manager) {
        IViewPart viewPart = ViewManager.showViewPart(ITreeModelView.ID, true);
        if(viewPart == null) {
            MessageDialog.openWarning(Display.getCurrent().getActiveShell(), Messages.CreateMapViewCheatSheetAction_0,
                    Messages.CreateMapViewCheatSheetAction_1);
            return;
        }
        
        IZentamateModel model = (IZentamateModel)viewPart.getAdapter(IZentamateModel.class);
        if(model == null) {
            MessageDialog.openWarning(Display.getCurrent().getActiveShell(), Messages.CreateMapViewCheatSheetAction_2,
                    Messages.CreateMapViewCheatSheetAction_3);
            return;
        }
        
        EList<IDiagramModel> diagramModels = model.getDiagramModels();
        if(diagramModels.size() < 2) {
            MessageDialog.openWarning(Display.getCurrent().getActiveShell(), Messages.CreateMapViewCheatSheetAction_4,
                    Messages.CreateMapViewCheatSheetAction_5);
            return;
        }
        
        CommandStack stack = (CommandStack)model.getAdapter(CommandStack.class);
        if(stack != null) {
            IZentamateDiagramModel diagramModel = IZentamateFactory.eINSTANCE.createZentamateDiagramModel();
            diagramModel.setName(Messages.CreateMapViewCheatSheetAction_6);
            
            int y = 20; 
            
            for(IDiagramModel dm : diagramModels) {
                IDiagramModelReference ref = IZentamateFactory.eINSTANCE.createDiagramModelReference();
                ref.setReferencedModel(dm);
                ref.setBounds(20, y, 400, 100);
                diagramModel.getChildren().add(ref);
                y += 120;
            }
            
            IFolder folder = model.getDefaultFolderForElement(diagramModel);
            
            stack.execute(new NewViewCommand(folder, diagramModel));
        }
    }
    
    private static class NewViewCommand extends Command {
        IFolder fParent;
        IDiagramModel fDiagramModel;
        
        NewViewCommand(IFolder parent, IDiagramModel model) {
            super(Messages.CreateMapViewCheatSheetAction_7);
            fParent = parent;
            fDiagramModel = model;
        }
        
        @Override
        public void execute() {
            fParent.getElements().add(0, fDiagramModel);
            EditorManager.openDiagramEditor(fDiagramModel);
        }
        
        @Override
        public void undo() {
            // Close Editor FIRST!
            EditorManager.closeDiagramEditor(fDiagramModel);
            fParent.getElements().remove(fDiagramModel);
        }
    }
    
}