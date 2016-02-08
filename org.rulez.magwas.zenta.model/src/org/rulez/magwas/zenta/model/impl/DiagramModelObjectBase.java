/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IFontAttribute;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getFont <em>Font</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase#getElementShape <em>Element Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramModelObjectBase extends DiagramModelComponentBase implements IDiagramModelObject {
    /**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
    protected static final String FONT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
    protected String font = FONT_EDEFAULT;

    /**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
    protected static final String FONT_COLOR_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
    protected String fontColor = FONT_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
    protected static final int TEXT_ALIGNMENT_EDEFAULT = 2;

    /**
	 * The cached value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
    protected int textAlignment = TEXT_ALIGNMENT_EDEFAULT;

    /**
	 * The default value of the '{@link #getTextPosition() <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTextPosition()
	 * @generated
	 * @ordered
	 */
    protected static final int TEXT_POSITION_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getTextPosition() <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTextPosition()
	 * @generated
	 * @ordered
	 */
    protected int textPosition = TEXT_POSITION_EDEFAULT;

    /**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated NOT
	 * @ordered
	 */
    protected IBounds bounds = new BoundsBase();

    /**
	 * The cached value of the '{@link #getSourceConnections() <em>Source Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSourceConnections()
	 * @generated
	 * @ordered
	 */
    protected EList<IDiagramModelConnection> sourceConnections;

    /**
	 * The cached value of the '{@link #getTargetConnections() <em>Target Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTargetConnections()
	 * @generated
	 * @ordered
	 */
    protected EList<IDiagramModelConnection> targetConnections;

    /**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
    protected static final String FILL_COLOR_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
    protected String fillColor = FILL_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getElementShape() <em>Element Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementShape()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String ELEMENT_SHAPE_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getElementShape() <em>Element Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementShape()
	 * @generated
	 * @ordered
	 */
	protected String elementShape = ELEMENT_SHAPE_EDEFAULT;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelObjectBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_OBJECT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBounds getBounds() {
		return bounds;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBounds(IBounds newBounds, NotificationChain msgs) {
		IBounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBounds(IBounds newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, newBounds, newBounds));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IDiagramModelConnection> getSourceConnections() {
		if (sourceConnections == null) {
			sourceConnections = new EObjectContainmentEList<IDiagramModelConnection>(IDiagramModelConnection.class, this, IZentaPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS);
		}
		return sourceConnections;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IDiagramModelConnection> getTargetConnections() {
		if (targetConnections == null) {
			targetConnections = new EObjectEList<IDiagramModelConnection>(IDiagramModelConnection.class, this, IZentaPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS);
		}
		return targetConnections;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getFillColor() {
		return fillColor;
	}
    
    public String getFinalFillColor() {
    	return fillColor;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFillColor(String newFillColor) {
		String oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR, oldFillColor, fillColor));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementShape() {
		return elementShape;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementShape(String newElementShape) {
		String oldElementShape = elementShape;
		elementShape = newElementShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE, oldElementShape, elementShape));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getFont() {
		return font;
	}

    public String getFinalFont() {
		return font;
	}
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT, oldFont, font));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getFontColor() {
		return fontColor;
	}

    public String getFinalFontColor() {
    	return fontColor;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFontColor(String newFontColor) {
		String oldFontColor = fontColor;
		fontColor = newFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR, oldFontColor, fontColor));
	}

    public int getTextAlignment() {
        return textAlignment;
    }

    public int getFinalTextAlignment() {
    	if(textAlignment == TEXT_ALIGNMENT_NONE)
    		return getDefaultTextAlignment();
    	return textAlignment;
    }
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTextAlignment(int newTextAlignment) {
		int oldTextAlignment = textAlignment;
		textAlignment = newTextAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getTextPosition() {
		return textPosition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTextPosition(int newTextPosition) {
		int oldTextPosition = textPosition;
		textPosition = newTextPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_POSITION, oldTextPosition, textPosition));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addConnection(IDiagramModelConnection connection) {
        if(connection == null) {
            throw new IllegalArgumentException("Connection was null"); //$NON-NLS-1$
        }
        
        if(connection.getSource() == this) {
            getSourceConnections().add(connection);
        }
        
        if(connection.getTarget() == this) {
            getTargetConnections().add(connection);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void removeConnection(IDiagramModelConnection connection) {
        if(connection == null) {
            throw new IllegalArgumentException();
        }
        
        if(connection.getSource() == this) {
            getSourceConnections().remove(connection);
        } 
        
        if(connection.getTarget() == this) {
            getTargetConnections().remove(connection);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setBounds(int x, int y, int width, int height) {
        IBounds bounds = IZentaFactory.eINSTANCE.createBounds(x, y, width, height);
        setBounds(bounds);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public int getDefaultTextAlignment() {
        return TEXT_ALIGNMENT_EDEFAULT;
    }

    @Override
    public EObject getCopy() {
        IDiagramModelObject newObject = (IDiagramModelObject)super.getCopy();
        
        newObject.getSourceConnections().clear();
        newObject.getTargetConnections().clear();
        
        return newObject;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				return basicSetBounds(null, msgs);
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				return ((InternalEList<?>)getSourceConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT:
				return getFont();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				return getFontColor();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				return getTextAlignment();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_POSITION:
				return getTextPosition();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				return getBounds();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				return getSourceConnections();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				return getTargetConnections();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				return getFillColor();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE:
				return getElementShape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT:
				setFont((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				setFontColor((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				setTextAlignment((Integer)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_POSITION:
				setTextPosition((Integer)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				setBounds((IBounds)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				getSourceConnections().clear();
				getSourceConnections().addAll((Collection<? extends IDiagramModelConnection>)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				getTargetConnections().clear();
				getTargetConnections().addAll((Collection<? extends IDiagramModelConnection>)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				setFillColor((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE:
				setElementShape((String)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_POSITION:
				setTextPosition(TEXT_POSITION_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				setBounds((IBounds)null);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				getSourceConnections().clear();
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				getTargetConnections().clear();
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE:
				setElementShape(ELEMENT_SHAPE_EDEFAULT);
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
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				return FONT_COLOR_EDEFAULT == null ? fontColor != null : !FONT_COLOR_EDEFAULT.equals(fontColor);
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_POSITION:
				return textPosition != TEXT_POSITION_EDEFAULT;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				return bounds != null;
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				return sourceConnections != null && !sourceConnections.isEmpty();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				return targetConnections != null && !targetConnections.isEmpty();
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				return FILL_COLOR_EDEFAULT == null ? fillColor != null : !FILL_COLOR_EDEFAULT.equals(fillColor);
			case IZentaPackage.DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE:
				return ELEMENT_SHAPE_EDEFAULT == null ? elementShape != null : !ELEMENT_SHAPE_EDEFAULT.equals(elementShape);
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
		if (baseClass == IFontAttribute.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT: return IZentaPackage.FONT_ATTRIBUTE__FONT;
				case IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR: return IZentaPackage.FONT_ATTRIBUTE__FONT_COLOR;
				case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT: return IZentaPackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT;
				case IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_POSITION: return IZentaPackage.FONT_ATTRIBUTE__TEXT_POSITION;
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
		if (baseClass == IFontAttribute.class) {
			switch (baseFeatureID) {
				case IZentaPackage.FONT_ATTRIBUTE__FONT: return IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT;
				case IZentaPackage.FONT_ATTRIBUTE__FONT_COLOR: return IZentaPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR;
				case IZentaPackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT: return IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;
				case IZentaPackage.FONT_ATTRIBUTE__TEXT_POSITION: return IZentaPackage.DIAGRAM_MODEL_OBJECT__TEXT_POSITION;
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
		result.append(" (font: ");
		result.append(font);
		result.append(", fontColor: ");
		result.append(fontColor);
		result.append(", textAlignment: ");
		result.append(textAlignment);
		result.append(", textPosition: ");
		result.append(textPosition);
		result.append(", fillColor: ");
		result.append(fillColor);
		result.append(", elementShape: ");
		result.append(elementShape);
		result.append(')');
		return result.toString();
	}

} //DiagramModelObject
