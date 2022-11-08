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
		pageContext.setAttribute("pageContext", "pageContextInfo");
		
		request.setAttribute("request", "requestInfo");
		session.setAttribute("session", "sessionInfo");
		application.setAttribute("application", "applicationInfo");
	%>
	<%= pageContext.getAttribute("pageContext") %> </br>
	<%= request.getAttribute("request") %> </br>
	<%= session.getAttribute("session") %> </br>
	<%= application.getAttribute("application") %> </br>
	
	<%
		pageContext.setAttribute("pageContext", "修改了");
	%>
	修改以后
	<%= pageContext.getAttribute("pageContext") %> </br>
	<%
		pageContext.removeAttribute("pageContext");
	%>
	删除以后
	<%= pageContext.getAttribute("pageContext") %> </br>
</body>
</html>