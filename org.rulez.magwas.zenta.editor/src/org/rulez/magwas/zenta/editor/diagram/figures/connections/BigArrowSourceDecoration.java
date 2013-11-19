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

public class BigArrowSourceDecoration implements IConnectionDecoration {
    
	@Override
	public void setFigureProperties(PolylineConnection owner) {
        owner.setSourceDecoration(createFigureTargetDecoration());
	}
	    public static PolygonDecoration createFigureTargetDecoration() {
	        PolygonDecoration decoration = new PolygonDecoration() {
	            @Override
	            protected void fillShape(Graphics g) {
	                g.setBackgroundColor(ColorConstants.white);
	                super.fillShape(g);
	            }
	        };
	        decoration.setScale(10, 7);
	        decoration.setBackgroundColor(ColorConstants.white);
	        return decoration;
	    }
}
