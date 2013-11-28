package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.IIdentifier;

public class RootObjectClass extends ObjectClassImpl implements ObjectClass, referencesModelObject {

	RootObjectClass() {
		super();
	}
	
	@Override
	public void setReference(IIdentifier newReference) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveReference();
	}

	@Override
	public String getName() {
		return "Basic Object";
	}
	
	@Override
	public String getId() {
		return "basicobject";
	}
	
	@Override
	public void setAncestor(ObjectClass ancestor) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveAncestor();
	}
}
