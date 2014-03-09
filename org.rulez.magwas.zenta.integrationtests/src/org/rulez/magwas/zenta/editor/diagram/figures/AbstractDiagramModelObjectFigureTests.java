/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.swt.graphics.Color;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.IDiagramModelEditor;
import org.rulez.magwas.zenta.editor.model.EditorModelManagerNoGUI;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.integrationtests.UITestUtils;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IZentaModel;


@SuppressWarnings("nls")
public abstract class AbstractDiagramModelObjectFigureTests {
    
    protected static IZentaModel model;
    protected static IDiagramModel dm;
    protected static IDiagramModelEditor editor;

    protected AbstractDiagramModelObjectFigure abstractFigure;
    protected IDiagramModelObject diagramModelObject;
    
    protected abstract AbstractDiagramModelObjectFigure createFigure();
    
    // Convenience method to find a Figure in an EditPart in a Viewer from the model object
    protected IFigure getFigureFromViewer(Object modelObject) {
        @SuppressWarnings("rawtypes")
		Map registry = editor.getGraphicalViewer().getEditPartRegistry();
		GraphicalEditPart editPart = (GraphicalEditPart)registry.get(modelObject);
		return editPart.getFigure();
    }
    
	@BeforeClass
    public static void runOnceBeforeAllTests() {
        // Create a model with a default DiagramModel and open the editor
        IEditorModelManager editorModeManager = new EditorModelManagerNoGUI();
        model = editorModeManager.createNewModel();
        editorModeManager.openModel(model);
        dm = model.getDefaultDiagramModel();
        assertNotNull(dm);
        editor = EditorManager.openDiagramEditor(dm);
    }

    @Before
    public void runBeforeEachAbstractTest() {
        // Get the figure and its DiagramModelObject
        abstractFigure = createFigure();
        diagramModelObject = abstractFigure.getDiagramModelObject();
    }

    @AfterClass
    public static void runOnceAfterAllTests() throws IOException {
    	UITestUtils.closeAllModels();
    }

    @Test
    public void have_diagram_object_associated() {
        assertNotNull(diagramModelObject);
    }
    
    @Test
    public void have_font() {
        assertNotNull(abstractFigure.getFont());
    }
    
    @Test
    public void have_fill_color() {
        assertEquals(ColorFactory.getDefaultFillColor(diagramModelObject), abstractFigure.getFillColor());
        
        diagramModelObject.setFillColor("#010203");
        abstractFigure.setFillColor();
        Color expected = new Color(null, 1, 2, 3);
        assertEquals(expected, abstractFigure.getFillColor());
        expected.dispose();
    }
    
    @Test
    public void have_font_color() {
        IFigure textControl = abstractFigure.getTextControl();
        if(textControl != null) {
            diagramModelObject.setFontColor("#010203");
            abstractFigure.setFontColor();
            Color expected = new Color(null, 1, 2, 3);
            assertEquals(expected, textControl.getForegroundColor());
            expected.dispose();
        }
    }
    
    @Test
    public void have_line_color() {
        Preferences.STORE.setValue(IPreferenceConstants.DERIVE_ELEMENT_LINE_COLOR, false);
        
        assertEquals(ColorFactory.getDefaultLineColor(diagramModelObject), abstractFigure.getLineColor());
        
        diagramModelObject.setLineColor("#010203");
        abstractFigure.setLineColor();
        Color expected = new Color(null, 1, 2, 3);
        assertEquals(expected, abstractFigure.getLineColor());
        expected.dispose();
    }
    
    @Test
    public void displays_tooltip_when_mouse_hovers() {
        Preferences.STORE.setValue(IPreferenceConstants.VIEW_TOOLTIPS, true);
        assertTrue(abstractFigure.getToolTip() instanceof ToolTipFigure);
        Preferences.STORE.setValue(IPreferenceConstants.VIEW_TOOLTIPS, false);
        assertNull(abstractFigure.getToolTip());
    }
    
    @Test
    public void text_control_can_be_clicked() {
        assertFalse(abstractFigure.didClickTextControl(new Point(10, 10)));
    }

	protected Point getAnchor(IFigure figure) {
		IFigure p = figure.getParent();
		Rectangle b = figure.getBounds();
		Point a = new Point(b.x,b.y);
		if(null != p)
			a = a.getTranslated(getAnchor(p));
		return a;	
	}

}
