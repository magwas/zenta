package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class OrJunctionInfoProvider implements IElementInfoProvider{

	public OrJunctionInfoProvider() {
		super();
	}

	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getOrJunction();
	}

	@Override
	public String getDefaultName() {
	    return Messages.OrJunctionUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_JUNCTION_OR_16;
	}

	@Override
	public String getDefaultColorString() {
	    return "#000000";
	}

}