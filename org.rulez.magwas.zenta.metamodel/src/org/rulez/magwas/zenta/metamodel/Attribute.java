package org.rulez.magwas.zenta.metamodel;

public interface Attribute extends AttributeBase {
	public enum Direction {
		SOURCE,TARGET
	}

	Direction getDirection();

}