package org.rulez.magwas.zenta.help.cheatseets;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.help.cheatsheets.CreateMapViewCheatSheetAction;
import org.rulez.magwas.zenta.integrationtests.HaveGUI;
import org.rulez.magwas.zenta.integrationtests.UITestWindow;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class CreateMapViewCheatSheetActionTest {

	private class CSM implements ICheatSheetManager {

		@Override
		public String getCheatSheetID() {
			throw new UnTestedException();
		}

		@Override
		public String getData(String key) {
			throw new UnTestedException();
		}

		@Override
		public void setData(String key, String data) {
			throw new UnTestedException();
		}

		@Override
		public ICheatSheetManager getParent() {
			throw new UnTestedException();
		}

		@Override
		public Set<String> getKeySet() {
			return null;
		}
		
	}
	@Test
	@HaveGUI(waitUser = false)
	public void A_map_view_can_be_created_using_cheat_sheet() throws IOException {
		CSM csm = new CSM();
		TestModel builder = new TestModel();
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		builder.createThirdGenerationWithRelation();
		IZentaModel model = builder.getModel();
		IEditorModelManager.INSTANCE.openModel(model);
		NonNullList<IDiagramModel> dms = model.getDiagramModels();
		assertEquals(2, dms.size());
		for(IDiagramModel dm : dms)
			dm.setName(dm.getId());

		UITestWindow win = new UITestWindow();
		CreateMapViewCheatSheetAction action = new CreateMapViewCheatSheetAction();
		String[] params = {};
		action.run(params, csm);
		win.showWindow();
		model.setFile(new File("/tmp/foo.zenta"));
		IEditorModelManager.INSTANCE.saveModel(model);
		assertModelHaveDiagramNamed(model, "Map View");
		
	}
		private void assertModelHaveDiagramNamed(IZentaModel model, String mapname) {
			for(IDiagramModel dm : model.getDiagramModels()) {
				if(dm.getName().equals(mapname))
					return;
			}
			fail();
		}
}
