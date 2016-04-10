/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas;

import java.util.List;

import org.eclipse.core.expressions.EvaluationResult;
import org.eclipse.core.expressions.Expression;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;
import org.rulez.magwas.zenta.canvas.model.ICanvasFactory;
import org.rulez.magwas.zenta.canvas.model.ICanvasModel;
import org.rulez.magwas.zenta.canvas.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.canvas.templates.wizard.NewCanvasFromTemplateWizard;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.components.ExtendedWizardDialog;
import org.rulez.magwas.zenta.editor.views.tree.commands.NewDiagramCommand;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;



/**
 * Canvas Editor ExtensionContributionFactory
 * Add context menu items to TreeModelView
 * 
 * @author Phillip Beauvoir
 */
public class NewCanvasExtensionContributionFactory extends ExtensionContributionFactory {
    
    private IFolder fCurrentFolder;

    public NewCanvasExtensionContributionFactory() {
    }

    @Override
    public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
        boolean enabled = CanvasEditorPlugin.INSTANCE.getPreferenceStore().getBoolean(IPreferenceConstants.CANVAS_EDITOR_ENABLED);
        if(!enabled) {
            return;
        }
        
        // New Blank Canvas
        IContributionItem item = new ActionContributionItem(new NewCanvasAction());
        additions.addContributionItem(item, diagramFolderExpression);
        
        // New Canvas from Template
        item = new ActionContributionItem(new NewCanvasFromTemplateAction());
        additions.addContributionItem(item, diagramFolderExpression);
    }

    /**
     * @return true if folder should hold diagrams
     */
    private boolean isDiagramFolder(IFolder folder) {
        return true;
    }

    /**
     * Action to create new Blank Canvas
     */
    private class NewCanvasAction extends Action {
        @Override
        public String getText() {
            return Messages.NewCanvasExtensionContributionFactory_0;
        }
        
        @Override
        public void run() {
            if(fCurrentFolder != null) {
                ICanvasModel canvasModel = ICanvasFactory.eINSTANCE.createCanvasModel();
                canvasModel.setName(Messages.NewCanvasExtensionContributionFactory_1);

                // Execute Command
                Command cmd = new NewDiagramCommand(fCurrentFolder, canvasModel, Messages.NewCanvasExtensionContributionFactory_1);
                CommandStack commandStack = IEditorModelManager.INSTANCE.obtainCommandStack(fCurrentFolder);
                commandStack.execute(cmd);
            }
            else {
                System.err.println("Folder was null in " + getClass()); //$NON-NLS-1$
            }
        }
        
        @Override
        public String getId() {
            return "newCanvasAction"; //$NON-NLS-1$
        };
        
        @Override
        public ImageDescriptor getImageDescriptor() {
            return ICanvasImages.ImageFactory.getImageDescriptor(ICanvasImages.ICON_CANVAS_BLANK_16);
        }
    };
    
    /**
     * Action to create Canvas based on Template
     */
    private class NewCanvasFromTemplateAction extends Action {
        @Override
        public String getText() {
            return Messages.NewCanvasExtensionContributionFactory_2;
        }
        
        @Override
        public void run() {
            IFolder cf = fCurrentFolder;
			if(cf != null) {
                WizardDialog dialog = new ExtendedWizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                                      new NewCanvasFromTemplateWizard(cf),
                                      "NewCanvasFromTemplateWizard"); //$NON-NLS-1$
                dialog.open();
            }
            else {
                System.err.println("Folder was null in " + getClass()); //$NON-NLS-1$
            }
        }
        
        @Override
        public String getId() {
            return "newCanvasFromTemplateAction"; //$NON-NLS-1$
        };
        
        @Override
        public ImageDescriptor getImageDescriptor() {
            return ICanvasImages.ImageFactory.getImageDescriptor(ICanvasImages.ICON_CANVAS_MODEL_16);
        }
    };

    /**
     * Evaluate whether the popup menu is on a Diagram Folder or a child of a Diagram Folder
     */
    private Expression diagramFolderExpression = new Expression() {
        @Override
        public EvaluationResult evaluate(IEvaluationContext context) throws CoreException {
            fCurrentFolder = null;
            Object o = context.getDefaultVariable();
            if(o instanceof List<?> && ((List<?>)o).size() > 0) {
                o = ((List<?>)o).get(0);
                if(o instanceof IFolder && isDiagramFolder((IFolder)o)) {
                    fCurrentFolder = (IFolder)o;
                }
                else if(o instanceof IDiagramModel) {
                    fCurrentFolder = (IFolder)((IDiagramModel)o).eContainer();
                }
            }
            return fCurrentFolder != null ? EvaluationResult.TRUE : EvaluationResult.FALSE;
        }
    };
}
