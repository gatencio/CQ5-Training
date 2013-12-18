package com.accenture.cq5;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.designer.Style;

public class HomePage {

	private List<Page> childrenList; 
	
	public HomePage(Page pPage, Style pCurrentStyle)
	{
		Iterator<Page> iterator = pPage.listChildren();
	}
	
	public List<Page> getChildrenList() {
		return childrenList;
	}
	public void setChildrenList(List<Page> childrenList) {
		this.childrenList = childrenList;
	}
}
