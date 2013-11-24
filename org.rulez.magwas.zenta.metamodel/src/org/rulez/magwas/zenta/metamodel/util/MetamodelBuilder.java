package org.rulez.magwas.zenta.metamodel.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.impl.MetamodelImpl;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.AssociationRelationship;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObject;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;
import org.rulez.magwas.zenta.model.impl.ZentaPackage;

public class MetamodelBuilder {

	private Metamodel metaModel;
	IZentaModel model;
	private Notification notificaton;
	
	public MetamodelBuilder(IZentaModel zentaModel) {
		model = zentaModel;
		metaModel = (Metamodel) MetamodelFactory.eINSTANCE.createMetamodel();
		initializeMetaModel();
	    setAdapter();
	}
		private void initializeMetaModel() {
			EList<IDiagramModel> diagrams = model.getDiagramModels();
			for(IDiagramModel diagram : diagrams) {
				extractTemplate(diagram);
			}
		}
			private void extractTemplate(IDiagramModel diagram) {
				if (!isTemplate(diagram))
					return;
				Template template = MetamodelFactory.eINSTANCE.
						createTemplate((ZentaDiagramModel) diagram, metaModel);
				metaModel.getTemplates().add(template);
			}
				private boolean isTemplate(IDiagramModel diagram) {
					EList<IProperty> properties = diagram.getProperties();
					for (IProperty property : properties)
						if(property.getKey().equals("Template"))
							return true;
					return false;
				}
	private void setAdapter() {
		EContentAdapter adapter = new EContentAdapter() {
	        public void notifyChanged(Notification notification) {
	          super.notifyChanged(notification);
	          processNotification(notification);
	        }
	    };
	    model.eAdapters().add(adapter);
	}
		private void processNotification(Notification notification) {
			this.notificaton = notification;
			EObject lastObject;
			lastObject = (EObject) notification.getNotifier();
			System.out.printf("notification for \n\t%s\n\t%s", notification.getNotifier(),notification.getFeature() );
			if(lastObject instanceof ZentaDiagramModel) {
				processDiagramModelChange((MetamodelImpl)metaModel, notification);
			} else if (lastObject instanceof DiagramModelZentaObject) {
				processDiagramModelObjectChange(notification);
			}
		}
			private void processDiagramModelObjectChange(Notification notification) {
				int feature = notification.getFeatureID(DiagramModelZentaObject.class);
				if(feature == ZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__SOURCE_CONNECTIONS) {
					IDiagramModelComponent dmzc = (IDiagramModelComponent) notification.getNewValue();
					IDiagramModel dm = dmzc.getDiagramModel();
					Template template = metaModel.getTemplateFor(dm);
					if(null == template)
						return;
					AssociationRelationship element = (AssociationRelationship) ((IDiagramModelZentaConnection) dmzc).getRelationship();
					MetamodelFactory.eINSTANCE.createRelationClass(element, template);
				}
			}
			private void processDiagramModelChange(MetamodelImpl metamodel, Notification notification) {
				int feature = notification.getFeatureID(ZentaDiagramModel.class);
				if(feature == ZentaPackage.ZENTA_DIAGRAM_MODEL__CHILDREN) {
					IDiagramModelComponent dmzc = (IDiagramModelComponent) notification.getNewValue();
					IDiagramModel dm = dmzc.getDiagramModel();
					Template template = metaModel.getTemplateFor(dm);
					if(null == template)
						return;
					BusinessObject element = (BusinessObject) ((IDiagramModelZentaObject) dmzc).getZentaElement();
					MetamodelFactory.eINSTANCE.createObjectClass(element, template);
				}
			}

	public Metamodel getMetamodel() {
		return metaModel;
	}
	
	public Object getLastObject() {
		return this.notificaton.getNotifier();
	}
}
