package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EReference;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;

public class AttributeChangeAdapter extends AdapterImpl {
	public void notifyChanged(Notification notification) {
		if(notification.getEventType()!=Notification.ADD)
			return;
		Object feature = notification.getFeature();
		if(feature instanceof EReference) {
			EReference eref = (EReference) feature;
			if("attributes".equals(eref.getName())) {
				IBasicObject att = (IBasicObject) notification.getNotifier();
				if (att.isChecked())
					att.checkAttributes();
			}
			if("diagObjects".equals(eref.getName())) {
				IBasicObject att = (IBasicObject) notification.getNotifier();
				if (att.isChecked())
					att.checkDiagObjects();
			}
			if("diagConnections".equals(eref.getName())) {
				IBasicRelationship att = (IBasicRelationship) notification.getNotifier();
				if (att.isChecked())
					att.checkDiagConnections();
			}
		}
		
	}
}