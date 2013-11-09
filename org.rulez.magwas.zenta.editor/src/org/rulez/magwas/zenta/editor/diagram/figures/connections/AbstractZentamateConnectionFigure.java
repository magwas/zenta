/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.ToolTipFigure;
import org.rulez.magwas.zenta.editor.ui.ZentamateLabelProvider;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Abstract implementation of an Zentamate connection figure.  Subclasses should decide how to draw the line
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractZentamateConnectionFigure
extends AbstractDiagramConnectionFigure implements IZentamateConnectionFigure {

    public AbstractZentamateConnectionFigure(IDiagramModelZentamateConnection connection) {
        super(connection);
    }
    
    @Override
    public IDiagramModelZentamateConnection getModelConnection() {
        return (IDiagramModelZentamateConnection)super.getModelConnection();
    }

    @Override
    public void highlight(boolean set) {
        if(set) {
            setForegroundColor(ColorConstants.red);
            fLineColor = ColorConstants.red;
            setLineWidth(2);
        }
        else {
            setLineColor();
            setLineWidth();
        }
    }

    @Override
    public IFigure getToolTip() {
        ToolTipFigure toolTipFigure = (ToolTipFigure)super.getToolTip();
        
        if(toolTipFigure == null) {
            return null;
        }
        
        IRelationship relation = getModelConnection().getRelationship();
        
        String text = ZentamateLabelProvider.INSTANCE.getLabel(relation);
        toolTipFigure.setText(text);

        String type = ZentamateLabelProvider.INSTANCE.getDefaultName(relation.eClass());
        toolTipFigure.setType(Messages.AbstractZentamateConnectionFigure_0 + " " + type); //$NON-NLS-1$

        String rubric = ZentamateLabelProvider.INSTANCE.getRelationshipSentence(relation);
        toolTipFigure.setRubric(rubric);

        return toolTipFigure;
    }
    
}
