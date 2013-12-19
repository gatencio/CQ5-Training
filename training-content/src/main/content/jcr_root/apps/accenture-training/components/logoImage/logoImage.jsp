<%--
  Copyright 1997-2008 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  Image component

  Draws an image. 

--%>
<%@ page import="com.day.cq.commons.Doctype,
    com.day.cq.wcm.api.components.DropTarget,
    com.day.cq.wcm.foundation.Image" %>
    <%@include file="/libs/foundation/global.jsp"%>
  <%
    //Obtenemos el resource del diseno
	Resource re = currentStyle.getDefiningResource("fileReference");
	 String divId = "imagen";
	if(re == null){
		re = currentStyle.getDefiningResource("file");
	}
	if(re != null){
    Image image = new Image(re);

    image.setSelector(".img"); // use image script

    divId = "cq-image-jsp-" + re.getPath();
    %><div id="<%= divId %>"><% image.draw(out); %></div><%
    }
    else
    {
    %><div id="<%= divId %>">No image</div><%
    }
    %>
    

    
