/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.sketch;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorPart;
import org.rulez.magwas.zenta.editor.diagram.ConnectionAndFolder;
import org.rulez.magwas.zenta.editor.diagram.ICreationFactory;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.ISketchModelActor;
import org.rulez.magwas.zenta.model.ISketchModelSticky;



/**
 * Sketch Model Factory for creating objects from the Palette in the Sketch Editor
 * 
 * @author Phillip Beauvoir
 */
public class SketchModelFactory implements ICreationFactory {
    
    private EClass fTemplate;
    private Object fParam;
    
    public SketchModelFactory(EClass template) {
        this(template, null);
    }
    
    public boolean isUsedFor(IEditorPart editor) {
        return editor instanceof ISketchEditor;
    }
    
    /**
     * Constructor for creating a new Ecore type model with a parameter
     * @param eClass
     * @param param
     */
    public SketchModelFactory(EClass template, Object param) {
        fTemplate = template;
        fParam = param;
    }
    
    public Object getNewObject() {
        Object object = IZentaFactory.eINSTANCE.create(fTemplate);
        
        // Actor
        if(object instanceof ISketchModelActor) {
            ((ISketchModelActor)object).setName(Messages.SketchModelFactory_0);
        }
        
        // Sticky
        else if(object instanceof ISketchModelSticky) {
            ((ISketchModelSticky)object).setName(Messages.SketchModelFactory_1);
            if(fParam instanceof Color) {
                String color = ColorFactory.convertRGBToString(((Color)fParam).getRGB());
                ((ISketchModelSticky)object).setFillColor(color);
            }
        }
            
        // Connection
        else if(object instanceof IDiagramModelConnection) {
            if(fParam instanceof Integer) {
                ((IDiagramModelConnection)object).setType((Integer)fParam);
            }
        	ConnectionAndFolder r = new ConnectionAndFolder((IBasicRelationship)null, (IFolder) null, (IDiagramModelConnection)object);
            return r;

        }
        
        return object;
    }

    public Object getObjectType() {
        return fTemplate;
    }
}
