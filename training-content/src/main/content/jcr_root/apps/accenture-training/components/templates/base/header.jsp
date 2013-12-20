<%@ include file="/libs/foundation/global.jsp" %>
<%@page import="com.accenture.cq5.BasePage" %>
<%
	BasePage nav = new BasePage(currentPage, currentStyle);
	pageContext.setAttribute("nav", nav);
%>
<header class="header">

<cq:include path="logoImage" resourceType="accenture-training/components/logoImage"/>

    <c:forEach var="page" items="${nav.childrenList}">
    	<nav>
    		<a href="${page.url}.html">${page.title}</a>
    	</nav>
    </c:forEach>
</header>