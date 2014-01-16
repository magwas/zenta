package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootRelationClass extends RelationClass {
	
	protected RootRelationClass(BuiltinTemplate builtinTemplate) {
		super();
		this.setTemplate(builtinTemplate);
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

}
