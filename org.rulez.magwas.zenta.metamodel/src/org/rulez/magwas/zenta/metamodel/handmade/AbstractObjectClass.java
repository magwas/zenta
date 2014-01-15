package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.metamodel.IAttribute;
import org.rulez.magwas.zenta.metamodel.IAttribute.Direction;
import org.rulez.magwas.zenta.metamodel.IMetamodel;
import org.rulez.magwas.zenta.metamodel.IMetamodelFactory;
import org.rulez.magwas.zenta.metamodel.IObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaElement;

public abstract class AbstractObjectClass extends ObjectClassBase implements IObjectClass {

	public AbstractObjectClass() {
	}

	public AbstractObjectClass(IZentaElement reference, ITemplate template) {
		super();
		setReference((IIdentifier) reference);
		template.getObjectClasses().add(this);
		setName(IMetamodelFactory.eINSTANCE.getDefiningName(reference));
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

}