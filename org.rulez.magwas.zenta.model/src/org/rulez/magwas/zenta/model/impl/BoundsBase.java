/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.handmade.ZentaObjectImpl;
import org.rulez.magwas.zenta.model.IBounds;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BoundsBase#getX <em>X</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BoundsBase#getY <em>Y</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BoundsBase#getWidth <em>Width</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BoundsBase#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundsBase extends ZentaObjectImpl implements IBounds {
    /**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
    protected static final int X_EDEFAULT = 10;

    /**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
    protected int x = X_EDEFAULT;

    /**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
    protected static final int Y_EDEFAULT = 10;

    /**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
    protected int y = Y_EDEFAULT;

    /**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated NOT
	 * @ordered
	 */
    public static final int WIDTH_EDEFAULT = 120;

    /**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
    protected int width = WIDTH_EDEFAULT;

    /**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated NOT
	 * @ordered
	 */
    public static final int HEIGHT_EDEFAULT = 55;

    /**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
    protected int height = HEIGHT_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BoundsBase() {
		super();
	}
    
    /* 
     * Over-ride this not to
     */
    @Override
    public boolean eNotificationRequired() {
        return false;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.BOUNDS;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getX() {
		return x;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.BOUNDS__X, oldX, x));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getY() {
		return y;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.BOUNDS__Y, oldY, y));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getWidth() {
		return width;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.BOUNDS__WIDTH, oldWidth, width));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getHeight() {
		return height;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setHeight(int newHeight) {
        height = newHeight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IBounds getCopy() {
        return EcoreUtil.copy(this);
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.BOUNDS__X:
				return getX();
			case IZentaPackage.BOUNDS__Y:
				return getY();
			case IZentaPackage.BOUNDS__WIDTH:
				return getWidth();
			case IZentaPackage.BOUNDS__HEIGHT:
				return getHeight();
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
			case IZentaPackage.BOUNDS__X:
				setX((Integer)newValue);
				return;
			case IZentaPackage.BOUNDS__Y:
				setY((Integer)newValue);
				return;
			case IZentaPackage.BOUNDS__WIDTH:
				setWidth((Integer)newValue);
				return;
			case IZentaPackage.BOUNDS__HEIGHT:
				setHeight((Integer)newValue);
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
			case IZentaPackage.BOUNDS__X:
				setX(X_EDEFAULT);
				return;
			case IZentaPackage.BOUNDS__Y:
				setY(Y_EDEFAULT);
				return;
			case IZentaPackage.BOUNDS__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case IZentaPackage.BOUNDS__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case IZentaPackage.BOUNDS__X:
				return x != X_EDEFAULT;
			case IZentaPackage.BOUNDS__Y:
				return y != Y_EDEFAULT;
			case IZentaPackage.BOUNDS__WIDTH:
				return width != WIDTH_EDEFAULT;
			case IZentaPackage.BOUNDS__HEIGHT:
				return height != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //Bounds
