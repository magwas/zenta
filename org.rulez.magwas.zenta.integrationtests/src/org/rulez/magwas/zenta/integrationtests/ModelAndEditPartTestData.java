package org.rulez.magwas.zenta.integrationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.jface.util.Policy;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditorPalette;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;

public class ModelAndEditPartTestData extends ModelAndMetaModelTestData {
	public BasicConnectionEditPart editPart;
	public BasicConnectionEditPart editPart2;
	private TestStatusHandler statusHandler;

	
	private ZentaDiagramEditor editor;
	public ModelAndEditPartTestData(String resourcename) {
		super(resourcename);
        openModelAndMetaModel();
		setUpStatusHandler();
	}

	public ModelAndEditPartTestData() {
		super();
        openModelAndMetaModel();
		initializeModelFields();

		initializeEditorWithDMO(getDiagramModel());

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
		editPart = (BasicConnectionEditPart) getEditor().getGraphicalViewer().getEditPartRegistry().get(connection);
		assertNotNull(editPart);
		editPart2 = (BasicConnectionEditPart) getEditor().getGraphicalViewer().getEditPartRegistry().get(connection2);
		assertNotNull(editPart2);
	}

	private void initializeModelFields() {
		setDiagramModel(getTemplateDiagramModel());
		assertNotNull(getDiagramModel());
		connection = getDMRById("24e3c661");
		assertNotNull(connection);
		connection2 = getDMRById("99e9c255");
		assertNotNull(connection2);
	}

	private void initializeEditorWithDMO(IZentaDiagramModel dMO) {
		ZentaDiagramEditor ed = (ZentaDiagramEditor) EditorManager.openDiagramEditor((IDiagramModel)dMO);
		setEditor(Util.verifyNonNull(ed));
		assertNotNull(getEditor());
	}

	private void openModelAndMetaModel() {
		BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
			public void run() {
                model = IEditorModelManager.INSTANCE.openModel(getFile());
            }
        });
        assertNotNull(model);
        metamodel = IZentaFactory.eINSTANCE.getMetamodelFor(getModel());
        assertNotNull(metamodel);
	}

	public IStatus getStatus() {
		return statusHandler.status;
	}
	public ZentaDiagramEditor focusOnDiagram(String id) {
		setDiagramModel(this.getZDiagramModelById(id));
		assertNotNull(getDiagramModel());
		return focusOnDiagram(getDiagramModel());
	}

	public ZentaDiagramEditor focusOnDiagram(IDiagramModel diagramModel) {
		ZentaDiagramEditor ed = (ZentaDiagramEditor) EditorManager.openDiagramEditor(diagramModel);
		setEditor(ed);
		return ed;
	}

	public EditPart getEditPartFor(String editPartId) {
		IDiagramModelComponent mo = (IDiagramModelComponent) getById(editPartId);
		return getEditPartFor(mo);
	}

	public EditPart getEditPartFor(IDiagramModelComponent mo) {
		ZentaDiagramEditor ed = getEditor();
		GraphicalViewer graphicalViewer = ed.getGraphicalViewer();
		Map<?, ?> registry = graphicalViewer.getEditPartRegistry();
		EditPart ep = (EditPart) registry.get(mo);
		return Util.verifyNonNull(ep);
	}

	public void selectDiagElement(IDiagramModelZentaObject diagElement) {
		IDiagramModel dm = diagElement.getDiagramModel();
		assertNotNull(dm);
		focusOnDiagram(dm);
		EditPart editpart = getEditPartFor(diagElement);
		editpart.getViewer().appendSelection(editpart);
		//ComponentSelectionManager.INSTANCE.fireSelectionEvent(dm, diagElement);
	}

	public ZentaDiagramEditor getEditor() {
		return Util.verifyNonNull(editor);
	}

	public void setEditor(ZentaDiagramEditor editor) {
		this.editor = editor;
	}

	public static boolean haveCreatorFor(IBasicObject klass, List<PaletteEntry> children) {
		return haveCreatorNamed(klass.getDefiningName(),children);
	}

	public static boolean haveCreatorNamed(String klass, List<PaletteEntry> children) {
		for ( PaletteEntry kid : children) {
			String label = kid.getLabel();
			if(klass.equals(label))
				return true;
		}
		return false;
	}

	public static List<PaletteEntry> getObjectClassPaletteEntries(ZentaDiagramEditor editor) {
		ZentaDiagramEditorPalette palette = editor.getPaletteRoot();
		PaletteContainer objectsgroup = palette._getObjectsGroup();
		assertNotNull(objectsgroup);
		@SuppressWarnings("unchecked")
		List<PaletteEntry> children = objectsgroup.getChildren();
		return Util.verifyNonNull(children);
	}
}