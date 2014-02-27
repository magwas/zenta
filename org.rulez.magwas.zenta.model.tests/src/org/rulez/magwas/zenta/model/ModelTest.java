package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.model.testutils.TestModel;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ModelTest {

	public TestModel builder;

	@Before
	public void setUp() throws Exception {
		builder = new TestModel();
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
	public void Diagram_objects_have_bounds() throws IOException {
		builder.createFullModel();
	    String dmoid = builder.getFirstgenSource().getDiagComponents().get(0).getId();

		File file = new File("/tmp/foo.zenta");
		ZentaModelUtils.saveModelToXMLFile(builder.getModel(), file);
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
        resource.load(null);
	    @SuppressWarnings("null")
		@NonNull IZentaModel model = (IZentaModel)resource.getContents().get(0);
	    
	    IDiagramModelObject dmo = Util.verifyNonNull((IDiagramModelObject) ZentaModelUtils.getObjectByID(model, dmoid));
	    IBounds bounds = dmo.getBounds();
	    assertNotNull(bounds);
	    assertTrue(bounds.getX()>0);
	    assertTrue(bounds.getY()>0);
	    assertTrue(bounds.getWidth()>0);
	    assertTrue(bounds.getHeight()>0);
	}

	@Test
	public void The_model_can_be_saved_and_loaded_in_idempotent_way() throws IOException {
		builder.createFullModel();

		File file = new File("/tmp/foo.zenta");
		ZentaModelUtils.saveModelToXMLFile(builder.getModel(), file);
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
        resource.load(null);
	    IZentaModel model = (IZentaModel)resource.getContents().get(0);
	    model.getMetamodel();
	    File file2 = new File("/tmp/bar.zenta");
		ZentaModelUtils.saveModelToXMLFile(model, file2);
		
		assertFilesAreSame(file, file2);
	}

	private void assertFilesAreSame(File file, File file2) throws IOException {
		@SuppressWarnings("null")
		@NonNull String absolutePath = file.getAbsolutePath();
		@SuppressWarnings("null")
		@NonNull String absolutePath2 = file2.getAbsolutePath();
		String string1 = Util.readFile(absolutePath);
		String string2 = Util.readFile(absolutePath2);
		assertEquals(string1,string2);
	}
	@Test
	public void Model_with_moved_builtin_classes_can_be_loaded() throws IOException {
		builder.createFullModel();
		
		IZentaModel model0 = builder.getModel();
		IFolder folder = IZentaFactory.eINSTANCE.createFolder();
		folder.getElements().addAll(model0.getElements());
		model0.getFolders().add(folder);

		File file = new File("/tmp/foo.zenta");
		ZentaModelUtils.saveModelToXMLFile(builder.getModel(), file);
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
        resource.load(null);
	    IZentaModel model = (IZentaModel)resource.getContents().get(0);
	    model.getMetamodel();
	    File file2 = new File("/tmp/bar.zenta");
		ZentaModelUtils.saveModelToXMLFile(model, file2);
		
		assertFilesAreSame(file, file2);
	}

	@Test
	public void Object_ancestry_is_built_correctly() throws IOException {
		builder.createFirstGeneration();
		
		IMetamodel mm = builder.getMetamodel();
		builder.assertIsAllFirstGenSources(builder.firstgenSource.getAncestry());
		builder.assertIsAllFirstGenRelations(builder.getFirstgenRelation().getAncestry());
		builder.assertIsAllFirstGenObjects(mm.getObjectClasses());
		builder.assertIsAllFirstGenRelations(mm.getRelationClasses());
		assertTrue(builder.firstgenSource.isTemplate());
		assertTrue(builder.firstgenTarget.isTemplate());
		assertTrue(builder.firstgenRelation.isTemplate());
		
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		
		builder.assertIsAllSecondGenSources(builder.secondgenSource.getAncestry());
		builder.assertIsAllSecondGenRelations(builder.getSecondgenRelation().getAncestry());
		builder.assertIsAllSecondGenObjects(mm.getObjectClasses());
		builder.assertIsAllSecondGenRelations(mm.getRelationClasses());
		assertTrue(builder.firstgenSource.isTemplate());
		assertTrue(builder.firstgenTarget.isTemplate());
		assertTrue(builder.firstgenRelation.isTemplate());
		assertTrue(builder.secondgenSource.isTemplate());
		assertTrue(builder.secondgenTarget.isTemplate());
		assertTrue(builder.secondgenRelation.isTemplate());
		
		builder.createThirdGenerationWithRelation();
		builder.assertMetaIsOK();
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
		
		assertEquals(builder.getLastAddedElement(), de.getZentaElement());
	}

	@Test
	public void Model_have_metamodel_when_created() {
		builder.createModel();
		
		IMetamodel metamodel = builder.getMetamodel();
		
		List<IBasicObject> ocs = metamodel.getObjectClasses();
		builder.assertIsElements(ocs, 1, 1);
		NonNullList<IBasicRelationship> rcs = metamodel.getRelationClasses();
		assertListHaveDefiningNames(rcs, "Basic Relation");
	}
	
	@Test
	public void When_diagram_is_converted_to_template_the_relationclasses_are_generated() {
		builder.createModel().addTemplateDiagrammodel();
		builder.createFirstGenerationNoTemplate();
		builder.makeTemplate();
		
		IMetamodel metamodel = builder.getMetamodel();
		NonNullList<IBasicRelationship> rcs = metamodel.getRelationClasses();
		builder.assertIsAllFirstGenRelations(rcs);
	}

	@Test
	public void When_diagram_is_converted_to_template_the_objectclasses_are_generated() {
		builder.createFirstGeneration();
		
		assertTrue(builder.getFirstgenRelation().isTemplate());
		assertTrue(builder.getFirstgenTarget().isTemplate());
		
		IMetamodel mm = builder.getFirstgenTarget().getZentaModel().getMetamodel();
		NonNullList<IBasicObject> ocs = mm.getObjectClasses();
		builder.assertIsAllFirstGenObjects(ocs);
		
	}

	@Test
	public void Non_template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		builder.createFirstGeneration();
		
		builder.addSimpleDiagramModel();
		builder.createSecondGeneration(builder.getDiagramModel());
		
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(builder.getDiagramModel()));
		NonNullList<IBasicRelationship> rcs = vp.getValidRelationships(builder.getSecondgenSource(), builder.getSecondgenTarget());
		builder.assertIsAllFirstGenRelations(rcs);
	}

	@Test
	public void Template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		builder.createFirstGeneration();
		
		builder.createSecondGeneration(builder.getTemplateDiagram());
		
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(builder.getTemplateDiagram()));
		NonNullList<IBasicRelationship> rcs = vp.getValidRelationships(builder.getSecondgenSource(), builder.getSecondgenTarget());
		builder.assertIsAllFirstGenRelations(rcs);
	}

	@Test
	public void Objects_appearing_in_a_template_can_be_put_to_another_folder() throws IOException {
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		IFolder newFolder = IZentaFactory.eINSTANCE.createFolder();
		newFolder.setName("newFolder");
		builder.folder.getFolders().add(newFolder);
		
		assertEquals(1, builder.secondgenSource.getDiagComponents().size());
		IDiagramModelZentaObject diagobj1 = (IDiagramModelZentaObject) builder.secondgenSource.getDiagComponents().get(0);
		
		newFolder.getElements().add(builder.secondgenSource);
		
		assertEquals("newFolder", ((IFolder)builder.secondgenSource.eContainer()).getName());
		assertEquals(1, builder.secondgenSource.getDiagComponents().size());
		assertEquals(diagobj1, builder.secondgenSource.getDiagComponents().get(0));
		
		IMetamodel mm = builder.getFirstgenTarget().getZentaModel().getMetamodel();
		NonNullList<IBasicRelationship> rcss = mm.getRelationClasses();
		builder.assertIsAllSecondGenRelations(rcss);

		EList<EObject> elements = newFolder.getElements();
		elements.add(builder.firstgenSource);
		assertTrue(builder.secondgenSource.isTemplate());
		assertTrue(builder.firstgenSource.isTemplate());
		assertTrue(builder.getFirstgenRelation().isTemplate());

		assertEquals("newFolder", ((IFolder)builder.secondgenSource.eContainer()).getName());
		assertEquals(1, builder.secondgenSource.getDiagComponents().size());
		assertEquals(diagobj1, builder.secondgenSource.getDiagComponents().get(0));
		
		NonNullList<IBasicRelationship> rcss2 = mm.getRelationClasses();
		builder.assertIsAllSecondGenRelations(rcss2);
		File file = new File("/tmp/baz.zenta");
		ZentaModelUtils.saveModelToXMLFile(builder.getModel(), file);
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
        resource.load(null);
	    IZentaModel model = (IZentaModel)resource.getContents().get(0);
	    model.getMetamodel();
	    File file2 = new File("/tmp/qqx.zenta");
		ZentaModelUtils.saveModelToXMLFile(model, file2);
		assertFilesAreSame(file, file2);
	}
	
	@Test
	public void Second_generation_templates_define_relationclass() {
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		
		IMetamodel mm = builder.getFirstgenTarget().getZentaModel().getMetamodel();
		NonNullList<IBasicRelationship> rcss = mm.getRelationClasses();
		builder.assertIsAllSecondGenRelations(rcss);
	}

	@Test
	public void Second_generation_non_template_objects_can_be_legally_connected_with_connection_according_to_the_template() {
		builder.createFullModel();
		
		
		IBasicObject ancie = builder.getThirdGenSource().getAncestor();
		assertEquals(builder.secondgenSource, ancie);
		assertEquals(builder.secondgenSource, builder.getThirdGenSource().getDefiningElement());
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(builder.getDiagramModel()));
		
		NonNullList<IBasicRelationship> startrcs = vp.getSourceRelationClassesFor(builder.getSecondgenSource());
		builder.assertIsAllSecondGenRelations(startrcs);
		
		NonNullList<IBasicRelationship> targetrcs = vp.getTargetRelationClassesFor(builder.getSecondgenTarget());
		builder.assertIsAllSecondGenRelations(targetrcs);
		
		NonNullList<IBasicObject> targets = vp.getAllowedTargets(builder.getSecondgenSource());
		builder.assertIsAllSecondGenObjects(targets);

		@SuppressWarnings("null")
		@NonNull
		NonNullList<IBasicRelationship> oc1relsafter = builder.secondgenSource.getAllowedRelations().get(Direction.SOURCE);
		builder.assertIsAllSecondGenRelations(oc1relsafter);

		NonNullList<IBasicRelationship> estartrcs = vp.getSourceRelationClassesFor(builder.getThirdGenSource());
		builder.assertIsAllSecondGenRelations(estartrcs);
		
		@SuppressWarnings("null")
		@NonNull
		NonNullList<IBasicRelationship> oc1relsafter2 = builder.secondgenSource.getAllowedRelations().get(Direction.SOURCE);
		builder.assertIsAllSecondGenRelations(oc1relsafter2);

		NonNullList<IBasicRelationship> etargetrcs = vp.getTargetRelationClassesFor(builder.getThirdGenTarget());
		builder.assertIsAllSecondGenRelations(etargetrcs);
		
		NonNullList<IBasicObject> etargets = vp.getAllowedTargets(builder.getSecondgenSource());
		builder.assertIsAllSecondGenObjects(etargets);
		
		NonNullList<IBasicRelationship> rcs = vp.getValidRelationships(builder.getThirdGenSource(), builder.getThirdGenTarget());
		builder.assertIsAllSecondGenRelations(rcs);
	}

	@Test
	public void getDiagramModels_finds_all_diagram_models() {
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		builder.createThirdGenerationWithRelation();
		IZentaModel model = builder.getModel();
		
		EList<IDiagramModel> dms = model.getDiagramModels();
		
		assertEquals(2, dms.size());

	}

	@Test
	public void getDiagramModels_finds_diagram_models_put_in_subfolder() {
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		builder.createThirdGenerationWithRelation();
		IZentaModel model = builder.getModel();
		IFolder folder1 = builder.factory.createFolder();
		IFolder folder2 = builder.factory.createFolder();
		builder.getModel().getFolders().add(folder1);
		folder1.getFolders().add(folder2);
		folder2.getElements().add(builder.getTemplateDiagram());
		
		EList<IDiagramModel> dms = model.getDiagramModels();
		
		assertEquals(2, dms.size());

	}

	private void assertListHaveDefiningNames(NonNullList<? extends IBasicObject> list,
			String... names) {
		List<String> namelist = Util.verifyNonNull(Arrays.asList(names));
		ModelTestUtils.assertEqualsAsSet(namelist,ModelTestUtils.definingNames(list));
	}

}
