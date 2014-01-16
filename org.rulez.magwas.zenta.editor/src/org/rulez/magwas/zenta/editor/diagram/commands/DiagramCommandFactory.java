/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.diagram.dialog.NewNestedRelationDialog;
import org.rulez.magwas.zenta.editor.diagram.dialog.NewNestedRelationsDialog;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;



/**
 * DiagramCommandFactory
 * 
 * @author Phillip Beauvoir
 */
public final class DiagramCommandFactory {

    /**
     * @param object
     * @return A new Delete Diagram Object Command
     */
    public static Command createDeleteDiagramObjectCommand(IDiagramModelObject object) {
        CompoundCommand result = new CompoundCommand();
        __addDeleteCommands(object, result);
        return result.unwrap();
    }
    
    /**
     * Recurse and add child delete commands.
     * We have to do this because if the object has children with connections going outside these need explicit Delete Commands too
     * otherwise we end up with trailing connections...
     * @param container
     * @param result
     */
    private static void __addDeleteCommands(IDiagramModelObject object, CompoundCommand result) {
        result.add(new DeleteDiagramObjectCommand(object));

        if(object instanceof IDiagramModelContainer) {
            for(IDiagramModelObject child : ((IDiagramModelContainer)object).getChildren()) {
                __addDeleteCommands(child, result);
            }
        }
    }
    
    /**
     * @param connection
     * @return A new Delete Diagram Connection Command
     */
    public static Command createDeleteDiagramConnectionCommand(IDiagramModelConnection connection) {
        return new DeleteDiagramConnectionCommand(connection);
    }
    
    /**
     * Create a Command or CompoundCommand to create new Relations between parentElement and childElements.
     * This is used when the user drags elements into a (parent) element and nested relations are required.
     * @param fParentElement
     * @param childElements
     * @return The Command or null
     */
    public static Command createNewNestedRelationCommandWithDialog(IDiagramModelZentaObject fParentElement, IZentaElement[] childElements) {
        Command command = null;
        
        List<IZentaElement> children = new ArrayList<IZentaElement>();
        
        IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(fParentElement);
        IZentaElement zentaElement = fParentElement.getZentaElement();
        // Remove any that already have a relationship
        for(IZentaElement element : childElements) {
			if(__canAddNewRelationship(vp, zentaElement, element)) {
                children.add(element);
            }
        }
        
        // One
        if(children.size() == 1) {
            NewNestedRelationDialog dialog = new NewNestedRelationDialog(vp,Display.getCurrent().getActiveShell(),
            		zentaElement, children.get(0));
            if(dialog.open() == Window.OK) {
                IBasicRelationship eClass = dialog.getSelectedType();
                if(eClass != null) {
                    command = new CreateRelationCommand(zentaElement, children.get(0), eClass);
                }
            }
        }
        
        // More than one
        else if(children.size() > 1) {
            NewNestedRelationsDialog dialog = new NewNestedRelationsDialog(vp, Display.getCurrent().getActiveShell(),
            		zentaElement, children);
            if(dialog.open() == Window.OK) {
                List<IZentaElement> elements = dialog.getSelectedElements();
                if(elements != null) {
                    command = new CompoundCommand();
                    List<IBasicRelationship> types = dialog.getSelectedTypes();
                    for(int i=0;i<types.size();i++) {
                        ((CompoundCommand)command).add(new CreateRelationCommand(zentaElement, elements.get(i), types.get(i)));
                    }
                }
            }
        }
        
        return command;
    }
    
    /**
     * @param parent
     * @param child
     * @return true if a new relation can/should be added between parent and child when adding an element to a View
     */
    private static boolean __canAddNewRelationship(IViewpoint vp, IZentaElement parent, IZentaElement child) {
        // Not certain types
        if(!DiagramModelUtils.isNestedConnectionTypeElement(parent) || !DiagramModelUtils.isNestedConnectionTypeElement(child)) {
            return false;
        }
        
        
        // Not if there is already a relationship of a certain type between the two
        for(IBasicRelationship relation : ZentaModelUtils.getSourceRelationships(parent)) {
            if(relation.getTarget() == child &&
            	vp.getRelationClasses().contains(relation))
                        return false;
        }
        
        // Check valid relations
        if(vp.getValidRelationships((IBasicObject)parent, (IBasicObject)child).size() > 0)
        	return true;
		return false;
    }
}
