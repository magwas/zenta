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
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;

public class ModelAndEditPartTestData extends ModelAndMetaModelTestData {
	public BasicConnectionEditPart editPart;
	public BasicConnectionEditPart editPart2;
	private TestStatusHandler statusHandler;

	
	public ZentaDiagramEditor editor;
	public ModelAndEditPartTestData(String resourcename) {
		super(resourcename);
        openModelAndMetaModel();
		setUpStatusHandler();
	}

	public ModelAndEditPartTestData() {
		super();
        openModelAndMetaModel();
		initializeModelFields();

		initializeEditorWithDMO(diagramModel);

		initializeGuiFields();
		setUpStatusHandler();
	}

	private void setUpStatusHandler() {
		statusHandler = new TestStatusHandler();
		Policy.setStatusHandler(statusHandler);
		assertEquals(Policy.getStatusHandler(), statusHandler);
		SafeRunnable.setIgnoreErrors(false);
	}

	private void initializeGuiFields() {
		editPart = (BasicConnectionEditPart) editor.getGraphicalViewer().getEditPartRegistry().get(connection);
		assertNotNull(editPart);
		editPart2 = (BasicConnectionEditPart) editor.getGraphicalViewer().getEditPartRegistry().get(connection2);
		assertNotNull(editPart2);
	}

	private void initializeModelFields() {
		diagramModel = getTemplateDiagramModel();
		assertNotNull(diagramModel);
		connection = getDMRById("24e3c661");
		assertNotNull(connection);
		connection2 = getDMRById("99e9c255");
		assertNotNull(connection2);
	}

	private void initializeEditorWithDMO(IZentaDiagramModel dMO) {
		editor = (ZentaDiagramEditor) EditorManager.openDiagramEditor((IDiagramModel)dMO);
		assertNotNull(editor);
	}

	private void openModelAndMetaModel() {
		BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
			public void run() {
                model = IEditorModelManager.INSTANCE.openModel(file);
            }
        });
        assertNotNull(model);
        metamodel = MetamodelFactory.eINSTANCE.createMetamodel(model);
        assertNotNull(metamodel);
	}

	public IStatus getStatus() {
		return statusHandler.status;
	}
	public ZentaDiagramEditor focusOnDiagram(String id) {
		diagramModel = this.getZDiagramModelById(id);
		assertNotNull(diagramModel);
		return focusOnDiagram(diagramModel);
	}

	public ZentaDiagramEditor focusOnDiagram(IDiagramModel diagramModel) {
		editor = (ZentaDiagramEditor) EditorManager.openDiagramEditor(diagramModel);
		return editor;
	}

	public EditPart getEditPartFor(String editPartId) {
		IDiagramModelComponent mo = (IDiagramModelComponent) getById(editPartId);
		return getEditPartFor(mo);
	}

	public EditPart getEditPartFor(IDiagramModelComponent mo) {
		return (EditPart) editor.getGraphicalViewer().getEditPartRegistry().get(mo);
	}

	public void selectDiagElement(IDiagramModelZentaObject diagElement) {
		IDiagramModel dm = diagElement.getDiagramModel();
		assertNotNull(dm);
		focusOnDiagram(dm);
		EditPart editpart = getEditPartFor(diagElement);
		editpart.getViewer().appendSelection(editpart);
		//ComponentSelectionManager.INSTANCE.fireSelectionEvent(dm, diagElement);
	}
}