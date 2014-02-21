package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootObjectClass extends ObjectClass implements IBasicObject {

	RootObjectClass(BuiltinTemplate builtinTemplate, @Nullable IBasicObject modelObject, EList<EObject> container) {
		super();
		setId(IZentaElement.basicObjectClassId);
		setName("Basic Object");
		int i=0;
		if(modelObject!=null) {
			this.getChildren().addAll(modelObject.getChildren());
			i = container.indexOf(modelObject);
			container.remove(modelObject);
		}
		container.add(i, this);

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
