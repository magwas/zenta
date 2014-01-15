package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.impl.ObjectClassBase;

public abstract class AbstractObjectClass extends ObjectClassBase implements IObjectClass {

	public AbstractObjectClass() {
	}

	public AbstractObjectClass(IZentaElement reference, ITemplate template) {
		super();
		setReference((IIdentifier) reference);
		template.getClasses().add(this);
		setName(IZentaFactory.eINSTANCE.getDefiningName(reference));
		setTemplate(template);
	}

	@Override
	public String getId() {
		return ((IIdentifier)reference).getId();
	}

	@Override
	public IMetamodel getMetamodel() {
		return (IMetamodel) getTemplate().getMetamodel();
	}

	@Override
	public void postCreate(IIdentifier createdObj, IFolder folder) {
		folder.getElements().add(createdObj);
	}

	@Override
	public boolean isAllowedRelation(IRelationClass relclass, Direction direction) {
		List<IRelationClass> alloweds = getAllowedRelations().get(direction);
		if(alloweds.contains(relclass))
			return true;
		return false;
	}

	@Override
	public Map<Direction,List<IRelationClass>> getAllowedRelations() {

		Map<Direction,List<IRelationClass>> ret = new HashMap<Direction,List<IRelationClass>>();
		ret.put(Direction.SOURCE, new ArrayList<IRelationClass>());
		ret.put(Direction.TARGET, new ArrayList<IRelationClass>());
		ret.get(Direction.SOURCE).add(this.getMetamodel().getBuiltinRelationClass());
		ret.get(Direction.TARGET).add(this.getMetamodel().getBuiltinRelationClass());
		for(IAttribute att : getAttributes()) {
			addParents(ret.get(((IAttribute) att).getDirection()),(IRelationClass) att.getRelation());
		}
		return ret;
	}

	private void addParents(List<IRelationClass> list, IRelationClass relation) {
		if(!list.contains(relation))
			list.add(relation);
		IRelationClass ancestor = (IRelationClass) relation.getAncestor();
		if(ancestor != null)
			addParents(list,ancestor);
	}

	@Override
	public boolean isInstance(IIdentifier relation) {
		return getId().equals(relation.getObjectClass());
	}

	protected void addAttributesToRelatedObjectClasses(ITemplate template,
			Direction dir, IZentaElement se) {
				IObjectClass sc = template.getObjectClassFrom(se);
				Attribute sa = new Attribute((IRelationClass) this,sc,dir);
				sc.getAttributes().add(sa);
			}

}