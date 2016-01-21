/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelSticky;
import org.rulez.magwas.zenta.canvas.model.ICanvasPackage;
import org.rulez.magwas.zenta.canvas.model.INotesContent;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBorderObject;
import org.rulez.magwas.zenta.model.IDiagramModelImageProvider;
import org.rulez.magwas.zenta.model.ILockable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ITextContent;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Sticky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.canvas.model.impl.CanvasModelSticky#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.canvas.model.impl.CanvasModelSticky#getImagePosition <em>Image Position</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.canvas.model.impl.CanvasModelSticky#getContent <em>Content</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.canvas.model.impl.CanvasModelSticky#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.canvas.model.impl.CanvasModelSticky#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.canvas.model.impl.CanvasModelSticky#isLocked <em>Locked</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.canvas.model.impl.CanvasModelSticky#getBorderColor <em>Border Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasModelSticky extends DiagramModelObjectBase implements ICanvasModelSticky {
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
     * The default value of the '{@link #getImagePosition() <em>Image Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImagePosition()
     * @generated
     * @ordered
     */
    protected static final int IMAGE_POSITION_EDEFAULT = 2;

    /**
     * The cached value of the '{@link #getImagePosition() <em>Image Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImagePosition()
     * @generated
     * @ordered
     */
    protected int imagePosition = IMAGE_POSITION_EDEFAULT;

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
     * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotes()
     * @generated
     * @ordered
     */
    protected static final String NOTES_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotes()
     * @generated
     * @ordered
     */
    protected String notes = NOTES_EDEFAULT;

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
     * The default value of the '{@link #isLocked() <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocked()
     * @generated
     * @ordered
     */
    protected static final boolean LOCKED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isLocked() <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLocked()
     * @generated
     * @ordered
     */
    protected boolean locked = LOCKED_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CanvasModelSticky() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ICanvasPackage.Literals.CANVAS_MODEL_STICKY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public @NonNull String getImagePathOrNull() {
        return Util.verifyNonNull(imagePath);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_PATH, oldImagePath, imagePath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getImagePosition() {
        return imagePosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImagePosition(int newImagePosition) {
        int oldImagePosition = imagePosition;
        imagePosition = newImagePosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_POSITION, oldImagePosition, imagePosition));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ICanvasPackage.CANVAS_MODEL_STICKY__CONTENT, oldContent, content));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    
	@NonNull
    public EList<IProperty> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocked(boolean newLocked) {
        boolean oldLocked = locked;
        locked = newLocked;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ICanvasPackage.CANVAS_MODEL_STICKY__LOCKED, oldLocked, locked));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ICanvasPackage.CANVAS_MODEL_STICKY__BORDER_COLOR, oldBorderColor, borderColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNotes(String newNotes) {
        String oldNotes = notes;
        notes = newNotes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ICanvasPackage.CANVAS_MODEL_STICKY__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_PATH:
                return getImagePathOrNull();
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_POSITION:
                return getImagePosition();
            case ICanvasPackage.CANVAS_MODEL_STICKY__CONTENT:
                return getContent();
            case ICanvasPackage.CANVAS_MODEL_STICKY__NOTES:
                return getNotes();
            case ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES:
                return getProperties();
            case ICanvasPackage.CANVAS_MODEL_STICKY__LOCKED:
                return isLocked();
            case ICanvasPackage.CANVAS_MODEL_STICKY__BORDER_COLOR:
                return getBorderColor();
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
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_PATH:
                setImagePath((String)newValue);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_POSITION:
                setImagePosition((Integer)newValue);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__CONTENT:
                setContent((String)newValue);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__NOTES:
                setNotes((String)newValue);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends IProperty>)newValue);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__LOCKED:
                setLocked((Boolean)newValue);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__BORDER_COLOR:
                setBorderColor((String)newValue);
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
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_PATH:
                setImagePath(IMAGE_PATH_EDEFAULT);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_POSITION:
                setImagePosition(IMAGE_POSITION_EDEFAULT);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__CONTENT:
                setContent(CONTENT_EDEFAULT);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES:
                getProperties().clear();
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__LOCKED:
                setLocked(LOCKED_EDEFAULT);
                return;
            case ICanvasPackage.CANVAS_MODEL_STICKY__BORDER_COLOR:
                setBorderColor(BORDER_COLOR_EDEFAULT);
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
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_PATH:
                return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
            case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_POSITION:
                return imagePosition != IMAGE_POSITION_EDEFAULT;
            case ICanvasPackage.CANVAS_MODEL_STICKY__CONTENT:
                return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
            case ICanvasPackage.CANVAS_MODEL_STICKY__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case ICanvasPackage.CANVAS_MODEL_STICKY__LOCKED:
                return locked != LOCKED_EDEFAULT;
            case ICanvasPackage.CANVAS_MODEL_STICKY__BORDER_COLOR:
                return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
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
        if (baseClass == IDiagramModelImageProvider.class) {
            switch (derivedFeatureID) {
                case ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_PATH: return IZentaPackage.DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH;
                default: return -1;
            }
        }
        if (baseClass == ITextContent.class) {
            switch (derivedFeatureID) {
                case ICanvasPackage.CANVAS_MODEL_STICKY__CONTENT: return IZentaPackage.TEXT_CONTENT__CONTENT;
                default: return -1;
            }
        }
        if (baseClass == INotesContent.class) {
            switch (derivedFeatureID) {
                case ICanvasPackage.CANVAS_MODEL_STICKY__NOTES: return ICanvasPackage.NOTES_CONTENT__NOTES;
                default: return -1;
            }
        }
        if (baseClass == IProperties.class) {
            switch (derivedFeatureID) {
                case ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES: return IZentaPackage.PROPERTIES__PROPERTIES;
                default: return -1;
            }
        }
        if (baseClass == ILockable.class) {
            switch (derivedFeatureID) {
                case ICanvasPackage.CANVAS_MODEL_STICKY__LOCKED: return IZentaPackage.LOCKABLE__LOCKED;
                default: return -1;
            }
        }
        if (baseClass == IBorderObject.class) {
            switch (derivedFeatureID) {
                case ICanvasPackage.CANVAS_MODEL_STICKY__BORDER_COLOR: return IZentaPackage.BORDER_OBJECT__BORDER_COLOR;
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
        if (baseClass == IDiagramModelImageProvider.class) {
            switch (baseFeatureID) {
                case IZentaPackage.DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH: return ICanvasPackage.CANVAS_MODEL_STICKY__IMAGE_PATH;
                default: return -1;
            }
        }
        if (baseClass == ITextContent.class) {
            switch (baseFeatureID) {
                case IZentaPackage.TEXT_CONTENT__CONTENT: return ICanvasPackage.CANVAS_MODEL_STICKY__CONTENT;
                default: return -1;
            }
        }
        if (baseClass == INotesContent.class) {
            switch (baseFeatureID) {
                case ICanvasPackage.NOTES_CONTENT__NOTES: return ICanvasPackage.CANVAS_MODEL_STICKY__NOTES;
                default: return -1;
            }
        }
        if (baseClass == IProperties.class) {
            switch (baseFeatureID) {
                case IZentaPackage.PROPERTIES__PROPERTIES: return ICanvasPackage.CANVAS_MODEL_STICKY__PROPERTIES;
                default: return -1;
            }
        }
        if (baseClass == ILockable.class) {
            switch (baseFeatureID) {
                case IZentaPackage.LOCKABLE__LOCKED: return ICanvasPackage.CANVAS_MODEL_STICKY__LOCKED;
                default: return -1;
            }
        }
        if (baseClass == IBorderObject.class) {
            switch (baseFeatureID) {
                case IZentaPackage.BORDER_OBJECT__BORDER_COLOR: return ICanvasPackage.CANVAS_MODEL_STICKY__BORDER_COLOR;
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
        result.append(" (imagePath: "); //$NON-NLS-1$
        result.append(imagePath);
        result.append(", imagePosition: "); //$NON-NLS-1$
        result.append(imagePosition);
        result.append(", content: "); //$NON-NLS-1$
        result.append(content);
        result.append(", notes: "); //$NON-NLS-1$
        result.append(notes);
        result.append(", locked: "); //$NON-NLS-1$
        result.append(locked);
        result.append(", borderColor: "); //$NON-NLS-1$
        result.append(borderColor);
        result.append(')');
        return result.toString();
    }
} //CanvasModelSticky
