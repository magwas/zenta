package org.rulez.magwas.zenta.editor.diagram.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;

public 		class EtalonFigureMock extends AbstractDiagramModelObjectFigure {
	public EtalonFigureMock() {
	}
	Display display = Display.getDefault();
	public Rectangle getBounds() {
		return new Rectangle(10,10,120,55);
	}
	public Color getFillColor() {
		return new Color(display, 128, 0, 0, 100);
	}
	@Override
	public void refreshVisuals() {
	}
	@Override
	public IFigure getTextControl() {
		return null;
	}
	@Override
	public Dimension getDefaultSize() {
		return null;
	}
	@Override
	protected void setUI() {
	}
	@Override
	public IDiagramModelObject getDiagramModelObject() {
		IZentaDiagramModel dm = IZentaFactory.eINSTANCE.createZentaDiagramModel();
		IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		dm.getChildren().add(dmo);
		return dmo;
	}
}

