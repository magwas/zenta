package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaModel;

public class BuiltinTemplate extends Template {
	
	
	private RootObjectClass rootObjectClass;
	private RootRelationClass rootRelationClass;


	public BuiltinTemplate(IMetamodel metamodel) {
		super();
		setPath("builtin");
		setMetamodel(metamodel);
		rootObjectClass = new RootObjectClass(this);
		rootRelationClass = new RootRelationClass(this,rootObjectClass);
		IZentaModel model = metamodel.getModel();
		IFolder folder = model.getDefaultFolderForElement(rootObjectClass);
		folder.getElements().add(rootObjectClass);
		folder.getElements().add(rootRelationClass);
	}

	
	@Override
	public String getName() {
		return "Builtins";
	}


	public RootObjectClass getRootObjectClass() {
		return rootObjectClass;
	}

	public RootRelationClass getRootRelationClass() {
		return rootRelationClass;
	}

}
