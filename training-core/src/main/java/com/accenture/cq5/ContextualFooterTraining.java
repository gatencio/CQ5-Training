package com.accenture.cq5;

import com.day.cq.wcm.api.Page;

import javax.jcr.NodeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContextualFooterTraining {
	
	private Page page;
	
	public ContextualFooterTraining(){
		
	}
	
	public void setPage(Page pPage){
		this.page = pPage;
	}
	
	public List<String> iteratePage(Page pPage){
		setPage(pPage);
		Page parent = page.getParent();
		
		List<String> list = new ArrayList<String>();
		
		if (parent != null) {
	        
            // Create an Iterator. listChildren() method returns an Iterator<Page>
            Iterator<Page> children = parent.listChildren();
            
            // While the iterator list has a next child
            while (children.hasNext()){
                
                // Get the child page. The next() method returns the next object in the collection.
                Page child = children.next();
                
                // Check that we are not including the current page. Using the equals() method inherited from the java Object class 
                if (page.equals(child)) { continue; }
                
                // "Print" a DIV tag to the html
                /*%><div><%*/
                
                // Logic to get the Title. check title first, then page title and lastly name.
                if (child.getTitle() != null){
                    
                    // Print the title to the html
                    /*%><%=child.getTitle()%><%*/
                	list.add(child.getTitle());
                } else if (child.getPageTitle() != null) {
                    
                    // Print the page title to the html
                    /*%><%=child.getPageTitle()%><%*/
                	list.add(child.getPageTitle());
                } else {
                    
                    // Last option: print the name to the html
                    /*%><%=child.getName()%><%*/
                	list.add(child.getName());
                }
                
                // Print the closing div for each child
               /* %> </div> <%*/
            }
        }
		return list;
	}

}
