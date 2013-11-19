/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;

public class AssignmentConnectionDecoration implements IConnectionDecoration {
	@Override
	public void setFigureProperties(PolylineConnection owner) {
        owner.setSourceDecoration(createFigureSourceDecoration());
        owner.setTargetDecoration(createFigureTargetDecoration()); 
	}
	    private static PolygonDecoration createFigureTargetDecoration() {
	        return new PolygonDecoration() {
	            {
	                setScale(2, 1.3);
	                
	                PointList decorationPointList = new PointList();
	                decorationPointList.addPoint(0, 0);
	                decorationPointList.addPoint(0, -1);
	                decorationPointList.addPoint(-1, -1);
	                decorationPointList.addPoint(-1, 0);
	                decorationPointList.addPoint(-1, 1);
	                decorationPointList.addPoint(0, 1);
	                setTemplate(decorationPointList);
	            }
	        };
	    }
	    private static PolygonDecoration createFigureSourceDecoration() {
	        return createFigureTargetDecoration();
	    }
}
