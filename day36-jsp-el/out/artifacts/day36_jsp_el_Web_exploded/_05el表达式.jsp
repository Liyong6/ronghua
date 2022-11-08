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
	<%= request.getAttribute("request111") %> </br>
	<%= session.getAttribute("session") %> </br>
	<%= application.getAttribute("application") %> </br>
	el表达式取值----------------</br>
	${pageContext }</br>
	${request }</br>
	${request111 }</br>
	${session }</br>
	${application }</br>
</body>
</html>