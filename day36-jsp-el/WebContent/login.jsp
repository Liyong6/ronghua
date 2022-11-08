<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	
	<h3 style="color:yellow">${msg }</h3> </br>
	<form action="/Login" method="post">
		账号：<input type="text" name="username" placeholder="请输入账号"/>
		密码：<input type="password" name="password" placeholder="请输入密码"/>
		<input type="submit" value="登录" />
	</form>
</body>
</html>