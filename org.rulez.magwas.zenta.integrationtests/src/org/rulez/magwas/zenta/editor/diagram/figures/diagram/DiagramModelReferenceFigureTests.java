/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigureTests;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.ModelConsistencyException;

import junit.framework.JUnit4TestAdapter;

@SuppressWarnings("nls")
public class DiagramModelReferenceFigureTests extends AbstractTextFlowFigureTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(DiagramModelReferenceFigureTests.class);
    }
    
    private DiagramModelReferenceFigure figure;
    private IDiagramModelReference dmRef;
	@Rule
	public final ExpectedException exception = ExpectedException.none();


    @Override
    protected DiagramModelReferenceFigure createFigure() {
        dmRef = IZentaFactory.eINSTANCE.createDiagramModelReference();
        IDiagramModel dM = model.getDefaultDiagramModel();
        dm = dM;
        dmRef.setReferencedModel(dM);
        dmRef.setBounds(IZentaFactory.eINSTANCE.createBounds());
        dm.getChildren().add(dmRef);
        
        figure = (DiagramModelReferenceFigure)getFigureFromViewer(dmRef);
        return figure;
    }
    
    @Override
    @Test
    public void its_text_can_be_set() {
    	//actually not
    	exception.expect(ModelConsistencyException.class);
        diagramModelObject.setName("Fido");
    }
}