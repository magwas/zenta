package org.rulez.magwas.zenta.model.info;

import org.eclipse.emf.ecore.EObject;

public interface IInfoProvider {
	String getLabel(EObject element);
	String getImageInfo(EObject element);
}