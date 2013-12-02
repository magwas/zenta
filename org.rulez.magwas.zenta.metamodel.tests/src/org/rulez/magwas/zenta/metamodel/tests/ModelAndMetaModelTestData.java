package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.assertNotNull;

import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ModelAndMetaModelTestData extends ModelTestData {

	public IDiagramModelZentaConnection connection;
	public IZentaDiagramModel diagramModel;
	public IDiagramModelZentaConnection connection2;
	public Metamodel metamodel;

	public ModelAndMetaModelTestData() {
		super();
        metamodel = MetamodelFactory.eINSTANCE.createMetamodel(model);
        assertNotNull(metamodel);
		diagramModel = getTestDiagramModel();
		assertNotNull(diagramModel);
		connection = getDMRById("24e3c661");
		assertNotNull(connection);
		connection2 = getDMRById("99e9c255");
		assertNotNull(connection2);

	}

	public IZentaElement createClassedTestElement() {
		String id = "ea94cf6c";//User
		IZentaElement user = getElementById(id);
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
		ObjectClass oc = metamodel.getBuiltinObjectClass();
		IZentaElement newElement = (IZentaElement) oc.create(folder);
		return newElement;
	}

	public ObjectClass createTestObjectClass() {
		IZentaElement element = (IZentaElement) ZentaModelUtils.getObjectByID(model, "ea94cf6c");
		return MetamodelFactory.eINSTANCE
				.createObjectClass(
						element,
						metamodel.getTemplates().get(0));
	}

	public IZentaElement createNewObjectClass(String elementName) {
		IZentaElement newElement = createClassedTestElement();
		IDiagramModel dm = getTestDiagramModel();
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
	
		dm.getChildren().add(dmo);
		newElement.setName(elementName);
		return newElement;
	}
	public IRelationship createNewRelationClass(String elementName) {
		IZentaElement newElement = createClassedTestElement();
		newElement.setName("test OC 1");
		IZentaElement newElement2 = createClassedTestElement();
		newElement2.setName("test OC 2");
		RelationClass oc = metamodel.getBuiltinRelationClass();
		IRelationship rel = (IRelationship) oc.create((IFolder) newElement.eContainer());
		rel.setSource(newElement);
		rel.setTarget(newElement2);
		IDiagramModel dm = getTestDiagramModel();
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
		IDiagramModelZentaObject dmo2 = ModelTestData.createDMOFor(newElement2);
		IDiagramModelZentaConnection diagramRelation =
				IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		diagramRelation.setSource(dmo);
		diagramRelation.setTarget(dmo2);
		diagramRelation.setRelationship(rel);
	
		dm.getChildren().add(dmo);
		dm.getChildren().add(dmo2);
		dmo.addConnection(diagramRelation);
		rel.setName(elementName);
		return rel;
	}

}