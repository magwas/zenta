/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.osgi.util.NLS;
import org.rulez.magwas.zenta.model.IZentamateFactory;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Add Connection Command
 * Used when dragging and dropping an Zentamate Relationship from the tree to the diagram.
 * Called from {@link org.rulez.magwas.zenta.editor.diagram.policies.ZentamateDNDEditPolicy}
 * 
 * @author Phillip Beauvoir
 */
public class AddDiagramZentamateConnectionCommand extends Command {
    
    private IDiagramModelZentamateConnection fConnection;
    private IDiagramModelObject fSource, fTarget;
    
    public AddDiagramZentamateConnectionCommand(IDiagramModelObject src, IDiagramModelObject tgt, IRelationship relationship) {
        setLabel(NLS.bind(Messages.AddDiagramZentamateConnectionCommand_0, relationship.getName()));

        fSource = src;
        fTarget = tgt;
        fConnection = IZentamateFactory.eINSTANCE.createDiagramModelZentamateConnection();
        fConnection.setRelationship(relationship);
    }

    @Override
    public void execute() {
        fConnection.connect(fSource, fTarget);
    }

    @Override
    public void undo() {
        fConnection.disconnect();
    }

    @Override
    public void redo() {
        fConnection.reconnect();
    }
}