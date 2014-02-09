package org.rulez.magwas.zenta.editor.actions;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.model.IZentaModel;

public class NewZentaModelActiontest {

	@Test
	public void NewZentaModelAction_creates_a_new_zenta_model() throws IOException {
		NewZentaModelAction action = new NewZentaModelAction();
		closeAllModels();
		action.run();
		assertEquals(1,IEditorModelManager.INSTANCE.getModels().size());
		NewZentaModelAction action2 = new NewZentaModelAction();
		closeAllModels();
		action2.run();
		assertEquals(1,IEditorModelManager.INSTANCE.getModels().size());
	}

	@SuppressWarnings("null")
	private void closeAllModels()
			throws IOException {
		NonNullList<IZentaModel> models = new NonNullArrayList<IZentaModel>(IEditorModelManager.INSTANCE.getModels());
		for(IZentaModel model : models) {
			assertTrue(IEditorModelManager.INSTANCE.closeModel(model));
		}
	}

}
