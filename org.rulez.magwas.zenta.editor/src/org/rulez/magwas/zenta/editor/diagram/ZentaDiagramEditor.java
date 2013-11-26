/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.AutoexposeHelper;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.diagram.actions.CreateDerivedRelationAction;
import org.rulez.magwas.zenta.editor.diagram.actions.DeleteFromModelAction;
import org.rulez.magwas.zenta.editor.diagram.actions.ShowStructuralChainsAction;
import org.rulez.magwas.zenta.editor.diagram.actions.ViewpointAction;
import org.rulez.magwas.zenta.editor.diagram.dnd.ZentaDiagramTransferDropTargetListener;
import org.rulez.magwas.zenta.editor.diagram.editparts.ZentaDiagramEditPartFactory;
import org.rulez.magwas.zenta.editor.diagram.util.ExtendedViewportAutoexposeHelper;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Zenta Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramEditor extends AbstractDiagramEditor
implements IZentaDiagramEditor {
    
    /**
     * Palette
     */
    private ZentaDiagramEditorPalette fPalette;
    
    @Override
    protected void applicationPreferencesChanged(PropertyChangeEvent event) {
        // Hide Palette elements on Viewpoint
        if(IPreferenceConstants.VIEWPOINTS_HIDE_PALETTE_ELEMENTS == event.getProperty()) {
            if(Boolean.TRUE == event.getNewValue()) {
                setPaletteViewpoint();
            }
            else {
                getPaletteRoot().setViewpoint(null);
            }
        }
        // Hide Diagram Elements on Viewpoint
        else if(IPreferenceConstants.VIEWPOINTS_HIDE_DIAGRAM_ELEMENTS == event.getProperty()) {
            getGraphicalViewer().setContents(getModel()); // refresh the model contents
        }
        else {
            super.applicationPreferencesChanged(event);
        }
    }
    
    /**
     * Set Viewpoint to current Viewpoint in model
     */
    protected void setViewpoint() {
        setPaletteViewpoint();
        getGraphicalViewer().setContents(getModel()); // refresh the model contents
    }
    
    /**
     * Set Palette to current Viewpoint in model if Preference set
     */
    protected void setPaletteViewpoint() {
        if(Preferences.STORE.getBoolean(IPreferenceConstants.VIEWPOINTS_HIDE_PALETTE_ELEMENTS)) {
            getPaletteRoot().setViewpoint(ViewpointsManager.INSTANCE.getViewpoint(getModel()));
        }
    }
    
    @Override
    public void doCreatePartControl(Composite parent) {
        // Register Help Context
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
    }
    
    @Override
    public ZentaDiagramEditorPalette getPaletteRoot() {
        if(fPalette == null) {
            fPalette = new ZentaDiagramEditorPalette();
            setPaletteViewpoint();
        }
        return fPalette;
    }

    @Override
    public IZentaDiagramModel getModel() {
        return (IZentaDiagramModel)super.getModel();
    }
    
    @Override
    protected void configureGraphicalViewer() {
        super.configureGraphicalViewer();

        GraphicalViewer viewer = getGraphicalViewer();

        // Register the Edit Part Factory before setting model contents
        viewer.setEditPartFactory(new ZentaDiagramEditPartFactory());
        
        // Set Model
        viewer.setContents(getModel());
        
        // Native DnD
        viewer.addDropTargetListener(new ZentaDiagramTransferDropTargetListener(viewer));
    }
    
    @Override
    protected void configurePaletteViewer(PaletteViewer viewer) {
        super.configurePaletteViewer(viewer);
        
        // Help for Palette
        PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), PALETTE_HELP_ID);
    }
    
    @Override
    protected void createRootEditPart(GraphicalViewer viewer) {
        // We'll have a Zoom Manager for our Root Edit Part
        viewer.setRootEditPart(new ScalableFreeformRootEditPart() {
            @SuppressWarnings("rawtypes")
            @Override
            public Object getAdapter(Class adapter) {
                if(adapter == AutoexposeHelper.class) {
                    return new ExtendedViewportAutoexposeHelper(this, new Insets(50), false);
                }
                return super.getAdapter(adapter);
            }
        });
    }
    
    /**
     * Set up and register the context menu
     */
    @Override
    protected void registerContextMenu(GraphicalViewer viewer) {
        MenuManager provider = new ZentaDiagramEditorContextMenuProvider(viewer, getActionRegistry());
        viewer.setContextMenu(provider);
        getSite().registerContextMenu(ZentaDiagramEditorContextMenuProvider.ID, provider, viewer);
    }
    
    @Override
    public void selectElements(IZentaElement[] elements) {
        List<EditPart> editParts = new ArrayList<EditPart>();
        
        for(IZentaElement element : elements) {
            // Find Diagram Components
            for(IDiagramModelComponent dc : DiagramModelUtils.findDiagramModelComponentsForElement(getModel(), element)) {
                EditPart editPart = (EditPart)getGraphicalViewer().getEditPartRegistry().get(dc);
                if(editPart != null && editPart.isSelectable() && !editParts.contains(editPart)) {
                    editParts.add(editPart);
                }
            }
            
            // Find Components from nested connections
            if(ConnectionPreferences.useNestedConnections() && element instanceof IRelationship) {
                for(IDiagramModelZentaObject[] list : DiagramModelUtils.findNestedComponentsForRelationship(getModel(), (IRelationship)element)) {
                    EditPart editPart1 = (EditPart)getGraphicalViewer().getEditPartRegistry().get(list[0]);
                    EditPart editPart2 = (EditPart)getGraphicalViewer().getEditPartRegistry().get(list[1]);
                    if(editPart1 != null && editPart1.isSelectable() && !editParts.contains(editPart1)) {
                        editParts.add(editPart1);
                    }
                    if(editPart2 != null && editPart2.isSelectable() && !editParts.contains(editPart2)) {
                        editParts.add(editPart2);
                    }
                }
            }
        }
        
        if(!editParts.isEmpty()) {
            getGraphicalViewer().setSelection(new StructuredSelection(editParts));
            getGraphicalViewer().reveal(editParts.get(0));
        }
        else {
            getGraphicalViewer().setSelection(StructuredSelection.EMPTY);
        }
    }
    
    /**
     * Add some extra Actions - *after* the graphical viewer has been created
     */
    @Override
    @SuppressWarnings("unchecked")
    protected void createActions(GraphicalViewer viewer) {
        super.createActions(viewer);
        
        ActionRegistry registry = getActionRegistry();
        IAction action;

        // Show Structural Chains
        action = new ShowStructuralChainsAction(this);
        registry.registerAction(action);
        
        // Create Derived Relation
        action = new CreateDerivedRelationAction(this);
        registry.registerAction(action);
        getSelectionActions().add(action.getId());
        
        // Delete from Model
        action = new DeleteFromModelAction(this);
        registry.registerAction(action);
        getSelectionActions().add(action.getId());
        
        // Viewpoints
        for(IViewpoint viewPoint : ViewpointsManager.INSTANCE.getAllViewpoints()) {
            action = new ViewpointAction(this, viewPoint);
            registry.registerAction(action);
        }
    }
    
    @Override
    protected void eCoreModelChanged(Notification msg) {
        super.eCoreModelChanged(msg);
        
        if(msg.getEventType() == Notification.SET) {
            // Diagram Model Viewpoint changed
            if(msg.getNotifier() == getModel() && msg.getFeature() == IZentaPackage.Literals.ZENTA_DIAGRAM_MODEL__VIEWPOINT) {
                setViewpoint();
            }
        }
    }
    
    @Override
    public void dispose() {
        super.dispose();
        if(fPalette != null) {
            fPalette.dispose();
        }
    }
    
    // =================================================================================
    //                       Contextual Help support
    // =================================================================================
    
    public int getContextChangeMask() {
        return NONE;
    }

    public IContext getContext(Object target) {
        return HelpSystem.getContext(HELP_ID);
    }

    public String getSearchExpression(Object target) {
        return Messages.ZentaDiagramEditor_0;
    }
}
