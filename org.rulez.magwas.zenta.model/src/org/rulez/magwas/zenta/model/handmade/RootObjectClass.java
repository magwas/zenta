package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodelFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootObjectClass extends ObjectClass implements IObjectClass {

	RootObjectClass() {
		
	}
	
	@Override
	public void setReference(IIdentifier newReference) {
		throw new IMetamodelFactory.BuiltinClassShouldNotHaveReference();
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
	public void setAncestor(IObjectClass ancestor) {
		throw new IMetamodelFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

}
