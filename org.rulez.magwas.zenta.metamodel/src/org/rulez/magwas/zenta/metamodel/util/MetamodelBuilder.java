package org.rulez.magwas.zenta.metamodel.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.impl.DiagramModelObject;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObject;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;
import org.rulez.magwas.zenta.model.impl.ZentaPackage;

public class MetamodelBuilder {

	private Metamodel metaModel;
	IZentaModel model;
	private Notification lastNotification;
	
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
			lastNotification = notification;
			EObject lastObject;
			lastObject = (EObject) notification.getNotifier();
			System.out.printf("processing %s\n", lastObject);
			if(lastObject instanceof BusinessObject) {
				processBusinessObjectChange((BusinessObject) lastObject);
			} else if (lastObject instanceof ZentaDiagramModel) {
				processDiagramModelChange((ZentaDiagramModel)lastObject);
			}
		}
			private void processDiagramModelChange(ZentaDiagramModel lastObject) {
				System.out.println("processDM");
				if(lastNotification.getFeature().equals(ZentaPackage.ZENTA_DIAGRAM_MODEL__CHILDREN)) {
					@SuppressWarnings("unchecked")
					EList<DiagramModelObject> newValue =
						(EList<DiagramModelObject>) lastNotification.getNewValue();
					@SuppressWarnings("unchecked")
					EList<DiagramModelObject> oldValue =
							(EList<DiagramModelObject>) lastNotification.getOldValue();
					for(DiagramModelObject dmo : newValue)
						if (!oldValue.contains(dmo)) 
							addObject((DiagramModelZentaObject) dmo);
				}
			}
			private void addObject(DiagramModelZentaObject dmo) {
				System.out.printf("adding %s\n", dmo);
				ZentaDiagramModel dm = (ZentaDiagramModel) dmo.getDiagramModel();
				Template template = metaModel.getTemplateFor(dm);
				IZentaElement element = dmo.getZentaElement();
				MetamodelFactory.eINSTANCE.createObjectClass(element, template);
			}
			private void processBusinessObjectChange(BusinessObject lastObject) {
				System.out.println("BusinessObjectChange");
			}
	public Object getLastObject() {
		if(null == lastNotification)
			return null;
		return lastNotification.getNotifier();
	}

	public Metamodel getMetamodel() {
		return metaModel;
	}
}
