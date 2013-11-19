/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;

public class InfluenceConnectionDecoration implements IConnectionDecoration {
	
	@Override
	public void setFigureProperties(PolylineConnection owner) {
        owner.setTargetDecoration(createFigureTargetDecoration()); 
        owner.setLineStyle(SWT.LINE_CUSTOM);
        owner.setLineDash(new float[] { 6, 3 });
	}
	    private static PolygonDecoration createFigureTargetDecoration() {
	        return new PolygonDecoration();
	    }
}
