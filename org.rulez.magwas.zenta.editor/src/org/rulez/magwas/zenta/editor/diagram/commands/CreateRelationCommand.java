/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
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
    private RelationClass fType;
    
    private IFolder fFolder;
    private IRelationship fRelation;
    
    public CreateRelationCommand(IZentaElement parent, IZentaElement child, RelationClass type) {
        fParent = parent;
        fChild = child;
        fType = type;
    }
    
    @Override
    public void execute() {
    	
        fRelation = fType.create();
        fRelation.setSource(fParent);
        fRelation.setTarget(fChild);
        fFolder = fChild.getZentaModel().getDefaultFolderForElement(fRelation);

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