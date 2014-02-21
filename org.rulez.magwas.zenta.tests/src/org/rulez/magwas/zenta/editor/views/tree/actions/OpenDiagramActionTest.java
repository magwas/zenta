package org.rulez.magwas.zenta.editor.views.tree.actions;

import static org.junit.Assert.*;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.ViewManager;
import org.rulez.magwas.zenta.editor.views.tree.ITreeModelView;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class OpenDiagramActionTest {
	@Test
	public void When_a_view_displayed_and_objects_moved_objects_are_not_dropped_out() {
		TestModel builder = new TestModel();
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		IZentaModel model = builder.getModel();
		assertNotNull(model);
		IEditorModelManager.INSTANCE.openModel(model);
		IZentaDiagramModel dia = builder.getTemplateDiagram();
		ITreeModelView treeView = (ITreeModelView)ViewManager.showViewPart(ITreeModelView.ID, false);
        treeView.getViewer().setSelection(new StructuredSelection(dia), true);
		OpenDiagramAction action = new OpenDiagramAction((ISelectionProvider) treeView.getViewer());
		
		assertTrue(builder.secondgenSource.isTemplate());
		assertEquals(2, builder.secondgenSource.getDiagObjects().size());
		IDiagramModelZentaObject diagobj1 = builder.secondgenSource.getDiagObjects().get(0);
		IDiagramModelZentaObject diagobj2 = builder.secondgenSource.getDiagObjects().get(1);
		
		action.run();
		IFolder newFolder = IZentaFactory.eINSTANCE.createFolder();
		newFolder.setName("newFolder");
		builder.folder.getFolders().add(newFolder);
		newFolder.getElements().add(builder.secondgenSource);
		assertTrue(builder.secondgenSource.isTemplate());
		assertTrue(builder.firstgenSource.isTemplate());
		assertTrue(builder.firstgenRelation.isTemplate());

		newFolder.getElements().add(builder.firstgenSource);
		
		assertTrue(builder.secondgenSource.isTemplate());
		assertTrue(builder.firstgenSource.isTemplate());
		assertTrue(builder.firstgenRelation.isTemplate());

		assertEquals("newFolder", ((IFolder)builder.secondgenSource.eContainer()).getName());
		assertEquals(2, builder.secondgenSource.getDiagObjects().size());
		assertEquals(diagobj1, builder.secondgenSource.getDiagObjects().get(0));
		assertEquals(diagobj2, builder.secondgenSource.getDiagObjects().get(1));
		IMetamodel mm = builder.getMetamodel();
		NonNullList<IBasicRelationship> rcss2 = mm.getRelationClasses();
		builder.assertIsAllThirdGenRelations(rcss2);

	}

}
