package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class RootRelationClass extends RelationClass {
	
	protected RootRelationClass(BuiltinTemplate builtinTemplate, RootObjectClass rootObjectClass, @Nullable IBasicRelationship modelRelation, EList<EObject> container) {
		super();
		setSource(rootObjectClass);
		setTarget(rootObjectClass);
		setAsTemplate(builtinTemplate);
		setId(IZentaElement.basicRelationClassId);
		setName("Basic Relation");
		int i=0;
		if(modelRelation!=null) {
			this.getChildren().addAll(modelRelation.getChildren());
			i = container.indexOf(modelRelation);
			container.remove(modelRelation);
		}
		container.add(i, this);
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

	@Override
	public List<IAttribute> getAttributesRecursively() {
		return Util.verifyNonNull(getAttributes());
	}

	@Override
	public List<IBasicObject> getAllowedTargets() {
		return getTemplate().getMetamodel().getObjectClasses();
	}

}
