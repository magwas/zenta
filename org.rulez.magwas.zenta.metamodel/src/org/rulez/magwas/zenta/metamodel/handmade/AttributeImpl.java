package org.rulez.magwas.zenta.metamodel.handmade;

import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl;


public class AttributeImpl extends AttributeBaseImpl implements AttributeBase {

	private Direction direction;

	public AttributeImpl(IRelationClass relation, ObjectClass connectedObject,
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
