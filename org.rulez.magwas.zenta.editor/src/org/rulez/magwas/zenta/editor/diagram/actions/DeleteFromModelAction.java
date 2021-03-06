/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.actions;

import java.util.List;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.rulez.magwas.zenta.editor.model.commands.DeleteCommand;
import org.rulez.magwas.zenta.editor.model.commands.NonNotifyingCompoundCommand;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaElement;



/**
 * Delete from Model Action
 * 
 * @author Phillip Beauvoir
 */
public class DeleteFromModelAction extends SelectionAction {
    
    public static final String ID = "DeleteFromModelAction"; //$NON-NLS-1$
    public static final String TEXT = Messages.DeleteFromModelAction_0;
    
    public DeleteFromModelAction(IWorkbenchPart part) {
        super(part);
        setText(TEXT);
        setId(ID);
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
                if(model instanceof IDiagramModelZentaObject || model instanceof IDiagramModelZentaConnection) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    @Override
    public void run() {
        List<?> selection = getSelectedObjects();
        CompoundCommand compoundCommand = new NonNotifyingCompoundCommand(TEXT);
        
        for(Object element : selection) {
        	if (element instanceof EditPart) {
        		element = ((EditPart)element).getModel();
        	}
	        if (element instanceof IDiagramModelZentaConnection) {
	        	IDiagramModelZentaConnection dmo = (IDiagramModelZentaConnection) element;
	        	IZentaElement modelElement = dmo.getRelationship();
		        Command cmd2 = new DeleteCommand((INameable) modelElement);
		        compoundCommand.add(cmd2);		        	
	        } else if (element instanceof IDiagramModelZentaObject) {
	        	IDiagramModelZentaObject dmo = (IDiagramModelZentaObject) element;
	        	IZentaElement modelElement = dmo.getZentaElement();
		        Command cmd2 = new DeleteCommand((INameable) modelElement);
		        compoundCommand.add(cmd2);
	        } else {
	        	EcorePlugin.INSTANCE.log(String.format("don't know how toremove %s\n",element));
	        	throw new UnsupportedOperationException();
	        }
        }
        
        execute(compoundCommand);
    }
    
}
