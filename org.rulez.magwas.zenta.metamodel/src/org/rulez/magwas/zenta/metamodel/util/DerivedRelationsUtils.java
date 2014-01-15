/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.metamodel.util;

import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.zenta.metamodel.MetamodelBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBaseFactory;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;



/**
 * Derived Relations Utils
 * 
 * @author Phillip Beauvoir
 */
public class DerivedRelationsUtils {
    
    
	private MetamodelBase metamodel;

	public DerivedRelationsUtils(IZentaModel model) {
		this.metamodel = MetamodelBaseFactory.eINSTANCE.getMetamodelFor(model);
        weaklist = metamodel.getWeaklist();
	}
	
    public static class TooComplicatedException extends Exception {
		private static final long serialVersionUID = 1L;
    }
    
    public boolean isInDerivedChain(IRelationship relation) {
        if(!isStructuralRelationship(relation)) {
            return false;
        }
        
        // Get relations from source element
        IZentaElement source = relation.getSource();
        if(source != null && source.getZentaModel() != null) { // An important guard because the element might have been deleted
            // Source has structural target relations
            for(IRelationship rel : ZentaModelUtils.getTargetRelationships(source)) {
                if(rel != relation) {
                    if(isStructuralRelationship(rel) && rel.getSource() != relation.getTarget()) {
                        return true;
                    }
                }
            }
            
            // Bi-directional relations
            for(IRelationship rel : ZentaModelUtils.getSourceRelationships(source)) {
                if(rel != relation) {
                    if(isBidirectionalRelationship(rel)) {
                        return true;
                    }
                    if(isStructuralRelationship(rel) && isBidirectionalRelationship(relation)) {
                        return true;
                    }
                }
            }
        }
        
        // Get relations from target element
        IZentaElement target = relation.getTarget();
        if(target != null && target.getZentaModel() != null) { // An important guard because the element might have been deleted
            // Target has structural source relations
            for(IRelationship rel : ZentaModelUtils.getSourceRelationships(target)) {
                if(rel != relation) {
                    if(isStructuralRelationship(rel) && rel.getTarget() != relation.getSource()) {
                        return true;
                    }
                }
            }
            
            // Bi-directional relations
            for(IRelationship rel : ZentaModelUtils.getTargetRelationships(target)) {
                if(rel != relation) {
                    if(isBidirectionalRelationship(rel)) {
                        return true;
                    }
                    if(isStructuralRelationship(rel) && isBidirectionalRelationship(relation)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    /**
     * @param relation
     * @return True if relation is bi-directional
     */
    public boolean isBidirectionalRelationship(IRelationship relation) {
        return false;
    }
    
    /**
     * @param relation
     * @return True if relation is a structural relationship
     */
    public boolean isStructuralRelationship(IRelationship relation) {
        return relation instanceof IBasicRelationship; 
   }
    
    /**
     * @param element1
     * @param element2
     * @return True if element1 has a direct Structural relationship to element2
     */
    public boolean hasDirectStructuralRelationship(IZentaElement element1, IZentaElement element2) {
        for(IRelationship relation : ZentaModelUtils.getSourceRelationships(element1)) {
            if(relation.getTarget() == element2 && isStructuralRelationship(relation)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * @param element1
     * @param element2
     * @return The list of chains
     * @throws TooComplicatedException 
     */
    public List<List<IRelationship>> getDerivedRelationshipChains(IZentaElement element1, IZentaElement element2) throws TooComplicatedException {
        if(element1 == null || element2 == null) {
            return null;
        }
        
        // Traverse from element1 to element2
        List<List<IRelationship>> chains = findChains(element1, element2);
        
        if(chains.isEmpty()) {
            return null;
        }
        
        List<List<IRelationship>> result = new ArrayList<List<IRelationship>>(); 
        
        // Check validity of weakest relationship in each chain and remove chain if the weakest relationship is not valid
        for(List<IRelationship> chain : chains) {
        	IRelationClass relationshipClass = getWeakestType(chain);
            boolean isValid = metamodel.isValidRelationship(element1, element2, relationshipClass);
            if(isValid) {
                result.add(chain);
            }
            else {
                System.err.println("Found invalid chain:"); //$NON-NLS-1$
                _printChain(chain, element2);
            }
        }
        
        return result.isEmpty() ? null : result;

    }
    
    /**
     * Create a derived relation between two elements
     * @param element1
     * @param element2
     * @return the derived relationship or null
     * @throws TooComplicatedException 
     */
    public IRelationship createDerivedRelationship(IZentaElement element1, IZentaElement element2) throws TooComplicatedException {
        if(element1 == null || element2 == null) {
            return null;
        }
    	throw new UnTestedException();//Should be moved to metamodel
/*
        
        //System.out.println("-----------------------------------");
        //System.out.println("Starting hunt from " + element1.getName() + " --> " + element2.getName());
        //System.out.println("-----------------------------------");
        
        // Traverse from element1 to element2
        List<List<IRelationship>> chains = findChains(element1, element2);
        
        if(chains.isEmpty()) {
            return null;
        }
        
        int weakest = weaklist.size() - 1;
        
        // You are the weakest link...goodbye.
        for(List<IRelationship> chain : chains) {
            for(IRelationship rel : chain) {
                //printChain(chain);
                int index = weaklist.indexOf(rel.eClass());
                if(index < weakest) {
                    weakest = index;
                }
            }
        }
        
        EClass relationshipClass = weaklist.get(weakest);
        //System.out.println("Weakest is: " + relationshipClass);
        
        boolean isValid = ZentaModelUtils.isValidRelationship(element1, element2, relationshipClass);
        if(!isValid) {
            return null;
        }
        
        return (IRelationship)IZentaFactory.eINSTANCE.create(relationshipClass);
*/
    }
    
    /**
     * @param chain
     * @return The weakest type of relationship in a chain of relationships
     */
    public IRelationClass getWeakestType(List<IRelationship> chain) {
		int weakest = weaklist.size() - 1;
        
        for(IRelationship rel : chain) {
            int index = weaklist.indexOf(metamodel.getClassReferencing(rel));
            if(index < weakest) {
                weakest = index;
            }
        }
        
        return weaklist.get(weakest);
    }
    
   
    // =================================================================================== 
    // TRAVERSE PATHS
    // ===================================================================================
    
    // Too complicated
    private static final int ITERATION_LIMIT = 20000;
    
    private IZentaElement finalTarget;
    private List<IRelationship> temp_chain;
    private List<List<IRelationship>> chains;
    private int weakestFound;
    private int iterations;

	private List<IRelationClass> weaklist;
    
    /**
     * @param sourceElement
     * @param targetElement
     * @return Find all the chains between element and finalTarget
     * @throws TooComplicatedException 
     */
    private List<List<IRelationship>> findChains(IZentaElement sourceElement, IZentaElement targetElement) throws TooComplicatedException {
        finalTarget = targetElement;
        temp_chain = new ArrayList<IRelationship>();
        chains = new ArrayList<List<IRelationship>>();
        weakestFound = weaklist.size();
        iterations = 0;
        
        // Easy win check
        if(!_hasTargetElementValidRelations(targetElement)) {
            return chains;
        }
        
        _traverse(sourceElement);
        
        return chains;
    }
    
    private void _traverse(IZentaElement element) throws TooComplicatedException {
        // We found the lowest weakest so no point going on
        if(weakestFound == 0) {
            return;
        }
        
        // Too deep
        if(++iterations > ITERATION_LIMIT) {
            throw new TooComplicatedException();
        }
        
        //System.out.println("TRAVERSING FROM: " + element.getName());
        
        /*
         * Traverse thru source relationships first
         */
        for(IRelationship rel : ZentaModelUtils.getSourceRelationships(element)) {
            if(isStructuralRelationship(rel)) {
                _addRelationshipToTempChain(rel, true);
            }
        }
        
        /*
         * Then thru the Bi-directional target relationships
         */
        for(IRelationship rel : ZentaModelUtils.getTargetRelationships(element)) {
            if(isBidirectionalRelationship(rel)) {
                _addRelationshipToTempChain(rel, false);
            }
        }
    }

    private void _addRelationshipToTempChain(IRelationship relation, boolean forwards) throws TooComplicatedException {
        // Reached the same relationship so go back one (this guards against a loop)
        if(temp_chain.contains(relation)) {
            //System.out.println("Reached same relationship in chain: " + relation.getName());
            return;
        }
        
        // If we get the target element we are traversing fowards, otherwise backwards from a bi-directional check
        IZentaElement element = forwards ? relation.getTarget() : relation.getSource();
        
        // Arrived at target
        if(finalTarget == element) {
            if(temp_chain.size() > 0) { // Only chains of length 2 or greater
                //System.out.println("Reached target from: " + element.getName());
                List<IRelationship> chain = new ArrayList<IRelationship>(temp_chain); // make a copy because temp_chain will have relation removed, below
                chain.add(relation);
                
                // Duplicate check - there must be a loop?
                if(_containsChain(chain, chains)) {
                    System.err.println("Duplicate chain:"); //$NON-NLS-1$
                    _printChain(chain, finalTarget);
                }

                IRelationClass weakest = getWeakestType(chain);
                int index = weaklist.indexOf(weakest);
                if(index < weakestFound) {
                    weakestFound = index;
                }

                chains.add(chain);
            }
        }
        // Move onto next element in chain
        else {
            //System.out.println("Adding to temp chain: " + relation.getName());
            temp_chain.add(relation);
            _traverse(element);
            temp_chain.remove(relation); // back up
        }
    }
    
	/*
     * This is an easy win check. Traversing will soon find if the source Element has no connections but it may take some
     * time to traverse to eventually find out that the target element had none. If the targte element has no incoming or 
     * bi-directional relationships then don't bother traversing.
     */
    private boolean _hasTargetElementValidRelations(IZentaElement targetElement) {
        for(IRelationship relation : ZentaModelUtils.getSourceRelationships(targetElement)) {
            if(isBidirectionalRelationship(relation)) {
                return true;
            }
        }
        
        for(IRelationship relation : ZentaModelUtils.getTargetRelationships(targetElement)) {
            if(isStructuralRelationship(relation)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Check if chain already exists in list of collected chains
     */
    private boolean _containsChain(List<IRelationship> chain, List<List<IRelationship>> chains) {
        for(List<IRelationship> stored_chain : chains) {
            if(stored_chain.size() == chain.size()) { // check only on same length
                boolean result = true; // assume the same
                for(int i = 0; i < chain.size(); i++) {
                    if(stored_chain.get(i) != chain.get(i)) { // relation is different so not the same
                        result = false;
                        break;
                    }
                }
                if(result) { // was the same
                    return true;
                }
            }
        }
        
        return false;
    }
    
    // =================================================================================== 
    // DEBUGGING PRINT
    // =================================================================================== 
    
    private void _printChain(List<IRelationship> chain, IZentaElement finalTarget) {
        String s = chain.get(0).getSource().getName();
        s += " --> "; //$NON-NLS-1$
        for(int i = 1; i < chain.size(); i++) {
            IRelationship relation = chain.get(i);
            s += _getRelationshipText(chain, relation);
            if(isBidirectionalRelationship(relation)) {
                s += " <-> "; //$NON-NLS-1$
            }
            else {
                s += " --> "; //$NON-NLS-1$
            }
        }
        s += finalTarget.getName();
        
        System.out.println(s);
    }
    
    private String _getRelationshipText(List<IRelationship> chain, IRelationship relation) {
        if(isBidirectionalRelationship(relation)) {
            int index = chain.indexOf(relation);
            if(index > 0) {
                IRelationship previous = chain.get(index - 1);
                if(relation.getTarget() == previous.getTarget()) {
                    return relation.getTarget().getName();
                }
            }
            return relation.getSource().getName();
        }
        else {
            return relation.getSource().getName();
        }
    }
}
