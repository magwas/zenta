/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.actions;

import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;
import org.rulez.magwas.zenta.editor.diagram.IZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.model.info.IZentaImages;



/**
 * Show Derived Relations Chains Action
 * 
 * @author Phillip Beauvoir
 */
public class ShowStructuralChainsAction extends WorkbenchPartAction {
    
    public static final String ID = "ShowStructuralChainsAction"; //$NON-NLS-1$
    public static final String DEFAULT_TEXT = Messages.ShowStructuralChainsAction_0;

    public ShowStructuralChainsAction(IWorkbenchPart part) {
        super(part);
        setId(ID);
        setText(DEFAULT_TEXT);
        setImageDescriptor(IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_DERIVED_16));
    }
    
    @Override
    protected boolean calculateEnabled() {
        return true;
    }
    
    private boolean isShowingChains() {
        GraphicalViewer viewer = (GraphicalViewer)getWorkbenchPart().getAdapter(GraphicalViewer.class);
        Boolean val = (Boolean)viewer.getProperty(IZentaDiagramEditor.PROPERTY_SHOW_STRUCTURAL_CHAIN);
        if (val != null)
            return val.booleanValue();
        return false;
    }

    @Override
    public void run() {
        GraphicalViewer viewer = (GraphicalViewer)getWorkbenchPart().getAdapter(GraphicalViewer.class);
        boolean val = !isShowingChains();
        viewer.setProperty(IZentaDiagramEditor.PROPERTY_SHOW_STRUCTURAL_CHAIN, new Boolean(val));
        setText(isShowingChains() ? Messages.ShowStructuralChainsAction_1 : DEFAULT_TEXT);
    }
}
