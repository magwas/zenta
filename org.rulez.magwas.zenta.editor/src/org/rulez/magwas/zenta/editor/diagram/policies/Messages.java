/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

    private static final String BUNDLE_NAME = "org.rulez.magwas.zenta.editor.diagram.policies.messages"; //$NON-NLS-1$

    public static String ZentaDiagramConnectionPolicy_0;

    public static String ZentaDiagramConnectionPolicy_1;

    public static String ZentaDNDEditPolicy_0;

    public static String BasicContainerEditPolicy_0;

    public static String PartDirectEditTitlePolicy_0;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
