package org.rulez.magwas.zenta.model.info;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.util.LogUtil;

public class InfoProviderExtensionHandler {

	public static String EXTENSIONPOINT = "org.rulez.magwas.zenta.model.labelProvider";
	public static InfoProviderExtensionHandler INSTANCE = new InfoProviderExtensionHandler();
	private List<IInfoProvider> factories = new ArrayList<IInfoProvider>();

	public InfoProviderExtensionHandler() {
		super();
		registerProviders();
	}

	public List<IInfoProvider> getRegisteredProviders() {
	    return factories;
	}

	protected void registerProviders() {
	    IExtensionRegistry registry = Platform.getExtensionRegistry();
	    for(IConfigurationElement configurationElement : registry.getConfigurationElementsFor(EXTENSIONPOINT)) {
	        try {
	            String id = configurationElement.getAttribute("id"); //$NON-NLS-1$
	            IInfoProvider provider = (IInfoProvider)configurationElement.createExecutableExtension("class"); //$NON-NLS-1$
	            if(id != null && provider != null) {
	                factories.add(provider);
	            }
	        } 
	        catch(CoreException ex) {
	            LogUtil.logException(ex);
	        } 
	    }
	}

	public String getLabel(EObject element) {
	    for(IInfoProvider provider : getRegisteredProviders()) {
	        String label = provider.getLabel(element);
	        if(label != null) {
	            return label;
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

}