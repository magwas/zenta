package org.rulez.magwas.zenta.editor.diagram.editparts.connections;

import static org.junit.Assert.*;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.BasicConnectionFigure;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.FontFactory;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

public class BasicConnectionEditPartTest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();
	}

	@Test
	public void The_connection_appearance_is_according_to_the_defining_relations_properties_in_the_template() {
		String id = "9c441eb7";
		IRelationship element = testdata.getRelationByID(id);
		assertNotNull(element);
		testdata.focusOnDiagram("e13c9626");
		BasicConnectionEditPart editPart = (BasicConnectionEditPart) testdata.getEditPartFor("9dc4d23a");
		assertNotNull(editPart);
		BasicConnectionFigure figure = (BasicConnectionFigure) editPart.getConnectionFigure();
		Font font = figure.getConnectionLabel().getFont();
		assertArrayEquals(FontFactory.get("1|Andika|10.0|3|GTK|1|").getFontData(),font.getFontData());
		Color fontColor = figure.getConnectionLabel().getForegroundColor();
		assertEquals("#ff0000",ColorFactory.convertRGBToString(fontColor.getRGB()));
		int position = figure.getLabelPosition();
		assertEquals(0,position);
		int lineWidth = figure.getLineWidth();
		assertEquals(2,lineWidth);
		Color color = figure.getForegroundColor();
		assertEquals("#0000ff",ColorFactory.convertRGBToString(color.getRGB()));
		assertEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration", figure.getlineDecorationString());
	}
	
	@Test
	public void A_newly_created_nondefining_connection_have_the_appearance_of_the_defining_relation() {
		String id = "9c441eb7";
		RelationClass baseRelationClass = (RelationClass) testdata.metamodel.getClassById(id);
		IRelationship rel = testdata.createNewNondefiningRelationBasedOn(baseRelationClass);
		assertNotNull(rel);
		assertNotSame(rel.getId(),rel.getObjectClass());
		testdata.focusOnDiagram("63f1b081");
		BasicConnectionEditPart editPart = (BasicConnectionEditPart) testdata.getEditPartFor(rel.getDiagConnections().get(0));
		assertNotNull(editPart);
		BasicConnectionFigure figure = (BasicConnectionFigure) editPart.getConnectionFigure();
		Font font = figure.getConnectionLabel().getFont();
		assertArrayEquals(FontFactory.get("1|Andika|10.0|3|GTK|1|").getFontData(),font.getFontData());
		Color fontColor = figure.getConnectionLabel().getForegroundColor();
		assertEquals("#ff0000",ColorFactory.convertRGBToString(fontColor.getRGB()));
		int position = figure.getLabelPosition();
		assertEquals(0,position);
		int lineWidth = figure.getLineWidth();
		assertEquals(2,lineWidth);
		Color color = figure.getForegroundColor();
		assertEquals("#0000ff",ColorFactory.convertRGBToString(color.getRGB()));
		assertEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration", figure.getlineDecorationString());		
	}
}
