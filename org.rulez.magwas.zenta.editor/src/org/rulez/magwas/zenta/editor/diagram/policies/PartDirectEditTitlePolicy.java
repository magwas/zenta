/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.osgi.util.NLS;
import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelObject;


/**
 * Policy for directly Editing Parts' titles
 * 
 * @author Phillip Beauvoir
 */
public class PartDirectEditTitlePolicy extends DirectEditPolicy {

    @Override
    protected Command getDirectEditCommand(DirectEditRequest request) {
        IDiagramModelObject object = (IDiagramModelObject)getHost().getModel();
        String name = (String)request.getCellEditor().getValue();
        return new EObjectFeatureCommand(NLS.bind(Messages.PartDirectEditTitlePolicy_0, object.getName()), object, IZentaPackage.Literals.NAMEABLE__NAME, name);
    }

    @Override
    protected void showCurrentEditValue(DirectEditRequest request) {
//        String value = (String)request.getCellEditor().getValue();
//        
//        if(getHostFigure() instanceof IEditableLabelFigure) {
//            ((IEditableLabelFigure)getHostFigure()).setText(value);
//        }
    }
}