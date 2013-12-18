<%--

  Contextual Footer component.

--%><%
%><%@include file="/libs/foundation/global.jsp"%>
<%@page import="com.accenture.cq5.ContextualFooterTraining" %>

<% 
        
        ContextualFooterTraining trainingFooter = new ContextualFooterTraining(currentPage);
        pageContext.setAttribute("list",trainingFooter);
        
        
        %>
<footer>
    <nav>
    	${fn:length(list.list)}
        <c:forEach var="item"  items="${list.list}">
		 ${item.name} <br>
		</c:forEach>
    </nav>
    <%=currentStyle.get("disclaimer", "Edit Disclaimer in Design")%>
</footer>