package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class BuiltinTemplate extends Template {
	
	
	private RootObjectClass rootObjectClass;
	private RootRelationClass rootRelationClass;


	public BuiltinTemplate(IMetamodel metamodel) {
		super();
		setPath("builtin");
		setMetamodel(metamodel);
		RootObjectClass roc = new RootObjectClass(this);
		rootObjectClass = roc;
		rootRelationClass = new RootRelationClass(this,roc);
		IZentaModel model = metamodel.getModel();
		IFolder folder = model.getDefaultFolderForElement(roc);
		folder.getElements().add(rootObjectClass);
		folder.getElements().add(rootRelationClass);
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
