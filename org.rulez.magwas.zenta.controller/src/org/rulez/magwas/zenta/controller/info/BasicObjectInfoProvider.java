package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class BasicObjectInfoProvider implements IElementInfoProvider {

	public BasicObjectInfoProvider() {
		super();
	}

	@Override
	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getBasicObject();
	}

	@Override
	public String getDefaultName() {
	    return Messages.BasicObjectUIProvider_0;
	}

	@Override
	public String getDefaultShortName() {
	    return Messages.BasicObjectUIProvider_1;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_BUSINESS_OBJECT_16;
	}

	@Override
	public String getDefaultColorString() {
	    return "#FFFFB5";
	}
}