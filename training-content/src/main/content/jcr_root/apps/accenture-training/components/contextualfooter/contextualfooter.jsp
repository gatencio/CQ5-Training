<%--

  Contextual Footer component.

--%><%
%><%@include file="/libs/foundation/global.jsp"%>
<%@page import="com.accenture.cq5.ContextualFooterTraining" %>
<footer>
    <nav>
        <% 
        
        ContextualFooterTraining t = new ContextualFooterTraining();
        pageContext.setAttribute("list",t.iteratePage(currentPage.getParent()));
        
        
        %>
    </nav>
    <%=currentStyle.get("disclaimer", "Edit Disclaimer in Design")%>
</footer>