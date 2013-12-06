package org.rulez.magwas.zenta.metamodel;

import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.metamodel.Attribute.Direction;

public interface ObjectClass extends ObjectClassBase, ReferencesModelObject {
	
	boolean isAllowedRelation(RelationClass klass, Direction source);

	Map<Direction, List<RelationClass>> getAllowedRelations();

} 