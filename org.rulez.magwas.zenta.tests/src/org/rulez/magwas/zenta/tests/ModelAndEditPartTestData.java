package org.rulez.magwas.zenta.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.util.Policy;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;

public class ModelAndEditPartTestData extends ModelAndMetaModelTestData {
	public BasicConnectionEditPart editPart;
	public BasicConnectionEditPart editPart2;
	private TestStatusHandler statusHandler;

	
	public ZentaDiagramEditor editor;
	public ModelAndEditPartTestData() {
		super();
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
			public void run() {
                model = IEditorModelManager.INSTANCE.openModel(file);
            }
        });
        assertNotNull(model);
        metamodel = MetamodelFactory.eINSTANCE.createMetamodel(model);
        assertNotNull(metamodel);
		diagramModel = getTemplateDiagramModel();
		assertNotNull(diagramModel);
		connection = getDMRById("24e3c661");
		assertNotNull(connection);
		connection2 = getDMRById("99e9c255");
		assertNotNull(connection2);

		editor = (ZentaDiagramEditor) EditorManager.openDiagramEditor((IDiagramModel)diagramModel);
		assertNotNull(editor);

		editPart = (BasicConnectionEditPart) editor.getGraphicalViewer().getEditPartRegistry().get(connection);
		assertNotNull(editPart);
		editPart2 = (BasicConnectionEditPart) editor.getGraphicalViewer().getEditPartRegistry().get(connection2);
		assertNotNull(editPart2);
		statusHandler = new TestStatusHandler();
		Policy.setStatusHandler(statusHandler);
		assertEquals(Policy.getStatusHandler(), statusHandler);
		SafeRunnable.setIgnoreErrors(false);
	}

	public IStatus getStatus() {
		return statusHandler.status;
	}
	public void focusOnDiagram(String id) {
		diagramModel = this.getZDiagramModelById(id);
		editor = (ZentaDiagramEditor) EditorManager.openDiagramEditor((IDiagramModel)diagramModel);
	}
	public EditPart getEditPartFor(String editPartId) {
		IDiagramModelComponent mo = (IDiagramModelComponent) getById(editPartId);
		return getEditPartFor(mo);
	}

	public EditPart getEditPartFor(IDiagramModelComponent mo) {
		return (EditPart) editor.getGraphicalViewer().getEditPartRegistry().get(mo);
	}

}