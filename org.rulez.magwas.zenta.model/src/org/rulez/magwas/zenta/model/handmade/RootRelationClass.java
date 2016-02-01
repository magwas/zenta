package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.UndoState;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class RootRelationClass extends RelationClass {
	
	protected RootRelationClass(BuiltinTemplate builtinTemplate, RootObjectClass rootObjectClass,  IBasicRelationship modelRelation, EList<INameable> container) {
		super();
		setSource(rootObjectClass);
		setTarget(rootObjectClass);
		setAsTemplate(builtinTemplate);
		setId(IZentaElement.basicRelationClassId);
		setName(IZentaElement.basicRelationClassName);
		addOrReplaceInModel(modelRelation, container);
	}

	private void addOrReplaceInModel( IBasicRelationship modelRelation,
			EList<INameable> container) {
		int i=0;
		if(modelRelation!=null) {
			this.getChildren().addAll(modelRelation.getChildren());
			IFolder f = (IFolder) modelRelation.eContainer();
			container = f.getElements();
			i = container.indexOf(modelRelation);
			container.remove(modelRelation);
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
		return Util.verifyNonNull(getAttributes());
	}

	@Override
	public NonNullList<IBasicObject> getAllowedTargets() {
		return getTemplate().getMetamodel().getObjectClasses();
	}

	@Override
	public UndoState delete(UndoState st) {
		return st;
	}

}
