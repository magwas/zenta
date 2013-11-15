package org.rulez.magwas.zenta.tests.editor.diagram.dialog.diagram.dialog;

import org.rulez.magwas.zenta.editor.editparts.connections.AssociationConnectionEditPart;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IZentaFactory;

public class DecorationSelectorTestData {
	private IDiagramModelZentaConnection modelConnectionObject;
	private AssociationConnectionEditPart editPart;

	public DecorationSelectorTestData() {
		setModelConnectionObject(IZentaFactory.eINSTANCE.createDiagramModelZentaConnection());
		setEditPart(new AssociationConnectionEditPart());
		getEditPart().setModel(getModelConnectionObject());		
	}

	public IDiagramModelZentaConnection getModelConnectionObject() {
		return modelConnectionObject;
	}

	public void setModelConnectionObject(
			IDiagramModelZentaConnection modelConnectionObject) {
		this.modelConnectionObject = modelConnectionObject;
	}

	public AssociationConnectionEditPart getEditPart() {
		return editPart;
	}

	public void setEditPart(AssociationConnectionEditPart editPart) {
		this.editPart = editPart;
	}
}