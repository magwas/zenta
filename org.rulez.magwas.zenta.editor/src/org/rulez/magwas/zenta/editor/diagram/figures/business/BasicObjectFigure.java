/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.business;

import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;





/**
 * Business Object Figure
 * 
 * @author Phillip Beauvoir
 */
public class BasicObjectFigure extends AbstractTextFlowFigure {
    
        
    public BasicObjectFigure(IDiagramModelZentaObject diagramModelObject) {
        super(diagramModelObject);
        setFigureShape(diagramModelObject.getElementShape());
        refreshVisuals();
    }

    
}
