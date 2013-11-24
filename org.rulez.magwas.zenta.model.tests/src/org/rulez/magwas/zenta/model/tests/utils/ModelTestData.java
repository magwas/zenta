package org.rulez.magwas.zenta.model.tests.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ModelTestData {

	private Resource resource;
	
	public ModelTestData() {
		resource = ModelTestUtils.getZentaModelResource("test.zenta");
	}
	
	public IZentaModel getModel() {
		return (IZentaModel)resource.getContents().get(0);
	}
	
	public void saveResource() throws IOException {
		URI backup_uri = resource.getURI().appendFileExtension("bak");
		resource.setURI(backup_uri);
		Map<String, Object> options = new HashMap<String,Object>();
		resource.save(options);
	}

	public IZentaDiagramModel getTestDiagramModel() {
		IZentaModel model = getModel();
		IZentaDiagramModel diagramModel = (IZentaDiagramModel) ZentaModelUtils.getObjectByID(model, "2ea99535");
		return diagramModel;
	}

	public Resource getResource() {
		return resource;
	}

	public EObject getById(String id) {
		System.out.printf("resource is %s\n",resource.toString());
		return ZentaModelUtils.getObjectByID(getModel(), id);
	}

	public IZentaDiagramModel getZDiagramModelById(String id) {
		return (IZentaDiagramModel) ZentaModelUtils.getObjectByID(getModel(),id);
	}
}
