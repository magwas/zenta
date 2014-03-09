package org.rulez.magwas.zenta.editor.actions;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.integrationtests.UITestUtils;

public class NewZentaModelActiontest {

	@Test
	public void NewZentaModelAction_creates_a_new_zenta_model() throws IOException {
		NewZentaModelAction action = new NewZentaModelAction();
		UITestUtils.closeAllModels();
		action.run();
		assertEquals(1,IEditorModelManager.INSTANCE.getModels().size());
		NewZentaModelAction action2 = new NewZentaModelAction();
		UITestUtils.closeAllModels();
		action2.run();
		assertEquals(1,IEditorModelManager.INSTANCE.getModels().size());
	}

}
