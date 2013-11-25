package org.rulez.magwas.zenta.tests.propertysections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.CommandStack;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.AssociationConnectionEditPart;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;

public class ModelAndEditPartTestData {
	private AssociationConnectionEditPart editPart;
	private IDiagramModelZentaConnection connection;
	private IZentaDiagramModel diagramModel;
	private IDiagramModelZentaConnection connection2;
	private AssociationConnectionEditPart editPart2;

	public ModelAndEditPartTestData() {
		CommandStack stack = new CommandStack();
		EList<EObject> folderContents = createFolderContents();
		createDiagramModel(stack, folderContents);
		createConnection(stack, folderContents);
		createEditPart();
	}

	private EList<EObject> createFolderContents() {
		IZentaModel model = IZentaFactory.eINSTANCE.createZentaModel();
		model.setDefaults();
		EList<IFolder> folders = model.getFolders();
		EList<EObject> folderContents = folders.get(0).getElements();
		return folderContents;
	}

	private void createEditPart() {
		editPart=new AssociationConnectionEditPart();
		editPart.setModel(connection);
		editPart2=new AssociationConnectionEditPart();
		editPart2.setModel(connection2);
	}

	private void createConnection(CommandStack stack,
			EList<EObject> folderContents) {
		connection = (IDiagramModelZentaConnection) IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		connection.setAdapter(CommandStack.class, stack);
		folderContents.add(connection);
		connection2 = (IDiagramModelZentaConnection) IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		connection2.setAdapter(CommandStack.class, stack);
		folderContents.add(connection2);
	}

	private void createDiagramModel(CommandStack stack,
			EList<EObject> folderContents) {
		diagramModel = (IZentaDiagramModel) IZentaFactory.eINSTANCE.createZentaDiagramModel();
		diagramModel.setAdapter(CommandStack.class, stack);
		folderContents.add(diagramModel);
	}

	public IDiagramModelZentaConnection getModelConnectionObject() {
		return connection;
	}
	public IDiagramModelZentaConnection getModelConnectionObject2() {
		return connection2;
	}

	public void setModelConnectionObject(
			IDiagramModelZentaConnection modelConnectionObject) {
		this.connection = modelConnectionObject;
	}

	public AssociationConnectionEditPart getEditPart() {
		return editPart;
	}

	public void setEditPart(AssociationConnectionEditPart editPart) {
		this.editPart = editPart;
	}

	public IDiagramModel getDiagramModelObject() {
		return diagramModel;
	}

	public AssociationConnectionEditPart getEditPart2() {
		return editPart2;
	}

}