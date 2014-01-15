package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootObjectClass extends ObjectClass implements IObjectClass {

	RootObjectClass(BuiltinTemplate builtinTemplate) {
		this.setTemplate(builtinTemplate);
	}
	
	@Override
	public void setReference(IBasicObject newReference) {
		throw new IZentaFactory.BuiltinClassShouldNotHaveReference();
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
		throw new IZentaFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

}
