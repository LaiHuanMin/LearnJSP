<%@ page import="java.util.Map" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<%
	Map userInfo = (Map)session.getAttribute("userInfo");
	if(userInfo == null){
		throw new Exception("is null");
	}
%>
<body>
</body>
</html>