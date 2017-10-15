<%@ page import="java.util.Enumeration"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%! 
	String targetURL = "";
%>
<%
String nextParam = "";
Enumeration paramName = request.getParameterNames();
out.println(paramName.hasMoreElements() == true ? "yes":"no");
while(paramName.hasMoreElements() == true){
	out.println(paramName.nextElement());
}
%>

<%
	if (false) {
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
			location.href = "<%=targetURL%>"  
		},3000)
	}
</script>