<%@ include file="/libs/foundation/global.jsp" %>
<%@page import="com.accenture.cq5.HomePage" %>
<%
	HomePage nav = new HomePage(currentPage, currentStyle);
	pageContext.setAttribute("nav", nav);
%>
<header class="header">
    <c:forEach var="page" items="${nav.childrenList}">
    	<nav>
    		<a href="${page.url}.html">${page.title}</a>
    	</nav>
    </c:forEach>
</header>