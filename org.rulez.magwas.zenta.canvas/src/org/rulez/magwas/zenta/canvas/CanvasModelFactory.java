/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorPart;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelBlock;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelConnection;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelImage;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelSticky;
import org.rulez.magwas.zenta.editor.diagram.ICreationFactory;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.model.IFontAttribute;



/**
 * Model Factory for creating objects from the Palette in the Canvas Editor
 * 
 * @author Phillip Beauvoir
 */
public class CanvasModelFactory implements ICreationFactory {
    
    private EClass fTemplate;
    private Object fParam;
    
    public CanvasModelFactory(EClass template) {
        this(template, null);
    }
    
    /**
     * Constructor for creating a new Ecore type model with a parameter
     * @param eClass
     * @param param
     */
    public CanvasModelFactory(EClass template, Object param) {
        fTemplate = template;
        fParam = param;
    }
    
    public boolean isUsedFor(IEditorPart editor) {
        return editor instanceof ICanvasEditor;
    }
    
    public Object getNewObject() {
        // Create the instance from the registered factory in case of extensions
        Object object = fTemplate.getEPackage().getEFactoryInstance().create(fTemplate);
        
        // Sticky
        if(object instanceof ICanvasModelSticky) {
            ICanvasModelSticky sticky = (ICanvasModelSticky)object;
            sticky.setTextPosition(IFontAttribute.TEXT_POSITION_MIDDLE_CENTRE);
            if(fParam instanceof Color) {
                String color = ColorFactory.convertRGBToString(((Color)fParam).getRGB());
                sticky.setFillColor(color);
            }
            sticky.setBorderColor("#C0C0C0"); //$NON-NLS-1$
        }
        
        // Block
        else if(object instanceof ICanvasModelBlock) {
            ICanvasModelBlock block = (ICanvasModelBlock)object;
            block.setTextPosition(IFontAttribute.TEXT_POSITION_TOP_LEFT);
            block.setBorderColor("#000000"); //$NON-NLS-1$
        }
        
        // Image
        else if(object instanceof ICanvasModelImage) {
            ICanvasModelImage image = (ICanvasModelImage)object;
            image.setBorderColor("#000000"); //$NON-NLS-1$
        }
        
        // Canvas Connection
        else if(object instanceof ICanvasModelConnection) {
            ICanvasModelConnection connection = (ICanvasModelConnection)object;
            if(fParam instanceof Integer) {
                connection.setType((Integer)fParam);
            }
        }
        
        return object;
    }

    public Object getObjectType() {
        return fTemplate;
    }
}
