package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;

public class CompositionDecoration implements IConnectionDecoration {
	@Override
	public void setFigureProperties(PolylineConnection owner) {
        owner.setSourceDecoration(createFigureSourceDecoration());
	}
	    private static PolygonDecoration createFigureSourceDecoration() {
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
}
