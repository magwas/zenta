package org.rulez.magwas.zenta.editor.diagram.figures.business;

import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;

public class DiagramModelReferenceFigureDelegate extends
		RectangleFigureDelegate {
	IDiagramModelObjectFigure owner;
    public DiagramModelReferenceFigureDelegate(IDiagramModelObjectFigure owner) {
		super(owner);
		this.owner=owner;
	}

	@Override
    public Image getImage() {
        IDiagramModelZentaObject referencedObject = (IDiagramModelZentaObject)owner.getDiagramModelObject();
		IDiagramModel dm = referencedObject.getDiagramModel();
        return dm == null ? IZentaImages.ImageFactory.getImage(IZentaImages.ICON_DIAGRAM_16) : ZentaLabelProvider.INSTANCE.getImage(dm.eClass());
    }

}
