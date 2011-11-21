/**
 * Copyright (c) 2010 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IDiagramModelBendpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Bendpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint#getWeight <em>Weight</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint#getStartX <em>Start X</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint#getStartY <em>Start Y</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint#getEndX <em>End X</em>}</li>
 *   <li>{@link uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint#getEndY <em>End Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelBendpoint extends CDOObjectImpl implements IDiagramModelBendpoint {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelBendpoint() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public float getWeight() {
		return (Float)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__WEIGHT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWeight(float newWeight) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__WEIGHT, newWeight);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getStartX() {
		return (Integer)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__START_X, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStartX(int newStartX) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__START_X, newStartX);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getStartY() {
		return (Integer)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__START_Y, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStartY(int newStartY) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__START_Y, newStartY);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getEndX() {
		return (Integer)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__END_X, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEndX(int newEndX) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__END_X, newEndX);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getEndY() {
		return (Integer)eGet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__END_Y, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEndY(int newEndY) {
		eSet(IArchimatePackage.Literals.DIAGRAM_MODEL_BENDPOINT__END_Y, newEndY);
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EObject getCopy() {
        return EcoreUtil.copy(this);
    }

} //DiagramModelBendpoint
