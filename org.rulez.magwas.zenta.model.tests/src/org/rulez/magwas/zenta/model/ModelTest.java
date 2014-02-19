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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ModelTest {

	private static final String THIRDGEN_RELATION = "secondGenrelation";
	private static final String THIRDGEN_OBJECT_2 = "oc2_2";
	private static final String THIRDGEN_OBJECT_1 = "oc2_1";
	private static final String SECONDGEN_RELATION = "testRelationka2";
	private static final String SECONDGEN_OBJECT_2 = "testOC2";
	private static final String SECONDGEN_OBJECT_1 = "testOC1";
	private BuildModel builder;

	@Before
	public void setUp() throws Exception {
		builder = new BuildModel();
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
		Document testDoc = Util.createXmlDocumentFromFileName(Util.verifyNonNull(path));
        String xpathExpression = "//sourceConnection[@id='24e3c661']";
	    Element node = ModelTestUtils.getElementByXpath(testDoc, xpathExpression);
        assertEquals("b0e2bfd8",node.getAttribute("relationship"));
	}
	
	@Test
	public void The_objects_are_loaded_in_the_model() {
		ModelTestData testdata = new ModelTestData();
		IZentaModel model = testdata.getModel();
		IBasicObject element = (IBasicObject) Util.verifyNonNull(ZentaModelUtils.getObjectByID(model, "c3d03626"));
		assertEquals("ProcessStep",element.getName());
	}

	@Test
	public void The_model_can_be_saved_and_loaded_in_idempotent_way() throws IOException {
		ModelTestData testdata = new ModelAndMetaModelTestData();
		File file = new File("/tmp/foo.zenta");
		ZentaModelUtils.saveModelToXMLFile(testdata.getModel(), file);
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
        resource.load(null);
	    IZentaModel model = (IZentaModel)resource.getContents().get(0);
	    model.getMetamodel();
	    File file2 = new File("/tmp/bar.zenta");
		ZentaModelUtils.saveModelToXMLFile(model, file2);
		String string1 = Util.readFile(file.getAbsolutePath());
		String string2 = Util.readFile(file2.getAbsolutePath());
		assertEquals(string1,string2);
	}

	@Test
	public void setDefaults_adds_folders() {
		builder.createModel();
		
		assertNotNull(builder.getFolder());
	}

	@Test
	public void DiagramModel_can_be_added_to_folder() {
		builder.createModel().
		
			addTemplateDiagrammodel();
		
		assertTrue(builder.getFolder().getElements().contains(builder.getTemplateDiagram()));
	}

	@Test
	public void Element_can_be_added_to_model() {
		builder.createModel();
		String name = "testOne";
		
		IBasicObject e = builder.addElement(name);
		
		assertEquals(e.getName(),name);
	}

	@Test
	public void Element_can_be_added_to_Diagram() {
		builder.createModel().addTemplateDiagrammodel();
		
		IDiagramModelZentaObject de = builder.addElementToDiagram("testTwo");
		
		assertEquals(builder.lastAddedElement, de.getZentaElement());
	}

	@Test
	public void Model_have_metamodel_when_created() {
		builder.createModel();
		
		IMetamodel metamodel = builder.getMetamodel();
		
		NonNullList<IBasicObject> ocs = metamodel.getObjectClasses();
		assertListHaveDefiningNames(ocs, "Basic Object");
		NonNullList<IBasicRelationship> rcs = metamodel.getRelationClasses();
		assertListHaveDefiningNames(rcs, "Basic Relation");
	}
	
	@Test
	public void When_diagram_is_converted_to_template_the_relationclasses_are_generated() {
		builder.createModel().addTemplateDiagrammodel();
		
		builder.createRelationWithDMC(SECONDGEN_OBJECT_1, SECONDGEN_OBJECT_2, SECONDGEN_RELATION);
		builder.makeTemplate();
		
		IMetamodel metamodel = builder.getMetamodel();
		NonNullList<IBasicRelationship> rcs = metamodel.getRelationClasses();
		List<String> names = Util.verifyNonNull(Arrays.asList(SECONDGEN_RELATION, "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(names,ModelTestUtils.definingNames(rcs));
	}

	@Test
	public void When_diagram_is_converted_to_template_the_objectclasses_are_generated() {
		builder.createFirstGeneration();
		
		assertTrue(builder.firstgenRelation.isTemplate());
		assertTrue(builder.getFirstgenTarget().isTemplate());
		
		IMetamodel mm = builder.getFirstgenTarget().getZentaModel().getMetamodel();
		NonNullList<IBasicObject> ocs = mm.getObjectClasses();
		assertListHaveDefiningNames(ocs, SECONDGEN_OBJECT_1, SECONDGEN_OBJECT_2, "Basic Object");
		
	}

	@Test
	public void Non_template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		builder.createFirstGeneration();
		
		builder.addSimpleDiagramModel();
		builder.createSecondGeneration(builder.getDiagramModel());
		
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(builder.getDiagramModel()));
		NonNullList<IBasicRelationship> rcs = vp.getValidRelationships(builder.getSecondgenSource(), builder.getSecondgenTarget());
		assertListHaveDefiningNames(rcs, SECONDGEN_RELATION, "Basic Relation");
	}

	@Test
	public void Template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		builder.createFirstGeneration();
		
		builder.createSecondGeneration(builder.getTemplateDiagram());
		
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(builder.getTemplateDiagram()));
		NonNullList<IBasicRelationship> rcs = vp.getValidRelationships(builder.getSecondgenSource(), builder.getSecondgenTarget());
		assertListHaveDefiningNames(rcs, SECONDGEN_RELATION, "Basic Relation");
	}

	@Test
	public void Second_generation_templates_define_relationclass() {
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		
		IMetamodel mm = builder.getFirstgenTarget().getZentaModel().getMetamodel();
		NonNullList<IBasicRelationship> rcss = mm.getRelationClasses();
		assertIsAllThirdGenRelations(rcss);
	}

	@Test
	public void Second_generation_non_template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		
		
		builder.addSimpleDiagramModel();
		IBasicObject e1 = builder.secondgenSource.create(builder.getFolder());
		e1.setName("e1");
		IBasicObject e2 = builder.secondgenTarget.create(builder.getFolder());
		e2.setName("e2");
		builder.addElementToDiagram(e1);
		builder.addElementToDiagram(e2);
		
		
		IBasicObject ancie = e1.getAncestor();
		assertEquals(builder.secondgenSource, ancie);
		assertEquals(builder.secondgenSource, e1.getDefiningElement());
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(builder.getDiagramModel()));
		
		NonNullList<IBasicRelationship> startrcs = vp.getSourceRelationClassesFor(builder.secondgenSource);
		assertIsAllThirdGenRelations(startrcs);
		
		NonNullList<IBasicRelationship> targetrcs = vp.getTargetRelationClassesFor(builder.secondgenTarget);
		assertIsAllThirdGenRelations(targetrcs);
		
		Collection<IBasicObject> targets = vp.getAllowedTargets(builder.secondgenSource);
		List<String> targetocnames = Util.verifyNonNull(Arrays.asList(THIRDGEN_OBJECT_2, SECONDGEN_OBJECT_2, "Basic Object", SECONDGEN_OBJECT_1, THIRDGEN_OBJECT_1));
		ModelTestUtils.assertEqualsAsSet(targetocnames,ModelTestUtils.definingNames(targets));

		NonNullList<IBasicRelationship> oc1relsafter = builder.secondgenSource.getAllowedRelations().get(Direction.SOURCE);
		assertIsAllThirdGenRelations(oc1relsafter);

		NonNullList<IBasicRelationship> estartrcs = vp.getSourceRelationClassesFor(e1);
		assertIsAllThirdGenRelations(estartrcs);
		
		NonNullList<IBasicRelationship> oc1relsafter2 = builder.secondgenSource.getAllowedRelations().get(Direction.SOURCE);
		assertIsAllThirdGenRelations(oc1relsafter2);

		NonNullList<IBasicRelationship> etargetrcs = vp.getTargetRelationClassesFor(e2);
		assertIsAllThirdGenRelations(etargetrcs);
		
		Collection<IBasicObject> etargets = vp.getAllowedTargets(builder.secondgenSource);
		List<String> etargetocnames = Util.verifyNonNull(Arrays.asList(THIRDGEN_OBJECT_2, SECONDGEN_OBJECT_2, "Basic Object", SECONDGEN_OBJECT_1, THIRDGEN_OBJECT_1));
		ModelTestUtils.assertEqualsAsSet(etargetocnames,ModelTestUtils.definingNames(etargets));
		
		NonNullList<IBasicRelationship> rcs = vp.getValidRelationships(e1, e2);
		assertIsAllThirdGenRelations(rcs);
	}


	private class BuildModel {

		private IFolder folder;
		private IZentaDiagramModel templateDiagram;
		private IZentaFactory factory = IZentaFactory.eINSTANCE;
		private IZentaDiagramModel diagramModel;
		private IBasicObject lastAddedElement;
		private IBasicObject firstgenSource;
		private IBasicObject firstgenTarget;
		public IBasicRelationship firstgenRelation;
		private IBasicObject secondgenSource;
		private IBasicObject secondgenTarget;
		private BuildModel createModel() {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IZentaModel model = factory.createZentaModel();
			model.getMetamodel();
			setFolder(model);
			return this;
		}
		@SuppressWarnings("null")
		private BuildModel addTemplateDiagrammodel() {
			setTemplateDiagram(factory.createZentaDiagramModel());
			getFolder().getElements().add(getTemplateDiagram());
			return this;
		}
		@SuppressWarnings("null")
		public BuildModel addSimpleDiagramModel() {
			setDiagramModel(factory.createZentaDiagramModel());
			getFolder().getElements().add(getDiagramModel());
			return this;
		}
		private IBasicObject addElement(String name) {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IBasicObject obj = factory.createBasicObject();
			obj.setName(name);
			getFolder().getElements().add(obj);
			assertTrue(getFolder().getElements().contains(obj));
			return obj;
		}
		private IDiagramModelZentaObject addElementToDiagram(String name) {
			lastAddedElement = addElement(name);
			IDiagramModelZentaObject dmo = addElementToTemplate(lastAddedElement);
			return dmo;
		}
		private IDiagramModelZentaObject addElementToTemplate(IBasicObject e) {
			return addElementToDiagram(e, getTemplateDiagram());
		}
		
		public IDiagramModelZentaObject addElementToDiagram(IBasicObject e) {
			return addElementToDiagram(e, getDiagramModel());		
		}
		public IDiagramModelZentaObject addElementToDiagram(IBasicObject e, IZentaDiagramModel templateDiagram) {
			IZentaFactory factory = IZentaFactory.eINSTANCE;
			IDiagramModelZentaObject dmo = factory.createDiagramModelZentaObject();
			dmo.setZentaElement(e);
			templateDiagram.getChildren().add(dmo);
			assertTrue(templateDiagram.getChildren().contains(dmo));
			return dmo;
		}

		private IDiagramModelZentaConnection createRelationWithDMC(String name1, String name2, String name) {
			IBasicObject e1 = addElement(name);
			IBasicObject e2 = addElement(name2);
			IDiagramModelZentaConnection zmc = createRelationWithDMC(e1, e2,
					name);
			return zmc;
		}
		private IDiagramModelZentaConnection createRelationWithDMC(
				IBasicObject e1, IBasicObject e2, String name) {
			IDiagramModelZentaObject sourceDmo = addElementToTemplate(e1);
			IDiagramModelZentaObject targetDmo = addElementToTemplate(e2);
			IBasicRelationship rel = createRelationship(e1, e2, name);
			IDiagramModelZentaConnection zmc = factory.createDiagramModelZentaConnection();
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

		public IMetamodel getMetamodel() {
			return factory.getMetamodelFor(getFolder().getZentaModel());
		}
		private void makeTemplate() {
			IProperty prop = factory.createProperty();
			prop.setKey("Template");
			getTemplateDiagram().getProperties().add(prop);
		}
		private void createFirstGeneration() {
			createFirstGenerationNoTemplate();
			makeTemplate();
		}
		private void createFirstGenerationNoTemplate() {
			createModel();
			setFirstgenSource(addElement(SECONDGEN_OBJECT_1));
			setFirstgenTarget(addElement(SECONDGEN_OBJECT_2));
			addTemplateDiagrammodel();
			firstgenRelation = createRelationWithDMC(getFirstgenSource(), getFirstgenTarget(), SECONDGEN_RELATION).getRelationship();
		}
		
		private void createSecondGenerationWithrelation(IZentaDiagramModel dm) {
			createSecondGeneration(dm);
			createRelationWithDMC(getSecondgenSource(), getSecondgenTarget(), THIRDGEN_RELATION);
		}
		private void createSecondGeneration(IZentaDiagramModel dm) {
			setSecondgenSource(getFirstgenSource().create(getFolder()));
			setSecondgenTarget(getFirstgenTarget().create(getFolder()));
			getSecondgenSource().setName(THIRDGEN_OBJECT_1);
			getSecondgenTarget().setName(THIRDGEN_OBJECT_2);
			addElementToDiagram(getSecondgenSource(), dm);
			addElementToDiagram(getSecondgenTarget(), dm);
		}
		@SuppressWarnings("null")
		public IFolder getFolder() {
			return folder;
		}
		public void setFolder(IZentaModel model) {
			this.folder = (IFolder) model;
		}
		@SuppressWarnings("null")
		public IBasicObject getFirstgenSource() {
			return firstgenSource;
		}
		public void setFirstgenSource(IBasicObject firstgenSource) {
			this.firstgenSource = firstgenSource;
		}
		@SuppressWarnings("null")
		public IBasicObject getFirstgenTarget() {
			return firstgenTarget;
		}
		public void setFirstgenTarget(IBasicObject firstgenTarget) {
			this.firstgenTarget = firstgenTarget;
		}
		@SuppressWarnings("null")
		public IBasicObject getSecondgenSource() {
			return secondgenSource;
		}
		public void setSecondgenSource(IBasicObject secondgenSource) {
			this.secondgenSource = secondgenSource;
		}
		@SuppressWarnings("null")
		public IBasicObject getSecondgenTarget() {
			return secondgenTarget;
		}
		public void setSecondgenTarget(IBasicObject secondgenTarget) {
			this.secondgenTarget = secondgenTarget;
		}
		@SuppressWarnings("null")
		public IZentaDiagramModel getDiagramModel() {
			return diagramModel;
		}
		public void setDiagramModel(IZentaDiagramModel diagramModel) {
			this.diagramModel = diagramModel;
		}
		@SuppressWarnings("null")
		public IZentaDiagramModel getTemplateDiagram() {
			return templateDiagram;
		}
		public void setTemplateDiagram(IZentaDiagramModel templateDiagram) {
			this.templateDiagram = templateDiagram;
		}
		
	}
	
	private void assertListHaveDefiningNames(NonNullList<? extends IBasicObject> list,
			String... names) {
		List<String> namelist = Util.verifyNonNull(Arrays.asList(names));
		ModelTestUtils.assertEqualsAsSet(namelist,ModelTestUtils.definingNames(list));
	}

	private void assertIsAllThirdGenRelations(
			NonNullList<IBasicRelationship> rcss) {
		List<String> rcsnames = Util.verifyNonNull(Arrays.asList(THIRDGEN_RELATION, SECONDGEN_RELATION, "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(rcsnames,ModelTestUtils.definingNames(rcss));
	}

}
