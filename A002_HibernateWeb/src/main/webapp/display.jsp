
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

</head>
<body>
	<div class="container">
				<div class="col-10 mx-auto card p-5 mt-5">
				<h2>User Registration</h2>
				<hr>
			<table class="table">
			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
		
			<th colspan="2">Action</th>		
			</tr>
			
			<c:forEach var="dt" items="${data}">
			
			<tr>
				<td>${dt.getId() }</td>
				<td>${dt.getName()}</td>
				<td>${dt.getEmail()}</td>
					<td><a href="update?action=delete&id=${dt.getId()}" class="btn btn-danger">Delete</a>
					<td><a href="update?action=update&id=${dt.getId()}" class="btn btn-primary">Update</a>
				</tr>
		
			</c:forEach>
			
			
			</table>
			</div>
			</div>

</body>
</html>