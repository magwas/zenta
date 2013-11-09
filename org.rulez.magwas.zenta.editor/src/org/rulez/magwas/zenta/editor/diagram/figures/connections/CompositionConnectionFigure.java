/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;



/**
 * Composition Connection Figure
 * 
 * @author Phillip Beauvoir
 */
public class CompositionConnectionFigure extends AbstractZentamateConnectionFigure {
	
    /**
     * @return Decoration to use on Source Node
     */
    public static PolygonDecoration createFigureSourceDecoration() {
        return new PolygonDecoration() {
            {
                setScale(5, 3);
                PointList decorationPointList = new PointList();
                decorationPointList.addPoint( 0, 0);
                decorationPointList.addPoint(-2, 2);
                decorationPointList.addPoint(-4, 0);
                decorationPointList.addPoint(-2,-2);
                setTemplate(decorationPointList);
            }
        };
    }

    public CompositionConnectionFigure(IDiagramModelZentamateConnection connection) {
        super(connection);
    }
	
    @Override
    protected void setFigureProperties() {
        setSourceDecoration(createFigureSourceDecoration());
    }
}