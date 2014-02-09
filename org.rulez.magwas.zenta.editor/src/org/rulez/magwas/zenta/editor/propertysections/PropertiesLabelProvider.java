/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.propertysections;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;



/**
 * Properties Label Provider
 * 
 * @author Phillip Beauvoir
 */
public class PropertiesLabelProvider implements ILabelProvider {

    public Image getImage(Object element) {
        if(!(element instanceof IStructuredSelection)) {
            return null;
        }
        
        element = ((IStructuredSelection)element).getFirstElement();

        if(element instanceof EditPart) {
            element = ((EditPart)element).getModel();
        }

        // Zenta Element 
        if(element instanceof IDiagramModelZentaObject) {
            element = ((IDiagramModelZentaObject)element).getZentaElement();
        }

        // Zenta Relationship
        if(element instanceof IDiagramModelZentaConnection) {
            element = ((IDiagramModelZentaConnection)element).getRelationship();
        }

        return ZentaLabelProvider.INSTANCE.getImage(element);
    }

    public String getText(Object element) {
        if(!(element instanceof IStructuredSelection)) {
            return ""; //$NON-NLS-1$
        }
        
        element = ((IStructuredSelection)element).getFirstElement();
        
        // Zenta Element
        if(element instanceof IZentaElement) {
            return getZentaElementText((IZentaElement)element);
        }
        else if(element instanceof IAdaptable) {
            IZentaElement zentaElement = (IZentaElement)((IAdaptable)element).getAdapter(IZentaElement.class);
            if(zentaElement != null) {
                return getZentaElementText(zentaElement);
            }
        }

        // Other Diagram Edit Part, so get model object
        if(element instanceof EditPart) {
            element = ((EditPart)element).getModel();
        }
        
        // Check the main label provider
        String text = ZentaLabelProvider.INSTANCE.getLabel(element);
        if(StringUtils.isSet(text)) {
            return StringUtils.escapeAmpersandsInText(text);
        }
        
        return " "; // Ensure the title bar is displayed //$NON-NLS-1$
    }

    private String getZentaElementText(IZentaElement element) {
        String name = StringUtils.escapeAmpersandsInText(element.getName());
        
        String typeName = ZentaLabelProvider.INSTANCE.getDefaultName(element.eClass());
        
        if(name.length() > 0) {
            return name + " (" + typeName + ")"; //$NON-NLS-1$ //$NON-NLS-2$
        }
        
        return typeName;
    }
    
    public void addListener(ILabelProviderListener listener) {
    }

    public void dispose() {
    }

    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    public void removeListener(ILabelProviderListener listener) {
    }

}
