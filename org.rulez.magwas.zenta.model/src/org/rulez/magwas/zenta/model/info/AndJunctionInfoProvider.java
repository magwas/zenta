package org.rulez.magwas.zenta.model.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.info.Messages;
import org.rulez.magwas.zenta.model.IElementInfoProvider;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class AndJunctionInfoProvider implements IElementInfoProvider{

	public AndJunctionInfoProvider() {
		super();
	}

	@Override
	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getAndJunction();
	}

	@Override
	public String getDefaultName() {
	    return Messages.AndJunctionUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_JUNCTION_AND_16;
	}

	@Override
	public String getDefaultColorString() {
	    return "#000000";
	}

}