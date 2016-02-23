package org.rulez.magwas.zenta.model.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.info.Messages;
import org.rulez.magwas.zenta.model.IElementInfoProvider;
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