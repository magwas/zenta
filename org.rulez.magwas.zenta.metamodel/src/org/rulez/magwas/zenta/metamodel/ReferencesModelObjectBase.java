/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IIdentifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References Model Object Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getReferencesModelObjectBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ReferencesModelObjectBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(IIdentifier)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getReferencesModelObjectBase_Reference()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	IIdentifier getReference();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(IIdentifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getReferencesModelObjectBase_Name()
	 * @model required="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	ITemplate getTemplate();

} // ReferencesModelObjectBase
