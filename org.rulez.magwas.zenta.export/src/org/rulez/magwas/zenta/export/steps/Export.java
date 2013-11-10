package org.rulez.magwas.zenta.export.steps;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.rulez.magwas.zenta.export.RichExport;
import org.rulez.magwas.zenta.export.Util;
import org.rulez.magwas.zenta.export.steps.Step;
import org.rulez.magwas.zenta.export.steps.StepFactory;
import org.rulez.magwas.zenta.model.util.ZentamateResourceFactory;
import org.w3c.dom.Element;


/**
 * The Exports the model either to zenta or rich format (default is rich).
 */
public class Export extends Step {
    
    /**
     * Instantiates a new export.
     * 
     * @param sf
     *            the Step Factory
     */
    public Export(StepFactory sf) {
        super(sf);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see org.rulez.magwas.zenta.export.steps.Step#doit(org.w3c.dom.Element,
     * java.io.File)
     */
    @Override
    public boolean doit(Element arg0, File current) {
        String style = arg0.getAttribute("style");
        String keep = arg0.getAttribute("keep");
        File policyfile = getFileFor(arg0, "policy", null, factory.styledir,
                current);
        File tfile = getFileFor(arg0, "target", null, factory.targetdir,
                current);
        factory.log.issueInfo("target=" + tfile.getAbsolutePath(), Util.now());
        
        if ("".equals(style) || "rich".equals(style)) {
            RichExport.export(factory.model, tfile, policyfile, factory.log);
        } else if ("archi".equals(style)) {
            Resource resource = ZentamateResourceFactory.createResource(tfile);
            resource.getContents().add(factory.model);
            try {
                resource.save(null);
            } catch (IOException e) {
                factory.log.issueError("cannot export model to",
                        tfile.getAbsolutePath());
                factory.log.printStackTrace(e);
                return false;
            }
            resource.getContents().remove(factory.model);
        } else {
            factory.log.issueError("Unknown export style", style);
            return false;
        }
        if ("false".equals(keep)) {
            factory.dontkeep.add(tfile);
        }
        return doSubSteps(arg0, tfile);
    }
}
