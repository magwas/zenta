package org.rulez.magwas.zenta.metamodel.handmade;

import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class RelationClassImpl extends AbstractRelationClassImpl implements RelationClass {

	protected RelationClassImpl(IRelationship referenced, Template template) {
		super(referenced,template);
		String refClassId = referenced.getObjectClass();
		String referenceId = referenced.getId();
		Metamodel metamodel = getMetamodel();
		RelationClass ancie = null;
		if(null != refClassId && !"basicrelation".equals(refClassId)&&!referenceId.equals(refClassId)) {
			IRelationship ancestorDefining = (IRelationship) ZentaModelUtils.getObjectByID(metamodel.getModel(), refClassId);
			ancie=metamodel.getRelationClassReferencing(ancestorDefining);
		}
		if(ancie == null)
			ancie=metamodel.getBuiltinRelationClass();
		setAncestor(ancie);
		referenced.setObjectClass(referenceId);
		addAttributesToRelatedObjectClasses(template, Attribute.Direction.SOURCE, referenced.getSource());
		addAttributesToRelatedObjectClasses(template, Attribute.Direction.TARGET, referenced.getTarget());
	}

	protected RelationClassImpl() {
		super();
	}

	@Override
	public IRelationship create(IFolder folder) {
		IBasicRelationship obj = IZentaFactory.eINSTANCE.createBasicRelationship();
		postCreate(obj, folder);
		obj.setObjectClass(getId());
		return obj;
	}
}
