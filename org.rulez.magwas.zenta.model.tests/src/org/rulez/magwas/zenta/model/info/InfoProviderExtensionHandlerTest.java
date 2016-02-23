package org.rulez.magwas.zenta.model.info;

import static org.junit.Assert.*;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.tests.TestInfoProvider;

public class InfoProviderExtensionHandlerTest {

	private InfoProviderExtensionHandler handler;
	private EObject targetObject;

	@Before
	public void setUp() {
		handler = InfoProviderExtensionHandler.INSTANCE;
		targetObject = IZentaPackage.eINSTANCE.getAttribute();
	}

	@Test
	public void registered_providers_contain_our_testprovider() {
		setUp();
		List<IInfoProvider> providers = handler.getRegisteredProviders();
		boolean found = false;
		for (IInfoProvider provider : providers) {
			if(provider instanceof TestInfoProvider) {
				found = true;
			}
		}
		assertTrue(found);
	}

	@Test
	public void getLabel_works() {
		assertEquals("Árvíztűrő Tükörfúrógép",handler.getLabel(targetObject));
	}

	@Test
	public void getImageInfo_works() {
		assertEquals("img/example-image-which-actually-does-not-exists.png",handler.getImageInfo(targetObject));
	}
}
