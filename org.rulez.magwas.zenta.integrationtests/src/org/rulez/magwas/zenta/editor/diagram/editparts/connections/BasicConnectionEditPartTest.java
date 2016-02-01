package org.rulez.magwas.zenta.editor.diagram.editparts.connections;

import static org.junit.Assert.*;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.actions.DeleteFromModelAction;
import org.rulez.magwas.zenta.editor.diagram.commands.DeleteDiagramConnectionCommand;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.ToolTipFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.BasicConnectionFigure;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.FontFactory;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;

public class BasicConnectionEditPartTest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();

	}

	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}
	
	@Test
	public void The_connection_appearance_is_according_to_the_defining_relations_properties_in_the_template() {
		String id = "9c441eb7";
		IBasicRelationship element = testdata.getRelationByID(id);
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
		IBasicRelationship baseRelationClass = (IBasicRelationship) testdata.metamodel.getClassById(id);
		IBasicRelationship rel = testdata.createNewNondefiningRelationBasedOn(baseRelationClass);
		assertNotNull(rel);
		assertNotSame(rel,rel.getDefiningElement());
		testdata.focusOnDiagram("63f1b081");
		
		BasicConnectionEditPart editPart = (BasicConnectionEditPart) testdata.getEditPartFor(rel.getDiagConnections().get(0));
		assertNotNull(editPart);
		assertTrue(editPart.getFigure().isEnabled());
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
	public void Connection_in_non_template_can_be_deleted() {
		testdata.focusOnDiagram("63f1b081");
		BasicConnectionEditPart editPart = (BasicConnectionEditPart) testdata.getEditPartFor("0a589074");
		assertNotNull(editPart);
		IDiagramModelZentaConnection connection = editPart.getModel();
		assertNotNull(connection);
		DeleteDiagramConnectionCommand cmd = new DeleteDiagramConnectionCommand(connection);
		cmd.execute();
		assertNull(testdata.getStatus());
	}
	
	@Test
	public void ToolTip_displays_the_RelationClass() {
		Preferences.STORE.setValue(IPreferenceConstants.VIEW_TOOLTIPS, true);
		String id = "9c441eb7";
		IBasicRelationship baseRelationClass = (IBasicRelationship) testdata.metamodel.getClassById(id);
		IBasicRelationship rel = testdata.createNewNondefiningRelationBasedOn(baseRelationClass);
		rel.setName("Displayable Relation Name");
		assertNotNull(rel);
		assertFalse(rel.isTemplate());
		testdata.focusOnDiagram("63f1b081");
		
		BasicConnectionEditPart editPart = (BasicConnectionEditPart) testdata.getEditPartFor(rel.getDiagComponents().get(0));
		assertNotNull(editPart);
		ToolTipFigure toolTip = (ToolTipFigure) editPart.getFigure().getToolTip();
		String tooltiptext = toolTip.getText();
		assertEquals("Displayable Relation Name",tooltiptext);
		assertEquals("RelationClass: describes",toolTip.getType());
		assertEquals("test OC 1 describes test OC 2",ZentaLabelProvider.INSTANCE.getRelationshipSentence(rel));
	}
	@Test
	public void ToolTip_displays_the_RelationClass_of_the_defining_element() {
		Preferences.STORE.setValue(IPreferenceConstants.VIEW_TOOLTIPS, true);
		String id = "9c441eb7";
		IBasicRelationship baseRelationClass = (IBasicRelationship) testdata.metamodel.getClassById(id);
		IZentaDiagramModel dm = testdata.getTemplateDiagramModel();
		IBasicRelationship rel = testdata.createNewConnection("áRVÍZTŰRŐ TÜKÖRFÚRÓGÉP",baseRelationClass,dm);
		assertNotNull(rel);
		assertTrue(rel.isTemplate());
		testdata.focusOnDiagram(dm.getId());
		
		BasicConnectionEditPart editPart = (BasicConnectionEditPart) testdata.getEditPartFor(rel.getDiagComponents().get(0));
		assertNotNull(editPart);
		ToolTipFigure toolTip = (ToolTipFigure) editPart.getFigure().getToolTip();
		assertEquals("áRVÍZTŰRŐ TÜKÖRFÚRÓGÉP",toolTip.getText());
		assertEquals("RelationClass: describes",toolTip.getType());
		assertEquals("test OC 1 áRVÍZTŰRŐ TÜKÖRFÚRÓGÉP test OC 2",ZentaLabelProvider.INSTANCE.getRelationshipSentence(rel));
		assertEquals("áRVÍZTŰRŐ TÜKÖRFÚRÓGÉP",rel.getDefiningElement().getName());
	}
	
	@Test
	public void It_is_possible_to_delete_from_model_through_a_diagram_connection() {
		String id = "9c441eb7";
		IBasicRelationship baseRelationClass = (IBasicRelationship) testdata.metamodel.getClassById(id);
		IBasicRelationship rel = testdata.createNewNondefiningRelationBasedOn(baseRelationClass);
		rel.setName("Displayable Relation Name");
		assertNotNull(rel);
		assertFalse(rel.isTemplate());
		IZentaDiagramModel dia = testdata.getNonTemplateDiagramModel();
		testdata.focusOnDiagram(dia.getId());
		
		IDiagramModelComponent dmo = rel.getDiagComponents().get(0);
		BasicConnectionEditPart editPart = (BasicConnectionEditPart) testdata.getEditPartFor(dmo);
		assertNotNull(editPart);

		
		testdata.focusOnDiagram(dia.getId());
		EditPartViewer viewer = editPart.getViewer();
		
		viewer.appendSelection(editPart);
		
		ZentaDiagramEditor editor = testdata.getEditor();
		ActionRegistry actionregistry = (ActionRegistry) editor.getAdapter(ActionRegistry.class);
		IAction action = actionregistry.getAction(DeleteFromModelAction.ID);
		
		assertNotNull(rel.eContainer());
		assertNotNull(dmo.eContainer());
		action.run();
		assertNull(dmo.eContainer());
		assertNull(rel.eContainer());
	}

}
