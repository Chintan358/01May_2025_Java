<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<sql:setDataSource 
			driver="com.mysql.cj.jdbc.Driver" 
			url="jdbc:mysql://localhost:3306/01may_java"
			user="root"
			password="root"
			var="ds"
		/>

	
		<sql:query var="data" dataSource="${ds}">
			select * from emp;
		</sql:query>
		
		<table>
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Phone</th>
		</tr>
		
		<c:forEach var="dt" items="${data.rows}">
			<tr>
			<td>${dt.id}</td>
				<td>${dt.name}</td>
					<td>${dt.email}</td>
						<td>${dt.phone}</td>
			</tr>
		
		</c:forEach>
		</table> 
	
</body>
</html>