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
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;

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
				extractTemplate((IZentaDiagramModel)diagram);
			}
		}
			private void extractTemplate(IZentaDiagramModel diagram) {
				if (!isTemplate(diagram))
					return;
				Template template = MetamodelFactory.eINSTANCE.
						createTemplate(diagram, metaModel);
				metaModel.getTemplates().add(template);
			}
				private boolean isTemplate(IZentaDiagramModel diagram) {
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
				if(lastObject instanceof IZentaDiagramModel) {
					processDiagramModelChange((MetamodelImpl)metaModel, notification);
				} else if (lastObject instanceof IDiagramModelZentaObject) {
					processDiagramModelObjectChange(notification);
				}
			}
				private void processDiagramModelObjectChange(Notification notification) {
					int feature = notification.getFeatureID(IDiagramModelZentaObject.class);
					if(feature == IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__SOURCE_CONNECTIONS) {
						IDiagramModelComponent dmzc = (IDiagramModelComponent) notification.getNewValue();
						IDiagramModel dm = dmzc.getDiagramModel();
						Template template = metaModel.getTemplateFor(dm);
						if(null == template)
							return;
						IRelationship element =((IDiagramModelZentaConnection) dmzc).getRelationship();
						MetamodelFactory.eINSTANCE.createRelationClass(element, template);
					}
				}
				private void processDiagramModelChange(MetamodelImpl metamodel, Notification notification) {
					int feature = notification.getFeatureID(IZentaDiagramModel.class);
					if(feature == IZentaPackage.ZENTA_DIAGRAM_MODEL__CHILDREN) {
						IDiagramModelComponent dmzc = (IDiagramModelComponent) notification.getNewValue();
						IDiagramModel dm = dmzc.getDiagramModel();
						Template template = metaModel.getTemplateFor(dm);
						if(null == template)
							return;
						IZentaElement element = ((IDiagramModelZentaObject) dmzc).getZentaElement();
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
