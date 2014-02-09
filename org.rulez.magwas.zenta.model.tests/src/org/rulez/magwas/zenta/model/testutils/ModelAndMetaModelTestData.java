package org.rulez.magwas.zenta.model.testutils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;

public class ModelAndMetaModelTestData extends ModelTestData {

	public IDiagramModelZentaConnection connection;
	private IZentaDiagramModel diagramModel;
	public IDiagramModelZentaConnection connection2;
	public IMetamodel metamodel;

	public ModelAndMetaModelTestData() {
		super();
        setUpMetaModel();
		setDiagramModel(getTemplateDiagramModel());
		assertNotNull(getDiagramModel());
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
			metamodel = IZentaFactory.eINSTANCE.createMetamodel(Util.assertNonNull(model));
	        assertNotNull(metamodel);
	        assertNotNull(metamodel.getTemplates());
		}

	public IBasicObject createClassedTestElement() {
		String id = "ea94cf6c";//User
		IZentaElement user = getElementById(id);
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
		IBasicObject oc = metamodel.getBuiltinObjectClass();
		IBasicObject newElement = (IBasicObject) oc.create(folder);
		return newElement;
	}
	public IBasicObject createClassedTestElement(IBasicObject baseClass) {
		String id = "ea94cf6c";//User
		IZentaElement user = getElementById(id);
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
		IBasicObject newElement = (IBasicObject) baseClass.create(folder);
		return newElement;
	}

	public IBasicObject getTestObjectClass() {
		IBasicObject element = (IBasicObject) ZentaModelUtils.getObjectByID(Util.assertNonNull(model), "ea94cf6c");
		ITemplate template = (ITemplate) metamodel.getBuiltinTemplate();
		assertNotNull(template);
		assertNotNull(template.getMetamodel());
		element.setTemplate(template);
		return element;
	}

	public IBasicObject createNewObjectClass(String elementName, IBasicObject baseClass) {
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
		IBasicRelationship oc = metamodel.getBuiltinRelationClass();
		IDiagramModel dm = getTemplateDiagramModel();
		IBasicRelationship rel = createNewConnection(elementName, oc, dm);
		return rel;
	}

	public IBasicRelationship createNewNondefiningRelationBasedOn(IBasicRelationship baseClass) {
		String name = "NonDefiningRelation";
		IDiagramModel dm = (IDiagramModel) this.getById("63f1b081");
		return createNewConnection(name, baseClass, dm);
	}
	public IBasicRelationship createNewConnection(String name,
			IBasicRelationship baseRelationClass, IDiagramModel diagram) {
		IBasicRelationship rel = createUnnamedRelation(baseRelationClass, diagram);
		rel.setName(name);
		return rel;
	}

	public IBasicRelationship createUnnamedRelation(
			IBasicRelationship baseRelationClass, IDiagramModel diagram) {
		IZentaElement sourceElement = createClassedTestElement();
		IZentaElement targetElement = createClassedTestElement();
		IFolder container = (IFolder) sourceElement.eContainer();
		IBasicRelationship rel = (IBasicRelationship) baseRelationClass.create(Util.assertNonNull(container));
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
		assertFalse(rel.isTemplate());
		return rel;
	}
	public IZentaDiagramModel getDiagramModel() {
		return Util.assertNonNull(diagramModel);
	}
	public void setDiagramModel(IZentaDiagramModel diagramModel) {
		this.diagramModel = diagramModel;
	}

}