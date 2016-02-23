package org.rulez.magwas.zenta.controller.info;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class NoteInfoProviderTest {

	private NoteInfoProvider fixture;
	
	@Before
	public void setUp() {
		fixture = new NoteInfoProvider();
	}

	@Test
	public void provider_is_correct() {
		assertEquals(fixture.providerFor(), IZentaPackage.eINSTANCE.getDiagramModelNote());
	}
	
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(), "Note");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(), "Note");
	}

	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(),"img/note-16.gif");
	}

	@Test
	public void color_is_correct() {
		assertEquals(fixture.getDefaultColorString(),"#ffffff");
	}

}
