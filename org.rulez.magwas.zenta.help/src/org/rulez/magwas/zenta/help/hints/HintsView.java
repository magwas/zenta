/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.help.hints;

import java.io.File;
import java.net.URL;
import java.util.Hashtable;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.Bundle;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.editor.ui.services.ComponentSelectionManager;
import org.rulez.magwas.zenta.editor.ui.services.IComponentSelectionListener;
import org.rulez.magwas.zenta.editor.utils.PlatformUtils;
import org.rulez.magwas.zenta.help.ZentaEditorHelpPlugin;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IHelpHintProvider;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.util.StringUtils;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;



/**
 * Hints View
 * 
 * @author Phillip Beauvoir
 */
public class HintsView
extends ViewPart
implements IContextProvider, IHintsView, ISelectionListener, IComponentSelectionListener {
    
	static File cssFile = new File(ZentaEditorHelpPlugin.INSTANCE.getHintsFolder(), "style.css"); //$NON-NLS-1$

    private Browser fBrowser;
    
    private IAction fActionPinContent;
    
    private Hashtable<String, Hint> fLookupTable = new Hashtable<String, Hint>();
    
    private String fLastPath;
    
    private CLabel fTitleLabel;
    
    private boolean fPageLoaded;

	private String titleText;
    
    private class PinAction extends Action {
        PinAction() {
            super(Messages.HintsView_0, IAction.AS_CHECK_BOX);
            setToolTipText(Messages.HintsView_1);
            setImageDescriptor(IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_PIN_16));
        }
    }
    
    /*
     * Hint Class
     */
    private static class Hint {
        String title;
        String path;
        
        Hint(String title, String path) {
            this.title = title;
            this.path = path;
        }
    }

    
    @Override
    public void createPartControl(Composite parent) {
        GridLayout layout = new GridLayout();
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        layout.verticalSpacing = 0;
        parent.setLayout(layout);
        
        if(!JFaceResources.getFontRegistry().hasValueFor("HintsTitleFont")) { //$NON-NLS-1$
            FontData[] fontData = JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT).getFontData();
            fontData[0].setHeight(fontData[0].getHeight() + 4);
            JFaceResources.getFontRegistry().put("HintsTitleFont", fontData); //$NON-NLS-1$
        }
        
        fTitleLabel = new CLabel(parent, SWT.NULL);
        fTitleLabel.setFont(JFaceResources.getFont("HintsTitleFont")); //$NON-NLS-1$
        fTitleLabel.setBackground(ColorConstants.white);
        
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        fTitleLabel.setLayoutData(gd);

        /*
         * It's possible that the system might not be able to create the Browser
         */
        fBrowser = createBrowser(parent);
        if(fBrowser == null) {
            return;
        }
        
        gd = new GridData(GridData.FILL_BOTH);
        fBrowser.setLayoutData(gd);
        
        // Listen to Loading progress
        fBrowser.addProgressListener(new ProgressListener() {
            @Override
            public void completed(ProgressEvent event) {
                fPageLoaded = true;
            }
            
            @Override
            public void changed(ProgressEvent event) {
            }
        });
        
        // Listen to Diagram Editor Selections
        ComponentSelectionManager.INSTANCE.addSelectionListener(this);
        
        fActionPinContent = new PinAction();
        
        //IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
        //menuManager.add(fActionPinContent);

        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        toolBarManager.add(fActionPinContent);
        
        createFileMap();
        
        // Listen to workbench selections
        getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
        
        // Help
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
        
        // Initialise with whatever is selected in the workbench
        ISelection selection = getSite().getWorkbenchWindow().getSelectionService().getSelection();
        IWorkbenchPart part = getSite().getWorkbenchWindow().getPartService().getActivePart();
        selectionChanged(part, selection);
    }
    
    /**
     * Create the Browser if possible
     */
    private Browser createBrowser(Composite parent) {
        Browser browser = null;
        try {
            // On Eclipse 3.6 set this
            if(PlatformUtils.isGTK()) {
                System.setProperty("org.eclipse.swt.browser.UseWebKitGTK", "true"); //$NON-NLS-1$ //$NON-NLS-2$
            }
            browser = new Browser(parent, SWT.NONE);
        }
        catch(SWTError error) {
        	error.printStackTrace();
            // Create a message and show that instead
            setTitleText(Messages.HintsView_2);
            fTitleLabel.setBackground(new Color[]{ColorConstants.lightGray, ColorConstants.white}, new int[]{80}, false);
            Text text = new Text(parent, SWT.MULTI | SWT.WRAP);
            text.setLayoutData(new GridData(GridData.FILL_BOTH));
            text.setText(Messages.HintsView_3);
        }
        
        return browser;
    }

	private void setTitleText(String text) {
		this.titleText = text;
		fTitleLabel.setText(text);
	}

    @Override
    public void setFocus() {
        /*
         * Need to do this otherwise we get a:
         * 
         * "java.lang.RuntimeException: WARNING: Prevented recursive attempt to activate part org.eclipse.ui.views.PropertySheet
         * while still in the middle of activating part org.rulez.magwas.zenta.help.hintsView"
         * 
         * But on Windows this leads to a SWTException if closing this View by shortcut key (Alt-4)
         */
        if(fBrowser != null) {
            fBrowser.setFocus();
        }
        else if(fTitleLabel != null) {
            fTitleLabel.setFocus();
        }
    }
    

    @Override
    public void componentSelectionChanged(Object component, Object selection) {
        selectionChanged(component, selection);
    }

    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        if(selection instanceof IStructuredSelection && !selection.isEmpty()) {
            Object selected = ((IStructuredSelection)selection).getFirstElement();
            selectionChanged(part, selected);
        }
    }
    
    public void selectionChanged(Object source, Object selected) {
        if(fActionPinContent.isChecked()) {
            return;
        }
        Object object = figureOutHintObject(selected);
        if(object instanceof IHelpHintProvider) {
            setUpHintBasedOnHintProvider((IHelpHintProvider) object);
            return;
        }
        Hint hint = getHintFromObject(object);
        if(hint != null) {
            displayHint(source, object, hint);
        } else {
            displayNoHint();
        }
    }
		private void displayNoHint() {
			fBrowser.setText(""); //$NON-NLS-1$
			fLastPath = ""; //$NON-NLS-1$
			setTitleText(""); //$NON-NLS-1$
			fTitleLabel.setBackground(ColorConstants.white);
		}
		private void displayHint(Object source, Object object, Hint hint) {
			if(fLastPath != hint.path) {
			    // Title and Color
			    Color color = getTitleColor(object);
			    fTitleLabel.setBackground(new Color[] { color, ColorConstants.white }, new int[] { 80 }, false);
			    setTitleText(hint.title);
	
			    // Load page
			    fPageLoaded = false;
			    fBrowser.setUrl(hint.path);
			    fLastPath = hint.path;
	
			    // Kludge for Mac/Safari when displaying hint on mouse rollover menu item in MagicConnectionCreationTool
			    if(PlatformUtils.isMac() && source instanceof MenuItem) {
			        _doMacWaitKludge();
			    }
			}
		}
		private void setUpHintBasedOnHintProvider(IHelpHintProvider hintProvider) {
			String title = hintProvider.getHelpHintTitle();
			String text = hintProvider.getHelpHintContent();
			if(StringUtils.isSet(title) || StringUtils.isSet(text)) {
			    setTitleText(title);
			    Color color = getTitleColor(hintProvider);
			    fTitleLabel.setBackground(new Color[] { color, ColorConstants.white }, new int[] { 80 }, false);
			    text = makeHTMLEntry(text);
			    fBrowser.setText(text);
			    fLastPath = ""; //$NON-NLS-1$
			    return;
			}
		}
		private Object figureOutHintObject(Object selected) {
			Object object;
			if(selected instanceof IBasicObject) {
	        	object = ((IBasicObject)selected).getDefiningElement();
	        } else if(selected instanceof IDiagramModelZentaObject) {
	        	IDiagramModelZentaObject dmzo = (IDiagramModelZentaObject)selected;
				object = ((IBasicObject) dmzo.getZentaElement()).getDefiningElement();
	        } else if(selected instanceof EClass) {
	            EClass eClass = (EClass)selected;
	            object = eClass.getInstanceClass();
	        }  else if(selected instanceof IAdaptable) {
	            object = ((IAdaptable)selected).getAdapter(IZentaElement.class);
	            if(object == null) {
	                object = ((IAdaptable)selected).getAdapter(IDiagramModelObject.class);
	            }
	            if(object == null) {
	                object = ((IAdaptable)selected).getAdapter(IDiagramModelConnection.class);
	            }
	            if(object == null) {
	                object = ((IAdaptable)selected).getAdapter(IDiagramModel.class);
	            }
	        } else {
	            object = selected;
	        }
			if(object instanceof IBasicObject) {
	        	object = ((IBasicObject)object).getDefiningElement();
	        }
			
	        if(object instanceof IZentaDiagramModel) {
	            object = ViewpointsManager.INSTANCE.getViewpoint(((IZentaDiagramModel)object));
	        }
			return object;
		}
			/**
     * HTML-ify some text
     */
    private String makeHTMLEntry(String text) {
        if(text == null) {
            return ""; //$NON-NLS-1$
        }
        
        StringBuffer html = new StringBuffer();
        html.append("<html><head>"); //$NON-NLS-1$
        
        html.append("<link rel=\"stylesheet\" href=\""); //$NON-NLS-1$
        html.append(cssFile.getPath());
        html.append("\" type=\"text/css\">"); //$NON-NLS-1$
        
        html.append("</head>"); //$NON-NLS-1$
        
        html.append("<body>"); //$NON-NLS-1$
        html.append(text);
        html.append("</body>"); //$NON-NLS-1$
        
        html.append("</html>"); //$NON-NLS-1$
        return html.toString();
    }
    
    /**
     * If we are displaying a hint from a menu rollover in MagicConnectionCreationTool then the threading is different
     * and the Browser does not update. So we need to wait for a few sleep cycles.
     */
    private void _doMacWaitKludge() {
        // This works on Carbon and Cocoa...usually needs about 4-7 sleep cycles
        fBrowser.getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(!fPageLoaded && i++ < 20) { // Set an upper getout limit for safety
                    fBrowser.getDisplay().sleep();
                }
            }
        });
    }
    
    private Hint getHintFromObject(Object object) {
        if(object == null) {
            return null;
        }
        
        Hint hint = null;
        
        // Is it in the lookup?
        hint = fLookupTable.get(object.getClass().getName());
        if(hint != null) {
            return hint;
        }
        
        // It's a Class
        if(object instanceof Class<?>) {
            return fLookupTable.get(((Class<?>)object).getName());
        }
        
        // Look for Java interface
        Class<?> clazzes[] = object.getClass().getInterfaces();
        for(Class<?> interf : clazzes) {
            hint = fLookupTable.get(interf.getName());
            if(hint != null) {
                return hint;
            }
        }
        
        return null;
    }
    
    private void createFileMap() {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        for(IConfigurationElement configurationElement : registry.getConfigurationElementsFor(EXTENSION_POINT_ID)) {
            String className = configurationElement.getAttribute("class"); //$NON-NLS-1$
            String fileName = configurationElement.getAttribute("file"); //$NON-NLS-1$
            String title = configurationElement.getAttribute("title"); //$NON-NLS-1$
            
            String id = configurationElement.getNamespaceIdentifier();
            Bundle bundle = Platform.getBundle(id);
            URL url = FileLocator.find(bundle, new Path("$nl$/" + fileName), null); //$NON-NLS-1$
            try {
                url = FileLocator.resolve(url);
            }
            catch(Exception ex) {
            	throw new HelpFileNotExists(id,fileName);
            }
            
            File f = new File(url.getPath());
            
            Hint hint = new Hint(title, f.getPath());
            fLookupTable.put(className, hint);
        }
    }
	    public class HelpFileNotExists extends RuntimeException {
			private static final long serialVersionUID = 1L;
			public HelpFileNotExists(String id, String fileName) {
				super(String.format("%s/%s", id, fileName));
			}
		}
    
    private Color getTitleColor(Object object) {
        Class<?> clazz;
        
        if(object instanceof IDiagramModelZentaObject) {
            object = ((IDiagramModelZentaObject)object).getZentaElement();
        }
        else if(object instanceof IDiagramModelZentaConnection) {
            object = ((IDiagramModelZentaConnection)object).getRelationship();
        }
        
        if(object instanceof Class<?>) {
            clazz = (Class<?>)object;
        }
        else {
            clazz = object.getClass();
        }
        
        if(IBasicObject.class.isAssignableFrom(clazz)) {
            return ColorFactory.COLOR_BUSINESS;
        }
        
        return ColorFactory.get(220, 235, 235);
    }

    
    @Override
    public void dispose() {
        super.dispose();
        ComponentSelectionManager.INSTANCE.removeSelectionListener(this);
        getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
    }
    
    // =================================================================================
    //                       Contextual Help support
    // =================================================================================
    
    public int getContextChangeMask() {
        return NONE;
    }

    public IContext getContext(Object target) {
        return HelpSystem.getContext(HELP_ID);
    }

    public String getSearchExpression(Object target) {
        return Messages.HintsView_4;
    }
    
    public boolean isReady() {
    	return fPageLoaded;
    }
    
    public String getTitleText() {
    	return titleText;
    }
    
    public String getText() {
    	return fBrowser.getText();
    }

}