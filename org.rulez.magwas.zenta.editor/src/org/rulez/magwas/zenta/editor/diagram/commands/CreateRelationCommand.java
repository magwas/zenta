/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Create Relationship between two elements
 * 
 * @author Phillip Beauvoir
 */
public class CreateRelationCommand extends Command {
    
    private IZentaElement fParent;
    private IZentaElement fChild;
    private IRelationClass fType;
    
    private IFolder fFolder;
    private IRelationship fRelation;
    
    public CreateRelationCommand(IZentaElement parent, IZentaElement child, IRelationClass type) {
        fParent = parent;
        fChild = child;
        fType = type;
    }
    
    @Override
    public void execute() {
    	IFolder folder = (IFolder) fParent.eContainer();
        fRelation = (IRelationship) fType.create(folder);
        fRelation.setSource(fParent);
        fRelation.setTarget(fChild);
        fFolder = (IFolder) fParent.eContainer();

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