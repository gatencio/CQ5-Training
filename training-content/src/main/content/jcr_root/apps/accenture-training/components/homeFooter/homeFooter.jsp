<%--

  Home Footer component.

  Home Footer

--%>
<%@include file="/libs/foundation/global.jsp"%>
<%@page import="com.accenture.cq5.HomePage" %>
<%
    HomePage nav = new HomePage(currentPage, currentStyle, properties);
	pageContext.setAttribute("nav", nav);
%>
<footer>
2112
    <c:forEach var="page" items="${nav.childrenList}">
    	<nav>
    		<a href="${page.url}.html">${page.title}</a>
    	</nav>
    </c:forEach>
    
</footer>
