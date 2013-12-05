package org.rulez.magwas.zenta.metamodel.testutil;

import static org.junit.Assert.*;


import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;

public class MetamodelBuilderTest {

	private IZentaModel model;
	private IZentaDiagramModel diagramModel;
	private ModelTestData testdata;
	private Metamodel metamodel;

	@Before
	public void setUp() {
		testdata = new ModelTestData();
		model = testdata.getModel();
		diagramModel = testdata.getTestDiagramModel();
		metamodel = MetamodelFactory.eINSTANCE.createMetamodel(model);
	}
	
	@Test
	public void The_builder_listens_to_canges_of_the_model() {
		String id = "ea94cf6c";
		IZentaElement element = testdata.getElementById(id);
		element.setName("newname");
	}

	@Test
	public void The_builder_has_a_metamodel_of_the_model() {
		assertNotNull(metamodel);
	}
	
	@Test
	public void The_builder_processes_Templates_when_initializes() {
		EList<Template> templates = metamodel.getTemplates();
		assertTrue(2 <= templates.size());
		int tsize = metamodel.getTemplates().size();
		Template template = metamodel.getTemplateFor(diagramModel);
		assertEquals(tsize,metamodel.getTemplates().size());
		assertNotNull(template);
	}
}
