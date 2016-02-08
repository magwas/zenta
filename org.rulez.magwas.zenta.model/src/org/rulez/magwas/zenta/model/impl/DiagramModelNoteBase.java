/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.ITextContent;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelNoteBase#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramModelNoteBase extends DiagramModelObjectBase implements IDiagramModelNote {
    /**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
    protected static final String CONTENT_EDEFAULT = ""; //$NON-NLS-1$

    /**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
    protected String content = CONTENT_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelNoteBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_NOTE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getContent() {
		return content;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_NOTE__CONTENT, oldContent, content));
	}
    
    /** 
     * Left Justified
     */
    @Override
    public int getDefaultTextAlignment() {
        return TEXT_ALIGNMENT_LEFT;
    }
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_NOTE__CONTENT:
				return getContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_NOTE__CONTENT:
				setContent((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_NOTE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_NOTE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITextContent.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_NOTE__CONTENT: return IZentaPackage.TEXT_CONTENT__CONTENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITextContent.class) {
			switch (baseFeatureID) {
				case IZentaPackage.TEXT_CONTENT__CONTENT: return IZentaPackage.DIAGRAM_MODEL_NOTE__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //DiagramModelNote
