/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.swt.SWT;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;



/**
 * Flow Connection Figure class
 * 
 * @author Phillip Beauvoir
 */
public class FlowConnectionFigure extends AbstractZentamateConnectionFigure {
	
    /**
     * @return Decoration to use on Target Node
     */
    public static PolygonDecoration createFigureTargetDecoration() {
        return new PolygonDecoration();
    }

    public FlowConnectionFigure(IDiagramModelZentamateConnection connection) {
        super(connection);
    }
	
    @Override
    protected void setFigureProperties() {
        setTargetDecoration(createFigureTargetDecoration()); 
        setLineStyle(SWT.LINE_CUSTOM); // We have to explitly set this otherwise dashes/dots don't show
        setLineDash(new float[] { 6, 3 });
    }
    

}
