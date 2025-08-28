<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

</head>
<body>

	<%
		String user = (String)session.getAttribute("user");
		if(user==null)
		{
			request.setAttribute("err", "please login first");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	%>

	<div class="container">
	<div class="col-8 mx-auto p-3 mt-3 card">
	<h2 align="center">Student Details</h2>
	<hr>
	<table class="table">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Email</th>
	<th>Phone</th>
	<th>Password</th>
	<th>Action</th>
	<th><a href="logout" class="btn btn-info">Logout</a></th>
	</tr>


			<%
			   ArrayList<Student> st =(ArrayList)request.getAttribute("data");
			
				for(Student s : st)
				{%>
					<tr>
					<td><%=s.getId()%></td>
					<td><%=s.getName() %></td>
					<td><%=s.getEmail() %></td>
					<td><%=s.getPhone() %></td>
					<td><%=s.getPassword() %></td>
					<td><a href="update?action=delete&id=<%=s.getId()%>" class="btn btn-danger">Delete</a></td>
					<td><a href="update?action=update&id=<%=s.getId()%>" class="btn btn-primary">Update</a></td>
					</tr>
				<%}
			%>
	</table>
	<a href="index.jsp" class="btn btn-success">Add new Student</a>
	</div>
	</div>
</body>
</html>