package com.kodekonveyor.zenta.model;

import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.handmade.RelationClass;

public class RelationClassTestData {

	public static final String ID = "foo";

	public static RelationClass get() {
		RelationClass relationship = new RelationClass();
		relationship.setId(ID);
		relationship.setSource(relationship);
		relationship.setTarget(relationship);
		return relationship;
	}

	public static RelationClass getIdNull() {
		RelationClass relationship = get();
		relationship.setId(null);
		return relationship;
	}

	public static IBasicRelationship getDocumentationNull() {
		RelationClass relationship = get();
		relationship.setDocumentation(null);
		return relationship;
	}

	public static IBasicRelationship getNameNull() {
		RelationClass relationship = get();
		relationship.setName(null);
		return relationship;
	}

	public static IBasicRelationship getSourceNull() {
		RelationClass relationship = get();
		relationship.setSource(null);
		return relationship;
	}

	public static IBasicRelationship getTargetNull() {
		RelationClass relationship = get();
		relationship.setTarget(null);
		return relationship;
	}

}
