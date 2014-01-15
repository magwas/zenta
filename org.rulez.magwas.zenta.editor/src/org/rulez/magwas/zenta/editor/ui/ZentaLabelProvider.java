/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.factory.ElementUIFactory;
import org.rulez.magwas.zenta.editor.ui.factory.IElementUIProvider;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.util.StringUtils;



/**
 * Main Label Provider for Zenta Editor
 * 
 * @author Phillip Beauvoir
 */
public class ZentaLabelProvider implements IEditorLabelProvider {
    
    public static ZentaLabelProvider INSTANCE = new ZentaLabelProvider();

    /**
     * @return A default name for an element.<br>
     *         This will be the element's name if of type INameable or the default Zenta name if an Zenta EObject,
     *         or a default name if blank.
     */
    @Override
    public String getLabel(Object element) {
        if(element == null) {
            return ""; //$NON-NLS-1$
        }
        
        String name = null;
        
        // Get Name
        if(element instanceof INameable) {
            name = ((INameable)element).getName();
        }
        
        // It's blank. Can we get a default name from its class?
        if(!StringUtils.isSet(name) && element instanceof EObject) {
            name = getDefaultName(((EObject)element).eClass());
        }
        
        // Yes
        if(StringUtils.isSet(name)) {
            return name;
        }
        
        // Defaults for empty strings
        if(element instanceof IZentaDiagramModel) {
            return Messages.ZentaLabelProvider_0;
        }
        else if(element instanceof ISketchModel) {
            return Messages.ZentaLabelProvider_1;
        }
        else if(element instanceof IDiagramModelImage) {
            return Messages.ZentaLabelProvider_2;
        }
       
        // If it's blank try registered extensions
        if(!StringUtils.isSet(name)) {
            name = LabelProviderExtensionHandler.INSTANCE.getLabel(element);
        }
        
        return StringUtils.safeString(name);
    }

    @Override
    public Image getImage(Object element) {
        if(element == null) {
            return null;
        }
        
        Image image = null;
        
        // This first, since EClass is an EObject
        if(element instanceof EClass) {
            image = getEClassImage((EClass)element);
        }
        else if(element instanceof EObject) {
            image = getObjectImage(((EObject)element));
        }
        
        // Try registered extensions
        if(image == null) {
            image = LabelProviderExtensionHandler.INSTANCE.getImage(element);
        }
        
        return image;
    }
    
    /**
     * @return An Image for an EObject instance
     */
    private Image getObjectImage(EObject eObject) {
        IElementUIProvider provider = ElementUIFactory.INSTANCE.getProvider(eObject.eClass());
        if(provider != null) {
            return provider.getImage(eObject);
        }
        
        return getEClassImage(eObject.eClass());
    }
    
    /**
     * @return An Image for an EClass
     */
    private Image getEClassImage(EClass eClass) {
        IElementUIProvider provider = ElementUIFactory.INSTANCE.getProvider(eClass);
        if(provider != null) {
            return provider.getImage();
        }
        
        String imageName = getImageName(eClass);
        if(imageName != null) {
            return IZentaImages.ImageFactory.getImage(imageName);
        }
        
        return null;
    }

    /**
     * @param eClass
     * @return An ImageDescriptor for an EClass
     */
    public ImageDescriptor getImageDescriptor(EClass eClass) {
        IElementUIProvider provider = ElementUIFactory.INSTANCE.getProvider(eClass);
        if(provider != null) {
            return provider.getImageDescriptor();
        }
        
        String imageName = getImageName(eClass);
        if(imageName != null) {
            return IZentaImages.ImageFactory.getImageDescriptor(imageName);
        }
        
        return null;
    }
    
    private String getImageName(EClass eClass) {
        switch(eClass.getClassifierID()) {
            // Other
            case IZentaPackage.ZENTA_MODEL:
                return IZentaImages.ICON_MODELS_16;
            case IZentaPackage.ZENTA_DIAGRAM_MODEL:
                return IZentaImages.ICON_DIAGRAM_16;
            case IZentaPackage.FOLDER:
                return IZentaImages.ECLIPSE_IMAGE_FOLDER;
            
            // Sketch
            case IZentaPackage.SKETCH_MODEL:
                return IZentaImages.ICON_SKETCH_16;
        }
        
        return null;
    }
    
    /**
     * Get a default human-readable name for an EClass
     * @param eClass The Class
     * @return A name or null
     */
    public String getDefaultName(EClass eClass) {
        IElementUIProvider provider = ElementUIFactory.INSTANCE.getProvider(eClass);
        if(provider != null) {
            return provider.getDefaultName();
        }
        
        return ""; //$NON-NLS-1$
    }
    
    /**
     * Get a default human-readable short name for an EClass
     * @param eClass The Class
     * @return A name or null
     */
    public String getDefaultShortName(EClass eClass) {
        IElementUIProvider provider = ElementUIFactory.INSTANCE.getProvider(eClass);
        if(provider != null) {
            return provider.getDefaultShortName();
        }
        
        return ""; //$NON-NLS-1$
    }

    /**
     * @param relation
     * @return A sentence that describes the relationship between the relationship's source and target elements
     */
    public String getRelationshipSentence(IBasicRelationship relation) {
        if(relation != null) {
            if(relation.getSource() != null && relation.getTarget() != null) {
                String nameSource = ZentaLabelProvider.INSTANCE.getLabel(relation.getSource());
                String nameTarget = ZentaLabelProvider.INSTANCE.getLabel(relation.getTarget());
                IMetamodel metamodel = IZentaFactory.eINSTANCE.getMetamodelFor(relation.getZentaModel());
                IReferencesModelObject klass = metamodel.getClassOf(relation);
                String relname;
				if(null != klass)
                	relname = klass.getName();
                else
                	relname = "relates to";
                return String.format("%s %s %s", nameSource, relname, nameTarget);
            }
        }
        
        return ""; //$NON-NLS-1$
    }

	public ImageDescriptor getImageDescriptor(IReferencesModelObject eClass) {
		IIdentifier reference = eClass.getReference();
		if(null == reference)
			reference = IZentaFactory.eINSTANCE.createBasicObject();
		return ZentaLabelProvider.INSTANCE.getImageDescriptor(reference.eClass());
	}

}
