/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigureTests;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IZentaFactory;

import junit.framework.JUnit4TestAdapter;

@SuppressWarnings("nls")
public class DiagramModelReferenceFigureTests extends AbstractTextFlowFigureTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(DiagramModelReferenceFigureTests.class);
    }
    
    private DiagramModelReferenceFigure figure;
    private IDiagramModelReference dmRef;
    

    @Override
    protected DiagramModelReferenceFigure createFigure() {
        dmRef = IZentaFactory.eINSTANCE.createDiagramModelReference();
        dm = model.getDefaultDiagramModel();
        dmRef.setReferencedModel(dm);
        dmRef.setBounds(IZentaFactory.eINSTANCE.createBounds());
        dm.getChildren().add(dmRef);
        
        figure = (DiagramModelReferenceFigure)getFigureFromViewer(dmRef);
        return figure;
    }
    
    @Override
    @Test
    public void its_text_can_be_set() {
        String name = diagramModelObject.getName();
        assertEquals(name, textFlowFigure.getTextControl().getText());
        diagramModelObject.setName("Fido");
        assertEquals(name, diagramModelObject.getName()); // Should not be set
    }
}