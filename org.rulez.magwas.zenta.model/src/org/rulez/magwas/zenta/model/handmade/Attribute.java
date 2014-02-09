package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.AttributeBase;


public class Attribute extends AttributeBase implements IAttribute {

	private Direction direction;

	public Attribute(IBasicRelationship relation, IBasicObject connectedObject,
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
		return Util.assertNonNull(direction);
	}
	@Override
	public void setDirection(@Nullable Direction dir) {
		Util.assertNonNull(dir);
		direction = dir;
	}

} //AttributeImpl
