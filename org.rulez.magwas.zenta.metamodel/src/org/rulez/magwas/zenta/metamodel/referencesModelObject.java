/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>references Model Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.referencesModelObject#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage#getreferencesModelObject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface referencesModelObject extends EObject {
	
	IIdentifier getReference();

	String getName();

	boolean isinstance(IIdentifier relation);

	void setReference(IIdentifier newReference);

	Template getTemplate();
	
	IIdentifier create();

	String getId();

} // referencesModelObject
