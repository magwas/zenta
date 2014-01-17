package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootObjectClass extends ObjectClass implements IBasicObject {

	RootObjectClass(BuiltinTemplate builtinTemplate) {
		super();
		setId(IZentaElement.basicObjectClassId);
		setName("Basic Object");
		this.setAsTemplate(builtinTemplate);
	}
	
	@Override
	public void setAncestor(IBasicObject ancestor) {
		throw new IZentaFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<IBasicObject> getAncestry(List<IBasicObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

	@Override
	public List<IAttribute> getAttributesRecursively() {
		return getAttributes();
	}

}
