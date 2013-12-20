package com.accenture.cq5;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.sling.api.resource.ValueMap;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.designer.Style;

public class HomePage extends BasePage {

	private static final String SITE_MAP ="sitemap";
	
	public HomePage(Page pCurrentPage, Style pCurrentStyle,  ValueMap pProperties){
		super();
		
		super.setChildrenList(generateFooterNavPages(pCurrentPage, pProperties));
	}
	
	private List<NavigationPage> generateFooterNavPages(Page pCurrentPage, ValueMap pProperties){
		List<NavigationPage> result = new ArrayList<NavigationPage>();
		
		if(pCurrentPage != null){
			Object siteMapPathr = pProperties.get(SITE_MAP);  
			if(siteMapPathr != null){
				String siteMapPath =siteMapPathr.toString();
				Page siteMap = pCurrentPage.getPageManager().getPage(siteMapPath);
				
				Iterator<Page> children = siteMap.listChildren();
				
				while(children.hasNext()){
					
					Page child = children.next();
	                
	                NavigationPage np = new NavigationPage(child);
	                result.add(np);
				}
			}
		}
		
		return result;
	}
}
