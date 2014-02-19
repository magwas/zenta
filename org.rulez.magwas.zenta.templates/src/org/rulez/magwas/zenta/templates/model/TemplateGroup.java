/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;




/**
 * Template Group
 * 
 * @author Phillip Beauvoir
 */
public class TemplateGroup implements ITemplateGroup {
    
    private List<ITemplate> fTemplates = new ArrayList<ITemplate>();
    private String fName;
    
    public TemplateGroup() {
    }

    public TemplateGroup(String name) {
        fName = name;
    }

    public String getName() {
        return Util.verifyNonNull(fName);
    }

    public void setName(String name) {
        fName = name;
    }

    public List<ITemplate> getTemplates() {
        return Util.verifyNonNull(fTemplates);
    }

    public void addTemplate(ITemplate template) {
        fTemplates.add(template);
    }

    public boolean removeTemplate(ITemplate template) {
        return fTemplates.remove(template);
    }

    @Override
    public List<ITemplate> getSortedTemplates() {
        NonNullList<ITemplate> list = new NonNullArrayList<ITemplate>(getTemplates());
        
        Collections.sort(list, new Comparator<ITemplate>() {
            @Override
            public int compare(@Nullable ITemplate t1, @Nullable ITemplate t2) {
            	if(t1 == null || t2 == null)
            		throw new AssertionError();
                String name1 = StringUtils.safeString(t1.getName()).toLowerCase().trim();
                String name2 = StringUtils.safeString(t2.getName()).toLowerCase().trim();
                return name1.compareTo(name2);
            }
        });
        
        return list;
    }
}
