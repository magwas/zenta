package org.rulez.magwas.zenta.model.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.info.Messages;
import org.rulez.magwas.zenta.model.IElementInfoProvider;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class BasicConnectionInfoProvider implements IElementInfoProvider{

	public BasicConnectionInfoProvider() {
		super();
	}

	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getBasicRelationship();
	}

	@Override
	public String getDefaultName() {
	    return Messages.BasicConnectionUIProvider_0;
	}

	@Override
	public String getDefaultShortName() {
	    return Messages.BasicConnectionUIProvider_1;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_ASSOCIATION_CONNECTION_16;
	}

}