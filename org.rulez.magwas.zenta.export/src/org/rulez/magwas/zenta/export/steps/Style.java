package org.rulez.magwas.zenta.export.steps;

import java.io.File;

import org.rulez.magwas.zenta.export.steps.Step;
import org.rulez.magwas.zenta.export.steps.StepFactory;
import org.w3c.dom.Element;

/**
 * The "style" step: id does nothing, just executes steps under it.
 */
public class Style extends Step {

	Style(StepFactory sf) {
		super(sf);
	}

	/* (non-Javadoc)
	 * @see org.rulez.magwas.zenta.export.steps.Step#doit(org.w3c.dom.Element, java.io.File)
	 */
	@Override
	public boolean doit(Element arg0, File current) {
		return doSubSteps(arg0, current);
	}

}
