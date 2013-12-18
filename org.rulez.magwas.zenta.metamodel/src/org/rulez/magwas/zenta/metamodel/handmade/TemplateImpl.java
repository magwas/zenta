package org.rulez.magwas.zenta.metamodel.handmade;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.RelationClassBase;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;

public class TemplateImpl extends TemplateBaseImpl implements Template {

	protected TemplateImpl() {
		super();
	}

	public TemplateImpl(IDiagramModel reference2, Metamodel metamodel) {
		super();
		metamodel.getTemplates().add(this);
		setReference(reference2);
		extractObjectClasses(reference2);
		extractRelationClasses(reference2);
	}

		private void extractObjectClasses(IDiagramModel diagram) {
			EList<IDiagramModelObject> kids = diagram.getChildren();
			for (IDiagramModelObject kid : kids)
				if(kid instanceof IDiagramModelZentaObject)
					extractDiagramElement((IDiagramModelZentaObject) kid);			
		}
			private void extractDiagramElement(IDiagramModelZentaObject kid) {
				IZentaElement zentaElement = (IZentaElement) kid.getZentaElement();
				MetamodelFactory.eINSTANCE
						.createObjectClass(zentaElement, this);
				EList<IDiagramModelObject> myKids = kid.getChildren();
				for (IDiagramModelObject aKid : myKids)
					extractDiagramElement((IDiagramModelZentaObject) aKid);
			}
		private void extractRelationClasses(IDiagramModel diagram) {
			EList<IDiagramModelObject> kids = diagram.getChildren();
			for (IDiagramModelObject kid : kids)
				if(kid instanceof IDiagramModelZentaObject)
					extractConnsFromDiagramElement((IDiagramModelZentaObject) kid);
		}
			private void extractConnsFromDiagramElement(IDiagramModelZentaObject kid) {
				EList<IDiagramModelObject> myKids = kid.getChildren();
				for (IDiagramModelObject aKid : myKids)
					extractConnsFromDiagramElement((IDiagramModelZentaObject) aKid);
				extractConnectionsForDiagramElement(kid);
			}
				private void extractConnectionsForDiagramElement(
						IDiagramModelZentaObject kid) {
					for (IDiagramModelConnection conn : kid.getSourceConnections())
						extractRelationClassFor(conn);
				}
					private void extractRelationClassFor(
							IDiagramModelConnection conn) {
						if(!(conn instanceof IDiagramModelZentaConnection))
							return;
						IDiagramModelZentaConnection dmc = (IDiagramModelZentaConnection)conn;
						IRelationship relationship = (IRelationship) dmc.getRelationship();
						MetamodelFactory.eINSTANCE.createRelationClass(
								relationship,
								this);
					}


	@Override
	public ObjectClass getObjectClassReferencingElement(IZentaElement classTemplate) {
		for(ObjectClassBase oc : ((MetamodelImpl)getMetamodel()).getObjectClasses()) {
			IIdentifier reference = oc.getReference();
			if(null == reference)
				continue;
			if(reference.equals(classTemplate))
				return (ObjectClass)oc;
		}
		return null;
	}
	@Override
	public ObjectClass getObjectClassFrom(IZentaElement referenced) {
		ObjectClass oc = getObjectClassReferencingElement(referenced);
		if (null == oc)
			oc = new ObjectClassImpl(referenced, this);
		return oc;
	}

	@Override
	public RelationClass getRelationClassReferencingElement(IRelationship classTemplate) {
		for(RelationClassBase oc : ((MetamodelImpl)getMetamodel()).getRelationClasses()) {
			IIdentifier reference = oc.getReference();
			if(null == reference)
				continue;
			if(reference.equals(classTemplate))
				return (RelationClass)oc;
		}
		return null;
	}

	@Override
	public RelationClass getRelationClassFrom(IRelationship referenced) {
		RelationClass oc = getRelationClassReferencingElement(referenced);
		if (null == oc)
			oc = new RelationClassImpl(referenced, this);
		return oc;
	}
	
	@Override
	public IIdentifier create(IFolder folder) {
		return IZentaFactory.eINSTANCE.createZentaDiagramModel();
	}

	@Override
	public void createClassBy(IZentaElement element) {
		if(element instanceof IRelationship)
			relationClasses.add(getRelationClassFrom((IRelationship) element));
		else
			objectClasses.add(getObjectClassFrom(element));
	}
}