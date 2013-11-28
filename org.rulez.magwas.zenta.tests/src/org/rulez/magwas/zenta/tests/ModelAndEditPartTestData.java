package org.rulez.magwas.zenta.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;

public class ModelAndEditPartTestData extends ModelTestData {
	public BasicConnectionEditPart editPart;
	public IDiagramModelZentaConnection connection;
	public IZentaDiagramModel diagramModel;
	public IDiagramModelZentaConnection connection2;
	public BasicConnectionEditPart editPart2;
	
	private File file;
	public ZentaDiagramEditor editor;

	public ModelAndEditPartTestData() {
		super();
		file = new File(resource.getURI().toFileString());
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
			public void run() {
                model = IEditorModelManager.INSTANCE.openModel(file);
            }
        });

		diagramModel = getTestDiagramModel();
		editor = (ZentaDiagramEditor) EditorManager.openDiagramEditor((IDiagramModel)diagramModel);
		assertNotNull(editor);

		connection = getDMRById("24e3c661");
		assertNotNull(connection);
		editPart = (BasicConnectionEditPart) editor.getGraphicalViewer().getEditPartRegistry().get(connection);
		assertNotNull(editPart);
		connection2 = getDMRById("99e9c255");
		assertNotNull(connection2);
		editPart2 = (BasicConnectionEditPart) editor.getGraphicalViewer().getEditPartRegistry().get(connection2);
		assertNotNull(editPart2);
		assertNotNull(diagramModel);
	}

	public EditPart getEditPartFor(String string) {
		EObject mo = getById(string);
		return (EditPart) editor.getGraphicalViewer().getEditPartRegistry().get(mo);
	}
}