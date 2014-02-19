package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootObjectClass extends ObjectClass implements IBasicObject {

	RootObjectClass(BuiltinTemplate builtinTemplate, @Nullable IBasicObject modelObject) {
		super();
		setId(IZentaElement.basicObjectClassId);
		setName("Basic Object");
		if(modelObject!=null) {
			this.getChildren().addAll(modelObject.getChildren());
			((IFolder)modelObject.eContainer()).getElements().remove(modelObject);
		}

		setAsTemplate(builtinTemplate);
		if(!(getTemplate() == builtinTemplate)) throw new AssertionError();
	}
	
	@Override
	public void setAncestor(@Nullable IBasicObject ancestor) {
		throw new IZentaFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<IBasicObject> getAncestry(List<IBasicObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

	@SuppressWarnings("null")
	@Override
	public List<IAttribute> getAttributesRecursively() {
		return getAttributes();
	}

}
