package org.rulez.magwas.zenta.model.testutils;

import static org.junit.Assert.assertNotNull;

import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ModelAndMetaModelTestData extends ModelTestData {

	public IDiagramModelZentaConnection connection;
	public IZentaDiagramModel diagramModel;
	public IDiagramModelZentaConnection connection2;
	public IMetamodel metamodel;

	public ModelAndMetaModelTestData() {
		super();
        setUpMetaModel();
		diagramModel = getTemplateDiagramModel();
		assertNotNull(diagramModel);
		connection = getDMRById("24e3c661");
		assertNotNull(connection);
		connection2 = getDMRById("99e9c255");
		assertNotNull(connection2);

	}
	public ModelAndMetaModelTestData(String resourcename) {
		super(resourcename);
		setUpMetaModel();
	}
		private void setUpMetaModel() {
			metamodel = IZentaFactory.eINSTANCE.createMetamodel(model);
	        assertNotNull(metamodel);
	        assertNotNull(metamodel.getTemplates());
		}

	public IBasicObject createClassedTestElement() {
		String id = "ea94cf6c";//User
		IZentaElement user = getElementById(id);
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
		IObjectClass oc = metamodel.getBuiltinObjectClass();
		IBasicObject newElement = (IBasicObject) oc.create(folder);
		return newElement;
	}
	public IBasicObject createClassedTestElement(IObjectClass baseClass) {
		String id = "ea94cf6c";//User
		IZentaElement user = getElementById(id);
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
		IBasicObject newElement = (IBasicObject) baseClass.create(folder);
		return newElement;
	}

	public IObjectClass getTestObjectClass() {
		IBasicObject element = (IBasicObject) ZentaModelUtils.getObjectByID(model, "ea94cf6c");
		ITemplate template = (ITemplate) metamodel.getBuiltinTemplate();
		assertNotNull(template);
		assertNotNull(template.getMetamodel());
		return IZentaFactory.eINSTANCE
				.createObjectClass(
						element,
						template);
	}

	public IBasicObject createNewObjectClass(String elementName, IObjectClass baseClass) {
		IBasicObject newElement = createClassedTestElement(baseClass);
		IDiagramModel dm = getTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
	
		dm.getChildren().add(dmo);
		newElement.setName(elementName);
		return newElement;
	}

	public IBasicObject createNewObjectClass(String elementName) {
		IBasicObject newElement = createClassedTestElement();
		IDiagramModel dm = getTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
	
		dm.getChildren().add(dmo);
		newElement.setName(elementName);
		return newElement;
	}
	public IBasicRelationship createNewRelationClass(String elementName) {
		IRelationClass oc = metamodel.getBuiltinRelationClass();
		IDiagramModel dm = getTemplateDiagramModel();
		IBasicRelationship rel = createNewConnection(elementName, oc, dm);
		return rel;
	}

	public IBasicRelationship createNewNondefiningRelationBasedOn(IRelationClass baseClass) {
		String name = "NonDefiningRelation";
		IDiagramModel dm = (IDiagramModel) this.getById("63f1b081");
		return createNewConnection(name, baseClass, dm);
	}
	public IBasicRelationship createNewConnection(String name,
			IRelationClass baseRelationClass, IDiagramModel diagram) {
		IBasicRelationship rel = createUnnamedRelation(baseRelationClass, diagram);
		rel.setName(name);
		return rel;
	}

	public IBasicRelationship createUnnamedRelation(
			IRelationClass baseRelationClass, IDiagramModel diagram) {
		IZentaElement sourceElement = createClassedTestElement();
		IZentaElement targetElement = createClassedTestElement();
		IBasicRelationship rel = (IBasicRelationship) baseRelationClass.create((IFolder) sourceElement.eContainer());
		rel.setSource(sourceElement);
		rel.setTarget(targetElement);
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(sourceElement);
		IDiagramModelZentaObject dmo2 = ModelTestData.createDMOFor(targetElement);
		sourceElement.setName("test OC 1");
		targetElement.setName("test OC 2");
		IDiagramModelZentaConnection diagramRelation =
				IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		diagramRelation.setSource(dmo);
		diagramRelation.setTarget(dmo2);
		diagramRelation.setRelationship(rel);
	
		diagram.getChildren().add(dmo);
		diagram.getChildren().add(dmo2);
		dmo.addConnection(diagramRelation);
		return rel;
	}

}