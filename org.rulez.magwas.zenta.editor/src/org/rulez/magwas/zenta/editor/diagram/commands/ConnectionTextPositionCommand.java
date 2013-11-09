/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IArchimatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;



/**
 * Connection Text Position Command
 *
 * @author Phillip Beauvoir
 */
public class ConnectionTextPositionCommand extends EObjectFeatureCommand {
    
    public ConnectionTextPositionCommand(IDiagramModelConnection connection, int position) {
        super(Messages.ConnectionTextPositionCommand_0, connection, IArchimatePackage.Literals.FONT_ATTRIBUTE__TEXT_POSITION, position);
    }
}