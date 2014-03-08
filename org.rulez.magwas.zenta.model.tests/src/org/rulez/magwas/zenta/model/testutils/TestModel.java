package org.rulez.magwas.zenta.model.testutils;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class TestModel {

	public static final int SOURCE = 1;
	public static final int TARGET = 2;
	public static final int RELATION = 4;
	public static final int BASE = 1;
	public static final int FIRST = 2;
	public static final int SECOND = 4;
	public static final int THIRD = 8;
	public static final String THIRDGEN_OBJECT_2 = "e2";
	public static final String THIRDGEN_OBJECT_1 = "e1";
	public static final String SECONDGEN_RELATION = "secondGenrelation";
	public static final String SECONDGEN_OBJECT_2 = "oc2_2";
	public static final String SECONDGEN_OBJECT_1 = "oc2_1";
	public static final String FIRSTGEN_RELATION = "firstGenRelation";
	public static final String FIRSTGEN_OBJECT_2 = "testOC2";
	public static final String FIRSTGEN_OBJECT_1 = "testOC1";
	private static final String THIRDGEN_RELATION = "reee";
	private String[][] matrix = {
			{"Basic Object","Basic Object","Basic Relation"},
			{FIRSTGEN_OBJECT_1, FIRSTGEN_OBJECT_2, FIRSTGEN_RELATION},
			{SECONDGEN_OBJECT_1, SECONDGEN_OBJECT_2, SECONDGEN_RELATION},
			{THIRDGEN_OBJECT_1, THIRDGEN_OBJECT_2, THIRDGEN_RELATION}
			};

	private IBasicObject thirdGenTarget;
	private IBasicObject thirdGenSource;
	public IFolder folder;
	public IZentaDiagramModel templateDiagram;
	public IZentaFactory factory = IZentaFactory.eINSTANCE;
	public IZentaDiagramModel diagramModel;
	private IBasicObject lastAddedElement;
	public IBasicObject firstgenSource;
	public IBasicObject firstgenTarget;
	public IBasicRelationship firstgenRelation;
	public IBasicObject secondgenSource;
	public IBasicObject secondgenTarget;
	public IZentaModel model;
	public IBasicRelationship secondgenRelation;
	private IBasicRelationship thirdGenerationRelation;
	public ISketchModel sketchModel;
	private IZentaDiagramModel emptyDiagramModel;
	public TestModel createModel() {
		IZentaFactory factory = IZentaFactory.eINSTANCE;
		model = factory.createZentaModel();
		model.getMetamodel();
		setFolder(getModel());
		return this;
	}
	public IZentaModel getModel() {
		return Util.verifyNonNull(model);
	}
	
	public TestModel addTemplateDiagrammodel() {
		setTemplateDiagram(factory.createZentaDiagramModel());
		getFolder().getElements().add(getTemplateDiagram());
		return this;
	}
	
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
		setLastAddedElement(addElement(name));
		IDiagramModelZentaObject dmo = addElementToTemplate(getLastAddedElement());
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

	public IDiagramModelZentaConnection createRelationWithDMC(
			IBasicObject e1, IBasicObject e2, IBasicRelationship rel) {
		IDiagramModelZentaObject sourceDmo = addElementToTemplate(e1);
		IDiagramModelZentaObject targetDmo = addElementToTemplate(e2);
		IDiagramModelZentaConnection zmc = factory.createDiagramModelZentaConnection();
		zmc.setRelationship(rel);
		zmc.setSource(sourceDmo);
		zmc.setTarget(targetDmo);
		sourceDmo.addConnection(zmc);
		targetDmo.addConnection(zmc);
		return zmc;
	}
		public IBasicRelationship createRelationship(IBasicObject e, IBasicObject e2, String name, IBasicRelationship ancie) {
			IBasicRelationship rel = ancie.create(getFolder());
			return wireInRelationShip(e, e2, name, rel);
		}
		private IBasicRelationship wireInRelationShip(IBasicObject e,
				IBasicObject e2, String name, IBasicRelationship rel) {
			rel.setName(name);
			rel.setSource(e);
			rel.setTarget(e2);
			return rel;
		}
		private IBasicRelationship createRelationship(IBasicObject firstgenSource2,
				IBasicObject firstgenTarget2, String name) {
			IBasicRelationship rel = factory.createBasicRelationship();
			folder.getElements().add(rel);
			return wireInRelationShip(firstgenSource2, firstgenTarget2, name, rel);
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
		setFirstgenSource(addElement(FIRSTGEN_OBJECT_1));
		setFirstgenTarget(addElement(FIRSTGEN_OBJECT_2));
		addTemplateDiagrammodel();
		setFirstgenRelation(createRelationship(getFirstgenSource(), getFirstgenTarget(), FIRSTGEN_RELATION));
		createRelationWithDMC(getFirstgenSource(), getFirstgenTarget(), getFirstgenRelation());
	}
	
	public void createSecondGenerationWithrelation(IZentaDiagramModel dm) {
		createSecondGenerationNoDMO();
		setSecondgenRelation(createRelationship(getSecondgenSource(), getSecondgenTarget(), SECONDGEN_RELATION, getFirstgenRelation()));
		createRelationWithDMC(getSecondgenSource(), getSecondgenTarget(), getSecondgenRelation());
	}
	public void createSecondGeneration(IZentaDiagramModel dm) {
		createSecondGenerationNoDMO();
		addElementToDiagram(getSecondgenSource(), dm);
		addElementToDiagram(getSecondgenTarget(), dm);
	}
	private void createSecondGenerationNoDMO() {
		setSecondgenSource(getFirstgenSource().create(getFolder()));
		setSecondgenTarget(getFirstgenTarget().create(getFolder()));
		getSecondgenSource().setName(SECONDGEN_OBJECT_1);
		getSecondgenTarget().setName(SECONDGEN_OBJECT_2);
	}
	
	public void createThirdGeneration() {
		addSimpleDiagramModel();
		setThirdGenSource(secondgenSource.create(getFolder()));
		getThirdGenSource().setName(THIRDGEN_OBJECT_1);
		setThirdGenTarget(secondgenTarget.create(getFolder()));
		getThirdGenTarget().setName(THIRDGEN_OBJECT_2);
		addElementToDiagram(getThirdGenSource());
		addElementToDiagram(getThirdGenTarget());
	}
	
	public void createThirdGenerationWithRelation() {
		createThirdGeneration();
		setThirdGenerationRelation(createRelationship(getThirdGenSource(), getThirdGenTarget(), THIRDGEN_RELATION, getSecondgenRelation()));
		arrangeDMOs(this.getTemplateDiagram());
		arrangeDMOs(this.getDiagramModel());
	}
	
	public void arrangeDMOs(IZentaDiagramModel dia) {
		int n = 0;
		double phi = 0;
		int x0 = 100;
		int y0 = 100;
		int r = 150;
		for(IDiagramModelObject i : dia.getChildren()) {
			double x = x0 + r*Math.sin(n*phi);
			double y = y0 + r*Math.cos(n*phi);
			i.getBounds().setX((int) x);
			i.getBounds().setY((int) y);
			n += 1;
			phi += Math.PI*0.3;
		}
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
	
	public void assertIsElements(List<? extends IBasicObject> list, int generations, int objs) {
		List<String> names = new ArrayList<String>();
		for(int i=0;i<4;i++)
			if((generations & (1<<i))>0)
				for(int j=0;j<3;j++)
					if((objs & (1<<j))>0)
						if(!names.contains(matrix[i][j]))
							names.add(matrix[i][j]);
		HashSet<String> definingNames = ModelTestUtils.definingNames(list);
		ModelTestUtils.assertEqualsAsSet(names,definingNames);
	}
	public void assertIsAllFirstGenRelations(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST,RELATION);
	}
	public void assertIsAllSecondGenRelations(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST|SECOND,RELATION);
	}
	public void assertIsAllThirdGenRelations(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST|SECOND|THIRD,RELATION);
	}
	public void assertIsAllFirstGenObjects(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST,SOURCE|TARGET);
	}
	public void assertIsAllSecondGenObjects(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST|SECOND,SOURCE|TARGET);
	}
	public void assertIsAllThirdGenObjects(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST|SECOND|THIRD,SOURCE|TARGET);
	}
	public void assertIsAllFirstGenSources(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST,SOURCE);
	}
	public void assertIsAllSecondGenSources(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST|SECOND,SOURCE);
	}
	public void assertIsAllThirdGenSources(
			List<? extends IBasicObject> rcss) {
		assertIsElements(rcss,BASE|FIRST|SECOND|THIRD,SOURCE);
	}
	public IBasicRelationship getSecondgenRelation() {
		return Util.verifyNonNull(secondgenRelation);
	}
	public void setSecondgenRelation(IBasicRelationship secondgenRelation) {
		this.secondgenRelation = secondgenRelation;
	}
	public IBasicRelationship getFirstgenRelation() {
		return Util.verifyNonNull(firstgenRelation);
	}
	public void setFirstgenRelation(IBasicRelationship firstgenRelation) {
		this.firstgenRelation = firstgenRelation;
	}
	public IBasicRelationship getThirdGenerationRelation() {
		return Util.verifyNonNull(thirdGenerationRelation);
	}
	public void setThirdGenerationRelation(IBasicRelationship thirdGenerationRelation) {
		this.thirdGenerationRelation = thirdGenerationRelation;
	}
	public void assertMetaIsOK() {
		IMetamodel mm = getMetamodel();
		assertIsAllFirstGenSources(firstgenSource.getAncestry());
		assertIsAllFirstGenRelations(getFirstgenRelation().getAncestry());
		assertIsAllSecondGenSources(secondgenSource.getAncestry());
		assertIsAllSecondGenRelations(getSecondgenRelation().getAncestry());
		assertIsAllThirdGenSources(getThirdGenSource().getAncestry());
		assertIsAllThirdGenRelations(getThirdGenerationRelation().getAncestry());
		assertIsAllFirstGenSources(firstgenSource.getAncestry());
		assertIsAllFirstGenRelations(getFirstgenRelation().getAncestry());
		assertIsAllSecondGenSources(secondgenSource.getAncestry());
		assertIsAllSecondGenRelations(getSecondgenRelation().getAncestry());
		assertIsAllThirdGenSources(getThirdGenSource().getAncestry());
		assertIsAllThirdGenRelations(getThirdGenerationRelation().getAncestry());
		assertTrue(firstgenSource.isTemplate());
		assertTrue(firstgenTarget.isTemplate());
		assertTrue(firstgenRelation.isTemplate());
		assertTrue(secondgenSource.isTemplate());
		assertTrue(secondgenTarget.isTemplate());
		assertTrue(secondgenRelation.isTemplate());
		assertIsAllSecondGenObjects(mm.getObjectClasses());
		assertIsAllSecondGenRelations(mm.getRelationClasses());
		assertIsAllThirdGenSources(getThirdGenSource().getAncestry());
		assertIsAllThirdGenRelations(getThirdGenerationRelation().getAncestry());
		assertIsAllSecondGenObjects(mm.getObjectClasses());
		assertIsAllSecondGenRelations(mm.getRelationClasses());

		
		assertIsAllThirdGenSources(getThirdGenSource().getAncestry());
		assertIsAllThirdGenRelations(getThirdGenerationRelation().getAncestry());
		assertIsAllSecondGenObjects(mm.getObjectClasses());
		assertIsAllSecondGenRelations(mm.getRelationClasses());
		assertTrue(firstgenSource.isTemplate());
		assertTrue(firstgenTarget.isTemplate());
		assertTrue(firstgenRelation.isTemplate());
		assertTrue(secondgenSource.isTemplate());
		assertTrue(secondgenTarget.isTemplate());
		assertTrue(secondgenRelation.isTemplate());
	}
	public IBasicObject getLastAddedElement() {
		return Util.verifyNonNull(lastAddedElement);
	}
	public void setLastAddedElement(IBasicObject lastAddedElement) {
		this.lastAddedElement = lastAddedElement;
	}
	public IBasicObject getThirdGenSource() {
		return Util.verifyNonNull(thirdGenSource);
	}
	public void setThirdGenSource(IBasicObject thirdGenSource) {
		this.thirdGenSource = thirdGenSource;
	}
	public IBasicObject getThirdGenTarget() {
		return Util.verifyNonNull(thirdGenTarget);
	}
	public void setThirdGenTarget(IBasicObject thirdGenTarget) {
		this.thirdGenTarget = thirdGenTarget;
	}
	public void createFullModel() {
		createFirstGeneration();
		createSecondGenerationWithrelation(getTemplateDiagram());
		createThirdGeneration();
		arrangeDMOs(getDiagramModel());
		arrangeDMOs(getTemplateDiagram());
	}
	public IZentaDiagramModel getEmptyDiagramModel() {
		return Util.verifyNonNull(emptyDiagramModel);
	}
	public void setEmptyDiagramModel(IZentaDiagramModel emptyDiagramModel) {
		this.emptyDiagramModel = emptyDiagramModel;
	}
	
}
