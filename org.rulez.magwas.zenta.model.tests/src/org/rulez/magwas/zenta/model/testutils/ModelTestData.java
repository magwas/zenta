package org.rulez.magwas.zenta.model.testutils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.ModelConsistencyException;
import org.rulez.magwas.zenta.model.ZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.manager.IArchiveManager;
import org.rulez.magwas.zenta.model.manager.TestModelManager;

public class ModelTestData {

	public Resource resource;
	private File file;
	public IZentaModel model;
	
	public ModelTestData(String resourcename) {
		initialize(resourcename);
	}
	public ModelTestData() {
		initialize("test.zenta");
	}
		private void initialize(String resourcename) {
			resource = ModelTestUtils.getZentaModelResource(resourcename);
			assertNotNull(resource);
			setFile(new File(resource.getURI().toFileString()));
			assertNotNull(getFile());
			model = getModel();
		}
	
	public IZentaModel getModel() {//FIXME: should use ModelManager
		IZentaModel m = model;
		if( null == m )
			m = (IZentaModel)resource.getContents().get(0);
		checkModel(m);
		return Util.verifyNonNull(m);
	}
	private void checkModel(IZentaModel m) {
		boolean okay=false;
		while(!okay) {
			try {
				m.check();
				okay = true;
			} catch(ModelConsistencyException ex) {
				ZentaObject element = ex.getElement();
				System.out.printf("element=%s\ncontainer=%s", element, element.eContainer());
				((IFolder)element.eContainer()).getElements().remove(element);
			}
		}
	}
	
	public void saveResource() throws IOException {
		URI backup_uri = resource.getURI().appendFileExtension("bak");
		resource.setURI(backup_uri);
		Map<String, Object> options = new HashMap<String,Object>();
		resource.save(options);
	}

	public IZentaDiagramModel getTemplateDiagramModel() {
		IZentaModel model = getModel();
		IZentaDiagramModel diagramModel = (IZentaDiagramModel) Util.verifyNonNull(ZentaModelUtils.getObjectByID(model, "2ea99535"));
		return diagramModel;
	}
    public IZentaDiagramModel getNonTemplateDiagramModel() {
        IZentaModel model = getModel();
        IZentaDiagramModel diagramModel = (IZentaDiagramModel) Util.verifyNonNull(ZentaModelUtils.getObjectByID(model, "63f1b081"));
        return diagramModel;
    }

	public Resource getResource() {
		return Util.verifyNonNull(resource);
	}

	public EObject getById(String id) {
		return Util.verifyNonNull(ZentaModelUtils.getObjectByID(getModel(), id));
	}

	public IZentaDiagramModel getZDiagramModelById(String id) {
		return (IZentaDiagramModel) Util.verifyNonNull(ZentaModelUtils.getObjectByID(getModel(),id));
	}

	public IZentaElement getElementById(String id) {
		return (IZentaElement) Util.verifyNonNull(ZentaModelUtils.getObjectByID(getModel(), id));
	}

	public IDiagramModelObject getDMOById(String id) {
		return (IDiagramModelObject) Util.verifyNonNull(ZentaModelUtils.getObjectByID(getModel(),id));
	}

	public IBasicRelationship getRelationByID(String id) {
		return (IBasicRelationship) Util.verifyNonNull(ZentaModelUtils.getObjectByID(getModel(), id));
	}
	public IBasicRelationship getARelation () {
		return getRelationByID("44041ead");
	}
	public IDiagramModelZentaConnection getDMRById(String id3) {
		return (IDiagramModelZentaConnection) Util.verifyNonNull(ZentaModelUtils.getObjectByID(getModel(),id3));
	}

	public static IDiagramModelZentaObject createDMOFor(IZentaElement newElement) {
		IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		assertNotNull(dmo);
		assertFalse("emptyShape".equals(dmo.getElementShape()));
		dmo.setElementShape("emptyShape");
		dmo.setZentaElement(newElement);
		dmo.setBounds(0, 0, 100, 100);
		return dmo;
	}

	public static IFolder getFolderByKid(EObject selected) {
		IFolder folder = ((IFolder)selected.eContainer());
		return Util.verifyNonNull(folder);
	}

	public static void assertNotEquals(String string, String string2) {
		assertFalse(string.equals(string2));
	}

	public static void assertNotEquals(int i, int j) {
		assertFalse(i == j);
	}

	public static void assertOnePropertyWithNameAndValue(IZentaElement userObject,
			String propname, String value) {
		List<String> properties = userObject.getPropertyNamed(propname);
		assertEquals(1,properties.size());
		assertEquals(value, properties.get(0));
	}
	public File getFile() {
		return Util.verifyNonNull(file);
	}
	public void setFile(File file) {
		this.file = file;
	}
}
