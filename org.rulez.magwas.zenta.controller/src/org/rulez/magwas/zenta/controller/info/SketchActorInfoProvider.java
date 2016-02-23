package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class SketchActorInfoProvider implements IElementInfoProvider {

	public SketchActorInfoProvider() {
		super();
	}

	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getSketchModelActor();
	}

	@Override
	public String getDefaultName() {
	    return Messages.SketchActorUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_ACTOR_16;
	}

	@Override
	public String getDefaultColorString() {
	    return "#000000";
	}

}