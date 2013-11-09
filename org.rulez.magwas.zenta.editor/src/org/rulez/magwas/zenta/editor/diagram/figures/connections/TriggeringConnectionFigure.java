/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;


/**
 * Triggering Connection Figure class
 * 
 * @author Phillip Beauvoir
 */
public class TriggeringConnectionFigure extends AbstractZentamateConnectionFigure {
	
    /**
     * @return Decoration to use on Target Node
     */
    public static PolygonDecoration createFigureTargetDecoration() {
        return new PolygonDecoration();
    }

    public TriggeringConnectionFigure(IDiagramModelZentamateConnection connection) {
        super(connection);
    }
	
    @Override
    protected void setFigureProperties() {
        setTargetDecoration(createFigureTargetDecoration()); 
    }
    

}
