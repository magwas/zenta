package org.rulez.magwas.zenta.model.info;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class BasicObjectInfoProviderTest {

	private BasicObjectInfoProvider fixture;
	
	@Before
	public void setUp() {
		fixture = new BasicObjectInfoProvider();
	}

	@Test
	public void provider_is_correct() {
		assertEquals(fixture.providerFor(), IZentaPackage.eINSTANCE.getBasicObject());
	}
	
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(), "Basic Object");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(), "Object");
	}

	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(),"img/zenta/business-object-16.png");
	}

	@Test
	public void color_is_correct() {
		assertEquals(fixture.getDefaultColorString(),"#FFFFB5");
	}

}
