package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class DiagramImageInfoProvider implements IElementInfoProvider {

	public DiagramImageInfoProvider() {
		super();
	}

	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getDiagramModelImage();
	}

	@Override
	public String getDefaultName() {
	    return Messages.DiagramImageUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_LANDSCAPE_16;
	}

	@Override
	public String getDefaultColorString() {
	    return "#FFFFFF";
	}

}