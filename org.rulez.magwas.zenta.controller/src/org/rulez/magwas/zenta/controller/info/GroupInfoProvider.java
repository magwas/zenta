package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class GroupInfoProvider implements IElementInfoProvider {

	public GroupInfoProvider() {
		super();
	}

	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getDiagramModelGroup();
	}

	@Override
	public String getDefaultName() {
	    return Messages.GroupUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_GROUP_16;
	}

	@Override
	public String getDefaultColorString() {
	    return "#D2D7D7";
	}

}