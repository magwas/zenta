/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBasicObject;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BasicObjectBase extends ZentaElementBase implements IBasicObject {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BasicObjectBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.BASIC_OBJECT;
	}

	@Override
	public IBasicRelationship getDefiningElement(
			DiagramModelZentaConnectionBase diagramModelZentaConnectionBase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTemplate() {
		// TODO Auto-generated method stub
		return false;
	}

} //BasicObject
