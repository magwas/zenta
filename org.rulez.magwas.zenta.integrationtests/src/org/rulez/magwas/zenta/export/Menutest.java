/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.rulez.magwas.zenta.export;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
 
public class Menutest {

private Shell shell;
private String result;


public Menutest() {
    Display display = new Display();
    shell = new Shell(display, SWT.SHELL_TRIM);
    shell.setLayout(new FillLayout(SWT.VERTICAL));
    shell.setSize(50, 100);

    final Button but = new Button(shell,0);
    final Image image = new Image(shell.getDisplay(), "/home/mag/build/zenta/org.rulez.magwas.zenta.editor/img/app-32.png");
    but.setImage(image);
    

    but.addSelectionListener(new SelectionAdapter() {

        Shell dropMenu = null;

        private void die() {
        	dropMenu.dispose();
        	dropMenu = null;
        }
        @Override
        public void widgetSelected(SelectionEvent e) {
            if(dropMenu == null) {
                dropMenu = new Shell(shell, SWT.NONE);
                dropMenu.setLayout(new FillLayout(SWT.VERTICAL));
                for(int i=0;i<4;i++) {
                    Button but1 = new Button(dropMenu,SWT.PUSH);
                    but1.setImage(image);
                    final String name = "button"+i;
                    but1.addSelectionListener(new SelectionAdapter() {
                        public void widgetSelected(SelectionEvent event) {
                            setResult( name);
                            die();
                        }
                    });

                }
                dropMenu.setSize(40, 4*34);
            }
            //Rectangle bounds = but.getBounds();
            //Rectangle shellbounds = shell.getBounds();
            //dropMenu.setLocation(shellbounds.x+bounds.x,shellbounds.y+bounds.y);
            dropMenu.open();
        }

    });

    shell.open();

    while(!shell.isDisposed()) {
        if(!display.readAndDispatch()) display.sleep();
    }

    display.dispose();
}

public void setResult(String res) {
	result = res;
}

public static void main(String[] args) {
	new Menutest();
  }

}