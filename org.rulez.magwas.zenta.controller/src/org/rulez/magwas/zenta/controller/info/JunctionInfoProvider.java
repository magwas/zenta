package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class JunctionInfoProvider implements IElementInfoProvider {

	public JunctionInfoProvider() {
		super();
	}

	@Override
	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getJunction();
	}

	@Override
	public String getDefaultName() {
	    return Messages.JunctionUIProvider_0;
	}

    @Override
	public String getImageInfo() {
		return IZentaImages.ICON_JUNCTION_16;
	}


}