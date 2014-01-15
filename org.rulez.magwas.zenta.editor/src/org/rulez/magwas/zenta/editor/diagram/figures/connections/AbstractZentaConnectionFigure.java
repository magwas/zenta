/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.ToolTipFigure;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IMetamodelFactory;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Abstract implementation of an Zenta connection figure.  Subclasses should decide how to draw the line
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractZentaConnectionFigure
extends AbstractDiagramConnectionFigure implements IZentaConnectionFigure {

    public AbstractZentaConnectionFigure(IDiagramModelZentaConnection connection) {
        super(connection);
    }
    
    @Override
    public IDiagramModelZentaConnection getModelConnection() {
        return (IDiagramModelZentaConnection)super.getModelConnection();
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
        
        String text = ZentaLabelProvider.INSTANCE.getLabel(relation);
        toolTipFigure.setText(text);

        IMetamodel metamodel = IMetamodelFactory.eINSTANCE.getMetamodelFor(relation);
        String className = metamodel.getClassById(relation.getObjectClass()).getName();
        toolTipFigure.setType(Messages.AbstractZentaConnectionFigure_0 + " " + className); //$NON-NLS-1$

        String rubric = ZentaLabelProvider.INSTANCE.getRelationshipSentence(relation);
        toolTipFigure.setRubric(rubric);

        return toolTipFigure;
    }
    
}
