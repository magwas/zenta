package org.rulez.magwas.zenta.metamodel.handmade;

import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.model.IIdentifier;

public class RootObjectClass extends ObjectClassImpl implements ObjectClass {

	RootObjectClass() {
		
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
	public void setAncestor(ObjectClassBase ancestor) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveAncestor();
	}
}
