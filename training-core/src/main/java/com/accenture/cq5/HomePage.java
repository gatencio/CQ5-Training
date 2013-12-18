package com.accenture.cq5;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.designer.Style;

public class HomePage {

	private List<NavigationPage> childrenList; 
	private String imagePath;
	
	public HomePage(Page pCurrentPage, Style pCurrentStyle)
	{
		childrenList = generateNavPages(pCurrentPage);
		
		if(pCurrentStyle != null){
			setImagePath(pCurrentStyle.get("imagePath","path")); 
		}
	}
	
	/**
	 * Genera la lista de paginas que apareceran en el menu de navegación
	 * @param pCurrentPage Pagina padre de todas las paginas navegables
	 * @return Lista de paginas. En caso de que el padre sea null la lista estara vacía
	 */
	private List<NavigationPage> generateNavPages(Page pCurrentPage){
		
		List<NavigationPage> result = new ArrayList<NavigationPage>();
		
		if(pCurrentPage != null){
			Iterator<Page> children = pCurrentPage.listChildren();
			
			while (children.hasNext()) {
                Page child = children.next();
                if (!pCurrentPage.equals(child)) {
                        NavigationPage np = new NavigationPage(child);
                        result.add(np);
                }
			}
		}
		
		return result;
	}
	
	public List<NavigationPage> getChildrenList() {
		return childrenList;
	}
	
	public void setChildrenList(List<NavigationPage> childrenList) {
		this.childrenList = childrenList;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
