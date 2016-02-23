package org.rulez.magwas.zenta.controller.tests;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.controller.IInfoProvider;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class TestInfoProvider implements IInfoProvider {

	private static EObject targetEClass = IZentaPackage.eINSTANCE.getAttribute();

	@Override
	public String getLabel(EObject element) {
		if (element.getClass() == targetEClass.getClass()) {
			return "Árvíztűrő Tükörfúrógép";			
		}
		return null;
	}

	@Override
	public String getImageInfo(EObject element) {
		if (element.getClass() == targetEClass.getClass()) {
			return "img/example-image-which-actually-does-not-exists.png";
		}
		return null;
	}

}
