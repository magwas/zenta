/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.tools;

import org.eclipse.ui.IEditorPart;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramModelFactory;
import org.rulez.magwas.zenta.editor.diagram.IZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.ICreationFactory;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;



/**
 * Diagram Model Factory for creating objects from the Palette in the Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class MagicConnectionModelFactory implements ICreationFactory {
    
    private IBasicRelationship fRelationshipTemplate;
    private IBasicObject fElementTemplate;
	private IFolder folder;
    
    public MagicConnectionModelFactory(IFolder parentfolder) {
    	folder = parentfolder;
    }
    public boolean isUsedFor(IEditorPart editor) {
        return editor instanceof IZentaDiagramEditor;
    }
    
    public void setRelationshipType(IBasicRelationship relationshipType) {
        fRelationshipTemplate = relationshipType;
    }
    
    public void setElementType(IBasicObject type) {
        fElementTemplate = type;
    }
    
    public IBasicRelationship getRelationshipType() {
        return fRelationshipTemplate;
    }
    
    public IBasicObject getElementType() {
        return fElementTemplate;
    }
    
    public Object getNewObject() {
    	System.out.printf("object is created\n");
        return new ZentaDiagramModelFactory(fRelationshipTemplate,folder).getNewObject();
    }

    public Object getObjectType() {
    	System.out.printf("getNewObjectType %s in %s\n", fRelationshipTemplate, this);
        return fRelationshipTemplate;
    }
    
    public void clear() {
        //fRelationshipTemplate = null;
        //fElementTemplate = null;
    }
}
