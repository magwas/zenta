package org.rulez.magwas.zenta.tests;

import static org.junit.Assert.fail;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;

public class UITestUtils {

	public static void addTestControls(Shell shell) {
		//no, Shell cannot be subclassed
        Composite buttonCompo = new Composite(shell, 3);
        buttonCompo.setLayout(new FillLayout());
        addOKButton(shell, buttonCompo);
        addNotNiceButton(shell, buttonCompo);
        buttonCompo.pack();
	}
	private static void addOKButton(Shell shell, Composite buttonCompo) {
		Button but = new Button(buttonCompo, SWT.PUSH);
        but.setText("OK");
        but.addSelectionListener(createDisposer(shell));
        but.pack();
	}
	    private static SelectionAdapter createDisposer(final Shell shell) {
	        return new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                shell.dispose();
	            }
	        };
	    }
	private static void addNotNiceButton(Shell shell, Composite buttonCompo) {
		Button but2 = new Button(buttonCompo, SWT.PUSH);
        but2.setText("Not nice!");
        but2.addSelectionListener(createFailDisposer(shell));
        but2.pack();
	}
	    private static SelectionAdapter createFailDisposer(final Shell shell) {
	        return new SelectionAdapter() {
	            @Override
	            public void widgetSelected(SelectionEvent e) {
	                fail("Not Nice!");
	            }
	        };
	    }

	public static void waitUserIfNeeded(Widget shell) {
		if (shouldWaitUser())
			runLoopWhileShellExists(shell);

	}
		private static void runLoopWhileShellExists(Widget shell) {
			Display display = shell.getDisplay();
			while (!shell.isDisposed())
				if (!display.readAndDispatch())
					display.sleep();
		}

		private static boolean shouldWaitUser()  {
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			StackTraceElement frame = stackTraceElements[4];
			return isAnnotatonForStackFrameElementSaystoWait(frame,HaveGUI.class);
		}
			private static boolean isAnnotatonForStackFrameElementSaystoWait(StackTraceElement frame, Class<HaveGUI> annotationClass) {
				String classname = frame.getClassName();
				String methodname = frame.getMethodName();
				try {
					Class<?> frameClass = Class.forName(classname);
					HaveGUI annotation = frameClass.getMethod(methodname).getAnnotation(annotationClass);
					return annotation.waitUser();
				} catch (Exception e) {};
				return false;
			}
}
