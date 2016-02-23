
package org.rulez.magwas.zenta.editor.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.info.InfoProvider;

public class ZentaLabelProvider extends InfoProvider implements IEditorLabelProvider {
    
    public static ZentaLabelProvider INSTANCE = new ZentaLabelProvider();

	@Override
    public Image getImage(EObject element) {//FIXME pull up model logic
        String imageName = getImageInfo(element);
        Image image = null;
        if(imageName != null) {
        	image = IZentaUIImages.ImageFactory.getImage(imageName);
        	if(image == null) {
                image = LabelProviderExtensionHandler.INSTANCE.getImage(element);
        	}
        }
        return image;
    }
    

    public ImageDescriptor getImageDescriptor(IBasicObject obj) {
		String imageName = getimageInfo(obj);
		if(imageName != null) {
		    return IZentaUIImages.ImageFactory.getImageDescriptor(imageName);
		}
		
		return null;
	}

    public ImageDescriptor getImageDescriptorNonTemplate(EClass eClass) {        
        String imageName = getImageInfo(eClass);
        if(imageName != null) {
            return IZentaUIImages.ImageFactory.getImageDescriptor(imageName);
        }
        
        return null;
    }

}
