package org.rulez.magwas.zenta.editor.diagram.dialog;




import java.util.Set;

import org.eclipse.core.commands.common.EventManager;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BasicObjectEditPart;
import org.rulez.magwas.zenta.editor.propertysections.ITabbedLayoutConstants;
import org.rulez.magwas.zenta.editor.ui.FigureFactory;
import org.rulez.magwas.zenta.model.IDiagramModelObject;

public class ShapeSelector extends EventManager {

	public static final String PROP_SHAPECHANGE = "shapeValue";
	
	private final Button fButton;
    private String fShapeValue;
    private IDiagramModelObject fShapeObject;

	private BasicObjectEditPart editPart;

	public ShapeSelector(Composite parent) {
		fButton = new Button(parent, SWT.PUSH);
		fButton.setEnabled(false);
        fButton.addSelectionListener(new SelectionAdapter() {
            Shell dropMenu = null;

            private void die() {
            	dropMenu.dispose();
            	dropMenu = null;
            }
            
            class verticalBar implements Listener{
            	Composite composite;
            	public int iconcount=10;
				private ScrollBar vBar;
            	public verticalBar(Composite composite)
            	{
            		this.composite = composite;
                    vBar = dropMenu.getVerticalBar();
                    vBar.addListener (SWT.Selection,this);
            	}
			@Override
			public void handleEvent(Event event) {
        		Point location = composite.getLocation ();
        		location.y = -vBar.getSelection ()*iconcount*65/250;
        		composite.setLocation (location);
			}
            }
            @Override
            public void widgetSelected(SelectionEvent e) {
                int iconcount= 0;
                if(dropMenu == null) {
                    dropMenu = new Shell(dropMenu, SWT.APPLICATION_MODAL|SWT.V_SCROLL);
                    final Composite composite = new Composite (dropMenu, SWT.BORDER);
                    verticalBar vBar = new verticalBar(composite);
                    composite.setLayout(new FillLayout(SWT.VERTICAL));
                    Set<String> names = FigureFactory.getFigureNames();
                    for(String name : names) {
                    	iconcount++;
                        Button but1 = new Button(composite,SWT.PUSH);
                        Image img = FigureFactory.getImageForName(name);
                        but1.setImage(img);
                        final String thename = name;
                        but1.addSelectionListener(new SelectionAdapter() {
                            public void widgetSelected(SelectionEvent event) {
                                setResult( thename);
                                die();
                            }
                        });

                    }
                    vBar.iconcount = iconcount;
                    composite.setSize(142, iconcount*65);
                    dropMenu.setSize(152, 250);
                }
                Point bounds = fButton.getLocation();
                
                int posX,posY;
                posX = bounds.x;
                posY = bounds.y;
                Shell theshell = fButton.getShell();
                Composite theparent = fButton.getParent();
                do {
                	Point pbounds = theparent.getLocation();
                	posX += pbounds.x;
                	posY += pbounds.y;
                	theparent = theparent.getParent();
                } while(!theparent.equals(theshell));
                
				dropMenu.setLocation(posX,posY);
                dropMenu.open();
            }

        });
        fButton.addDisposeListener(new DisposeListener() {

			public void widgetDisposed(DisposeEvent event) {
            }
        });
        fButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.accessibility.AccessibleAdapter#getName(org.eclipse.swt.accessibility.AccessibleEvent)
             */
            public void getName(AccessibleEvent e) {
                e.result = JFaceResources.getString("ColorSelector.Name"); //$NON-NLS-1$
            }
        });
	}


    /**
     * set the new shape
	 */
	public void setResult(String newShape) {
		if (newShape != null) {
		    String oldValue = fShapeValue;
		    setShapeValue(newShape);
		    final Object[] finalListeners = getListeners();
		    if (finalListeners.length > 0) {
		        PropertyChangeEvent pEvent = new PropertyChangeEvent(
		                this, PROP_SHAPECHANGE, oldValue, newShape);
		        for (int i = 0; i < finalListeners.length; ++i) {
		            IPropertyChangeListener listener = (IPropertyChangeListener) finalListeners[i];
		            listener.propertyChange(pEvent);
		        }
		    }
		}
	}

	public void setElement(IDiagramModelObject shapeObject,EditPart editPart) {
		fShapeObject = shapeObject;
		this.editPart=(BasicObjectEditPart) editPart;
	    setShapeValue(shapeObject.getElementShape());
	}

    public Control getButton() {		
		return fButton;
	}

	public void addListener(IPropertyChangeListener shapeListener) {
		addListenerObject(shapeListener);
	}

	public void setShapeValue(String shape) {
		FigureFactory.checkShapeValue(shape);
		fShapeValue = shape;
    	setButtonImage();
        String currentShape = fShapeObject.getElementShape();
		if((currentShape == null && fShapeValue != null) ||(currentShape!=null) && !currentShape.equals(fShapeValue)) {
            fShapeObject.setElementShape(fShapeValue);
            editPart.shapeShift(fShapeValue);
        }
	}


	private void setButtonImage() {
		String imgname;
    	if (fShapeValue == null) {
    		//FIXME: restore defaultfor objectClass
    		imgname = FigureFactory.getDefaultFigureName();
    	} else {
    		imgname = fShapeValue;
    	}
    	Image img = FigureFactory.getImageForName(imgname);
        fButton.setImage(img);
	}

	public void setEnabled(boolean enabled) {
		getButton().setEnabled(enabled);		
	}

	public String getShapeValue() {
		return fShapeValue;
	}
}
