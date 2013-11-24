package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;

public class RootObjectClass extends ObjectClassImpl {

	RootObjectClass() {
		super();
	}
	
	public void setReference(EObject newReference) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveReference();
	}

	@Override
	public String getName() {
		return "Basic Object";
	}
	
	@Override
	public void setAncestor(ObjectClass ancestor) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveAncestor();
	}
}
