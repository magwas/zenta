/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateFactory;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Create Relationship between two elements
 * 
 * @author Phillip Beauvoir
 */
public class CreateRelationCommand extends Command {
    
    private IZentamateElement fParent;
    private IZentamateElement fChild;
    private EClass fType;
    
    private IFolder fFolder;
    private IRelationship fRelation;
    
    public CreateRelationCommand(IZentamateElement parent, IZentamateElement child, EClass type) {
        fParent = parent;
        fChild = child;
        fType = type;
    }
    
    @Override
    public void execute() {
        fRelation = (IRelationship)IZentamateFactory.eINSTANCE.create(fType);
        fRelation.setSource(fParent);
        fRelation.setTarget(fChild);
        fFolder = fChild.getZentamateModel().getDefaultFolderForElement(fRelation);

        redo();
    }

    @Override
    public void undo() {
        if(fFolder != null) {
            fFolder.getElements().remove(fRelation);
        }
    }
    
    @Override
    public void redo() {
        if(fFolder != null) {
            fFolder.getElements().add(fRelation);
        }
    }
    
    /**
     * @return The Relationship that was created
     */
    IRelationship getRelationshipCreated() {
        return fRelation;
    }
    
    @Override
    public void dispose() {
        fParent = null;
        fChild = null;
        fFolder = null;
        fRelation = null;
        fType = null;
    }
}