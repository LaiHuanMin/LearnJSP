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
	<h1>Employee Table</h1>
	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/employees" user="root"
		password="123456" var="ds" />
	<jsp:useBean id="table" class="me.rmrf.javabean.TableInfo"></jsp:useBean>
	<jsp:setProperty property="*" name="table" />
	<c:if test="${table.beginIndex == null}">
		<jsp:setProperty property="beginIndex" name="table" value="0" />
	</c:if>
	<sql:query dataSource="${ds}" var="result"> 
		select emp_no,birth_date,CONCAT(first_name," ",last_name) as `person name`,if(gender='m','man','female') as `sex`,hire_date from emp where CONCAT(first_name," ",last_name) like "${table.filter}" order by ${table.order == null ? "1" : table.order } limit ${table.beginIndex},10; 
	</sql:query> 
	<div>
		<input type="text" id="filter" placeholder="Please input words" />
		<button onclick="search()">search</button>
	</div>
	<br/>
	<table border="1">
		<thead>
			<tr>
				<c:forEach items="${result.columnNames }" varStatus="status"
					var="column">
					<td><a href="/flipPage.jsp?order=${status.index+1 }">${column}</a></td>
				</c:forEach>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${result.rows }" var="row">
				<tr>
					<c:forEach items="${result.columnNames}" var="column">
						<td><c:out value="${row[column] }"></c:out></td>
					</c:forEach>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr />
	<div>
		<button ${table.beginIndex == 0 ? "disabled" : "" }
			onclick="lastPage()">上一页</button>
		<button onclick="nextPage()">下一页</button>
	</div>
</body>
</html>
<script>
	var currentOrder = ${table.order == null ? 1 : table.order}  
	var currentPage = ${table.beginIndex}
	var currentFilter = "${table.filter}"
	window.lastPage = function(){
		if(currentPage == 0){
			return;
		}else{
			location.href = "http://localhost:8080/flipPage.jsp?beginIndex="+(currentPage - 10) + "&order="+currentOrder+"&filter="+currentFilter;
		}
	}
	window.nextPage = function(){
		location.href = "http://localhost:8080/flipPage.jsp?beginIndex="+(currentPage + 10) + "&order="+currentOrder+"&filter="+currentFilter
	}

	window.search = function(){
		var ipt = document.querySelector("#filter");
		console.log(ipt.value);
	}
</script>