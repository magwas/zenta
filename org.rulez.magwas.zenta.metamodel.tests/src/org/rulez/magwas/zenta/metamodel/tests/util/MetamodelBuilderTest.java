package org.rulez.magwas.zenta.metamodel.tests.util;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.commands.AddDiagramObjectCommand;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.util.MetamodelBuilder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObject;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class MetamodelBuilderTest {

	private MetamodelBuilder builder;
	private IZentaModel zentaModel;

	@Before
	public void setUp() {
		ModelTestData testdata = new ModelTestData();
		zentaModel = testdata.getModel();
		builder = new MetamodelBuilder(zentaModel);
	}
	
	@Test
	public void The_builder_listens_to_canges_of_the_model() {
		BusinessObject element = (BusinessObject) ZentaModelUtils.getObjectByID(zentaModel, "ea94cf6c");
		element.setName("newname");
		assertEquals(element,builder.getLastObject());
	}
	
	@Test
	public void The_builder_has_a_metamodel_of_the_model() {
		builder.getMetamodel();
	}
	
	@Test
	public void The_builder_processes_Templates_when_initializes() {
		assertTrue(2 >= builder.getMetamodel().getTemplates().size());
	}
	
	
	@Test
	public void If_a_new_element_added_to_a_template__an_objectclass_will_be_created_for_it() {
		ModelTestData testdata = new ModelTestData();
		ZentaDiagramModel dm = testdata.getTestDiagramModel();
		BusinessObject elementToAdd = (BusinessObject) testdata.getById("a885cd76");
		System.out.printf("adding %s", elementToAdd);
		addElementToDiagramModel(dm,elementToAdd);
		assertEquals(elementToAdd,builder.getLastObject());
		assertTrue(metamodelHasObjectClassReferencingElement(elementToAdd));
	}

	private boolean metamodelHasObjectClassReferencingElement(
			BusinessObject elementToAdd) {
		EList<Template> templates = builder.getMetamodel().getTemplates();
		for(Template template : templates) {
			if(template.getReference() != null)
				if(null != template.getObjectClassReferencingElement(elementToAdd))
					return true;
		}
		return false;
	}

	private void addElementToDiagramModel(ZentaDiagramModel dm,
			BusinessObject elementToAdd) {
		DiagramModelZentaObject mo = (DiagramModelZentaObject) IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		mo.setZentaElement(elementToAdd);
		AddDiagramObjectCommand cmd = new AddDiagramObjectCommand(dm, mo);
		cmd.execute();
	}
}
