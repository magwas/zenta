/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;

public class RealisationConnectionDecoration implements IConnectionDecoration {
    
	@Override
	public void setFigureProperties(PolylineConnection owner) {
        owner.setTargetDecoration(createFigureTargetDecoration());
        owner.setLineStyle(SWT.LINE_CUSTOM);
        owner.setLineDash(new float[] { 4 });
	}
	    public static PolygonDecoration createFigureTargetDecoration() {
	        PolygonDecoration decoration = new PolygonDecoration() {
	            @Override
	            protected void fillShape(Graphics g) {
	                // Draw this as white in case it is disabled
	                g.setBackgroundColor(ColorConstants.white);
	                super.fillShape(g);
	            }
	        };
	        decoration.setScale(10, 7);
	        decoration.setBackgroundColor(ColorConstants.white);
	        
	        return decoration;
	    }
}
