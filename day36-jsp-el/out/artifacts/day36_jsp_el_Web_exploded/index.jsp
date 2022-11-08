<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">这是我的第一个jsp</title>
</head>
<body>
 	<marquee><h1 style="color:red">哈哈哈哈哈哈哈<h1></marquee>
 	<%= new Date().toLocaleString() %>
</body>
</html>