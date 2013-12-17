package org.rulez.magwas.zenta.editor.diagram.editparts.business;

import static org.junit.Assert.*;

import org.eclipse.draw2d.text.BlockFlow;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BasicObjectEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.FontFactory;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObject;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class BasicObjectEditPartTest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();
	}

	@Test
	public void The_element_appearance_is_according_to_the_defining_objects_properties_in_the_template() {
		String id = "ea94cf6c";
		IZentaElement element = testdata.getElementById(id);
		assertNotNull(element);
		testdata.focusOnDiagram("2ea99535");
		BasicObjectEditPart editPart = (BasicObjectEditPart) testdata.getEditPartFor("b2608459");
		assertNotNull(editPart);
		assertTrue(editPart.getFigure().isEnabled());
		IDiagramModelObjectFigure figure = editPart.getFigure();
		Color color = figure.getFillColor();
		assertEquals("#ffa500",ColorFactory.convertRGBToString(color.getRGB()));
		Color fontColor = figure.getTextControl().getForegroundColor();
		assertEquals("#ffffff",ColorFactory.convertRGBToString(fontColor.getRGB()));
		int textAlignment = ((BlockFlow)figure.getTextControl().getParent()).getHorizontalAligment();
		assertEquals(4,textAlignment);
		assertEquals("ellipseShape",((DiagramModelZentaObject)testdata.getDMOById("b2608459")).getFinalElementShape());
		Font font = figure.getTextControl().getFont();
		assertArrayEquals(FontFactory.get("1|Arial Black|11.0|1|GTK|1|").getFontData(),font.getFontData());
	}
	
    @Test
    public void NonDefining_elements_are_not_disabled() {
        IZentaElement element = testdata.createClassedTestElement();
        IZentaDiagramModel dia = testdata.getNonTemplateDiagramModel();
        IDiagramModelZentaObject dmo = ModelAndEditPartTestData.createDMOFor(element);
        dia.getChildren().add(dmo);
        testdata.focusOnDiagram(dia.getId());
        BasicObjectEditPart editPart = (BasicObjectEditPart) testdata.getEditPartFor(dmo.getId());
        assertNotNull(editPart);
        assertTrue(editPart.getFigure().isEnabled());
    }

}
