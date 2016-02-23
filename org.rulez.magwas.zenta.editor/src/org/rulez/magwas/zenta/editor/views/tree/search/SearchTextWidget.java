/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.search;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.editor.ui.UIUtils;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.controller.IZentaImages;



/**
 * Search Text Widget
 * 
 * @author Phillip Beauvoir
 */
public class SearchTextWidget extends Composite {
    
    private Text fTextControl;
    
    private Label fCancelLabel;
    
    private ModifyListener fModifyListener = new ModifyListener() {
        public void modifyText(ModifyEvent e) {
            String text = getText();
            if("".equals(text) && fCancelLabel != null && !fCancelLabel.isDisposed()) { //$NON-NLS-1$
                fCancelLabel.dispose();
                fCancelLabel = null;
                layout();
            }
            else if(fCancelLabel == null) {
                fCancelLabel = new Label(SearchTextWidget.this, SWT.NULL);
                fCancelLabel.setImage(IZentaUIImages.ImageFactory.getImage(IZentaImages.ICON_CANCEL_SEARCH_16));
                fCancelLabel.setBackground(fTextControl.getBackground());
                
                GridData gd = new GridData(SWT.NONE, SWT.FILL, false, true);
                fCancelLabel.setLayoutData(gd);
                
                fCancelLabel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseUp(MouseEvent e) {
                        fTextControl.setText(""); //$NON-NLS-1$
                        fTextControl.setFocus();
                    };
                });
                
                layout();
            }
        }
    };

    public SearchTextWidget(Composite parent) {
        super(parent, SWT.BORDER);
        
        GridLayout layout = new GridLayout(3, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 0;
        setLayout(layout);
        
        Label label = new Label(this, SWT.NULL);
        label.setImage(IZentaUIImages.ImageFactory.getImage(IZentaImages.ICON_SEARCH_16));
        GridData gd = new GridData(SWT.NONE, SWT.FILL, false, true);
        label.setLayoutData(gd);
        
        fTextControl = new Text(this, SWT.NULL);
        gd = new GridData(SWT.FILL, SWT.FILL, true, true);
        fTextControl.setLayoutData(gd);
        fTextControl.addModifyListener(fModifyListener);
        
        // Single text control so strip CRLFs
        UIUtils.conformSingleTextControl(fTextControl);
        
        label.setBackground(fTextControl.getBackground());
        setBackground(fTextControl.getBackground());
    }

    public Text getTextControl() {
        return fTextControl;
    }
    
    public String getText() {
        return fTextControl.getText();
    }
    
    public void setText(String text) {
        fTextControl.setText(StringUtils.safeString(text));
    }
 }
