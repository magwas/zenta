/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;



/**
 * Connection Line Color Command
 *
 * @author Phillip Beauvoir
 */
public class ConnectionLineColorCommand extends EObjectFeatureCommand {
    
    public ConnectionLineColorCommand(IDiagramModelConnection connection, String rgb) {
        super(Messages.ConnectionLineColorCommand_0, connection, IZentamatePackage.Literals.DIAGRAM_MODEL_CONNECTION__LINE_COLOR, rgb);
    }
}