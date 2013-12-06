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
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelBendpoint;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IFontAttribute;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getFont <em>Font</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getText <em>Text</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getSource <em>Source</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getLineDecoration <em>Line Decoration</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelConnection extends DiagramModelComponent implements IDiagramModelConnection {
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
    protected static final int TEXT_ALIGNMENT_EDEFAULT = 0;

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
     * @generated NOT
     * @ordered
     */
    protected static final int TEXT_POSITION_EDEFAULT = -1;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
    protected EList<IProperty> properties;

    /**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
    protected static final String DOCUMENTATION_EDEFAULT = ""; //$NON-NLS-1$

    /**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
    protected String documentation = DOCUMENTATION_EDEFAULT;

    /**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
    protected static final String TEXT_EDEFAULT = ""; //$NON-NLS-1$

    /**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
    protected String text = TEXT_EDEFAULT;

    /**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
    protected IDiagramModelObject source;

    /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
    protected IDiagramModelObject target;

    /**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
    protected EList<IDiagramModelBendpoint> bendpoints;

    /**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
    protected static final int LINE_WIDTH_EDEFAULT = 1;

    /**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
    protected int lineWidth = LINE_WIDTH_EDEFAULT;

    /**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
    protected static final String LINE_COLOR_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
    protected String lineColor = LINE_COLOR_EDEFAULT;

    /**
	 * The default value of the '{@link #getLineDecoration() <em>Line Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_DECORATION_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getLineDecoration() <em>Line Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineDecoration()
	 * @generated
	 * @ordered
	 */
	protected String lineDecoration = LINE_DECORATION_EDEFAULT;

				/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected static final int TYPE_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected int type = TYPE_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelConnection() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT, oldFont, font));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR, oldFontColor, fontColor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getTextAlignment() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDocumentation() {
		return documentation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION, oldDocumentation, documentation));
	}

    /**
	 * <!-- begin-user-doc -->
     * @deprecated As of version 2.1.0 the connection text is now the "name" attribute
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getText() {
		return text;
	}

    /**
	 * <!-- begin-user-doc -->
     * @deprecated As of version 2.1.0 the connection text is now the "name" attribute
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT, oldText, text));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public int getTextPosition() {
    	if(-1 == textPosition)
    		return CONNECTION_TEXT_POSITION_MIDDLE;
		return textPosition;
	}

    public int getFinalTextPosition() {
		return getTextPosition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION, oldTextPosition, textPosition));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelObject getSource() {
		return source;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSource(IDiagramModelObject newSource) {
		IDiagramModelObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__SOURCE, oldSource, source));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelObject getTarget() {
		return target;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTarget(IDiagramModelObject newTarget) {
		IDiagramModelObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__TARGET, oldTarget, target));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IDiagramModelBendpoint> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EObjectContainmentEList<IDiagramModelBendpoint>(IDiagramModelBendpoint.class, this, IZentaPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS);
		}
		return bendpoints;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public int getLineWidth() {
    	if(LINE_WIDTH_EDEFAULT == lineWidth)
    		return 1;
		return lineWidth;
	}

    public int getFinalLineWidth() {
		return getLineWidth();
	}
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH, oldLineWidth, lineWidth));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLineColor() {
		return lineColor;
	}
    public String getFinalLineColor() {
		return lineColor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLineColor(String newLineColor) {
		String oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR, oldLineColor, lineColor));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineDecoration() {
		return lineDecoration;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineDecoration(String newLineDecoration) {
		String oldLineDecoration = lineDecoration;
		lineDecoration = newLineDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_DECORATION, oldLineDecoration, lineDecoration));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(int newType) {
		int oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_CONNECTION__TYPE, oldType, type));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void connect(IDiagramModelObject source, IDiagramModelObject target) {
        if(source == null || target == null) {
            throw new IllegalArgumentException("Source or Target cannot be null"); //$NON-NLS-1$
        }
        if(source == target) {
            //throw new IllegalArgumentException("Source cannot be the same as target!");
        }
        
        // Same as before, don't bother
        if(this.source == source && this.target == target) {
            return;
        }
        
        disconnect();
        this.source = source;
        this.target = target;        
        reconnect();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void disconnect() {
        if(source != null && target != null) {
            source.removeConnection(this);
            target.removeConnection(this);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void reconnect() {
        if(source != null && target != null) {
            source.addConnection(this);
            target.addConnection(this);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public int getDefaultTextAlignment() {
        return TEXT_ALIGNMENT_CENTER;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				return ((InternalEList<?>)getBendpoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    @Override
    public EObject getCopy() {
        IDiagramModelConnection newConnection = (IDiagramModelConnection)super.getCopy();
        newConnection.setSource(null);
        newConnection.setTarget(null);
        return newConnection;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				return getFont();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				return getFontColor();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT:
				return getTextAlignment();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				return getTextPosition();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				return getProperties();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				return getDocumentation();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				return getText();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				return getSource();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				return getTarget();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				return getBendpoints();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				return getLineWidth();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				return getLineColor();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_DECORATION:
				return getLineDecoration();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				return getType();
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
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				setFont((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				setFontColor((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT:
				setTextAlignment((Integer)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				setTextPosition((Integer)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends IProperty>)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				setText((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				setSource((IDiagramModelObject)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				setTarget((IDiagramModelObject)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends IDiagramModelBendpoint>)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				setLineColor((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_DECORATION:
				setLineDecoration((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				setType((Integer)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				setTextPosition(TEXT_POSITION_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				getProperties().clear();
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				setSource((IDiagramModelObject)null);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				setTarget((IDiagramModelObject)null);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_DECORATION:
				setLineDecoration(LINE_DECORATION_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				return FONT_COLOR_EDEFAULT == null ? fontColor != null : !FONT_COLOR_EDEFAULT.equals(fontColor);
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				return textPosition != TEXT_POSITION_EDEFAULT;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				return source != null;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				return target != null;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				return LINE_COLOR_EDEFAULT == null ? lineColor != null : !LINE_COLOR_EDEFAULT.equals(lineColor);
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__LINE_DECORATION:
				return LINE_DECORATION_EDEFAULT == null ? lineDecoration != null : !LINE_DECORATION_EDEFAULT.equals(lineDecoration);
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				return type != TYPE_EDEFAULT;
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
				case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT: return IZentaPackage.FONT_ATTRIBUTE__FONT;
				case IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR: return IZentaPackage.FONT_ATTRIBUTE__FONT_COLOR;
				case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT: return IZentaPackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT;
				case IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION: return IZentaPackage.FONT_ATTRIBUTE__TEXT_POSITION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES: return IZentaPackage.PROPERTIES__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (derivedFeatureID) {
				case IZentaPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION: return IZentaPackage.DOCUMENTABLE__DOCUMENTATION;
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
				case IZentaPackage.FONT_ATTRIBUTE__FONT: return IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT;
				case IZentaPackage.FONT_ATTRIBUTE__FONT_COLOR: return IZentaPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR;
				case IZentaPackage.FONT_ATTRIBUTE__TEXT_ALIGNMENT: return IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT;
				case IZentaPackage.FONT_ATTRIBUTE__TEXT_POSITION: return IZentaPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION;
				default: return -1;
			}
		}
		if (baseClass == IProperties.class) {
			switch (baseFeatureID) {
				case IZentaPackage.PROPERTIES__PROPERTIES: return IZentaPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == IDocumentable.class) {
			switch (baseFeatureID) {
				case IZentaPackage.DOCUMENTABLE__DOCUMENTATION: return IZentaPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION;
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
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", text: ");
		result.append(text);
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineColor: ");
		result.append(lineColor);
		result.append(", lineDecoration: ");
		result.append(lineDecoration);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DiagramModelConnection
