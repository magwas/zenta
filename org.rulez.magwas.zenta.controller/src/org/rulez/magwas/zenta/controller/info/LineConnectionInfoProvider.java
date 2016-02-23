package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class LineConnectionInfoProvider implements IElementInfoProvider{

	public LineConnectionInfoProvider() {
		super();
	}

	@Override
	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getDiagramModelConnection();
	}

	@Override
	public String getDefaultName() {
	    return Messages.LineConnectionUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_CONNECTION_PLAIN_16;
	}

}