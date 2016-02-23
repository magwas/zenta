/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.ui.actions.LabelRetargetAction;
import org.eclipse.ui.actions.RetargetAction;
import org.rulez.magwas.zenta.editor.actions.ZentaEditorActionFactory;
import org.rulez.magwas.zenta.editor.diagram.actions.CreateDerivedRelationAction;
import org.rulez.magwas.zenta.editor.diagram.actions.DeleteFromModelAction;
import org.rulez.magwas.zenta.editor.diagram.actions.ShowStructuralChainsAction;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;



/**
 * Action Bar contributor for Zenta Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramEditorActionBarContributor
extends AbstractDiagramEditorActionBarContributor {
    
    protected String editDeleteMenuGroup = "editDeleteMenuGroup"; //$NON-NLS-1$

    @Override
    protected void buildActions() {
        super.buildActions();
        
        // Show Structural Chains
        RetargetAction retargetAction = new LabelRetargetAction(ShowStructuralChainsAction.ID, ShowStructuralChainsAction.DEFAULT_TEXT);
        retargetAction.setImageDescriptor(IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_DERIVED_16));
        addRetargetAction(retargetAction);
        
        // Create Derived Relation
        retargetAction = new RetargetAction(CreateDerivedRelationAction.ID, CreateDerivedRelationAction.TEXT);
        retargetAction.setImageDescriptor(new DecorationOverlayIcon(IZentaUIImages.ImageFactory.getImage(IZentaImages.ICON_DERIVED_SM_16),
                        IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_NEW_OVERLAY_16), IDecoration.TOP_LEFT));
        addRetargetAction(retargetAction);
        
        // Delete From Model
        retargetAction = new RetargetAction(DeleteFromModelAction.ID, DeleteFromModelAction.TEXT);
        addRetargetAction(retargetAction);
        
        // Viewpoints
        for(IViewpoint viewPoint : ViewpointsManager.INSTANCE.getAllViewpoints()) {
            retargetAction = new RetargetAction(viewPoint.getClass().toString(), viewPoint.getName(), IAction.AS_RADIO_BUTTON);
            // Looks better as a checkbox
            //retargetAction.setImageDescriptor(ViewpointsManager.INSTANCE.getImageDescriptor(viewPoint));
            addRetargetAction(retargetAction);
        }
    }
    
    @Override
    protected IMenuManager contributeToEditMenu(IMenuManager menuManager) {
        IMenuManager editMenu = super.contributeToEditMenu(menuManager);
        
        editMenu.insertAfter(ZentaEditorActionFactory.DELETE.getId(), new Separator(editDeleteMenuGroup));
        editMenu.appendToGroup(editDeleteMenuGroup, getAction(DeleteFromModelAction.ID));
        
        return editMenu;
    }
    
    @Override
    protected IMenuManager createViewMenu(IMenuManager menuManager) {
        IMenuManager viewMenu = super.createViewMenu(menuManager);
        
        // Viewpoints
        IMenuManager viewPointMenu = new MenuManager(Messages.ZentaDiagramEditorActionBarContributor_0);
        viewMenu.add(viewPointMenu);
        for(IViewpoint viewPoint : ViewpointsManager.INSTANCE.getAllViewpoints()) {
            viewPointMenu.add(getAction(viewPoint.getClass().toString()));
        }

        viewMenu.add(new Separator());
        
        // Derived Relations
        IMenuManager derivedRelationsMenu = new MenuManager(Messages.ZentaDiagramEditorActionBarContributor_1);
        viewMenu.add(derivedRelationsMenu);
        derivedRelationsMenu.add(getAction(ShowStructuralChainsAction.ID));
        derivedRelationsMenu.add(getAction(CreateDerivedRelationAction.ID));
        
        return viewMenu;
    }
}
