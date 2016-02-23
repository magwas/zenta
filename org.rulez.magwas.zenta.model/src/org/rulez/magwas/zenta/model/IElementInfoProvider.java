package org.rulez.magwas.zenta.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.info.IInfoProvider;

public interface IElementInfoProvider extends IInfoProvider {

	EClass providerFor();

	String getDefaultName();

	default String getDefaultShortName() {
	    return getDefaultName();
	}

	default String getImageInfo(EObject element) {
		return getImageInfo();
	}

	String getImageInfo();
	
	default String getDefaultColorString() {
        return "#ffffff";
    }
	
	default String getLabel(EObject element) {
	    return getDefaultName();
	}


}