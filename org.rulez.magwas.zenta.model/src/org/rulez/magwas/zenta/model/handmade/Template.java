package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.TemplateBase;

public class Template extends TemplateBase implements ITemplate {

	protected Template() {
		super();
	}

	public Template(IDiagramModel reference2, IMetamodel metamodel) {
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
				IZentaFactory.eINSTANCE
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
						IZentaFactory.eINSTANCE.createRelationClass(
								relationship,
								this);
					}


	@Override
	public IObjectClass getObjectClassReferencingElement(IZentaElement classTemplate) {
		for(IObjectClass oc : ((Metamodel)getMetamodel()).getObjectClasses()) {
			IIdentifier reference = oc.getReference();
			if(null == reference)
				continue;
			if(reference.equals(classTemplate))
				return (IObjectClass)oc;
		}
		return null;
	}
	@Override
	public IObjectClass getObjectClassFrom(IZentaElement referenced) {
		IObjectClass oc = getObjectClassReferencingElement(referenced);
		if (null == oc)
			oc = new ObjectClass(referenced, this);
		return oc;
	}

	@Override
	public IRelationClass getRelationClassReferencingElement(IRelationship classTemplate) {
		for(IRelationClass oc : ((Metamodel)getMetamodel()).getRelationClasses()) {
			IIdentifier reference = oc.getReference();
			if(null == reference)
				continue;
			if(reference.equals(classTemplate))
				return (IRelationClass)oc;
		}
		return null;
	}

	@Override
	public IRelationClass getRelationClassFrom(IRelationship referenced) {
		IRelationClass oc = getRelationClassReferencingElement(referenced);
		if (null == oc)
			oc = new RelationClass(referenced, this);
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

	@Override
	public void postCreate(IIdentifier createdObj, IFolder folder) {
		// TODO design problem
		throw new RuntimeException();
	}

	@Override
	public boolean isInstance(IIdentifier relation) {
		// TODO design problem
		throw new RuntimeException();
	}

	@Override
	public String getId() {
		// TODO design problem
		throw new RuntimeException();
	}

	@Override
	public List<IReferencesModelObject> getAncestry(
			List<IReferencesModelObject> ancestry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IReferencesModelObject> getAncestry() {
		// TODO Auto-generated method stub
		return null;
	}
}