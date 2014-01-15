package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.List;

import org.rulez.magwas.zenta.metamodel.MetamodelBaseFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootObjectClass extends ObjectClassImpl implements ObjectClass {

	RootObjectClass() {
		
	}
	
	@Override
	public void setReference(IIdentifier newReference) {
		throw new MetamodelBaseFactory.BuiltinClassShouldNotHaveReference();
	}

	@Override
	public String getName() {
		return "Basic Object";
	}
	
	@Override
	public String getId() {
		return IZentaElement.basicObjectClassId;
	}
	
	@Override
	public void setAncestor(ObjectClass ancestor) {
		throw new MetamodelBaseFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<ReferencesModelObject> getAncestry(List<ReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

}
