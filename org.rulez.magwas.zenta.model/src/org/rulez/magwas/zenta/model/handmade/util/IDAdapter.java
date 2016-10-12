/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.handmade.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaFactory;


/**
 * Adapter to allocate and/or store unique IDs for child objects of an Zenta model as they are added or de-serialised.
 *
 * IDs in IIdentifier need to be unique for the model so we need a system to allocate and track them.
 * This adapter will listen for child elements added to the model, both when deserialising from file
 * and when the user creates a child element. The IDs are cached to check for duplicates.
 * 
 * In order for this to work a model object should be added to the main ZentaModel first *before* any of its
 * child objects are added (would be orphaned otherwise).
 * 
 * IDs are not removed from the cache if an element is deleted in case the user performs an Undo operation.
 * 
 * @author Phillip Beauvoir
 */
public class IDAdapter extends EContentAdapter {

    @Override
    public void notifyChanged(Notification msgo) {
    	Notification msg = Util.verifyNonNull(msgo);
        super.notifyChanged(msg);

        if(msg.getEventType() == Notification.ADD) {
            if(msg.getNewValue() instanceof IIdentifier) {
                IIdentifier element = (IIdentifier)msg.getNewValue();
                String id = element.getId();
                // Element has no ID so allocate one
                if(id == null) {
                    element.setId(getNewID());
                }
                // Register the ID to the list when loading in from file
                else {
                    registerID(id);
                }
            }
        }
    }

    public void registerID(String id) {
    	IZentaFactory.eINSTANCE.registerID(id);
    }
    
    public String getNewID() {
    	return IZentaFactory.eINSTANCE.getNewID();
    }
}