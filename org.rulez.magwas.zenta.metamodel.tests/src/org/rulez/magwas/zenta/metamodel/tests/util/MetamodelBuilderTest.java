package org.rulez.magwas.zenta.metamodel.tests.util;

import static org.junit.Assert.*;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.util.MetamodelBuilder;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;

public class MetamodelBuilderTest {

	private MetamodelBuilder builder;
	private IZentaModel model;
	private IZentaDiagramModel diagramModel;
	private ModelTestData testdata;

	@Before
	public void setUp() {
		testdata = new ModelTestData();
		model = testdata.getModel();
		diagramModel = testdata.getTestDiagramModel();
		builder = new MetamodelBuilder(model);
	}
	
	@Test
	public void The_builder_listens_to_canges_of_the_model() {
		String id = "ea94cf6c";
		IZentaElement element = testdata.getElementById(id);
		element.setName("newname");
		assertEquals(element,builder.getLastObject());
	}

	@Test
	public void The_builder_has_a_metamodel_of_the_model() {
		assertNotNull(builder.getMetamodel());
	}
	
	@Test
	public void The_builder_processes_Templates_when_initializes() {
		EList<Template> templates = builder.getMetamodel().getTemplates();
		assertTrue(2 <= templates.size());
		Metamodel metamodel = builder.getMetamodel();
		int tsize = metamodel.getTemplates().size();
		Template template = metamodel.getTemplateFor(diagramModel);
		assertEquals(tsize,metamodel.getTemplates().size());
		assertNotNull(template);
	}
	
	@Test
	public void When_the_model_is_loaded_the_diagram_elements_are_converted_according_to_the_defining_element() {
		checkUserElement();
		checkDataElement();
	}

	private void checkUserElement() {
		IZentaElement userObject = testdata.getElementById("ea94cf6c");
		IDiagramModelObject diagObject1 = testdata.getDMOById("b2608459");
		IDiagramModelObject diagObject2 = testdata.getDMOById("9404b9cd");
		
		assertEquals("ellipseShape",diagObject1.getElementShape());
		assertEquals("1|Arial Black|11.0|1|GTK|1|",diagObject1.getFont());
		assertEquals("#ffffff",diagObject1.getFontColor());
		assertEquals(4,diagObject1.getTextAlignment());
		assertEquals("#ffa500",diagObject1.getFillColor());
		
		assertEquals("ellipseShape",diagObject2.getElementShape());
		assertEquals("1|Arial Black|11.0|1|GTK|1|",diagObject2.getFont());
		assertEquals("#ffffff",diagObject2.getFontColor());
		assertEquals(4,diagObject2.getTextAlignment());
		assertEquals("#ffa500",diagObject2.getFillColor());
		
		assertOnePropertyWithNameAndValue(userObject, "elementShape", "ellipseShape");
		assertOnePropertyWithNameAndValue(userObject, "font", "1|Arial Black|11.0|1|GTK|1|");
		assertOnePropertyWithNameAndValue(userObject, "fontColor", "#ffffff");
		assertOnePropertyWithNameAndValue(userObject, "textAlignment", "4");
		assertOnePropertyWithNameAndValue(userObject, "fillColor", "#ffa500");

	}
	private void checkDataElement() {
		IZentaElement userObject = testdata.getElementById("23138a61");
		IDiagramModelObject diagObject1 = testdata.getDMOById("99b3ed89");
		IDiagramModelObject diagObject2 = testdata.getDMOById("843322b7");
		assertEquals("emptyShape",diagObject1.getElementShape());
		assertEquals("emptyShape",diagObject2.getElementShape());
		assertOnePropertyWithNameAndValue(userObject, "elementShape", "emptyShape");
	}

	private static void assertOnePropertyWithNameAndValue(IZentaElement userObject,
			String propname, String value) {
		List<String> properties = userObject.getPropertyNamed(propname);
		assertEquals(1,properties.size());
		assertEquals(value, properties.get(0));
	}

}
