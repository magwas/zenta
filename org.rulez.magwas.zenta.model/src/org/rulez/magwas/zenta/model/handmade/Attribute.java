package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.impl.AttributeBase;


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
