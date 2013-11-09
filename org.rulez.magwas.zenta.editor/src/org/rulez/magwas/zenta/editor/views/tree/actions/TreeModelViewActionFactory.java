/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ZentamateLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.views.tree.commands.NewDiagramCommand;
import org.rulez.magwas.zenta.editor.views.tree.commands.NewElementCommand;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateFactory;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.util.ZentamateModelUtils;




/**
 * Factory for Tree Model Viewer to create "New" type actions
 * Each Action will create a new Ecore Zentamate Element and add it to the Ecore Model
 * 
 * Also returns Images for Ecore types and Tree Model types
 * 
 * @author Phillip Beauvoir
 */
public class TreeModelViewActionFactory {

    public static final TreeModelViewActionFactory INSTANCE = new TreeModelViewActionFactory();

    private TreeModelViewActionFactory() {
    }

    /**
     * @param selected
     * @return A List (perhaps empty) of Actions for a given selected object
     */
    public List<IAction> getNewObjectActions(Object selected) {
        List<IAction> list = new ArrayList<IAction>();

        // If we have selected a leaf object, go up to parent
        if(selected instanceof IZentamateElement || selected instanceof IDiagramModel) {
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

        switch(f.getType()) {
            case BUSINESS:
                for(EClass eClass : ZentamateModelUtils.getBusinessClasses()) {
                    IAction action = createNewElementAction(folder, eClass);
                    list.add(action);
                }
                break;

            case CONNECTORS:
                for(EClass eClass : ZentamateModelUtils.getConnectorClasses()) {
                    IAction action = createNewElementAction(folder, eClass);
                    list.add(action);
                }
                break;
                
            case DIAGRAMS:
                list.add(createNewZentamateDiagramAction(folder));
                list.add(createNewSketchAction(folder));
                break;

            default:
                break;
        }

        return list;
    }

    private IAction createNewElementAction(final IFolder folder, final EClass eClass) {
        IAction action = new Action(ZentamateLabelProvider.INSTANCE.getDefaultName(eClass)) {
            @Override
            public void run() {
                // Create a new Zentamate Element, set its name
                IZentamateElement element = (IZentamateElement)IZentamateFactory.eINSTANCE.create(eClass);
                element.setName(getText());
                // Execute Command
                Command cmd = new NewElementCommand(folder, element);
                CommandStack commandStack = (CommandStack)folder.getAdapter(CommandStack.class);
                commandStack.execute(cmd);
            }
        };

        action.setImageDescriptor(ZentamateLabelProvider.INSTANCE.getImageDescriptor(eClass));
        return action;
    }
    
    private IAction createNewZentamateDiagramAction(final IFolder folder) {
        IAction action = new Action(Messages.TreeModelViewActionFactory_0) {
            @Override
            public void run() {
                // Create a new Diagram Model, set its name
                IDiagramModel diagramModel = IZentamateFactory.eINSTANCE.createZentamateDiagramModel();
                diagramModel.setName(Messages.TreeModelViewActionFactory_1);
                
                // Execute Command
                Command cmd = new NewDiagramCommand(folder, diagramModel, Messages.TreeModelViewActionFactory_1);
                CommandStack commandStack = (CommandStack)folder.getAdapter(CommandStack.class);
                commandStack.execute(cmd);
            }
        };

        action.setImageDescriptor(IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_DIAGRAM_16));
        return action;
    }
    
    private IAction createNewSketchAction(final IFolder folder) {
        IAction action = new Action(Messages.TreeModelViewActionFactory_2) {
            @Override
            public void run() {
                // Create a new Diagram Model, set its name
                ISketchModel sketchModel = IZentamateFactory.eINSTANCE.createSketchModel();
                sketchModel.setName(Messages.TreeModelViewActionFactory_3);
                
                // Defaults
                int defaultBackground = Preferences.STORE.getInt(IPreferenceConstants.SKETCH_DEFAULT_BACKGROUND);
                sketchModel.setBackground(defaultBackground);
                
                // Execute Command
                Command cmd = new NewDiagramCommand(folder, sketchModel, Messages.TreeModelViewActionFactory_3);
                CommandStack commandStack = (CommandStack)folder.getAdapter(CommandStack.class);
                commandStack.execute(cmd);
            }
        };

        action.setImageDescriptor(IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_SKETCH_16));
        return action;
    }
}
