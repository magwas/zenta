package org.rulez.magwas.zenta.model.handmade;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.impl.BasicObjectBase;

public class ObjectClass extends BasicObjectBase implements IObjectClass {

	public ObjectClass(IBasicObject ancestor) {
		setAncestor(ancestor);
		Adapter object = new AttributeChangeAdapter();
		eAdapters().add(object);
	}

	public ObjectClass() {
		Adapter object = new AttributeChangeAdapter();
		eAdapters().add(object);
	}

	@Override
	public boolean isAllowedRelation(IBasicRelationship relclass, Direction direction, boolean includeBasic) {
		List<IBasicRelationship> alloweds = getAllowedRelations(includeBasic).get(direction);
		if(alloweds.contains(relclass))
			return true;
		return false;
	}

	@Override
	public Map<Direction,NonNullList<IBasicRelationship>> getAllowedRelations(boolean includeBasic) {
		Map<Direction, NonNullList<IBasicRelationship>> ret = new HashMap<Direction,NonNullList<IBasicRelationship>>();
		ret.put(Direction.SOURCE, new NonNullArrayList<IBasicRelationship>());
		ret.put(Direction.TARGET, new NonNullArrayList<IBasicRelationship>());
		if ((!includeBasic) && "basicobject".equals(id))
			return ret;
		for(IAttribute att : getAttributesRecursively()) {
			List<IBasicRelationship> list = ret.get(att.getDirection());
			IBasicRelationship relation = (IBasicRelationship) att.getRelation();
			addParents(list,relation, includeBasic);
		}
		return ret;
	}
	
	private void addParents(List<IBasicRelationship> list, IBasicRelationship relation, boolean includeBasic) {
		assert(relation != null);
		assert(list != null);
		if((!includeBasic) && relation.getId().equals("basicrelation"))
			return;
		if(!list.contains(relation))
			list.add(relation);
		IBasicRelationship ancestor = (IBasicRelationship) relation.getAncestor();
		if(ancestor != null)
			addParents(list,ancestor, includeBasic);
	}


	@Override
	public IBasicObject create(IFolder folder) {
		IBasicObject obj = create();
		folder.getElements().add(obj);
		return obj;
	}

	@Override
	public IBasicObject create() {
		IBasicObject obj = IZentaFactory.eINSTANCE.createBasicObject();
		obj.setAncestor(this);
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
		//FIXME horrible hack
		if (id=="basicobject")
			return this;
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
