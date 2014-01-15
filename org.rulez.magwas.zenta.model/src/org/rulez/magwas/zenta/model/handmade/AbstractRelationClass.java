package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.impl.RelationClassBase;

public abstract class AbstractRelationClass extends RelationClassBase implements IRelationClass{

	protected IRelationClass ancestor;
	protected EList<IRelationClass> children;
	protected ITemplate template;

	public AbstractRelationClass() {
		super();
	}

	public AbstractRelationClass(IRelationship referenced,
			ITemplate template) {
		setReference(referenced);
		template.getRelationClasses().add(this);
		setName(IZentaFactory.eINSTANCE.getDefiningName(reference));
		this.template = template;
	}

	@Override
	public IMetamodel getMetamodel() {
		return (IMetamodel) template.getMetamodel();
	}

	protected void addAttributesToRelatedObjectClasses(ITemplate template,
			Direction dir, IZentaElement se) {
				IObjectClass sc = template.getObjectClassFrom(se);
				Attribute sa = new Attribute(this,sc,dir);
				sc.getAttributes().add(sa);
			}

	@Override
	public ITemplate getTemplate() {
		return template;
	}

	@Override
	public void postCreate(IIdentifier createdObj, IFolder folder) {
		folder.getElements().add(createdObj);
	}

	@Override
	public String getId() {
		return ((IIdentifier)reference).getId();
	}

	@Override
	public boolean isInstance(IIdentifier relation) {
		return getId().equals(relation.getObjectClass());
	}

	@Override
	public String getHelpHintTitle() {
		return this.getName();
	}

}