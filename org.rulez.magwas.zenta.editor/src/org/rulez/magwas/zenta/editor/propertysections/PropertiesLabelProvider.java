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
import org.rulez.magwas.zenta.editor.ui.ZentamateLabelProvider;
import org.rulez.magwas.zenta.editor.utils.StringUtils;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;



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

        // Zentamate Element 
        if(element instanceof IDiagramModelZentamateObject) {
            element = ((IDiagramModelZentamateObject)element).getZentamateElement();
        }

        // Zentamate Relationship
        if(element instanceof IDiagramModelZentamateConnection) {
            element = ((IDiagramModelZentamateConnection)element).getRelationship();
        }

        return ZentamateLabelProvider.INSTANCE.getImage(element);
    }

    public String getText(Object element) {
        if(!(element instanceof IStructuredSelection)) {
            return ""; //$NON-NLS-1$
        }
        
        element = ((IStructuredSelection)element).getFirstElement();
        
        // Zentamate Element
        if(element instanceof IZentamateElement) {
            return getZentamateElementText((IZentamateElement)element);
        }
        else if(element instanceof IAdaptable) {
            IZentamateElement zentaElement = (IZentamateElement)((IAdaptable)element).getAdapter(IZentamateElement.class);
            if(zentaElement != null) {
                return getZentamateElementText(zentaElement);
            }
        }

        // Other Diagram Edit Part, so get model object
        if(element instanceof EditPart) {
            element = ((EditPart)element).getModel();
        }
        
        // Check the main label provider
        String text = ZentamateLabelProvider.INSTANCE.getLabel(element);
        if(StringUtils.isSet(text)) {
            return StringUtils.escapeAmpersandsInText(text);
        }
        
        return " "; // Ensure the title bar is displayed //$NON-NLS-1$
    }

    private String getZentamateElementText(IZentamateElement element) {
        String name = StringUtils.escapeAmpersandsInText(element.getName());
        
        String typeName = ZentamateLabelProvider.INSTANCE.getDefaultName(element.eClass());
        
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
