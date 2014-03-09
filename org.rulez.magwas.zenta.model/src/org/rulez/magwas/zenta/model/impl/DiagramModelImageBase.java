/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBorderObject;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IDiagramModelImageProvider;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelImageBase#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelImageBase#getImagePath <em>Image Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelImageBase extends DiagramModelObjectBase implements IDiagramModelImage {
    /**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
    protected static final String BORDER_COLOR_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
    protected String borderColor = BORDER_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getImagePathOrNull() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getImagePathOrNull()
	 * @generated
	 * @ordered
	 */
    protected static final String IMAGE_PATH_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getImagePathOrNull() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getImagePathOrNull()
	 * @generated
	 * @ordered
	 */
    protected String imagePath = IMAGE_PATH_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelImageBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_IMAGE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getBorderColor() {
		return borderColor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBorderColor(String newBorderColor) {
		String oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_IMAGE__BORDER_COLOR, oldBorderColor, borderColor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getImagePathOrNull() {
		return imagePath;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setImagePath(@Nullable String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_IMAGE__IMAGE_PATH, oldImagePath, imagePath));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__BORDER_COLOR:
				return getBorderColor();
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__IMAGE_PATH:
				return getImagePathOrNull();
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
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__IMAGE_PATH:
				setImagePath((String)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
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
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
			case IZentaPackage.DIAGRAM_MODEL_IMAGE__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
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
		if (baseClass == IBorderObject.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_IMAGE__BORDER_COLOR: return IZentaPackage.BORDER_OBJECT__BORDER_COLOR;
				default: return -1;
			}
		}
		if (baseClass == IDiagramModelImageProvider.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_IMAGE__IMAGE_PATH: return IZentaPackage.DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH;
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
		if (baseClass == IBorderObject.class) {
			switch (baseFeatureID) {
				case IZentaPackage.BORDER_OBJECT__BORDER_COLOR: return IZentaPackage.DIAGRAM_MODEL_IMAGE__BORDER_COLOR;
				default: return -1;
			}
		}
		if (baseClass == IDiagramModelImageProvider.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH: return IZentaPackage.DIAGRAM_MODEL_IMAGE__IMAGE_PATH;
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
		result.append(" (borderColor: ");
		result.append(borderColor);
		result.append(", imagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //DiagramModelImage
