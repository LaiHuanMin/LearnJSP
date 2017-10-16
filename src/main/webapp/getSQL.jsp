<%@page import="javax.servlet.jsp.jstl.sql.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>I want to exec SQL</h1>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/employees" user="root"
		password="123456" var="ds" />
	<h1>
		<%
			String[] tableNames = { "emp", "salaries", "dept_emp" };
			pageContext.setAttribute("tableList", tableNames);
		%>
	</h1>
	<c:forEach items="${tableList }" var="tableItem">
		<sql:query var="result" dataSource="${ds}">
		select * from ${tableItem} limit 5;
		</sql:query>
		<h1>${tableItem }</h1>
		<table border="1">
			<thead>
				<tr>
					<c:forEach items="${result.columnNames }" var="column">
						<td>${column}</td>
					</c:forEach>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${result.rows }" var="row">
					<tr>
						<c:forEach items="${result.columnNames}" var="column">
							<td><c:out value="${row[column]}" /></td>
						</c:forEach>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr/>
	</c:forEach>
</body>
</html>