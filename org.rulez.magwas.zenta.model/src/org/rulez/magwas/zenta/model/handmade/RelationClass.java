package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.util.StringUtils;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class RelationClass extends AbstractRelationClass implements IRelationClass {

	protected RelationClass(IRelationship referenced, ITemplate template) {
		super(referenced,template);
		IRelationClass ancie = getAncestorClass(referenced);
		setAncestor(ancie);
		referenced.setObjectClass(ancie.getId());
		addAttributesToRelatedObjectClasses(template, IAttribute.Direction.SOURCE, referenced.getSource());
		addAttributesToRelatedObjectClasses(template, IAttribute.Direction.TARGET, referenced.getTarget());
	}
		private IRelationClass getAncestorClass(IRelationship referenced) {
			String refClassId = referenced.getObjectClass();
			String referenceId = referenced.getId();
			IMetamodel metamodel = getMetamodel();
			IRelationClass ancie = null;
			if(haveAncestor(refClassId, referenceId)) {
				ancie = getAncestorClass(refClassId, metamodel);
			}
			if(ancie == null)
				ancie=metamodel.getBuiltinRelationClass();
			return ancie;
		}
			private boolean haveAncestor(String refClassId, String referenceId) {
				return null != refClassId && !"basicrelation".equals(refClassId)&&!referenceId.equals(refClassId);
			}
			private IRelationClass getAncestorClass(String refClassId,
					IMetamodel metamodel) {
				IRelationClass ancie;
				IRelationship ancestorDefining = (IRelationship) ZentaModelUtils.getObjectByID(metamodel.getModel(), refClassId);
				ancie=metamodel.getRelationClassReferencing(ancestorDefining);
				return ancie;
			}

	protected RelationClass() {
		super();
	}

	@Override
	public IRelationship create(IFolder folder) {
		IBasicRelationship obj = IZentaFactory.eINSTANCE.createBasicRelationship();
		postCreate(obj, folder);
		obj.setObjectClass(getId());
		return obj;
	}
	public String getHelpHintContent() {
		IRelationship ref = (IRelationship) this.reference;
		if(null == ref)
			return "";
		String doc = ref.getDocumentation();
		List<IReferencesModelObject> ancestry = this.getAncestry();
		List<String> ancestorNames = new ArrayList<String>();
		for( IReferencesModelObject a : ancestry) {
			ancestorNames.add(a.getName());
		}
		String ancestryNames = StringUtils.join(ancestorNames, " => ");
		return String.format("%s\nAncestry: %s\n", doc, ancestryNames);
	}

	@Override
	public List<IReferencesModelObject> getAncestry() {
		ArrayList<IReferencesModelObject> ancestry = new ArrayList<IReferencesModelObject>();
		return getAncestry(ancestry);
	}

	@Override
	public List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry) {
		ancestry.add(this);
		if(null == ancestor)
			return ancestry;
		return ((IReferencesModelObject)ancestor).getAncestry(ancestry);
	}

}
