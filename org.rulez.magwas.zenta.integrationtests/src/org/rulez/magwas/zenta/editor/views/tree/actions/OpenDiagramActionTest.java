package org.rulez.magwas.zenta.editor.views.tree.actions;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.ViewManager;
import org.rulez.magwas.zenta.editor.views.tree.ITreeModelView;
import org.rulez.magwas.zenta.integrationtests.HaveGUI;
import org.rulez.magwas.zenta.integrationtests.UITestWindow;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.model.testutils.TestModel;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;

public class OpenDiagramActionTest {
	@Test
	@HaveGUI(waitUser = false)
	public void When_a_view_displayed_and_objects_moved_objects_are_not_dropped_out() throws IOException {
		UITestWindow win = new UITestWindow();

		TestModel builder = new TestModel();
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		builder.createThirdGenerationWithRelation();
		IZentaModel model = builder.getModel();
		assertNotNull(model);
		IEditorModelManager.INSTANCE.openModel(model);
		IZentaDiagramModel dia = builder.getTemplateDiagram();
		ITreeModelView treeView = (ITreeModelView)ViewManager.showViewPart(ITreeModelView.ID, false);
        treeView.getViewer().setSelection(new StructuredSelection(dia), true);
		OpenDiagramAction action = new OpenDiagramAction((ISelectionProvider) treeView.getViewer());
		
		assertTrue(builder.secondgenSource.isTemplate());
		assertEquals(1, builder.secondgenSource.getDiagComponents().size());
		
		action.run();

		IFolder newFolder = IZentaFactory.eINSTANCE.createFolder();
		newFolder.setName("newFolder");
		builder.folder.getFolders().add(newFolder);
		newFolder.getElements().add(builder.secondgenSource);
		assertTrue(builder.secondgenSource.isTemplate());
		assertTrue(builder.firstgenSource.isTemplate());
		assertTrue(builder.getFirstgenRelation().isTemplate());

		newFolder.getElements().add(builder.firstgenSource);
		
		builder.assertMetaIsOK();

		File file = ModelTestUtils.createTempFile(".zenta");
		ZentaModelUtils.saveModelToXMLFile(builder.getModel(), file);
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
        resource.load(null);
	    IZentaModel model2 = (IZentaModel)resource.getContents().get(0);
	    model2.getMetamodel();
	    File file2 = ModelTestUtils.createTempFile(".zenta");
		ZentaModelUtils.saveModelToXMLFile(model2, file2);
		
		
		String string1 = Util.readFile(file.getAbsolutePath());
		
		String string2 = Util.readFile(file2.getAbsolutePath());
		assertEquals(string1,string2);
		IEditorModelManager.INSTANCE.openModel(model2);
		win.showWindow();

	}

}
