/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.rulez.magwas.zenta.editor.diagram.commands.DiagramCommandFactory;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.ILockable;


/**
 * Policy for Deleting and Orphaning Parts
 * 
 * @author Phillip Beauvoir
 */
public class PartComponentEditPolicy extends ComponentEditPolicy {

    @Override
    protected Command createDeleteCommand(GroupRequest request) {
        IDiagramModelObject object = (IDiagramModelObject)getHost().getModel();
        boolean isLocked = object instanceof ILockable && ((ILockable)object).isLocked();
        return isLocked ? null : DiagramCommandFactory.createDeleteDiagramObjectCommand(object);
    }
}