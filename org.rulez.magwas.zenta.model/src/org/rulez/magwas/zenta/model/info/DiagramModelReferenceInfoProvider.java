package org.rulez.magwas.zenta.model.info;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.info.Messages;
import org.rulez.magwas.zenta.model.IElementInfoProvider;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class DiagramModelReferenceInfoProvider implements IElementInfoProvider{

	public DiagramModelReferenceInfoProvider() {
		super();
	}

	public EClass providerFor() {
	    return IZentaPackage.eINSTANCE.getDiagramModelReference();
	}

	@Override
	public String getDefaultName() {
	    return Messages.DiagramModelReferenceUIProvider_0;
	}

	@Override
	public String getImageInfo() {
		return IZentaImages.ICON_DIAGRAM_16;
	}

	@Override
	public String getDefaultColorString() {
	    return "#DCEBEB";
	}

}