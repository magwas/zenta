package org.rulez.magwas.zenta.model.handmade;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.BasicObjectBase;

public class ObjectClass extends BasicObjectBase implements IObjectClass {

	public ObjectClass(IBasicObject ancestor) {
		setAncestor(ancestor);
	}

	public ObjectClass() {
	}

	@Override
	public boolean isAllowedRelation(IBasicRelationship relclass, Direction direction) {
		List<IBasicRelationship> alloweds = getAllowedRelations().get(direction);
		if(alloweds.contains(relclass))
			return true;
		return false;
	}

	@Override
	public Map<Direction,List<IBasicRelationship>> getAllowedRelations() {
		Map<Direction,List<IBasicRelationship>> ret = new HashMap<Direction,List<IBasicRelationship>>();
		ret.put(Direction.SOURCE, new ArrayList<IBasicRelationship>());
		ret.put(Direction.TARGET, new ArrayList<IBasicRelationship>());
		ret.get(Direction.SOURCE).add(this.getMetamodel().getBuiltinRelationClass());
		ret.get(Direction.TARGET).add(this.getMetamodel().getBuiltinRelationClass());
		for(IAttribute att : getAttributesRecursively()) {
			List<IBasicRelationship> list = ret.get(att.getDirection());
			IBasicRelationship relation = (IBasicRelationship) att.getRelation();
			addParents(Util.assertNonNull(list), Util.assertNonNull(relation));
		}
		return ret;
	}
	
	private void addParents(List<IBasicRelationship> list, IBasicRelationship relation) {
		assert(relation != null);
		assert(list != null);
		if(!list.contains(relation))
			list.add(relation);
		IBasicRelationship ancestor = (IBasicRelationship) relation.getAncestor();
		if(ancestor != null)
			addParents(list,ancestor);
	}


	@Override
	public IBasicObject create(IFolder folder) {
		IBasicObject obj = IZentaFactory.eINSTANCE.createBasicObject();
		obj.setAncestor(this);
		folder.getElements().add(obj);
		return obj;
	}

	@Override
	public boolean isObject() {
		return true;
	}

	@Override
	public boolean isRelation() {
		return false;
	}

	@Override
	public String getHelpHintTitle() {
		return ObjectClassMixin.getHelpHintTitle(this);
	}

	@Override
	public String getHelpHintContent() {
		return ObjectClassMixin.getHelpHintContent(this);
	}

	@Override
	public IMetamodel getMetamodel() {
		return ObjectClassMixin.getMetamodel(this);
	}

	@Override
	public List<IBasicObject> getAncestry(List<IBasicObject> ancestry) {
		return ObjectClassMixin.getAncestry(this,ancestry);
	}

	@Override
	public List<IBasicObject> getAncestry() {
		return ObjectClassMixin.getAncestry(this);
	}

	@Override
	public void setAsTemplate(ITemplate template) {
		ObjectClassMixin.setAsTemplate(this, template);
	}
	
	@Override
	public IBasicObject getDefiningElement() {
		return ObjectClassMixin.getDefiningElement(this);
	}

	@Override
	public boolean isTemplate() {
		return ObjectClassMixin.isTemplate(this);
	}

	@Override
	public String getDefiningName() {
		return ObjectClassMixin.getDefiningName(this);
	}

	@Override
	public List<IAttribute> getAttributesRecursively() {
		return ObjectClassMixin.getAttributesRecursively(this);
	}

}
