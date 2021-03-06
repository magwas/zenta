/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.commands;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.rulez.magwas.zenta.editor.model.commands.NonNotifyingCompoundCommand;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.editor.ui.services.UIRequestManager;
import org.rulez.magwas.zenta.editor.views.tree.TreeSelectionRequest;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.handmade.util.Util;



/**
 * Duplicate Command Handler
 * 
 * @author Phillip Beauvoir
 */
public class DuplicateCommandHandler {

    /*
     * If duplicating elements from more than one model in the tree we need to use the
     * Command Stack allocated to each model. And then allocate one CompoundCommand per Command Stack.
     */
    private Hashtable<CommandStack, CompoundCommand> fCommandMap = new Hashtable<CommandStack, CompoundCommand>();

    // Selected objects in Tree
    private Object[] fSelectedObjects;
    
    // Newly added objects
    private List<Object> fNewObjects = new ArrayList<Object>();

    // Elements to duplicate
    private List<Object> fElementsToDuplicate = new ArrayList<Object>();
    
    /**
     * @param selection
     * @return True if we can duplicate anything in selection
     */
    public static boolean canDuplicate(IStructuredSelection selection) {
        for(Object element : selection.toList()) {
            if(canDuplicate(element)) { // At least one element can be duplicated
                return true;
            }
        }
        
        return false;
    }

    /**
     * @param element
     * @return True if we can duplicate this object
     */
    public static boolean canDuplicate(Object element) {
        // Elements
        if(element instanceof IZentaElement && !(element instanceof IBasicRelationship)) {
            return true;
        }
        // Diagrams
        else if(element instanceof IDiagramModel) {
            return true;
        }
        
        return false;
    }
    
    public DuplicateCommandHandler(Object[] objects) {
        fSelectedObjects = objects;
    }

    /**
     * Perform the duplicate command
     */
    public void duplicate() {
        // Gather the elements to duplicate
        getElementsToDuplicate();
        
        // Create the Commands
        createCommands();
        
        // Execute the Commands on the CommandStack(s) - there could be more than one if more than one model open in the Tree
        for(Entry<CommandStack, CompoundCommand> entry : fCommandMap.entrySet()) {
            entry.getKey().execute(entry.getValue());
        }
        
        // Select new objects in Tree
        UIRequestManager.INSTANCE.fireRequest(new TreeSelectionRequest(this, new StructuredSelection(fNewObjects), true));
        
        dispose();
    }

    private void getElementsToDuplicate() {
        for(Object object : fSelectedObjects) {
            if(canDuplicate(object)) {
                addToList(object, fElementsToDuplicate);
            }
        }
    }
    
    private void createCommands() {
        for(Object object : fElementsToDuplicate) {
            CompoundCommand compoundCommand = getCompoundCommand((IAdapter)object);
            if(compoundCommand == null) { // sanity check
                System.err.println("Could not get CompoundCommand in " + getClass()); //$NON-NLS-1$
                continue;
            }
            
            if(object instanceof IDiagramModel) {
                Command cmd = new DuplicateDiagramModelCommand((IDiagramModel)object);
                compoundCommand.add(cmd);
            }
            else if(object instanceof IZentaElement && !(object instanceof IBasicRelationship)) {
                Command cmd = new DuplicateElementCommand((IZentaElement)object);
                compoundCommand.add(cmd);
            }
        }
    }
    
    /**
     * Add object to list if not already in list
     */
    private void addToList(Object object, List<Object> list) {
        if(object != null && !list.contains(object)) {
            list.add(object);
        }
    }

    /**
     * Get, and if need be create, a CompoundCommand to which to add the object to be duplicated command
     */
    private CompoundCommand getCompoundCommand(IAdapter object) {
        // Get the Command Stack registered to the object
        CommandStack stack = (CommandStack)object.getAdapter(CommandStack.class);
        if(stack == null) {
            System.err.println("CommandStack was null in " + getClass()); //$NON-NLS-1$
            return null;
        }
        
        // Now get or create a Compound Command
        CompoundCommand compoundCommand = fCommandMap.get(stack);
        if(compoundCommand == null) {
            compoundCommand = new NonNotifyingCompoundCommand(Messages.DuplicateCommandHandler_1);
            fCommandMap.put(stack, compoundCommand);
        }
        
        return compoundCommand;
    }
    
    private void dispose() {
        fSelectedObjects = null;
        fElementsToDuplicate = null;
        fCommandMap = null;
        fNewObjects = null;
    }


    
    /**
     * Duplicate Diagram Model Command
     */
    private class DuplicateDiagramModelCommand extends Command {
        private IFolder fParent;
        private IDiagramModel fDiagramModelOriginal;
        private IDiagramModel fDiagramModelCopy;
        
        /**
         * Mapping of original objects to new copied objects
         */
        private Hashtable<IDiagramModelObject, IDiagramModelObject> fMapping;
        
        public DuplicateDiagramModelCommand(IDiagramModel dm) {
            fParent = (IFolder)dm.eContainer();
            fDiagramModelOriginal = dm;
            setLabel(Messages.DuplicateCommandHandler_2);
        }
        
        @Override
        public void execute() {
            // We have to add the diagram model to the model first so that child objects can be allocated IDs.
            // See org.rulez.magwas.zenta.model.util.IDAdapter
            IDiagramModel dmcopy = (IDiagramModel)fDiagramModelOriginal.getCopy();
			fDiagramModelCopy = dmcopy;
			dmcopy.setName(fDiagramModelOriginal.getName() + " " + Messages.DuplicateCommandHandler_3); //$NON-NLS-1$
            fParent.getElements().add(dmcopy);
            
            fNewObjects.add(dmcopy);
            
            // Add children
            copyChildren();

            // Open Editor
            EditorManager.openDiagramEditor(dmcopy);
        }
        
        @Override
        public void undo() {
            // Close the Editor FIRST!
            EditorManager.closeDiagramEditor(fDiagramModelCopy);
            fParent.getElements().remove(fDiagramModelCopy);
        }
        
        @Override
        public void redo() {
            fParent.getElements().add(fDiagramModelCopy);
            // Open Editor
            EditorManager.openDiagramEditor(Util.verifyNonNull(fDiagramModelCopy));
        }
        
        private void copyChildren() {
            // Child objects
            fMapping = new Hashtable<IDiagramModelObject, IDiagramModelObject>();
            copyChildren(fDiagramModelOriginal, fDiagramModelCopy);
            
            // Connections
            for(Entry<IDiagramModelObject, IDiagramModelObject> entry : fMapping.entrySet()) {
                IDiagramModelObject original = entry.getKey();
                for(IDiagramModelConnection conn : original.getSourceConnections()) {
                    IDiagramModelConnection connCopy = (IDiagramModelConnection)conn.getCopy();
                    IDiagramModelObject srcCopy = fMapping.get(conn.getSource());
                    IDiagramModelObject tgtCopy = fMapping.get(conn.getTarget());
                    connCopy.connect(srcCopy, tgtCopy);
                    
                    if(conn instanceof IDiagramModelZentaConnection) {
                        ((IDiagramModelZentaConnection)connCopy).setRelationship(((IDiagramModelZentaConnection)conn).getRelationship());
                    }
                }
            }
        }
        
        private void copyChildren(IDiagramModelContainer container, IDiagramModelContainer containerCopy) {
            for(IDiagramModelObject childObject : container.getChildren()) {
                IDiagramModelObject childCopy = (IDiagramModelObject)childObject.getCopy();
                
                if(childObject instanceof IDiagramModelZentaObject) {
                    ((IDiagramModelZentaObject)childCopy).setZentaElement(((IDiagramModelZentaObject)childObject).getZentaElement());
                }
                
                containerCopy.getChildren().add(childCopy);
                
                fMapping.put(childObject, childCopy);
                
                if(childObject instanceof IDiagramModelContainer) {
                    copyChildren((IDiagramModelContainer)childObject, (IDiagramModelContainer)childCopy);
                }
            }
        }
        
        @Override
        public void dispose() {
            fParent = null;
            fDiagramModelOriginal = null;
            fDiagramModelCopy = null;
            fMapping =  null;
        }
    }
    
    /**
     * Duplicate Element Command
     */
    private class DuplicateElementCommand extends Command {
        private IFolder fParent;
        private IZentaElement fElementCopy;
        
        public DuplicateElementCommand(IZentaElement element) {
            setLabel(Messages.DuplicateCommandHandler_4);

            fParent = (IFolder)element.eContainer();
            fElementCopy = (IZentaElement)element.getCopy();
            fElementCopy.setName(element.getName() + " " + Messages.DuplicateCommandHandler_3); //$NON-NLS-1$

            fNewObjects.add(fElementCopy);
        }
        
        @Override
        public void execute() {
            fParent.getElements().add(fElementCopy);
        }
        
        @Override
        public void undo() {
            fParent.getElements().remove(fElementCopy);
        }
        
        @Override
        public void dispose() {
            fParent = null;
            fElementCopy = null;
        }
    }

}
