package org.rulez.magwas.zenta.model.testutils;

import static org.junit.Assert.assertNotNull;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
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

	public IZentaElement createClassedTestElement() {
		String id = "ea94cf6c";//User
		IZentaElement user = getElementById(id);
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
		IObjectClass oc = metamodel.getBuiltinObjectClass();
		IZentaElement newElement = (IZentaElement) oc.create(folder);
		return newElement;
	}
	public IZentaElement createClassedTestElement(IObjectClass baseClass) {
		String id = "ea94cf6c";//User
		IZentaElement user = getElementById(id);
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
		IZentaElement newElement = (IZentaElement) baseClass.create(folder);
		return newElement;
	}

	public IObjectClass createTestObjectClass() {
		IZentaElement element = (IZentaElement) ZentaModelUtils.getObjectByID(model, "ea94cf6c");
		ITemplate template = (ITemplate) metamodel.getTemplates().get(0);
		assertNotNull(template);
		assertNotNull(template.getMetamodel());
		return IZentaFactory.eINSTANCE
				.createObjectClass(
						element,
						template);
	}

	public IZentaElement createNewObjectClass(String elementName, IObjectClass baseClass) {
		IZentaElement newElement = createClassedTestElement(baseClass);
		IDiagramModel dm = getTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
	
		dm.getChildren().add(dmo);
		newElement.setName(elementName);
		return newElement;
	}

	public IZentaElement createNewObjectClass(String elementName) {
		IZentaElement newElement = createClassedTestElement();
		IDiagramModel dm = getTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
	
		dm.getChildren().add(dmo);
		newElement.setName(elementName);
		return newElement;
	}
	public IRelationship createNewRelationClass(String elementName) {
		IRelationClass oc = metamodel.getBuiltinRelationClass();
		IDiagramModel dm = getTemplateDiagramModel();
		IRelationship rel = createNewConnection(elementName, oc, dm);
		return rel;
	}

	public IRelationship createNewNondefiningRelationBasedOn(IRelationClass baseClass) {
		String name = "NonDefiningRelation";
		IDiagramModel dm = (IDiagramModel) this.getById("63f1b081");
		return createNewConnection(name, baseClass, dm);
	}
	public IRelationship createNewConnection(String name,
			IRelationClass baseRelationClass, IDiagramModel diagram) {
		IRelationship rel = createUnnamedRelation(baseRelationClass, diagram);
		rel.setName(name);
		return rel;
	}

	public IRelationship createUnnamedRelation(
			IRelationClass baseRelationClass, IDiagramModel diagram) {
		IZentaElement sourceElement = createClassedTestElement();
		IZentaElement targetElement = createClassedTestElement();
		IRelationship rel = (IRelationship) baseRelationClass.create((IFolder) sourceElement.eContainer());
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