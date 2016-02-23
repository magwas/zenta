package org.rulez.magwas.zenta.controller.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.controller.info.Messages;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class NoteInfoProvider implements IElementInfoProvider{

	public NoteInfoProvider() {
		super();
	}

	@Override
	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getDiagramModelNote();
	}

	@Override
	public String getDefaultName() {
	    return Messages.NoteUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_NOTE_16;
	}

}