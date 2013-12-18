package com.accenture.cq5;

import com.day.cq.wcm.api.Page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContextualFooterTraining {
	
	private List<Page> list;
	
	public List<Page> getList() {
		return list;
	}

	public void setList(List<Page> list) {
		this.list = list;
	}

	public ContextualFooterTraining(Page pCurrentPage){
		list = new ArrayList<Page>();
		Page parent = pCurrentPage.getParent();
		
		if (parent != null) {
	        
            // Create an Iterator. listChildren() method returns an Iterator<Page>
            Iterator<Page> children = parent.listChildren();
            
            // While the iterator list has a next child
            while (children.hasNext()){
                
                // Get the child page. The next() method returns the next object in the collection.
                Page child = children.next();
                
                // Check that we are not including the current page. Using the equals() method inherited from the java Object class 
                if (pCurrentPage.equals(child)) { continue; }

                list.add(child);

            }
        }else{
        	list.add(pCurrentPage);
        }
	}
}
