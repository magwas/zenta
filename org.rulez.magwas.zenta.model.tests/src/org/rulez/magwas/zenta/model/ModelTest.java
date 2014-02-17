package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ModelTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIdOkay() throws IOException, ParserConfigurationException, SAXException, URISyntaxException, XPathExpressionException {
		ModelTestData testdata = new ModelTestData();
		IBasicObject bo = (IBasicObject) testdata.getById("f33bd0d2");
		assertEquals("Procedure",bo.getName());
		testdata.saveResource();
		String path = testdata.resource.getURI().devicePath();
		Document testDoc = Util.createXmlDocumentFromFileName(Util.assertNonNull(path));
        String xpathExpression = "//sourceConnection[@id='24e3c661']";
	    Element node = ModelTestUtils.getElementByXpath(testDoc, xpathExpression);
        assertEquals("b0e2bfd8",node.getAttribute("relationship"));
	}
	
	@Test
	public void The_objects_are_loaded_in_the_model() {
		ModelTestData testdata = new ModelTestData();
		IZentaModel model = testdata.getModel();
		IBasicObject element = (IBasicObject) ZentaModelUtils.getObjectByID(model, "c3d03626");
		assertEquals("ProcessStep",element.getName());
	}
	@Test
	public void The_model_can_be_saved() {
		ModelTestData testdata = new ModelAndMetaModelTestData();
		File file = new File("/tmp/foo.zenta");
		ZentaModelUtils.saveModelToXMLFile(testdata.getModel(), file);
	}

	@Test
	public void setDefaults_adds_folders() {
		createModel();
	}

	@SuppressWarnings("null")
		private IFolder createModel() {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IZentaModel model = factory.createZentaModel();
			//model.setDefaults();
			IFolder folder = model.getFolders().get(0);
			assertNotNull(folder);
			return folder;
		}
	
	@Test
	public void DiagramModel_can_be_added_to_folder() {
		IFolder folder = createModel();
		addDiagrammodelToFolder(folder);
	}
		private IZentaDiagramModel addDiagrammodelToFolder(IFolder folder) {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IZentaDiagramModel dm = factory.createZentaDiagramModel();
			folder.getElements().add(dm);
			assertTrue(folder.getElements().contains(dm));
			return dm;
		}
	@Test
	public void Element_can_be_added_to_model() {
		IFolder folder = createModel();
		String name = "testOne";
		IBasicObject e = addElementToFolder(folder,name);
		assertEquals(e.getName(),name);
	}
		private IBasicObject addElementToFolder(IFolder folder, String name) {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IBasicObject obj = factory.createBasicObject();
			obj.setName(name);
			folder.getElements().add(obj);
			assertTrue(folder.getElements().contains(obj));
			return obj;
		}

	@Test
	public void Element_can_be_added_to_Diagram() {
		IFolder folder = createModel();
		String name = "testTwo";
		IBasicObject e = addElementToFolder(folder,name);
		IZentaDiagramModel dm = addDiagrammodelToFolder(folder);
		IDiagramModelZentaObject de = addElementToDiagram(e,dm);
		assertEquals(e, de.getZentaElement());
	}

		private IDiagramModelZentaObject addElementToDiagram(IBasicObject e, IZentaDiagramModel dm) {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IDiagramModelZentaObject dmo = factory.createDiagramModelZentaObject();
			dmo.setZentaElement(e);
			dm.getChildren().add(dmo);
			assertTrue(dm.getChildren().contains(dmo));
			return dmo;
		}

	@Test
	public void Model_have_metamodel_when_created() {
		IZentaFactory factory = IZentaFactory.eINSTANCE;
		IFolder folder = createModel();
		IZentaModel model = folder.getZentaModel();
		assertNotNull(model);
		IMetamodel metamodel = factory.getMetamodelFor(model);
		NonNullList<IBasicObject> ocs = metamodel.getObjectClasses();
		List<String> names = Util.assertNonNull(Arrays.asList("Basic Object"));
		ModelTestUtils.assertEqualsAsSet(names,ModelTestUtils.definingNames(ocs));
		NonNullList<IBasicObject> rcs = metamodel.getObjectClasses();
		List<String> relnames = Util.assertNonNull(Arrays.asList("Basic Object"));
		ModelTestUtils.assertEqualsAsSet(relnames,ModelTestUtils.definingNames(rcs));
	}

	@Test
	public void When_diagram_is_converted_to_template_the_objectclasses_are_generated() {
		IFolder folder = createModel();
		String name = "testThree";
		IBasicObject e = addElementToFolder(folder,name);
		IZentaDiagramModel dm = addDiagrammodelToFolder(folder);
		IDiagramModelZentaObject de = addElementToDiagram(e,dm);
		assertEquals(e, de.getZentaElement());
		IZentaFactory factory = makeTemplate(dm);
		IMetamodel metamodel = factory.getMetamodelFor(dm);
		NonNullList<IBasicObject> ocs = metamodel.getObjectClasses();
		List<String> names = Util.assertNonNull(Arrays.asList("testThree", "Basic Object"));
		ModelTestUtils.assertEqualsAsSet(names,ModelTestUtils.definingNames(ocs));
	}

	@Test
	public void When_diagram_is_converted_to_template_the_relationclasses_are_generated() {
		IFolder folder = createModel();
		IZentaDiagramModel dm = createDmWithRel(folder, "testFour", "testFive");
		IZentaFactory factory = makeTemplate(dm);
		IMetamodel metamodel = factory.getMetamodelFor(dm);
		NonNullList<IBasicRelationship> rcs = metamodel.getRelationClasses();
		List<String> names = Util.assertNonNull(Arrays.asList("testRelation", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(names,ModelTestUtils.definingNames(rcs));
	}

		private IDiagramModelZentaConnection createRelationWithDMC(IBasicObject e, IBasicObject e2, IZentaDiagramModel dm, String name) {
			IBasicRelationship rel = createRelationship(e, e2, name);
			IZentaFactory factory2 = IZentaFactory.eINSTANCE;
			IDiagramModelZentaConnection zmc = factory2.createDiagramModelZentaConnection();
			IDiagramModelZentaObject sourceDmo = addElementToDiagram(e,dm);
			IDiagramModelZentaObject targetDmo = addElementToDiagram(e2,dm);
			zmc.setSource(sourceDmo);
			zmc.setTarget(targetDmo);
			zmc.setRelationship(rel);
			sourceDmo.addConnection(zmc);
			return zmc;
		}
		
		private IBasicRelationship createRelationship(IBasicObject e, IBasicObject e2, String name) {
			IZentaFactory factory2 = IZentaFactory.eINSTANCE;
			IBasicRelationship rel = factory2.createBasicRelationship();
			rel.setName(name);
			rel.setSource(e);
			rel.setTarget(e2);
			return rel;
		}

	@Test
	public void Non_template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		IFolder folder = createModel();
		IBasicObject oc1 = addElementToFolder(folder,"testOC1");
		IBasicObject oc2 = addElementToFolder(folder,"testOC2");
		IZentaDiagramModel templateDM = addDiagrammodelToFolder(folder);
		IBasicRelationship rc = createRelationWithDMC(oc1, oc2,templateDM,"testRelationka").getRelationship();
		makeTemplate(templateDM);
		
		IZentaDiagramModel dm2 = addDiagrammodelToFolder(folder);
		IBasicObject e1 = oc1.create(folder);
		IBasicObject e2 = oc2.create(folder);
		IBasicRelationship rel = rc.create(folder);
		rel.setSource(e1);
		rel.setTarget(e2);
		addElementToDiagram(e1,dm2);
		addElementToDiagram(e2,dm2);
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.assertNonNull(dm2));
		List<IBasicRelationship> rcs = vp.getValidRelationships(e1, e2);

		List<String> names = Util.assertNonNull(Arrays.asList("testRelationka", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(names,ModelTestUtils.definingNames(rcs));
	}
	@Test
	public void Second_generation_non_template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		IFolder folder = createModel();
		IBasicObject oc1 = addElementToFolder(folder,"testOC1");
		IBasicObject oc2 = addElementToFolder(folder,"testOC2");
		IZentaDiagramModel templateDM = addDiagrammodelToFolder(folder);
		IBasicRelationship rc = createRelationWithDMC(oc1, oc2,templateDM,"testRelationka2").getRelationship();
		makeTemplate(templateDM);
		
		IMetamodel mm = oc2.getZentaModel().getMetamodel();
		NonNullList<IBasicObject> ocs = mm.getObjectClasses();
		List<String> ocsnames = Util.assertNonNull(Arrays.asList("testOC1", "testOC2", "Basic Object"));
		ModelTestUtils.assertEqualsAsSet(ocsnames,ModelTestUtils.definingNames(ocs));
		
		assertTrue(oc2.isTemplate());
		assertTrue(rc.isTemplate());
		
		IBasicObject oc2_1 = oc1.create(folder);
		oc2_1.setName("oc2_1");
		List<IBasicRelationship> oc1relsbefore = oc2_1.getAllowedRelations().get(Direction.SOURCE);
		List<String> rcsnamesbefore = Util.assertNonNull(Arrays.asList("testRelationka2", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(rcsnamesbefore,ModelTestUtils.definingNames(oc1relsbefore));
		IBasicObject oc2_2 = oc2.create(folder);
		oc2_2.setName("oc2_2");
		IBasicRelationship rel = rc.create(folder);
		rel.setSource(oc2_1);
		rel.setTarget(oc2_2);
		addElementToDiagram(oc2_1,templateDM);
		addElementToDiagram(oc2_2,templateDM);
		IBasicRelationship rc2 = createRelationWithDMC(oc2_1, oc2_2,templateDM,"secondGenrelation").getRelationship();
		assertTrue(rc2.isTemplate());
		NonNullList<IBasicRelationship> rcss = mm.getRelationClasses();
		List<String> rcsnames = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(rcsnames,ModelTestUtils.definingNames(rcss));

		
		IZentaDiagramModel dm2 = addDiagrammodelToFolder(folder);
		IBasicObject e1 = oc2_1.create(folder);
		IBasicObject ancie = e1.getAncestor();
		assertEquals(oc2_1, ancie);
		assertEquals(oc2_1, e1.getDefiningElement());
		e1.setName("e1");
		IBasicObject e2 = oc2_2.create(folder);
		e2.setName("e2");
		addElementToDiagram(e1,dm2);
		addElementToDiagram(e2,dm2);
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.assertNonNull(dm2));
		
		List<IBasicRelationship> startrcs = vp.getSourceRelationClassesFor(oc2_1);
		List<String> startrcnames = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(startrcnames,ModelTestUtils.definingNames(startrcs));
		
		List<IBasicRelationship> targetrcs = vp.getTargetRelationClassesFor(oc2_2);
		List<String> targetrcnames = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(targetrcnames,ModelTestUtils.definingNames(targetrcs));
		
		Collection<IBasicObject> targets = vp.getAllowedTargets(oc2_1);
		List<String> targetocnames = Util.assertNonNull(Arrays.asList("oc2_2", "testOC2", "Basic Object", "testOC1", "oc2_1"));
		ModelTestUtils.assertEqualsAsSet(targetocnames,ModelTestUtils.definingNames(targets));

	List<IBasicRelationship> oc1relsafter = oc2_1.getAllowedRelations().get(Direction.SOURCE);
	List<String> rcsnamesafter = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
	ModelTestUtils.assertEqualsAsSet(rcsnamesafter,ModelTestUtils.definingNames(oc1relsafter));

		List<IBasicRelationship> estartrcs = vp.getSourceRelationClassesFor(e1);
		List<String> estartrcnames = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(estartrcnames,ModelTestUtils.definingNames(estartrcs));
		
	List<IBasicRelationship> oc1relsafter2 = oc2_1.getAllowedRelations().get(Direction.SOURCE);
	List<String> rcsnamesafter2 = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
	ModelTestUtils.assertEqualsAsSet(rcsnamesafter2,ModelTestUtils.definingNames(oc1relsafter2));

		List<IBasicRelationship> etargetrcs = vp.getTargetRelationClassesFor(e2);
		List<String> etargetrcnames = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(etargetrcnames,ModelTestUtils.definingNames(etargetrcs));
		
		Collection<IBasicObject> etargets = vp.getAllowedTargets(oc2_1);
		List<String> etargetocnames = Util.assertNonNull(Arrays.asList("oc2_2", "testOC2", "Basic Object", "testOC1", "oc2_1"));
		ModelTestUtils.assertEqualsAsSet(etargetocnames,ModelTestUtils.definingNames(etargets));
		
		List<IBasicRelationship> rcs = vp.getValidRelationships(e1, e2);
		List<String> names = Util.assertNonNull(Arrays.asList("secondGenrelation", "testRelationka2", "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(names,ModelTestUtils.definingNames(rcs));
	}

	private IZentaFactory makeTemplate(IZentaDiagramModel dm) {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IProperty prop = factory.createProperty();
			prop.setKey("Template");
			dm.getProperties().add(prop);
			return factory;
		}
	
		private IZentaDiagramModel createDmWithRel(IFolder folder, String name,
				String name2) {
			IBasicObject e = addElementToFolder(folder,name);
			IBasicObject e2 = addElementToFolder(folder,name2);
			IZentaDiagramModel dm = addDiagrammodelToFolder(folder);
			createRelationWithDMC(e, e2,dm,"testRelation");
			return dm;
		}
}
