/**
 */
package org.rulez.magwas.zenta.model;

import java.util.List;
import java.util.Map;

import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAttribute.Direction;

public interface IObjectClass extends IHelpHintProvider {
	
	IBasicObject create(IFolder folder);
	IBasicObject create();
	
	boolean isObject();
	boolean isRelation();
	boolean isTemplate();
	void setAsTemplate(ITemplate template);
	IBasicObject getDefiningElement();

	public boolean isAllowedRelation(IBasicRelationship relclass, Direction direction, boolean includeBasic);
	public Map<Direction,NonNullList<IBasicRelationship>> getAllowedRelations(boolean includeBasic);

	IMetamodel getMetamodel();
	
	public abstract List<IBasicObject> getAncestry(List<IBasicObject> ancestry);

	public abstract List<IBasicObject> getAncestry();

	List<IAttribute> getAttributesRecursively();



} // ObjectClass
