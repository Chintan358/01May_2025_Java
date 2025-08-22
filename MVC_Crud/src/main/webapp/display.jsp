<%@page import="model.Emp"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<h2>Employee Registration</h2>
				<hr>
			<table class="table">
			<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th colspan="2">Action</th>		
			</tr>
			
			<%
			ArrayList<Emp> allEmps = (ArrayList)request.getAttribute("data");
			for(Emp e : allEmps)
			{ %>
				<tr>
				<td><%=e.getId() %></td>
				<td><%=e.getName()%></td>
				<td><%=e.getEmail()%></td>
				<td><%=e.getPhone()%></td>
				<td><a href="update?action=delete&id=<%=e.getId()%>" class="btn btn-danger">Delete</a>
					<td><a href="update?action=update&id=<%=e.getId()%>" class="btn btn-primary">Update</a>
				</tr>
			<%}
			
			%>
			
			
			</table>
			</div>
			</div>

</body>
</html>