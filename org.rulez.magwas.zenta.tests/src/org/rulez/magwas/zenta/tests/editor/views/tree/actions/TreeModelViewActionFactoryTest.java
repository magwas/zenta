package org.rulez.magwas.zenta.tests.editor.views.tree.actions;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.junit.After;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionCreationTool;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionModelFactory;
import org.rulez.magwas.zenta.editor.views.tree.actions.TreeModelViewActionFactory;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.tests.IsInteractive;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

public class TreeModelViewActionFactoryTest {

	
	private ModelTestData data;
	private TreeModelViewActionFactory fixture;
	
	//FIXME: canvas and diagram view missing on folders.
	//FIXME: no connectors

	@Test
	public void Initializes_with_a_model() {
		data = new ModelTestData();
		fixture = new TreeModelViewActionFactory(data.model);
	}

	@IsInteractive
	@Test
	public void Magic_Connector_magically_connects_two_diagram_objects() {
		ModelAndEditPartTestData data = new ModelAndEditPartTestData();
		MagicConnectionModelFactory factory = new MagicConnectionModelFactory();
		MagicConnectionCreationTool tool = new MagicConnectionCreationTool();
		tool.setFactory(factory);
		tool.setViewer(data.editor.getGraphicalViewer());
		CreateConnectionRequest req = new CreateConnectionRequest();
		EditPart spart = data.getEditPartFor("b2608459");
		EditPart tpart = data.getEditPartFor("88f40127");
		req.setSourceEditPart(spart);
		req.setTargetEditPart(tpart);
		tool.setRequest(req);
		tool.handleCreateConnection();
	}

	@After
	public void tearDown() {
		fixture = null;
	}

}
