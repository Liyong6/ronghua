<%@page import="java.util.Date"%>
<!-- 
	<%@page %> page指令
		language="java"： 表示语言是java 意义不大
		contentType="text/html; charset=UTF-8" 等同于 response.setContentType("text/html; charset=UTF-8");
		pageEncoding="UTF-8"： 如果有charset=UTF-8 就使用它，如果没有就使用pageEncoding
		
 -->
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="./myerror.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 书写java代码方式一: 这个写法 等于 调用了 out.print(表达式) -->
	<%= new Date().toLocaleString() %>
	</br>
	<!-- 书写java代码方式二: jsp脚本 编写java代码 -->
	<%
		String name = "zs";
		int a = 1/0;
	%>
	<%= name %>
	</br>
	<!-- 书写java代码方式三: jsp申明  -->
	<%!
		int age = 16;
	%>
	</br>
	<%= age %>
	</br>
	
	<%
		if(age >= 18 ){
	%>
		你已经成年了可以学编程了
	<%
		}else{
	%>
		你还没有满18岁
	<%
		}
	%>
	<!-- 
		逻辑方面的东西我们交给servlet去处理 尽量不要在servlet中拼接页面
		页面展示的东西我们交给jsp去处理 也不要在jsp中写java代码
		职责分明
	
	 -->
</body>
</html>