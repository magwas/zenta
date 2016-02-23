package org.rulez.magwas.zenta.editor.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.model.info.IInfoProvider;
import org.rulez.magwas.zenta.model.util.LogUtil;

public class LabelProviderExtensionHandler {//FIXME: refactor with InfoProviderExtensionHandler
    
    private LabelProviderExtensionHandler() {
        registerProviders();
    }
    
	public static String EXTENSIONPOINT = "org.rulez.magwas.zenta.editor.labelProvider";
	public static LabelProviderExtensionHandler INSTANCE = new LabelProviderExtensionHandler();
	private List<IEditorLabelProvider> factories = new ArrayList<IEditorLabelProvider>();

	public List<IEditorLabelProvider> getRegisteredProviders() {
	    return factories;
	}

    public Image getImage(EObject element) {
        for(IEditorLabelProvider provider : getRegisteredProviders()) {
            Image image = provider.getImage(element);
            if(image != null) {
                return image;
            }
        }
        
        return null;
    }
    public String getImageInfo(EObject element) {
        for(IInfoProvider provider : getRegisteredProviders()) {
            String imageInfo = provider.getImageInfo(element);
            if(imageInfo != null) {
                return imageInfo;
            }
        }
        return null;
    }

    protected void registerProviders() {
	    IExtensionRegistry registry = Platform.getExtensionRegistry();
	    for(IConfigurationElement configurationElement : registry.getConfigurationElementsFor(EXTENSIONPOINT)) {
	        try {
	            String id = configurationElement.getAttribute("id"); //$NON-NLS-1$
	            IEditorLabelProvider provider = (IEditorLabelProvider)configurationElement.createExecutableExtension("class"); //$NON-NLS-1$
	            if(id != null && provider != null) {
	                factories.add(provider);
	            }
	        } 
	        catch(CoreException ex) {
	            LogUtil.logException(ex);
	        } 
	    }
	}

}
