package org.rulez.magwas.zenta.model.testutils;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class TestModel {

	public static final String THIRDGEN_RELATION = "secondGenrelation";
	public static final String THIRDGEN_OBJECT_2 = "oc2_2";
	public static final String THIRDGEN_OBJECT_1 = "oc2_1";
	public static final String SECONDGEN_RELATION = "testRelationka2";
	public static final String SECONDGEN_OBJECT_2 = "testOC2";
	public static final String SECONDGEN_OBJECT_1 = "testOC1";

	public IBasicObject thirdGenerationTarget;
	public IBasicObject thirdGenerationSource;
	public IFolder folder;
	public IZentaDiagramModel templateDiagram;
	public IZentaFactory factory = IZentaFactory.eINSTANCE;
	public IZentaDiagramModel diagramModel;
	public IBasicObject lastAddedElement;
	public IBasicObject firstgenSource;
	public IBasicObject firstgenTarget;
	public IBasicRelationship firstgenRelation;
	public IBasicObject secondgenSource;
	public IBasicObject secondgenTarget;
	public IZentaModel model;
	public TestModel createModel() {
		IZentaFactory factory = IZentaFactory.eINSTANCE;
		model = factory.createZentaModel();
		model.getMetamodel();
		setFolder(model);
		return this;
	}
	public IZentaModel getModel() {
		return model;
	}
	@SuppressWarnings("null")
	public TestModel addTemplateDiagrammodel() {
		setTemplateDiagram(factory.createZentaDiagramModel());
		getFolder().getElements().add(getTemplateDiagram());
		return this;
	}
	@SuppressWarnings("null")
	public TestModel addSimpleDiagramModel() {
		setDiagramModel(factory.createZentaDiagramModel());
		getFolder().getElements().add(getDiagramModel());
		return this;
	}
	public IBasicObject addElement(String name) {
		IZentaFactory factory = IZentaFactory.eINSTANCE;
		IBasicObject obj = factory.createBasicObject();
		obj.setName(name);
		getFolder().getElements().add(obj);
		assertTrue(getFolder().getElements().contains(obj));
		return obj;
	}
	public IDiagramModelZentaObject addElementToDiagram(String name) {
		lastAddedElement = addElement(name);
		IDiagramModelZentaObject dmo = addElementToTemplate(lastAddedElement);
		return dmo;
	}
	public IDiagramModelZentaObject addElementToTemplate(IBasicObject e) {
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

	public IDiagramModelZentaConnection createRelationWithDMC(String name1, String name2, String name) {
		IBasicObject e1 = addElement(name);
		IBasicObject e2 = addElement(name2);
		IDiagramModelZentaConnection zmc = createRelationWithDMC(e1, e2,
				name);
		return zmc;
	}
	public IDiagramModelZentaConnection createRelationWithDMC(
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
		public IBasicRelationship createRelationship(IBasicObject e, IBasicObject e2, String name) {
			IZentaFactory factory2 = IZentaFactory.eINSTANCE;
			IBasicRelationship rel = factory2.createBasicRelationship();
			folder.getElements().add(rel);
			rel.setName(name);
			rel.setSource(e);
			rel.setTarget(e2);
			return rel;
		}

	public IMetamodel getMetamodel() {
		return factory.getMetamodelFor(getFolder().getZentaModel());
	}
	public void makeTemplate() {
		IProperty prop = factory.createProperty();
		prop.setKey("Template");
		getTemplateDiagram().getProperties().add(prop);
	}
	public void createFirstGeneration() {
		createFirstGenerationNoTemplate();
		makeTemplate();
	}
	public void createFirstGenerationNoTemplate() {
		createModel();
		setFirstgenSource(addElement(SECONDGEN_OBJECT_1));
		setFirstgenTarget(addElement(SECONDGEN_OBJECT_2));
		addTemplateDiagrammodel();
		firstgenRelation = createRelationWithDMC(getFirstgenSource(), getFirstgenTarget(), SECONDGEN_RELATION).getRelationship();
	}
	
	public void createSecondGenerationWithrelation(IZentaDiagramModel dm) {
		createSecondGeneration(dm);
		createRelationWithDMC(getSecondgenSource(), getSecondgenTarget(), THIRDGEN_RELATION);
	}
	
	public void createThirdGeneration() {
		addSimpleDiagramModel();
		thirdGenerationSource = secondgenSource.create(getFolder());
		thirdGenerationSource.setName("e1");
		thirdGenerationTarget = secondgenTarget.create(getFolder());
		thirdGenerationTarget.setName("e2");
		addElementToDiagram(thirdGenerationSource);
		addElementToDiagram(thirdGenerationTarget);
	}

	public void createSecondGeneration(IZentaDiagramModel dm) {
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
	public void assertIsAllThirdGenRelations(
			NonNullList<IBasicRelationship> rcss) {
		List<String> rcsnames = Util.verifyNonNull(Arrays.asList(THIRDGEN_RELATION, SECONDGEN_RELATION, "Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(rcsnames,ModelTestUtils.definingNames(rcss));
	}
	
}
