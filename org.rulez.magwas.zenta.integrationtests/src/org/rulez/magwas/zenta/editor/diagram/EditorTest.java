package org.rulez.magwas.zenta.editor.diagram;

import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class EditorTest {

	protected IZentaDiagramModel templateDiagram;
	TestModel builder;

	public EditorTest() {
		super();
	}

	protected ZentaDiagramEditor openDiagramEditorWithFirstGeneration() {
		builder = new TestModel();
		builder.createFirstGeneration();
		IEditorModelManager.INSTANCE.openModel(builder.getModel());
		templateDiagram = builder.getTemplateDiagram();
		ZentaDiagramEditor ed = (ZentaDiagramEditor) EditorManager.openDiagramEditor(templateDiagram);
		return ed;
	}

}