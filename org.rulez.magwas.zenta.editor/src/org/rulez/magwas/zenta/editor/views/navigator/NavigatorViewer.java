/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IBasicRelationship;




/**
 * Tree Viewer for Navigator View
 * 
 * @author Phillip Beauvoir
 */
public class NavigatorViewer extends TreeViewer {
    
    private boolean fShowTargetElements = true;
    
    public NavigatorViewer(Composite parent, int style) {
        super(parent, style | SWT.MULTI);
        
        setContentProvider(new NavigatorViewerContentProvider());
        setLabelProvider(new NavigatorViewerLabelProvider());
        setAutoExpandLevel(3);
        
        setSorter(new ViewerSorter());
    }
    
    public Object getActualInput() {
        return getActualInput(getInput());
    }
    
    public Object getActualInput(Object input) {
        if(input instanceof Object[] && ((Object[])input).length == 1) {
            input = ((Object[])input)[0];
        }
        return input;
    }
    
    public void setShowTargetElements(boolean set) {
        if(fShowTargetElements != set) {
            fShowTargetElements = set;
            refresh();
        }
    }
    
    /**
     *  Content Provider
     */
    private class NavigatorViewerContentProvider implements ITreeContentProvider {
        
        public void inputChanged(Viewer v, Object oldInput, Object newInput) {
        }
        
        public void dispose() {
        }
        
        public Object[] getElements(Object parent) {
            if(parent instanceof Object[]) {
                // Check if it was deleted
                Object input = getActualInput(parent);
                if(input instanceof EObject && ((EObject)input).eContainer() == null) {
                    return new Object[0];
                }
                
                return (Object[])parent;
            }
            return new Object[0];
        }

        public Object[] getChildren(Object parent) {
            if(parent instanceof IBasicRelationship) {
                IBasicRelationship relation = (IBasicRelationship)parent;
                if(fShowTargetElements) {
                    return new Object[] { relation.getTarget() };
                }
                else {
                    return new Object[] { relation.getSource() };
                }
            }
            else if(parent instanceof IZentaElement) {
                IZentaElement element = (IZentaElement)parent;
                if(fShowTargetElements) {
                    return element.getSourceRelationships().toArray();
                }
                else {
                    return element.getTargetRelationships().toArray();
                }
            }
            
            return new Object[0];
        }

        public Object getParent(Object element) {
            return null;
        }

        public boolean hasChildren(Object element) {
            return getChildren(element).length > 0;
        }
        
    }
    
    /**
     * Label Provider
     */
    private class NavigatorViewerLabelProvider extends LabelProvider {
        
        @Override
        public String getText(Object element) {
            return ZentaLabelProvider.INSTANCE.getLabel((EObject) element);
        }
        
        @Override
        public Image getImage(Object element) {
            return ZentaLabelProvider.INSTANCE.getImage((EObject) element);
        }
    }
    
}
