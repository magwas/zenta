package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.assertNotNull;

import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
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

}