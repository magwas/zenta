package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.Attribute.Direction;
import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaElement;

public abstract class AbstractObjectClassImpl extends ObjectClassBaseImpl implements ObjectClass {

	public AbstractObjectClassImpl() {
	}

	public AbstractObjectClassImpl(IZentaElement reference, Template template) {
		super();
		setReference((IIdentifier) reference);
		template.getObjectClasses().add(this);
		setName(MetamodelFactory.eINSTANCE.getDefiningName(reference));
		setTemplate(template);
	}

	@Override
	public String getId() {
		return ((IIdentifier)reference).getId();
	}

	@Override
	public Metamodel getMetamodel() {
		return (Metamodel) getTemplate().getMetamodel();
	}

	@Override
	public void postCreate(IIdentifier createdObj, IFolder folder) {
		folder.getElements().add(createdObj);
	}

	@Override
	public boolean isAllowedRelation(RelationClass relclass, Direction direction) {
		List<RelationClass> alloweds = getAllowedRelations().get(direction);
		if(alloweds.contains(relclass))
			return true;
		return false;
	}

	@Override
	public Map<Direction,List<RelationClass>> getAllowedRelations() {
		Map<Direction,List<RelationClass>> ret = new HashMap<Direction,List<RelationClass>>();
		ret.put(Direction.SOURCE, new ArrayList<RelationClass>());
		ret.put(Direction.TARGET, new ArrayList<RelationClass>());
		ret.get(Direction.SOURCE).add(this.getMetamodel().getBuiltinRelationClass());
		ret.get(Direction.TARGET).add(this.getMetamodel().getBuiltinRelationClass());
		for(AttributeBase att : getAttributes()) {
			addParents(ret.get(((Attribute) att).getDirection()),(RelationClass) att.getRelation());
		}
		return ret;
	}

	private void addParents(List<RelationClass> list, RelationClass relation) {
		if(!list.contains(relation))
			list.add(relation);
		RelationClass ancestor = (RelationClass) relation.getAncestor();
		if(ancestor != null)
			addParents(list,ancestor);
	}

	@Override
	public boolean isInstance(IIdentifier relation) {
		return getId().equals(relation.getObjectClass());
	}

}