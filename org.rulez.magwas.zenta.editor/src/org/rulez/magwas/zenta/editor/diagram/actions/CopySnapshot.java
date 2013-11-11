/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.actions;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.Clipboard;
import org.eclipse.jface.viewers.StructuredSelection;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.model.commands.NonNotifyingCompoundCommand;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Snapshot Copy of Diagram objects.
 * <p>
 * This involves taking a snapshot copy of selected objects when the user does a Copy Action.
 * We take a snapshot so that we can maintain the integrity of the copied objects if the user
 * edits or deleted the originals of if a Cut action is performed (which will delete the originals).
 * <p>
 * When the user comes to Paste the objects, a new copy is made from the Snapshot.
 * Then a set of Undoable Commands is created for each newly created object.
 * 
 * This is truly horrible code.
 *
 * @author Phillip Beauvoir
 */
public final class CopySnapshot {
    
    /**
     * A new Diagram Model container that contains a copy of all copied diagram model objects.
     * We take a snapshot so that we can maintain the integrity of the copied objects if the user
     * edits or deleted the originals of if a Cut action is performed (which will delete the originals).
     */
    private IDiagramModel fDiagramModelSnapshot;
    
    /**
     * Mapping of original objects to new copied objects in the Snapshot
     */
    private Hashtable<IDiagramModelObject, IDiagramModelObject> fOriginalToSnapshotObjectsMapping;
    
    /**
     * Mapping of new copied objects in the snapshot to original objects
     */
    private Hashtable<IDiagramModelObject, IDiagramModelObject> fSnapshotToOriginalObjectsMapping;
    
    /**
     * Mapping of new copied Snapshot connections to original connections in the Snapshot
     */
    private Hashtable<IDiagramModelConnection, IDiagramModelConnection> fSnapshotToOriginalConnectionsMapping;
    
    /**
     * Mapping of original connections to new copied Snapshot connections
     */
    private Hashtable<IDiagramModelConnection, IDiagramModelConnection> fOriginalToSnapshotConnectionsMapping;
    
    /**
     * x, y mouse click offset for pasting in same diagram
     */
    private int fXOffSet, fYOffSet;
    
    /**
     * Whether or not we paste new copies of the copied Zenta Elements
     */
    private boolean fDoCreateZentaElementCopies;
    
    /**
     * The source Zenta Model of the copied objects
     */
    private IZentaModel fSourceZentaModel;
    
    /**
     * The target Zenta Model of the copied objects
     */
    private IZentaModel fTargetZentaModel;
    
    /**
     * Clear the system Clipboard of any CopySnapshot object if the CopySnapshot references a model that is closed
     */
    static {
        IEditorModelManager.INSTANCE.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if(evt.getPropertyName() == IEditorModelManager.PROPERTY_MODEL_REMOVED) {
                    Object contents = Clipboard.getDefault().getContents();
                    if(contents instanceof CopySnapshot) {
                        CopySnapshot copySnapshot = (CopySnapshot)contents;
                        IZentaModel model = (IZentaModel)evt.getNewValue();
                        if(copySnapshot.fSourceZentaModel == model) {
                            Clipboard.getDefault().setContents(""); //$NON-NLS-1$
                        }
                    }
                }
            }
        });
    }
    
    /**
     * Constructor
     * @param modelObjectsSelected
     */
    public CopySnapshot(List<IDiagramModelObject> modelObjectsSelected) {
        // Mappings
        fOriginalToSnapshotObjectsMapping = new Hashtable<IDiagramModelObject, IDiagramModelObject>();
        fSnapshotToOriginalObjectsMapping = new Hashtable<IDiagramModelObject, IDiagramModelObject>();
        
        fSnapshotToOriginalConnectionsMapping = new Hashtable<IDiagramModelConnection, IDiagramModelConnection>();
        fOriginalToSnapshotConnectionsMapping = new Hashtable<IDiagramModelConnection, IDiagramModelConnection>();
        
        if(modelObjectsSelected == null || modelObjectsSelected.isEmpty()) {
            return;
        }
        
        // Assume that all objects belong to the same source diagram model
        IDiagramModel diagramModel = modelObjectsSelected.get(0).getDiagramModel();
        
        /*
         *  Create a new Diagram Model object snapshot based on source diagram model type.
         *  Create the instance from the registered factory to get the correct type of diagram model.
         */
        fDiagramModelSnapshot = (IDiagramModel)diagramModel.eClass().getEPackage().getEFactoryInstance().create(diagramModel.eClass());

        // Sanity check...
        for(IDiagramModelObject object : modelObjectsSelected) {
            if(object.getDiagramModel() != diagramModel) {
                System.err.println("Different diagram models in " + getClass()); //$NON-NLS-1$
                return;
            }
        }
        
        fSourceZentaModel = diagramModel.getZentaModel();
        
        // First copy objects
        List<IDiagramModelObject> objectsToCopy = getTopLevelObjectsToCopy(modelObjectsSelected);
        for(IDiagramModelObject child : objectsToCopy) {
            createSnapshotObjects(fDiagramModelSnapshot, child);
        }
        
        // Then copy connections
        List<IDiagramModelConnection> connections = getConnectionsToCopy();
        for(IDiagramModelConnection originalConnection : connections) {
            // Check with mapping for original source and target
            IDiagramModelObject newSource = fOriginalToSnapshotObjectsMapping.get(originalConnection.getSource());
            IDiagramModelObject newTarget = fOriginalToSnapshotObjectsMapping.get(originalConnection.getTarget());
            // Only add Connections that have both nodes copied as well
            if(newSource != null && newTarget != null) {
                IDiagramModelConnection newConnection = (IDiagramModelConnection)originalConnection.getCopy();
                newConnection.connect(newSource, newTarget);
                fSnapshotToOriginalConnectionsMapping.put(newConnection, originalConnection);
                fOriginalToSnapshotConnectionsMapping.put(originalConnection, newConnection);
            }
        }
    }
    
    /*
     * Iterate and make copies of objects
     */
    private void createSnapshotObjects(IDiagramModelContainer copyContainer, IDiagramModelObject originalObject) {
        IDiagramModelObject newObject = (IDiagramModelObject)originalObject.getCopy();
        copyContainer.getChildren().add(newObject);
        
        // Add to mapping
        fOriginalToSnapshotObjectsMapping.put(originalObject, newObject);
        fSnapshotToOriginalObjectsMapping.put(newObject, originalObject);
        
        if(newObject instanceof IDiagramModelContainer) {
            for(IDiagramModelObject child : ((IDiagramModelContainer)originalObject).getChildren()) {
                createSnapshotObjects((IDiagramModelContainer)newObject, child);
            }
        }
    }

    /*
     * Create a list of topmost objects to copy.
     * This will eliminate duplicate selected children and give us only the top level objects to copy.
     */
    private List<IDiagramModelObject> getTopLevelObjectsToCopy(List<IDiagramModelObject> selected) {
        List<IDiagramModelObject> objects = new ArrayList<IDiagramModelObject>();
        
        for(IDiagramModelObject object : selected) {
            if(!hasAncestorSelected(object, selected)) { // if an ancestor is selected don't add that
                objects.add(object);
            }
        }
        
        /*
         * Maintain relative Z-Order in list by original Z-order in original model
         * If each has same container parent
         */
        Collections.sort(objects, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                if(o1 instanceof IDiagramModelObject && o2 instanceof IDiagramModelObject) {
                    IDiagramModelContainer parent1 = (IDiagramModelContainer)((IDiagramModelObject)o1).eContainer();
                    IDiagramModelContainer parent2 = (IDiagramModelContainer)((IDiagramModelObject)o2).eContainer();
                    if(parent1 == parent2) {
                        int index1 = parent1.getChildren().indexOf(o1);
                        int index2 = parent2.getChildren().indexOf(o2);
                        return index1 - index2;    
                    }
                }
                return 0;
            }
        });
        
        return objects;
    }
    
    /*
     * Copy connections where both nodes are stored in Snapshot
     */
    private List<IDiagramModelConnection> getConnectionsToCopy() {
        List<IDiagramModelConnection> connections = new ArrayList<IDiagramModelConnection>();
        
        // Copy Connections that have both nodes copied as well
        for(IDiagramModelObject originalObject : fOriginalToSnapshotObjectsMapping.keySet()) {
            for(IDiagramModelConnection originalSourceConnection : originalObject.getSourceConnections()) {
                IDiagramModelObject originalTarget = originalSourceConnection.getTarget();
                if(fOriginalToSnapshotObjectsMapping.containsKey(originalTarget)) {
                    connections.add(originalSourceConnection);
                }
            }
        }
        
        return connections;
    }

    /*
     * @return True if object has an ancestor container that has been selected to be copied and pasted
     */
    private boolean hasAncestorSelected(IDiagramModelObject object, List<?> selected) {
        EObject container = object.eContainer();
        
        while(!(container instanceof IDiagramModel)) { // top level
            if(selected.contains(container)) {
                return true;
            }
            container = container.eContainer();
        }
        
        return false;
    }
    
    /**
     * @param targetDiagramModel
     * @return true if at least one copied object can be pasted to target diagram model
     */
    public boolean canPasteToDiagram(IDiagramModel targetDiagramModel) {
        if(fOriginalToSnapshotObjectsMapping.isEmpty()) {
            return false;
        }
        
        // Different diagram model types, so no...
        if(targetDiagramModel.eClass() != fDiagramModelSnapshot.eClass()) {
            return false;
        }
        
        for(IDiagramModelObject object : fSnapshotToOriginalObjectsMapping.keySet()) {
            if(isValidPasteObject(targetDiagramModel, object)) { // at least one selected object is valid
                return true;
            }
        }

        return false;
    }
    
    private boolean isValidPasteObject(IDiagramModel targetDiagramModel, IDiagramModelObject object) {
        // Can't paste IDiagramModelReference to another Zenta model
        if(object instanceof IDiagramModelReference) {
            IDiagramModel ref = ((IDiagramModelReference)object).getReferencedModel();
            for(IDiagramModel diagramModel : targetDiagramModel.getZentaModel().getDiagramModels()) {
                if(ref == diagramModel) {
                    return true;
                }
            }
            return false;
        }
        
        return true;
    }
    
    /*
     * @return True if the target diagram model already contains at least one reference to the copied Zenta Elements.
     * If this is true then we need to paste copies.
     */
    private boolean needsCopiedZentaElements(IDiagramModel targetDiagramModel) {
        // If different Zenta Models then yes!
        if(fTargetZentaModel != fSourceZentaModel) {
            return true;
        }
        
        for(IDiagramModelObject object : fOriginalToSnapshotObjectsMapping.keySet()) {
            if(object instanceof IDiagramModelZentaObject) {
                IZentaElement originalElement = ((IDiagramModelZentaObject)object).getZentaElement();
                if(originalElement == null || originalElement.eContainer() == null) { // zenta element was deleted
                    return true;
                }
                if(!DiagramModelUtils.findDiagramModelObjectsForElement(targetDiagramModel, originalElement).isEmpty()) { // already on diagram
                    return true;
                }
            }
        }
        
        for(IDiagramModelConnection connection : fOriginalToSnapshotConnectionsMapping.keySet()) {
            if(connection instanceof IDiagramModelZentaConnection) {
                IRelationship originalRelationship = ((IDiagramModelZentaConnection)connection).getRelationship();
                if(originalRelationship == null || originalRelationship.eContainer() == null) { // zenta relationship was deleted
                    return true;
                }
                if(!DiagramModelUtils.findDiagramModelConnectionsForRelation(targetDiagramModel, originalRelationship).isEmpty()) { // already on diagram
                    return true;
                }
            }
        }

        return false;
    }
    
    /**
     * @param targetDiagramModel
     * @param viewer
     * @return A Paste Command
     */
    public Command getPasteCommand(IDiagramModel targetDiagramModel, GraphicalViewer viewer, int xMousePos, int yMousePos) {
        if(targetDiagramModel == null || viewer == null) {
            return null;
        }
        
        fTargetZentaModel = targetDiagramModel.getZentaModel();
        
        // Create copies of Zenta Elements or not
        fDoCreateZentaElementCopies = needsCopiedZentaElements(targetDiagramModel);

        // Find smallest x,y origin offset to paste at
        // TODO Calculate offsets
        fXOffSet += 20;
        fYOffSet += 20;
        //calculateXYOffset(xMousePos, yMousePos);
        
        // Mapping of snapshot objects to new copy, used for connections
        Hashtable<IDiagramModelObject, IDiagramModelObject> tmpSnapshotToNewObjectMapping = new Hashtable<IDiagramModelObject, IDiagramModelObject>();
        
        CompoundCommand result = new PasteCompoundCommand(Messages.CopySnapshot_0, tmpSnapshotToNewObjectMapping, viewer);
        
        // Diagram objects first
        for(IDiagramModelObject object : fDiagramModelSnapshot.getChildren()) {
            if(isValidPasteObject(targetDiagramModel, object)) {
                createPasteObjectCommand(targetDiagramModel, object, result, tmpSnapshotToNewObjectMapping);
            }
        }

        // Then Connections
        for(IDiagramModelConnection connection : fSnapshotToOriginalConnectionsMapping.keySet()) {
            createPasteConnectionCommand(connection, result, tmpSnapshotToNewObjectMapping);
        }
        
        return result; // Don't return unwrap() as we want the CompoundCommand to execute to select the objects
    }
    
    /*
     * Create a single Paste command for an object
     */
    private void createPasteObjectCommand(IDiagramModelContainer container, IDiagramModelObject snapshotObject,
                                        CompoundCommand result, Hashtable<IDiagramModelObject, IDiagramModelObject> tmpSnapshotToNewObjectMapping) {
        
        IDiagramModelObject newObject = (IDiagramModelObject)snapshotObject.getCopy();
        
        // Offset top level objects
        if(container instanceof IDiagramModel) {
            IBounds bounds = newObject.getBounds();
            bounds.setX(bounds.getX() + fXOffSet);
            bounds.setY(bounds.getY() + fYOffSet);
        }
        
        if(newObject instanceof IDiagramModelZentaObject) {
            IDiagramModelZentaObject dmo = (IDiagramModelZentaObject)newObject;
            // Use a copy so provide a new name
            if(fDoCreateZentaElementCopies) {
                String name = dmo.getZentaElement().getName();
                dmo.getZentaElement().setName(name + " " + Messages.CopySnapshot_1); //$NON-NLS-1$
            }
            // Else re-use original ZentaMate element
            else {
                IDiagramModelZentaObject originalDiagramObject = (IDiagramModelZentaObject)fSnapshotToOriginalObjectsMapping.get(snapshotObject);
                IZentaElement element = originalDiagramObject.getZentaElement();
                dmo.setZentaElement(element);
            }
        }
        
        // Mapping
        tmpSnapshotToNewObjectMapping.put(snapshotObject, newObject);
        
        // New diagram object Command
        result.add(new PasteDiagramObjectCommand(container, newObject, fDoCreateZentaElementCopies));
        
        // Container
        if(snapshotObject instanceof IDiagramModelContainer) {
            for(IDiagramModelObject child : ((IDiagramModelContainer)snapshotObject).getChildren()) {
                createPasteObjectCommand((IDiagramModelContainer)newObject, child, result, tmpSnapshotToNewObjectMapping);
            }
        }
    }

    /*
     * Create a single Paste command for a connection
     */
    private void createPasteConnectionCommand(IDiagramModelConnection snapshotConnection, CompoundCommand result,
                                            Hashtable<IDiagramModelObject, IDiagramModelObject> tmpSnapshotToNewObjectMapping) {
        // Check with mapping for original source and target
        IDiagramModelObject newSource = tmpSnapshotToNewObjectMapping.get(snapshotConnection.getSource());
        IDiagramModelObject newTarget = tmpSnapshotToNewObjectMapping.get(snapshotConnection.getTarget());
        // Only add Connections that have both nodes copied as well
        if(newSource != null && newTarget != null) {
            IDiagramModelConnection newConnection = (IDiagramModelConnection)snapshotConnection.getCopy();
            
            // Re-use original Zenta relationship
            if(!fDoCreateZentaElementCopies && snapshotConnection instanceof IDiagramModelZentaConnection) {
                IDiagramModelZentaConnection originalDiagramConnection = (IDiagramModelZentaConnection)fSnapshotToOriginalConnectionsMapping.get(snapshotConnection);
                IRelationship relationship = originalDiagramConnection.getRelationship();
                ((IDiagramModelZentaConnection)newConnection).setRelationship(relationship);
            }
            
            result.add(new PasteDiagramConnectionCommand(newConnection, newSource, newTarget, fDoCreateZentaElementCopies));
        }
    }

    /**
     * Find smallest x,y origin offset to paste at
     * @param selected
     */
    @SuppressWarnings("unused")
    private void calculateXYOffset(int xMousePos, int yMousePos) {
        /*
         * TODO - Get this calculation working
         */
        if(xMousePos == -1) {
            fXOffSet = 0;
            fYOffSet = 0;
        }
        else {
            int smallest_x = -1, smallest_y = -1;

            for(IDiagramModelObject dmo : fOriginalToSnapshotObjectsMapping.keySet()) {
                int x = dmo.getBounds().getX();
                int y = dmo.getBounds().getY();
                if(smallest_x == -1 || x < smallest_x) {
                    smallest_x = x;
                }
                if(smallest_y == -1 || y < smallest_y) {
                    smallest_y = y;
                }
            }

            fXOffSet = xMousePos - smallest_x;
            fYOffSet = yMousePos - smallest_y;
        }
    }
    
    // ================================================================================================================
    // Commands
    // ================================================================================================================

    /*
     * Compound Command
     */
    private static class PasteCompoundCommand extends NonNotifyingCompoundCommand {
        private GraphicalViewer fViewer;
        private Hashtable<IDiagramModelObject, IDiagramModelObject> tempOriginalToNewMapping;
        
        public PasteCompoundCommand(String title,  Hashtable<IDiagramModelObject, IDiagramModelObject> tempOriginalToNewMapping, GraphicalViewer viewer) {
            super(title);
            this.tempOriginalToNewMapping = tempOriginalToNewMapping;
            fViewer = viewer;
        }

        @Override
        public void execute() {
            super.execute();
            
            // Select the new objects
            selectNewObjects();
        }
        
        @Override
        public void redo() {
            super.redo();
            
            // Select the new objects
            selectNewObjects();
        }
        
        private void selectNewObjects() {
            List<EditPart> selected = new ArrayList<EditPart>();
            for(Enumeration<IDiagramModelObject> enm = tempOriginalToNewMapping.elements(); enm.hasMoreElements();) {
                IDiagramModelObject object = enm.nextElement();
                EditPart editPart = (EditPart)fViewer.getEditPartRegistry().get(object);
                if(editPart != null && editPart.isSelectable()) {
                    selected.add(editPart);
                }
            }
            
            fViewer.setSelection(new StructuredSelection(selected));
        }
        
        @Override
        public void dispose() {
            super.dispose();
            fViewer = null;
            tempOriginalToNewMapping = null;
        }
    }
    
    /*
     * Paste Diagram Object Command
     */
    private static class PasteDiagramObjectCommand extends Command {
        private IDiagramModelContainer fParent; // Target Parent Container
        private IDiagramModelObject fNewDiagramObject; // New copy
        private boolean fDoCreateZentaElement;
        
        public PasteDiagramObjectCommand(IDiagramModelContainer parent, IDiagramModelObject modelObject, boolean doCreateZentaElement) {
            fParent = parent;
            fNewDiagramObject = modelObject;
            fDoCreateZentaElement = doCreateZentaElement;
        }
        
        @Override
        public void execute() {
            // This first
            fParent.getChildren().add(fNewDiagramObject);
            
            // If it's an Zenta model type then add the Zenta model object to a default folder
            if(fNewDiagramObject instanceof IDiagramModelZentaObject && fDoCreateZentaElement) {
                ((IDiagramModelZentaObject)fNewDiagramObject).addZentaElementToModel(null);
            }
        }
        
        @Override
        public void undo() {
            fParent.getChildren().remove(fNewDiagramObject);
            
            // If it's an Zenta model type then remove the Zenta model object from its containing folder
            if(fNewDiagramObject instanceof IDiagramModelZentaObject && fDoCreateZentaElement) {
                ((IDiagramModelZentaObject)fNewDiagramObject).removeZentaElementFromModel();
            }
        }
        
        @Override
        public void dispose() {
            fParent = null;
            fNewDiagramObject = null;
        }
    }
    
    /*
     * Paste Diagram Connection Command
     */
    private static class PasteDiagramConnectionCommand extends Command {
        private IDiagramModelConnection fConnection;
        private IDiagramModelObject fSource;
        private IDiagramModelObject fTarget;
        private boolean fDoCreateZentaElement;
        
        public PasteDiagramConnectionCommand(IDiagramModelConnection connection, IDiagramModelObject source,
                IDiagramModelObject target, boolean doCreateZentaElement) {
            fConnection = connection;
            fSource = source;
            fTarget = target;
            fDoCreateZentaElement = doCreateZentaElement;
        }

        @Override
        public void execute() {
            fConnection.connect(fSource, fTarget);
            
            // If it's an Zenta model type Add relationship to default folder
            if(fConnection instanceof IDiagramModelZentaConnection && fDoCreateZentaElement) {
                ((IDiagramModelZentaConnection)fConnection).addRelationshipToModel(null);
            }
        }
        
        @Override
        public void undo() {
            fConnection.disconnect(); // have to do this
            
            // If it's an Zenta model type remove relationship from folder
            if(fConnection instanceof IDiagramModelZentaConnection && fDoCreateZentaElement) {
                ((IDiagramModelZentaConnection)fConnection).removeRelationshipFromModel();
            }
        }
        
        @Override
        public void redo() {
            fConnection.reconnect(); // have to do this
            
            // If it's an Zenta model type Add relationship to default folder
            if(fConnection instanceof IDiagramModelZentaConnection && fDoCreateZentaElement) {
                ((IDiagramModelZentaConnection)fConnection).addRelationshipToModel(null);
            }
        }
        
        @Override
        public void dispose() {
            fConnection = null;
            fSource = null;
            fTarget = null;
        }
    }
    

}
