/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModel;



/**
 * Connection Router Type Command
 *
 * @author Phillip Beauvoir
 */
public class ConnectionRouterTypeCommand extends EObjectFeatureCommand {
    
    public ConnectionRouterTypeCommand(IDiagramModel diagramModel, int type) {
        super(Messages.ConnectionRouterTypeCommand_0, diagramModel, IZentamatePackage.Literals.DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE, type);
    }
}