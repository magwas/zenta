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
import org.rulez.magwas.zenta.metamodel.IObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.model.IFolder;



/**
 * Diagram Model Factory for creating objects from the Palette in the Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class MagicConnectionModelFactory implements ICreationFactory {
    
    private IRelationClass fRelationshipTemplate;
    private IObjectClass fElementTemplate;
	private IFolder folder;
    
    public MagicConnectionModelFactory(IFolder parentfolder) {
    	folder = parentfolder;
    }
    public boolean isUsedFor(IEditorPart editor) {
        return editor instanceof IZentaDiagramEditor;
    }
    
    public void setRelationshipType(IRelationClass relationshipType) {
        fRelationshipTemplate = relationshipType;
    }
    
    public void setElementType(IObjectClass type) {
        fElementTemplate = type;
    }
    
    public IRelationClass getRelationshipType() {
        return fRelationshipTemplate;
    }
    
    public IObjectClass getElementType() {
        return fElementTemplate;
    }
    
    public Object getNewObject() {
        return new ZentaDiagramModelFactory(fRelationshipTemplate,folder).getNewObject();
    }

    public Object getObjectType() {
        return fRelationshipTemplate;
    }
    
    public void clear() {
        fRelationshipTemplate = null;
        fElementTemplate = null;
    }
}
