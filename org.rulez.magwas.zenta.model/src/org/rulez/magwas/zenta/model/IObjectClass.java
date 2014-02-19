/**
 */
package org.rulez.magwas.zenta.model;

import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAttribute.Direction;

public interface IObjectClass extends IHelpHintProvider {
	
	@NonNull IBasicObject create(@NonNull IFolder folder);
	
	boolean isObject();
	boolean isRelation();
	boolean isTemplate();
	void setAsTemplate(@NonNull ITemplate template);
	@NonNull IBasicObject getDefiningElement();

	public boolean isAllowedRelation(@NonNull IBasicRelationship relclass, @NonNull Direction direction);
	public @NonNull Map<Direction,NonNullList<IBasicRelationship>> getAllowedRelations();

	@NonNull IMetamodel getMetamodel();
	
	public abstract @NonNull List<IBasicObject> getAncestry(@NonNull List<IBasicObject> ancestry);

	public abstract @NonNull List<IBasicObject> getAncestry();

	@NonNull List<IAttribute> getAttributesRecursively();



} // ObjectClass
