<%@page import="cn.ronghuanet.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		/* 往四大作用域中放值 */
		session.setAttribute("key", "sessionInfo");
		request.setAttribute("key", "requestInfo");
	 	pageContext.setAttribute("key", "pageContextInfo"); 
		application.setAttribute("key", "applicationInfo");
		User user = new User("zs","123");
		session.setAttribute("user", user);
		
		session.setAttribute("dog.name", "wc");
	%>
	${sessionScope["dog.name"] } </br>
	
	${user.username } </br>
	${user.password } </br>
	${requestScope.key}
	${pageScope.key}
	${applicationScope.key}
	${sessionScope.key}
	<%-- <%= pageContext.getAttribute("key") %> </br>
	<%= request.getAttribute("key") %> </br>
	<%= session.getAttribute("key") %> </br>
	<%= application.getAttribute("key") %> </br> --%>
</body>
</html>