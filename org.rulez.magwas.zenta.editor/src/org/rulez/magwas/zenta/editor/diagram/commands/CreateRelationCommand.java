/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.IFolder;



/**
 * Create Relationship between two elements
 * 
 * @author Phillip Beauvoir
 */
public class CreateRelationCommand extends Command {
    
    private IZentaElement fParent;
    private IZentaElement fChild;
    private IBasicRelationship fType;
    
    private IFolder fFolder;
    private IBasicRelationship fRelation;
    
    public CreateRelationCommand(IZentaElement parent, IZentaElement child, IBasicRelationship type) {
        fParent = parent;
        fChild = child;
        fType = type;
    }
    
    @Override
    public void execute() {
    	
    	IFolder folder = (IFolder) fParent.eContainer();
    	fRelation = ZentaModelUtils.createChildRelation(fType, folder, "", fParent, fChild);
        fFolder = folder;

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
    IBasicRelationship getRelationshipCreated() {
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