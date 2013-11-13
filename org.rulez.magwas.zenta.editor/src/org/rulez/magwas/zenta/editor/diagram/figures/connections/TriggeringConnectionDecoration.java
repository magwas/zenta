/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.PolygonDecoration;


/**
 * Triggering Connection Figure class
 * 
 * @author Phillip Beauvoir
 */
public class TriggeringConnectionDecoration extends AbstractConnectionDecoration {
	
    /**
     * @return Decoration to use on Target Node
     */
    private static PolygonDecoration createFigureTargetDecoration() {
        return new PolygonDecoration();
    }

	
    @Override
    public void setFigureProperties() {
        owner.setTargetDecoration(createFigureTargetDecoration()); 
    }
    

}
