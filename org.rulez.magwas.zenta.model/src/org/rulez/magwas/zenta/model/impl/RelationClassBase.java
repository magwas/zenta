/**
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Class Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.RelationClassBase#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.RelationClassBase#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.RelationClassBase#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.RelationClassBase#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.RelationClassBase#getTemplate <em>ITemplate</em>}</li>
 * </ul>
 * </p>
 *
 */
abstract public class RelationClassBase extends EObjectImpl implements IRelationClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationClassBase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IZentaPackage.Literals.RELATION_CLASS;
	}

} //RelationClassBaseImpl
