package org.rulez.magwas.zenta.controller;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.controller.info.ElementInfoFactory;
import org.rulez.magwas.zenta.controller.info.InfoProviderExtensionHandler;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;

public class InfoProvider implements IInfoProvider{//FIXME NonNull

	public InfoProvider() {
		super();
	}

    public static InfoProvider INSTANCE = new InfoProvider();

	@Override
	public String getLabel(EObject element) {
	    if(element == null) {
	        return ""; //$NON-NLS-1$
	    }
	    
	    String name = null;
	    
	    if(element instanceof INameable) {
	        name = ((INameable)element).getName();
	    }
	    
	    if(!StringUtils.isSet(name) && element instanceof EObject) {
	        name = getDefaultName(((EObject)element).eClass());
	    }
	    
	    if(StringUtils.isSet(name)) {
	        return name;
	    }
	    
	    if(element instanceof IZentaDiagramModel) {
	        return Messages.ZentaLabelProvider_0;
	    }
	    else if(element instanceof ISketchModel) {
	        return Messages.ZentaLabelProvider_1;
	    }
	    else if(element instanceof IDiagramModelImage) {
	        return Messages.ZentaLabelProvider_2;
	    }
	
	    if(!StringUtils.isSet(name)) {
	        name = InfoProviderExtensionHandler.INSTANCE.getLabel(element);
	    }
	    
	    return StringUtils.safeString(name);
	}

	protected String getImageName(EClass eClass) {
	    switch(eClass.getClassifierID()) {
	        case IZentaPackage.ZENTA_MODEL:
	            return IZentaImages.ICON_MODELS_16;
	        case IZentaPackage.ZENTA_DIAGRAM_MODEL:
	            return IZentaImages.ICON_DIAGRAM_16;
	        case IZentaPackage.FOLDER:
	            return IZentaImages.ECLIPSE_IMAGE_FOLDER;
	        case IZentaPackage.SKETCH_MODEL:
	            return IZentaImages.ICON_SKETCH_16;
	    }
	    
	    return null;
	}

	public String getDefaultName(EObject element) {
        if(!(element instanceof EClass)) {
        	element = element.eClass();
        }
	    IElementInfoProvider provider = ElementInfoFactory.INSTANCE.getProvider((EClass) element);
	    if(provider != null) {
	        return provider.getDefaultName();
	    }
        String name = InfoProviderExtensionHandler.INSTANCE.getLabel(element);
        if (name != null) {
        	return name;
        }

	    return ""; //$NON-NLS-1$
	}

	public String getDefaultShortName(EObject element) {
        if(!(element instanceof EClass)) {
        	element = element.eClass();
        }  
	    IElementInfoProvider provider = ElementInfoFactory.INSTANCE.getProvider((EClass) element);
	    if(provider != null) {
	        return provider.getDefaultShortName();
	    }
        String shortName = InfoProviderExtensionHandler.INSTANCE.getLabel(element);
        if (shortName != null) {
        	return shortName;
        }

	    return ""; //$NON-NLS-1$
	}

	public String getRelationshipSentence(IBasicRelationship relation) {
	    if(relation != null) {
	        String nameSource = InfoProvider.INSTANCE.getLabel(relation.getSource());
	        String nameTarget = InfoProvider.INSTANCE.getLabel(relation.getTarget());
	        IBasicObject klass = relation.getDefiningElement();
	        String relname = klass.getName();
	        return String.format("%s %s %s", nameSource, relname, nameTarget);
	    }
	    
	    return ""; //$NON-NLS-1$
	}


	protected String getimageInfo(IBasicObject obj) {
		if (!obj.isTemplate())
			obj = obj.getAncestor();
		EClass eClass = obj.eClass();
		String imageName = getImageInfo(eClass);
		return imageName;
	}

	@Override
	public String getImageInfo(EObject element) {
		String imageName = null;
        if(element == null) {
            return null;
        }
        if(!(element instanceof EClass)) {
        	element = element.eClass();
        }  
		IElementInfoProvider provider = ElementInfoFactory.INSTANCE.getProvider((EClass) element);
		if (provider != null) {
			imageName = provider.getImageInfo();				
		}
        if (imageName == null) {
            imageName = InfoProviderExtensionHandler.INSTANCE.getImageInfo(element);
        }
		return imageName;
	}

}