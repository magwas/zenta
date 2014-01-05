package org.rulez.magwas.zenta.metamodel;

import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.metamodel.Attribute.Direction;
import org.rulez.magwas.zenta.model.IHelpHintProvider;

public interface ObjectClass extends ObjectClassBase, ReferencesModelObject, IHelpHintProvider {
	
	boolean isAllowedRelation(RelationClass klass, Direction source);

	Map<Direction, List<RelationClass>> getAllowedRelations();

} 