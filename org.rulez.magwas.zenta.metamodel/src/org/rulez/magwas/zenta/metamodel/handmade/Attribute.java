package org.rulez.magwas.zenta.metamodel.handmade;

import org.rulez.magwas.zenta.metamodel.IAttribute;
import org.rulez.magwas.zenta.metamodel.IObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.impl.AttributeBase;


public class Attribute extends AttributeBase implements IAttribute {

	private Direction direction;

	public Attribute(IRelationClass relation, IObjectClass connectedObject,
			Direction whichend) {
		super();
		this.connectedObject = connectedObject;
		this.relation = relation;
		this.direction = whichend;
	}

	public Attribute() {
		super();
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

} //AttributeImpl
