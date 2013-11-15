package org.rulez.magwas.zenta.tests.propertysections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.AssociationConnectionEditPart;

public class SelectionMockup implements ISelection, IStructuredSelection {

	AssociationConnectionEditPart editPart;
	
	public SelectionMockup(AssociationConnectionEditPart editPart) {
		this.editPart = editPart;
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
	public Iterator<AssociationConnectionEditPart> iterator() {
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
	public List<AssociationConnectionEditPart> toList() {
		List<AssociationConnectionEditPart> l = new ArrayList<AssociationConnectionEditPart>();
		l.add(editPart);
		return l;
	}


}
