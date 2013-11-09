package org.rulez.magwas.zenta.export.steps;



import java.io.File;

import org.rulez.magwas.zenta.export.steps.Step;
import org.rulez.magwas.zenta.export.steps.StepFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * A step in the export style.
 */
public abstract class Step {
	
	/** The factory. */
	StepFactory factory;
	
	/**
	 * Instantiates a new step.
	 *
	 * @param sf the factory
	 */
	Step(StepFactory sf) {
		factory = sf;
	}
	
	/**
	 * Do the step.
	 *
	 * @param e the xml element defining the step
	 * @param current the current target file
	 * @return true, if successful
	 */
	public final boolean doIt(Element e, File current) {
		String name = e.getNodeName();
		Step s = factory.get(name);
		return s.doit(e, current);
	}
	
	/**
	 * Do substeps.
	 *
	 * @param arg0 the xml element for which we do the supsteps
	 * @param current the current output file
	 * @return true, if successful
	 */
	public boolean doSubSteps(Element arg0, File current) {
		NodeList l = arg0.getChildNodes();
		for(int i=0; i<l.getLength();i++) {
			Node n = l.item(i);
			if(n.getNodeType() == Node.ELEMENT_NODE) {
				if (!doIt((Element) n, current)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Gets the file for and element attribute
	 * 
	 * $target, $source, and $current is replaced with the 
	 * absolute path of directory of the style file, the target directory and the current file respectively
	 *
	 * @param e the element in the style file
	 * @param attname the attribute name
	 * @param defval the default file name value
	 * @param defbase the default directory
	 * @param current the current target file
	 * @return the file for
	 */
	public File getFileFor(Element e, String attname, String defval, File defbase, File current) {
		String attval=e.getAttribute(attname);
		File retfile;
		if("".equals(attval)) {
			if (null != defval) {
				retfile=new File(defbase,defval);
			} else {
				factory.log.issueWarning("No attribute named " +attname, "at "+e.getNodeName());
				return null;
			}
		} else {
			String path;
			if(attval.contains("$target")) {
				path=attval.replace("$target",factory.targetdir.getAbsolutePath());
			} else if (attval.contains("$source")) {
				path=attval.replace("$source",factory.styledir.getAbsolutePath());
			} else if (attval.contains("$current")) {
				path=attval.replace("$current",current.getAbsolutePath());
			} else {
				path=defbase.getAbsolutePath()+"/"+attval;
			}
			retfile=new File(path);
		}
		return retfile;
	}
	
	/**
	 * Do the step.
	 *
	 * @param arg0 the xml element from the style file
	 * @param current the current output file
	 * @return true, if successful
	 */
	abstract public boolean doit(Element arg0, File current);

}
