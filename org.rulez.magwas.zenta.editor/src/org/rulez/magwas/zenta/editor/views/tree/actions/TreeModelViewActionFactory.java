/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.editor.views.tree.commands.NewDiagramCommand;
import org.rulez.magwas.zenta.editor.views.tree.commands.NewElementCommand;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.controller.IZentaImages;




/**
 * Factory for Tree Model Viewer to create "New" type actions
 * Each Action will create a new Ecore Zenta Element and add it to the Ecore Model
 * 
 * Also returns Images for Ecore types and Tree Model types
 * 
 * @author Phillip Beauvoir
 */
public class TreeModelViewActionFactory {

	private IMetamodel metamodel;

    public TreeModelViewActionFactory( IZentaModel model) {
    	metamodel = IZentaFactory.eINSTANCE.getMetamodelFor(model);
    }

    /**
     * @param selected
     * @return A List (perhaps empty) of Actions for a given selected object
     */
    public List<IAction> getNewObjectActions(Object selected) {
        List<IAction> list = new ArrayList<IAction>();

        // If we have selected a leaf object, go up to parent
        if(selected instanceof IZentaElement || selected instanceof IDiagramModel) {
            selected = ((EObject)selected).eContainer();
        }
        
        // We want a folder
        if(!(selected instanceof IFolder)) {
            return list;
        }
        
        IFolder folder = (IFolder)selected;
        // Find topmost folder type
        IFolder f = folder;
        while(f.eContainer() instanceof IFolder) {
            f = (IFolder)f.eContainer();
        }

        for(IBasicObject eClass : metamodel.getObjectClasses()) {
            IAction action = createNewElementAction(folder, eClass);
            list.add(action);
        }
        for(IBasicObject eClass : metamodel.getConnectorClasses()) {
            IAction action = createNewElementAction(folder, eClass);
            list.add(action);
        }
        list.add(createNewZentaDiagramAction(folder));
        list.add(createNewSketchAction(folder));

        return list;
    }

    private IAction createNewElementAction(final IFolder folder, final IBasicObject eClass) {
        IAction action = new Action(eClass.getName()) {
            @Override
            public void run() {
                // Create a new Zenta Element, set its name
                IFolder f = Util.verifyNonNull(folder);
				IZentaElement element = (IZentaElement) eClass.create(f);
                element.setName(getText());
                // Execute Command
                Command cmd = new NewElementCommand(f, element);
                CommandStack commandStack = IEditorModelManager.INSTANCE.obtainCommandStack(f);
                commandStack.execute(cmd);
            }
        };

        action.setImageDescriptor(ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass));
        return action;
    }
    
    private IAction createNewZentaDiagramAction(final IFolder folder) {
        IAction action = new Action(Messages.TreeModelViewActionFactory_0) {
            @Override
            public void run() {
                // Create a new Diagram Model, set its name
                IDiagramModel diagramModel = IZentaFactory.eINSTANCE.createZentaDiagramModel();
                diagramModel.setName(Messages.TreeModelViewActionFactory_1);
                
                // Execute Command
                Command cmd = new NewDiagramCommand(folder, diagramModel, Messages.TreeModelViewActionFactory_1);
                CommandStack commandStack = IEditorModelManager.INSTANCE.obtainCommandStack(folder);
                commandStack.execute(cmd);
            }
        };

        action.setImageDescriptor(IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_DIAGRAM_16));
        return action;
    }
    
    private IAction createNewSketchAction(final IFolder folder) {
        IAction action = new Action(Messages.TreeModelViewActionFactory_2) {
            @Override
            public void run() {
                // Create a new Diagram Model, set its name
                ISketchModel sketchModel = IZentaFactory.eINSTANCE.createSketchModel();
                sketchModel.setName(Messages.TreeModelViewActionFactory_3);
                
                // Defaults
                int defaultBackground = Preferences.STORE.getInt(IPreferenceConstants.SKETCH_DEFAULT_BACKGROUND);
                sketchModel.setBackground(defaultBackground);
                
                // Execute Command
                Command cmd = new NewDiagramCommand(folder, sketchModel, Messages.TreeModelViewActionFactory_3);
                CommandStack commandStack = IEditorModelManager.INSTANCE.obtainCommandStack(folder);
                commandStack.execute(cmd);
            }
        };

        action.setImageDescriptor(IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_SKETCH_16));
        return action;
    }

	public IMetamodel getMetamodel() {
		return metamodel;
	}
}
