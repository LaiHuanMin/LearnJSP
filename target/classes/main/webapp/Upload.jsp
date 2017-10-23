<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload file index page</h1>
	<form action="/uploadFile" enctype="multipart/form-data" method="POST" id="form">
		<input name="uploadFile" type="file" />
		<div>
			<input type="submit" value="提交" />
		</div>
	</form>
</body>
</html>