<%@page import="java.util.List"%>
<%@page import="org.apache.commons.io.IOUtils"%>
<%@ page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="org.apache.commons.io.input.*"%>
<%!
String targetURL = "";
boolean isValid = false;	
%>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	if(username == null || password == null){
		isValid = false;		
	}else{
		isValid = true;
	}
%>

<%
	if (isValid) {
		targetURL = "/index.jsp";
%>
<div>登录成功...3秒后跳转</div>
<%
	} else {
		targetURL = "login.jsp";
%>
<div>登录失败...3秒后返回</div>
<%
	}
%>

<script>
	window.onload = function(){
		setTimeout( function(){
			location.href = "<%=targetURL%>";
		}, 3000)
	}
</script>