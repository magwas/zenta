package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

public class DiagramEditorStateListener implements IPartListener {

	public String state;

	@Override
	public void partActivated(IWorkbenchPart part) {
		state = "activated";
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		state = "BroughtToTop";
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		state = "closed";
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		state = "deactivated";

	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		state = "opened";

	}

}
