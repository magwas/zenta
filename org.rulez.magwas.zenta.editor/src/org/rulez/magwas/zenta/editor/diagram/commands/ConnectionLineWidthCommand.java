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
 * Connection Line Width Command
 *
 * @author Phillip Beauvoir
 */
public class ConnectionLineWidthCommand extends EObjectFeatureCommand {
    
    public ConnectionLineWidthCommand(IDiagramModelConnection connection, int lineWidth) {
        super(Messages.ConnectionLineWidthCommand_0, connection, IZentaPackage.Literals.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH, lineWidth);
    }
}