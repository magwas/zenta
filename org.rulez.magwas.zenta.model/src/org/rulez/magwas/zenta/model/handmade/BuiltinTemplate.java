package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
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
		@NonNull IZentaModel model = metamodel.getModel();
		addRootObjectClass(model);
		addRootRelationClass(model);
	}
		private void addRootRelationClass(IZentaModel model) {
			@SuppressWarnings("null")
			IBasicRelationship rrc = (IBasicRelationship) ZentaModelUtils.getObjectByID(model, RootRelationClass.basicRelationClassId);
			rootRelationClass = new RootRelationClass(this, getRootObjectClass() , rrc, model.getElements());
		}
		private void addRootObjectClass(IZentaModel model) {
			@SuppressWarnings("null")
			IBasicObject f = (IBasicObject) ZentaModelUtils.getObjectByID(model, RootObjectClass.basicObjectClassId);
			rootObjectClass = new RootObjectClass(this, f, model.getElements());
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
