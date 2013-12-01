package org.rulez.magwas.zenta.tests.editor.model.viewpoints;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class TotalViewpointTest {

	private ModelAndEditPartTestData data;
	private IZentaDiagramModel dm;
	private IViewpoint vp;

	@HaveGUI(waitUser = false)
	@Test
	public void TotalViewpoint_is_initialized_with_a_diagram() {
		UITestWindow win = new UITestWindow();
		assertNotNull(vp);
		win.showWindow();
	}

	@Before
	public void setUp() {
		data = new ModelAndEditPartTestData();
		dm = data.getTestDiagramModel();
		vp = ViewpointsManager.INSTANCE.getViewpoint(dm);
	}
	
	@Test
	public void There_is_one_instance_of_ViewPoint_for_each_diagram() {
		IViewpoint vp2 = ViewpointsManager.INSTANCE.getViewpoint(dm);
		assertEquals(vp,vp2);
	}

}
