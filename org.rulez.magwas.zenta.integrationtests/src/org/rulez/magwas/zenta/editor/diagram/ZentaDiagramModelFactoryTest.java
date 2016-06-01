package org.rulez.magwas.zenta.editor.diagram;

import static org.junit.Assert.*;

import org.eclipse.gef.requests.CreateConnectionRequest;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.commands.CreateDiagramConnectionCommand;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionModelFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;

public class ZentaDiagramModelFactoryTest {

	@Test
	public void DiagramModelZentaObjectobject_can_be_created_from_a_BasicObject() {
		IBasicObject a = IZentaFactory.eINSTANCE.createBasicObject();
		a.check();
		IFolder b = IZentaFactory.eINSTANCE.createFolder();
		ZentaDiagramModelFactory factory = new ZentaDiagramModelFactory(a, b);
		assertNotNull(factory);
		Object ob = factory.getNewObject();
		System.out.println(ob);
	}

	@Test
	public void DiagramModelZentaConnection_can_be_created_from_a_Basicrelation() {
		IZentaModel model = IZentaFactory.eINSTANCE.createZentaModel();
		IFolder folder = IZentaFactory.eINSTANCE.createFolder();
		model.getElements().add(folder);
		IBasicObject elementA = IZentaFactory.eINSTANCE.createBasicObject();
		IBasicObject elementB = IZentaFactory.eINSTANCE.createBasicObject();
		folder.getElements().add(elementA);
		folder.getElements().add(elementB);
		IBasicRelationship relation = IZentaFactory.eINSTANCE.createBasicRelationship();
		relation.setSource(elementA);
		relation.setTarget(elementB);
		folder.getElements().add(relation);
		IZentaDiagramModel diagram = IZentaFactory.eINSTANCE.createZentaDiagramModel();
		folder.getElements().add(diagram);
		IDiagramModelZentaObject diagObjectA = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		diagObjectA.setZentaElement(elementA);
		IDiagramModelZentaObject diagObjectB = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		diagObjectB.setZentaElement(elementB);
		diagram.getChildren().add(diagObjectA);
		diagram.getChildren().add(diagObjectB);
		model.check();
		CreateConnectionRequest request = new CreateConnectionRequest();
		MagicConnectionModelFactory factory = new MagicConnectionModelFactory(folder);
		factory.setRelationshipType(relation);
		request.setFactory(factory);
		CreateDiagramConnectionCommand a = new CreateDiagramConnectionCommand(request);
		a.setSource(diagObjectA);
		a.setTarget(diagObjectB);
		a.execute();
	}

}
