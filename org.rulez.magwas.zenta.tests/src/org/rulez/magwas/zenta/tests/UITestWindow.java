package org.rulez.magwas.zenta.tests;

import static org.junit.Assert.fail;

import java.lang.reflect.Method;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class UITestWindow {

	private Shell shell;
	private Composite compositeForTest;
	
	public UITestWindow() {
		shell = new Shell();
		//no, Shell cannot be subclassed
		shell.setBounds(new Rectangle(0,0,200,200));
		shell.setLayout(new GridLayout(1,true));
		setBackgroundWhite(shell);
        compositeForTest = new Composite(shell, 0);
        Composite buttonCompo = new Composite(shell, 3);
        buttonCompo.setLayout(new FillLayout());
        addOKButton(buttonCompo);
        addNotNiceButton(buttonCompo);
        buttonCompo.pack();
	}
		private void setBackgroundWhite(Composite composite) {
			Display display = composite.getDisplay();
			composite.setBackground(new Color(display,255,255,255));
		}
		private void addOKButton(Composite buttonCompo) {
			Button but = new Button(buttonCompo, SWT.PUSH);
	        but.setText("OK");
	        but.addSelectionListener(createDisposer());
	        but.pack();
		}
		    private SelectionAdapter createDisposer() {
		        return new SelectionAdapter() {
		            @Override
		            public void widgetSelected(SelectionEvent e) {
		                shell.dispose();
		            }
		        };
		    }
		private void addNotNiceButton(Composite buttonCompo) {
			Button but2 = new Button(buttonCompo, SWT.PUSH);
	        but2.setText("Not nice!");
	        but2.addSelectionListener(createFailDisposer());
	        but2.pack();
		}
		    private SelectionAdapter createFailDisposer() {
		        return new SelectionAdapter() {
		            @Override
		            public void widgetSelected(SelectionEvent e) {
		                fail("Not Nice!");
		            }
		        };
		    }

	public void resize(int width, int height) {
		GridData data = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		data.heightHint = height;
		data.widthHint = width;
		compositeForTest.setLayoutData(data);	
	}
	public Composite getComposite() {
		return compositeForTest;
	}

	public Composite getNewHiddenComposite() {
		Composite composite = new Composite(shell, 0);
		composite.setVisible(false);
		return composite;
	}
	public void showWindow() {
		shell.pack();
		shell.open();
		Method method = findTestMethod();
		TestCaseImageSaver.save(method,compositeForTest);
		if (method.getAnnotation(HaveGUI.class).waitUser())
			runLoopWhileShellExists();
	}

		private void runLoopWhileShellExists() {
			Display display = shell.getDisplay();
			while (!shell.isDisposed())
				if (!display.readAndDispatch())
					display.sleep();
		}

		private Method findTestMethod()  {
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			return findTestMethodInFrame(stackTraceElements);
		}
		private Method findTestMethodInFrame(StackTraceElement[] stackTraceElements) {
			for(int i=1;i<7;i++) {
				StackTraceElement frame = stackTraceElements[i];
				Method method = getMethodIfAnnotated(frame);
				if(method != null)
					return method;
			}
			throw new TestMethodNotFound();
		}
			public class TestMethodNotFound extends RuntimeException {
				private static final long serialVersionUID = 1L;
			}

			private static Method getMethodIfAnnotated(StackTraceElement frame) {
				String classname = frame.getClassName();
				String methodname = frame.getMethodName();
				try {
					Class<?> frameClass = Class.forName(classname);
					Method method = frameClass.getMethod(methodname);
					if(null != method.getAnnotation(HaveGUI.class))
						return method;
				} catch (Exception e) {};
				return null;
			}
}
