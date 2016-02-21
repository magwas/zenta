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
import org.rulez.magwas.zenta.editor.diagram.IZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;



/**
 * Provides Tree filtering support when a Viewpoint is selected
 * 
 * @author Phillip Beauvoir
 */
public class TreeViewpointFilterProvider implements IPartListener {
	/**
     * Active Diagram Model
     */
    private IZentaDiagramModel fActiveDiagramModel;
    
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
     * Refresh the Zenta model in the tree
     */
    private void refreshTreeModel(IZentaDiagramModel dm) {
        if(dm != null && isActive()) {
            IZentaModel model = dm.getZentaModel();
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
            IZentaDiagramModel previous = fActiveDiagramModel;

            // Zenta editor
            if(part instanceof IZentaDiagramEditor) {
                IZentaDiagramModel dm = (IZentaDiagramModel)((IZentaDiagramEditor)part).getModel();
                
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
        if(isActive() && fActiveDiagramModel != null && element instanceof IZentaElement) {
        	if (null == fActiveDiagramModel.eContainer()) {
        		fActiveDiagramModel=null;
                return ColorFactory.get(128, 128, 128);
        	}
            IViewpoint viewpoint = ViewpointsManager.INSTANCE.getViewpoint(fActiveDiagramModel);
            if(viewpoint != null) {
                // From same model as active diagram
                IZentaModel model = ((IZentaElement)element).getZentaModel();
                if(model == fActiveDiagramModel.getZentaModel()) {
                    if(element instanceof IBasicRelationship) {
                    	if (!((IBasicRelationship) element).isConnected())
                            return ColorFactory.get(255, 0, 0);
                        IBasicObject source = (IBasicObject) ((IBasicRelationship)element).getSource();
                        IBasicObject target = (IBasicObject) ((IBasicRelationship)element).getTarget();
                        if( !viewpoint.isAllowedType(source) || !viewpoint.isAllowedType(target)) {
                            return ColorFactory.get(128, 128, 128);
                        }
                    }
                    else if(element instanceof IBasicObject) {
                        if(!viewpoint.isAllowedType((IBasicObject) element)) {
                            return ColorFactory.get(128, 128, 128);
                        }
                    } else
                        return ColorFactory.get(128, 128, 128);
                }
            }
        }

        return null;
    }
    
    boolean isActive() {
        return Preferences.STORE.getBoolean(IPreferenceConstants.VIEWPOINTS_FILTER_MODEL_TREE);
    }
}
