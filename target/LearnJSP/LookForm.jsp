<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="me.rmrf.javabean.UserInfo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userInfo" class="me.rmrf.javabean.UserInfo"></jsp:useBean>
	<jsp:setProperty property="*" name="userInfo"/>

	Username: <jsp:getProperty property="username" name="userInfo"/>
	<br/>
	Password: <jsp:getProperty property="password" name="userInfo"/>
	<br/>
	<%= userInfo.echo("ok") %>
</body>
</html>