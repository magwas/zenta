package org.rulez.magwas.zenta.metamodel.handmade;

import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.metamodel.RelationClassBase;
import org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl;


public class AttributeImpl extends AttributeBaseImpl implements Attribute {

	private Direction direction;

	public AttributeImpl(RelationClassBase relation, ObjectClassBase connectedObject,
			Direction whichend) {
		super();
		this.connectedObject = connectedObject;
		this.relation = relation;
		this.direction = whichend;
	}

	public AttributeImpl() {
		super();
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

} //AttributeImpl
