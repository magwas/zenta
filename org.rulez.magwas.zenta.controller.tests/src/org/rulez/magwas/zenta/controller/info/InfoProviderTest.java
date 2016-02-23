package org.rulez.magwas.zenta.controller.info;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.controller.InfoProvider;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class InfoProviderTest {

	private InfoProvider fixture;
	private EClass klass;
	private EObject ojjectum;
	private EObject extensionObject;

	@Before
	public void SetUp() {
		klass = IZentaPackage.eINSTANCE.getSketchModelSticky();
		ojjectum = IZentaFactory.eINSTANCE.createSketchModelSticky();
		extensionObject = IZentaPackage.eINSTANCE.getAttribute_MinOccurs();
		fixture = InfoProvider.INSTANCE;
	}
		
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(klass), "Sticky");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(klass), "Sticky");
	}
	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(klass),"img/sticky-16.png");
	}

	@Test
	public void default_name_is_correct_for_instance() {
		assertEquals(fixture.getDefaultName( ojjectum), "Sticky");
	}

	@Test
	public void default_short_name_is_correct_for_instance() {
		assertEquals(fixture.getDefaultShortName(ojjectum), "Sticky");
	}
	@Test
	public void image_info_is_correct_for_instance() {
		assertEquals(fixture.getImageInfo(ojjectum),"img/sticky-16.png");
	}

	@Test
	public void default_name_is_correct_for_extension() {
		assertEquals(fixture.getDefaultName( extensionObject), "Árvíztűrő Tükörfúrógép");
	}

	@Test
	public void default_short_name_is_correct_for_extension() {
		assertEquals(fixture.getDefaultShortName(extensionObject), "Árvíztűrő Tükörfúrógép");
	}
	@Test
	public void image_info_is_correct_for_extension() {
		assertEquals(fixture.getImageInfo(extensionObject),"img/example-image-which-actually-does-not-exists.png");
	}

	//FIXME #56
}
