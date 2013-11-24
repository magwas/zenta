package org.rulez.magwas.zenta.metamodel.tests.util;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.util.MetamodelBuilder;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

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
		IZentaElement element = getElementById(id);
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
	
	private IZentaElement getElementById(String id) {
		return (IZentaElement) ZentaModelUtils.getObjectByID(model, id);
	}
}
