package org.rulez.magwas.zenta.tests.propertysections;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IKeyBindingService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPageSite;

@SuppressWarnings("deprecation")
public class EditorSiteMockup implements IEditorSite, IPageSite {

	private IWorkbenchWindow win;
	private IWorkbenchPage page;

	public EditorSiteMockup() {
		IWorkbench wb = PlatformUI.getWorkbench();
		this.win = wb.getActiveWorkbenchWindow();
		page = win.getActivePage();
	}

	@Override
	public String getId() {
		return "EditorSiteMockup";
	}

	@Override
	public String getPluginId() {
		return null;
	}

	@Override
	public String getRegisteredName() {
		return null;
	}

	@Override
	public void registerContextMenu(String menuId, MenuManager menuManager,
			ISelectionProvider selectionProvider) {
	}

	@Override
	public void registerContextMenu(MenuManager menuManager,
			ISelectionProvider selectionProvider) {
	}

	@Override
	public IKeyBindingService getKeyBindingService() {
		return null;
	}

	@Override
	public IWorkbenchPart getPart() {
		return null;
	}

	void setPage(IWorkbenchPage page) {
		this.page = page;
	}
	
	@Override
	public IWorkbenchPage getPage() {
		return page;
	}

	@Override
	public ISelectionProvider getSelectionProvider() {
		return null;
	}

	@Override
	public Shell getShell() {
		return null;
	}

	@Override
	public IWorkbenchWindow getWorkbenchWindow() {
		return win;
	}

	@Override
	public void setSelectionProvider(ISelectionProvider provider) {
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return null;
	}

	@Override
	public Object getService(@SuppressWarnings("rawtypes") Class api) {
		return null;
	}

	@Override
	public boolean hasService(@SuppressWarnings("rawtypes") Class api) {
		return false;
	}

	@Override
	public IEditorActionBarContributor getActionBarContributor() {
		return null;
	}

	@Override
	public IActionBars getActionBars() {
		return null;
	}

	@Override
	public void registerContextMenu(MenuManager menuManager,
			ISelectionProvider selectionProvider, boolean includeEditorInput) {
	}

	@Override
	public void registerContextMenu(String menuId, MenuManager menuManager,
			ISelectionProvider selectionProvider, boolean includeEditorInput) {
	}

}
