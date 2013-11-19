/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;

public class SmallStartArrowDecoration implements IConnectionDecoration {

	@Override
	public void setFigureProperties( PolylineConnection owner) {
        owner.setSourceDecoration(createFigureTargetDecoration()); 
    }
	    private PolygonDecoration createFigureTargetDecoration() {
	        return new PolygonDecoration();
	    }
}
