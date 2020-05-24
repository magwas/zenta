package com.kodekonveyor.zenta.model;

import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.ModelConsistencyException;
import org.rulez.magwas.zenta.model.ZentaObject;

public class BasicRelationshipCheckService {

	public static void call(IBasicRelationship iBasicRelationship) {
		checkId(iBasicRelationship);
		checkDocumentation(iBasicRelationship);
		checkName(iBasicRelationship);
		checkSource(iBasicRelationship);
		checkTarget(iBasicRelationship);
		iBasicRelationship.setChecked(true);
	}

	private static void checkSource(IBasicRelationship iBasicRelationship) {
		checkNotNull(iBasicRelationship.getSource(),"source cannot be null", iBasicRelationship);
	}

	private static void checkTarget(IBasicRelationship iBasicRelationship) {
		checkNotNull(iBasicRelationship.getTarget(), "target cannot be null", iBasicRelationship);
	}

	private static void checkId(IIdentifier iBasicRelationship) {
		checkNotNull ( iBasicRelationship.getId(),"id cannot be null", iBasicRelationship);
	}

	private static void checkDocumentation(IDocumentable iBasicRelationship) {
		checkNotNull (iBasicRelationship.getDocumentation(),"documentation cannot be null", iBasicRelationship);
	}

	private static void checkName(INameable iBasicRelationshipe) {
		checkNotNull ( iBasicRelationshipe.getName() ,"name cannot be null", iBasicRelationshipe);
	}
	
	public static void checkNotNull(Object value, String message, ZentaObject object ) {
		if(value == null)
			throw new ModelConsistencyException(message, object);
			
	}

}
