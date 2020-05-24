package com.kodekonveyor.zenta.editor.propertysections;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.withSettings;

import org.eclipse.swt.widgets.Composite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.rulez.magwas.zenta.editor.propertysections.ModelsViewer;

public class ModelsViewerCharacterizationTest {

	@Test
	@DisplayName("sort")
	void test() {
		Composite parent = mock(Composite.class, withSettings().verboseLogging());
		doReturn(false).when(parent).isDisposed();
		ModelsViewer modelsViewer = new ModelsViewer(parent);
		Object obj = modelsViewer.getElementAt(0);
		System.out.println(obj);
		fail();
	}
}
