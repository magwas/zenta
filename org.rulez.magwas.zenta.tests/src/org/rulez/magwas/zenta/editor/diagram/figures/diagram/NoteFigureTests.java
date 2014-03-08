/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractDiagramModelObjectFigureTests;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.tests.AsyncTestRunner;

@SuppressWarnings("nls")
public class NoteFigureTests extends AbstractDiagramModelObjectFigureTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(NoteFigureTests.class);
    }
    
    private NoteFigure figure;
    private IDiagramModelNote dmNote;
    

    @Override
    protected NoteFigure createFigure() {
        // Add a DiagramModelNote
        dmNote = IZentaFactory.eINSTANCE.createDiagramModelNote();
        dmNote.setBounds(IZentaFactory.eINSTANCE.createBounds());
        dm.getChildren().add(dmNote);
        
        figure = (NoteFigure)getFigureFromViewer(dmNote);
        return figure;
    }
    
    @Test
    public void testGetDefaultSize() {
        assertEquals(NoteFigure.DEFAULT_SIZE, figure.getDefaultSize());
    }

    @Test
    public void testGetTextControl() {
        assertNotNull(figure.getTextControl());
    }

    @Override
    @Test
    public void text_control_can_be_clicked() {
        dmNote.setContent("Note Test");
        AsyncTestRunner runner = new AsyncTestRunner() {
            @Override
            public void run() {
                super.run();
                IFigure tc = abstractFigure.getTextControl();
                Point point = getAnchor(tc);
				assertTrue(abstractFigure.didClickTextControl(point));
            }
        };
        runner.start();
    }
}