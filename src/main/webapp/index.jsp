%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Map"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>rmrf.me管理系统</title>
</head>
<%
	//鉴权
	Map userInfo = (Map) session.getAttribute("userInfo");
	try {
		if (userInfo == null) {
			throw new Exception("userInfo is null");
		} else if ((Boolean) (userInfo.get("valid")) == false) {
			throw new Exception("userInfo is not valid");
		}
	} catch (Exception exp) {
		response.sendRedirect("/login.jsp");
	}
%>
<body>
</body>
</html>