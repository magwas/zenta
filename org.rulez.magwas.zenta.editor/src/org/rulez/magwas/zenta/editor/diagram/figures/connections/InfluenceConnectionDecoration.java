/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.swt.SWT;


/**
 * Influence Connection Figure class
 * 
 * @author Phillip Beauvoir
 */
public class InfluenceConnectionDecoration extends AbstractConnectionDecoration {
	
    /**
     * @return Decoration to use on Target Node
     */
    private static PolygonDecoration createFigureTargetDecoration() {
        return new PolygonDecoration();
    }
	
    @Override
    public void setFigureProperties() {
        owner.setTargetDecoration(createFigureTargetDecoration()); 
        owner.setLineStyle(SWT.LINE_CUSTOM); // We have to explitly set this otherwise dashes/dots don't show
        owner.setLineDash(new float[] { 6, 3 });
    }
    

}
