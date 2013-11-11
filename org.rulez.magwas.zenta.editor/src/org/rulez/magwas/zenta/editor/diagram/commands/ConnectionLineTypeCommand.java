/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;



/**
 * Connection Line Type Command
 *
 * @author Phillip Beauvoir
 */
public class ConnectionLineTypeCommand extends EObjectFeatureCommand {
    
    public ConnectionLineTypeCommand(IDiagramModelConnection connection, int lineType) {
        super(Messages.ConnectionLineTypeCommand_0, connection, IZentaPackage.Literals.DIAGRAM_MODEL_CONNECTION__TYPE, lineType);
    }
}