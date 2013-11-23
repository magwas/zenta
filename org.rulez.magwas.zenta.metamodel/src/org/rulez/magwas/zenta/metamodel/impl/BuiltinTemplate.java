package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;

public class BuiltinTemplate extends TemplateImpl {

	private static BuiltinTemplate INSTANCE = null;

	public void setReference(EObject newReference) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveReference();
	}

	@Override
	public String getName() {
		return "Builtins";
	}

	public static BuiltinTemplate getInstance() {
		if( null == INSTANCE) {
			INSTANCE = new BuiltinTemplate();
		}
		return INSTANCE;
	}
}
