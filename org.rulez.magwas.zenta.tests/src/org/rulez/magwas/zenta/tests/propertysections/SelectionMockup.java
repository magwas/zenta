package org.rulez.magwas.zenta.tests.propertysections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;

public class SelectionMockup implements ISelection, IStructuredSelection {

	BasicConnectionEditPart editPart;
	
	public SelectionMockup(BasicConnectionEditPart associationConnectionEditPart) {
		this.editPart = associationConnectionEditPart;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public Object getFirstElement() {
		return editPart;
	}

	@Override
	public Iterator<BasicConnectionEditPart> iterator() {
		return toList().iterator();
	}

	@Override
	public int size() {
		return 1;
	}

	@Override
	public Object[] toArray() {
		return toList().toArray();
	}

	@Override
	public List<BasicConnectionEditPart> toList() {
		List<BasicConnectionEditPart> l = new ArrayList<BasicConnectionEditPart>();
		l.add(editPart);
		return l;
	}


}
