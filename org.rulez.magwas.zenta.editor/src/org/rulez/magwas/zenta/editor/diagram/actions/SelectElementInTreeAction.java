/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.rulez.magwas.zenta.editor.ui.services.ViewManager;
import org.rulez.magwas.zenta.editor.views.tree.ITreeModelView;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;


/**
 * Action to select the current element in the Tree
 * 
 * @author Phillip Beauvoir
 */
public class SelectElementInTreeAction extends SelectionAction {

    public static final String ID = "SelectElementInTreeAction"; //$NON-NLS-1$

    public SelectElementInTreeAction(IWorkbenchPart part) {
        super(part);
        setText(Messages.SelectElementInTreeAction_0);
        setId(ID);
        setToolTipText(Messages.SelectElementInTreeAction_1);
    }

    @Override
    public void run() {
        List<?> selection = getSelectedObjects();
        
        List<Object> elements = new ArrayList<Object>();
        
        for(Object object : selection) {
            if(object instanceof EditPart) {
                Object model = ((EditPart)object).getModel();
                if(model instanceof IDiagramModel) {
                    elements.add(model);
                }
                else if(model instanceof IDiagramModelZentaObject) {
                    elements.add(((IDiagramModelZentaObject)model).getZentaElement());
                }
                else if(model instanceof IDiagramModelZentaConnection) {
                    elements.add(((IDiagramModelZentaConnection)model).getRelationship());
                }
            }
        }
        
        ITreeModelView view = (ITreeModelView)ViewManager.showViewPart(ITreeModelView.ID, false);
        if(view != null) {
            view.getViewer().setSelection(new StructuredSelection(elements), true);
        }
    }

    @Override
    protected boolean calculateEnabled() {
        List<?> list = getSelectedObjects();
        
        if(list.isEmpty()) {
            return false;
        }
        
        for(Object object : list) {
            if(object instanceof EditPart) {
                Object model = ((EditPart)object).getModel();
                if(model instanceof IDiagramModel || model instanceof IDiagramModelZentaConnection || model instanceof IDiagramModelZentaObject) {
                    return true;
                }
            }
        }
        
        return false;
    }

}
