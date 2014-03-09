package org.rulez.magwas.zenta.editor.diagram.editparts.business;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.draw2d.text.BlockFlow;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BasicObjectEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.ToolTipFigure;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.FontFactory;
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase;

public class BasicObjectEditPartTest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() throws IOException {
		testdata = new ModelAndEditPartTestData();
	}
	
	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
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
		assertEquals(2,textAlignment);
		assertEquals("ellipseShape",((DiagramModelZentaObjectBase)testdata.getDMOById("b2608459")).getFinalElementShape());
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
	@Test
	public void NonDefining_elements_are_not_disabled_in_template() {
		IZentaDiagramModel dia = testdata.getTemplateDiagramModel();
		IDiagramModelZentaObject dmo = (IDiagramModelZentaObject) testdata.getDMOById("c4618eab");//NotDefinesObjectClass
		testdata.focusOnDiagram(dia.getId());
		BasicObjectEditPart editPart = (BasicObjectEditPart) testdata.getEditPartFor(dmo.getId());
		assertNotNull(editPart);
		assertTrue(editPart.getFigure().isEnabled());
	}
	
	@Test
	public void The_ToolTip_displays_the_ObjectClass() {
		Preferences.STORE.setValue(IPreferenceConstants.VIEW_TOOLTIPS, true);
		IBasicObject oc = (IBasicObject) testdata.metamodel.getClassById("ea94cf6c");//User
		IZentaElement element = testdata.createClassedTestElement(oc);
		element.setName("Displayable Name");
		IZentaDiagramModel dia = testdata.getNonTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelAndEditPartTestData.createDMOFor(element);
		dia.getChildren().add(dmo);
		testdata.focusOnDiagram(dia.getId());
		BasicObjectEditPart editPart = (BasicObjectEditPart) testdata.getEditPartFor(dmo.getId());
		ToolTipFigure toolTip = (ToolTipFigure) editPart.getFigure().getToolTip();
		assertEquals("Displayable Name",toolTip.getText());
		assertEquals("ObjectClass: User",toolTip.getType());
	}
	
	@Test
	public void The_Tooltip_displays_the_ObjectClass_of_defining_element() {
		Preferences.STORE.setValue(IPreferenceConstants.VIEW_TOOLTIPS, true);
		IBasicObject oc = (IBasicObject) testdata.metamodel.getClassById("ea94cf6c");//User
		IBasicObject element = testdata.createClassedTestElement(oc);
		element.setName("Árvíztűrő Tükörfúrógép");
		IZentaDiagramModel dia = testdata.getTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelAndEditPartTestData.createDMOFor(element);
		dia.getChildren().add(dmo);
		testdata.focusOnDiagram(dia.getId());
		BasicObjectEditPart editPart = (BasicObjectEditPart) testdata.getEditPartFor(dmo.getId());
		ToolTipFigure toolTip = (ToolTipFigure) editPart.getFigure().getToolTip();
		assertEquals("Árvíztűrő Tükörfúrógép",toolTip.getText());
		assertEquals("ObjectClass: User",toolTip.getType());
		IBasicObject elementOc = element.getDefiningElement();
		assertEquals("Árvíztűrő Tükörfúrógép",elementOc.getName());
	}
}
