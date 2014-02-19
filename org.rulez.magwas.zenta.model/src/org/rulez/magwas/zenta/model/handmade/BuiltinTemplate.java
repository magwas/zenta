package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;

public class BuiltinTemplate extends Template {
	
	
	private RootObjectClass rootObjectClass;
	private RootRelationClass rootRelationClass;


	public BuiltinTemplate(IMetamodel metamodel) {
		super();
		setPath("builtin");
		setMetamodel(metamodel);
		IZentaModel model = metamodel.getModel();
		IBasicObject f = (IBasicObject) ZentaModelUtils.getObjectByID(model, RootObjectClass.basicObjectClassId);
		rootObjectClass = new RootObjectClass(this, f);
		IBasicRelationship rrc = (IBasicRelationship) ZentaModelUtils.getObjectByID(model, RootRelationClass.basicRelationClassId);
		rootRelationClass = new RootRelationClass(this, rootObjectClass , rrc);
		model.getElements().add(rootObjectClass);
		model.getElements().add(rootRelationClass);
	}

	
	@Override
	public String getName() {
		return "Builtins";
	}


	public RootObjectClass getRootObjectClass() {
		return Util.verifyNonNull(rootObjectClass);
	}

	public RootRelationClass getRootRelationClass() {
		return Util.verifyNonNull(rootRelationClass);
	}

}
