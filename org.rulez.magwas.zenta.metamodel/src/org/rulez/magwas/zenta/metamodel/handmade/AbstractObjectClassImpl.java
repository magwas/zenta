package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.AttributeBase.Direction;
import org.rulez.magwas.zenta.metamodel.MetamodelBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBaseFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaElement;

public abstract class AbstractObjectClassImpl extends ObjectClassBaseImpl implements ObjectClass {

	public AbstractObjectClassImpl() {
	}

	public AbstractObjectClassImpl(IZentaElement reference, ITemplate template) {
		super();
		setReference((IIdentifier) reference);
		template.getObjectClasses().add(this);
		setName(MetamodelBaseFactory.eINSTANCE.getDefiningName(reference));
		setTemplate(template);
	}

	@Override
	public String getId() {
		return ((IIdentifier)reference).getId();
	}

	@Override
	public MetamodelBase getMetamodel() {
		return (MetamodelBase) getTemplate().getMetamodel();
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
		for(AttributeBase att : getAttributes()) {
			addParents(ret.get(((AttributeBase) att).getDirection()),(IRelationClass) att.getRelation());
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