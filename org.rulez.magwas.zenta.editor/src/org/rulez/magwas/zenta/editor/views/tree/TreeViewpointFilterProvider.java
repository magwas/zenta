/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.diagram.IZentamateDiagramEditor;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.model.IZentamateDiagramModel;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Provides Tree filtering support when a Viewpoint is selected
 * 
 * @author Phillip Beauvoir
 */
public class TreeViewpointFilterProvider implements IPartListener {

    /**
     * Active Diagram Model
     */
    private IZentamateDiagramModel fActiveDiagramModel;
    
    /**
     * Tree Viewer
     */
    private TreeViewer fViewer;
    
    /**
     * Application Preferences Listener
     */
    private IPropertyChangeListener prefsListener = new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if(IPreferenceConstants.VIEWPOINTS_FILTER_MODEL_TREE.equals(event.getProperty())) {
                fViewer.refresh();
            }
        }
    };
    
    TreeViewpointFilterProvider(TreeViewer viewer) {
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(this);
        fViewer = viewer;

        // Listen to Preferences
        Preferences.STORE.addPropertyChangeListener(prefsListener);
        fViewer.getControl().addDisposeListener(new DisposeListener() {
            @Override
            public void widgetDisposed(DisposeEvent e) {
            	if(PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
            		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().removePartListener(TreeViewpointFilterProvider.this);
            	}
                
                Preferences.STORE.removePropertyChangeListener(prefsListener);
            }
        });
    }
    
    /**
     * Refresh the Zentamate model in the tree
     */
    private void refreshTreeModel(IZentamateDiagramModel dm) {
        if(dm != null && isActive()) {
            IZentamateModel model = dm.getZentamateModel();
            fViewer.refresh(model);
        }
    }

    @Override
    public void partActivated(IWorkbenchPart part) {
        /*
         * Refresh Tree only if an IEditorPart is activated.
         * 
         * If we call refresh() when a ViewPart is activated then a problem occurs when:
         * 1. User adds a new Diagram View to the Tree
         * 2. Element is added to model - refresh() is called on Tree
         * 3. Diagram Editor is opened and activated
         * 4. This is notified of Diagram Editor Part activation and calls refresh() on Tree
         * 5. NewDiagramCommand.execute() calls TreeModelViewer.editElement() to edit the cell name
         * 6. The Tree is then activated and This is notified of Diagram Editor Part activation and calls refresh() on Tree
         * 7. TreeModelViewer.refresh(element) then cancels editing
         */
        if(part instanceof IEditorPart) {
            IZentamateDiagramModel previous = fActiveDiagramModel;

            // Zentamate editor
            if(part instanceof IZentamateDiagramEditor) {
                IZentamateDiagramModel dm = (IZentamateDiagramModel)((IZentamateDiagramEditor)part).getModel();
                
                if(previous == dm) {
                    return;
                }
                
                fActiveDiagramModel = dm;
            }
            // Other type of editor (sketch, canvas)
            else {
                fActiveDiagramModel = null;
            }
            
            // Refresh previous model
            refreshTreeModel(previous);

            // Refresh selected model
            refreshTreeModel(fActiveDiagramModel);
        }
    }

    @Override
    public void partBroughtToTop(IWorkbenchPart part) {
    }

    @Override
    public void partClosed(IWorkbenchPart part) {
        // Check if no editors open
        if(part instanceof IEditorPart) {
        	if(PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
        		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                if(page != null && page.getActiveEditor() == null) {
                    fActiveDiagramModel = null;
                    if(isActive()) {
                        fViewer.refresh();
                    }
                }
        	}
        }
    }

    @Override
    public void partDeactivated(IWorkbenchPart part) {
    }

    @Override
    public void partOpened(IWorkbenchPart part) {
    }

    /**
     * If the element is disallowed in a Viewpoint grey it out
     * @param element
     * @return Color or null
     */
    public Color getTextColor(Object element) {
        if(isActive() && fActiveDiagramModel != null && element instanceof IZentamateElement) {
            int index = fActiveDiagramModel.getViewpoint();
            IViewpoint viewpoint = ViewpointsManager.INSTANCE.getViewpoint(index);
            if(viewpoint != null) {
                // From same model as active diagram
                IZentamateModel model = ((IZentamateElement)element).getZentamateModel();
                if(model == fActiveDiagramModel.getZentamateModel()) {
                    if(element instanceof IRelationship) {
                        IZentamateElement source = ((IRelationship)element).getSource();
                        IZentamateElement target = ((IRelationship)element).getTarget();
                        if(!viewpoint.isAllowedType(source.eClass()) || !viewpoint.isAllowedType(target.eClass())) {
                            return ColorFactory.get(128, 128, 128);
                        }
                    }
                    else {
                        if(!viewpoint.isAllowedType(((IZentamateElement)element).eClass())) {
                            return ColorFactory.get(128, 128, 128);
                        }
                    }
                }
            }
        }

        return null;
    }
    
    boolean isActive() {
        return Preferences.STORE.getBoolean(IPreferenceConstants.VIEWPOINTS_FILTER_MODEL_TREE);
    }
}
