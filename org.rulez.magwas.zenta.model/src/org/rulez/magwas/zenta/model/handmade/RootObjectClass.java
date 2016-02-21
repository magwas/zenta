package org.rulez.magwas.zenta.model.handmade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.UndoState;
import org.rulez.magwas.zenta.model.IAttribute.Direction;

public class RootObjectClass extends ObjectClass implements IBasicObject {

	RootObjectClass(BuiltinTemplate builtinTemplate,  IBasicObject modelObject, EList<INameable> container) {
		super();
		setId(IZentaElement.basicObjectClassId);
		setName(IZentaElement.basicObjectClassName);
		addOrReplaceInModel(modelObject, container);

		setAsTemplate(builtinTemplate);
		if(!(getTemplate() == builtinTemplate)) throw new AssertionError();
	}

	private void addOrReplaceInModel( IBasicObject modelObject,
			EList<INameable> container) {
		int i=0;
		if(modelObject!=null) {
			this.getChildren().addAll(modelObject.getChildren());
			IFolder f = (IFolder) modelObject.eContainer();
			container = f.getElements();
			i = container.indexOf(modelObject);
			container.remove(modelObject);
		}
		container.add(i, this);
	}
	
	@Override
	public void setAncestor( IBasicObject ancestor) {
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

	@Override
	public UndoState delete(UndoState st) {
		return st;
	}
	
}
