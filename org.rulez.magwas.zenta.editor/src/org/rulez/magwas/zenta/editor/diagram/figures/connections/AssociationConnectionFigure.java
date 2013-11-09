/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;


/**
 * Association Connection Figure
 * 
 * @author Phillip Beauvoir
 */
public class AssociationConnectionFigure extends AbstractZentamateConnectionFigure {
	
    public AssociationConnectionFigure(IDiagramModelZentamateConnection connection) {
        super(connection);
    }
	
    @Override
    protected void setFigureProperties() {
    }
}
