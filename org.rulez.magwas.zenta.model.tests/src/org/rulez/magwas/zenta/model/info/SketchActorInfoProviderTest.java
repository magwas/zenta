package org.rulez.magwas.zenta.model.info;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class SketchActorInfoProviderTest {

	private SketchActorInfoProvider fixture;
	
	@Before
	public void setUp() {
		fixture = new SketchActorInfoProvider();
	}

	@Test
	public void provider_is_correct() {
		assertEquals(fixture.providerFor(), IZentaPackage.eINSTANCE.getSketchModelActor());
	}
	
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(), "Actor");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(), "Actor");
	}
	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(),"img/zenta/actor-16.png");
	}

	@Test
	public void color_is_correct() {
		assertEquals(fixture.getDefaultColorString(),"#000000");
	}

}
