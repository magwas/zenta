/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.tools;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ui.IEditorPart;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramModelFactory;
import org.rulez.magwas.zenta.editor.diagram.IZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.ICreationFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;



/**
 * Diagram Model Factory for creating objects from the Palette in the Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class MagicConnectionModelFactory implements ICreationFactory {
    
    private RelationClass fRelationshipTemplate;
    private ObjectClass fElementTemplate;
    
    public boolean isUsedFor(IEditorPart editor) {
        return editor instanceof IZentaDiagramEditor;
    }
    
    public void setRelationshipType(RelationClass relationshipType) {
        fRelationshipTemplate = relationshipType;
    }
    
    public void setElementType(ObjectClass type) {
        fElementTemplate = type;
    }
    
    public RelationClass getRelationshipType() {
        return fRelationshipTemplate;
    }
    
    public ObjectClass getElementType() {
        return fElementTemplate;
    }
    
    public Object getNewObject() {
        return new ZentaDiagramModelFactory(fRelationshipTemplate).getNewObject();
    }

    public Object getObjectType() {
        return fRelationshipTemplate;
    }
    
    public void clear() {
        fRelationshipTemplate = null;
        fElementTemplate = null;
    }
}
