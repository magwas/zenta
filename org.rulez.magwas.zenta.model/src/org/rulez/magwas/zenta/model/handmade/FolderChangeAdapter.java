package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EReference;
import org.rulez.magwas.zenta.model.IFolder;

public class FolderChangeAdapter extends AdapterImpl {
	public void notifyChanged(Notification notification) {
		if(notification.getEventType()!=Notification.ADD)
			return;
		Object feature = notification.getFeature();
		if(feature instanceof EReference) {
			EReference eref = (EReference) feature;
			if("elements".equals(eref.getName())) {
				IFolder folder = (IFolder) notification.getNotifier();
				if (folder.isChecked())
					folder.checkElements();
			} else if("folders".equals(eref.getName())) {
				IFolder folder = (IFolder) notification.getNotifier();
				if (folder.isChecked())
					folder.checkFolders();
			}
		}
	}
}