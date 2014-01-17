package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootRelationClass extends RelationClass {
	
	protected RootRelationClass(BuiltinTemplate builtinTemplate, RootObjectClass rootObjectClass) {
		super();
		setSource(rootObjectClass);
		setTarget(rootObjectClass);
		setAsTemplate(builtinTemplate);
		setId(IZentaElement.basicRelationClassId);
		setName("Basic Relation");
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

	@Override
	public List<IBasicObject> getAllowedTargets() {
		return getTemplate().getMetamodel().getObjectClasses();
	}

}
