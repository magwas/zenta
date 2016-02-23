package org.rulez.magwas.zenta.canvas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.canvas.model.ICanvasModel;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelBlock;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelConnection;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelImage;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelSticky;
import org.rulez.magwas.zenta.canvas.model.ICanvasPackage;
import org.rulez.magwas.zenta.editor.ui.IEditorLabelProvider;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.model.info.IZentaImages;

public class CanvasLabelProvider implements IEditorLabelProvider {
    
    public static CanvasLabelProvider INSTANCE = new CanvasLabelProvider();

    @Override
    public String getLabel(EObject element) {
        if(element == null) {
            return ""; //$NON-NLS-1$
        }
        
        // Get Name
        if(element instanceof INameable) {
            String name = ((INameable)element).getName();
            if(StringUtils.isSet(name)) {
                return name;
            }
        }
        
        // Defaults for empty strings
        if(element instanceof ICanvasModelImage) {
            return Messages.CanvasLabelProvider_0;
        }
        else if(element instanceof ICanvasModelBlock) {
            return Messages.CanvasLabelProvider_1;
        }
        else if(element instanceof ICanvasModelSticky) {
            return Messages.CanvasLabelProvider_2;
        }
        else if(element instanceof ICanvasModel) {
            return Messages.CanvasLabelProvider_3;
        }
        else if(element instanceof ICanvasModelConnection) {
            return Messages.CanvasLabelProvider_4;
        }
        
        return ""; //$NON-NLS-1$
    }

    @Override
    public Image getImage(EObject element) {
    	return ICanvasImages.ImageFactory.getImage(getImageInfo(element));
    }

    public Image getEClassImage(EClass eClass) {
    	return ICanvasImages.ImageFactory.getImage(getEClassImageInfo(eClass));
    }

	@Override
	public String getImageInfo(EObject element) {
        // This first, since EClass is an EObject
        if(element instanceof EClass) {
            return getEClassImageInfo((EClass)element);
        }
        if(element instanceof EObject) {
            return getEClassImageInfo(((EObject)element).eClass());
        }
        
        return null;
	}

	private String getEClassImageInfo(EClass eClass) {
        switch(eClass.getClassifierID()) {
	        case ICanvasPackage.CANVAS_MODEL:
	            return ICanvasImages.ICON_CANVAS_MODEL_16;
	        case ICanvasPackage.CANVAS_MODEL_BLOCK:
	            return ICanvasImages.ICON_CANVAS_BLOCK_16;
	        case ICanvasPackage.CANVAS_MODEL_STICKY:
	            return ICanvasImages.ICON_CANVAS_STICKY_16;
	        case ICanvasPackage.CANVAS_MODEL_IMAGE:
	            return IZentaImages.ICON_LANDSCAPE_16;
	        case ICanvasPackage.CANVAS_MODEL_CONNECTION:
	            return IZentaImages.ICON_CONNECTION_ARROW_16;
        }
        return null;
	}

}
