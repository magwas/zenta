package org.rulez.magwas.zenta.model.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.IElementInfoProvider;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class SketchStickyInfoProvider implements IElementInfoProvider {

	public SketchStickyInfoProvider() {
		super();
	}

	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getSketchModelSticky();
	}

	@Override
	public String getDefaultName() {
	    return Messages.SketchStickyUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_STICKY_16;
	}

}