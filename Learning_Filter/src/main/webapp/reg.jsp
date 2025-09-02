<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

</head>
<body>
				<div class="container">
				<div class="col-5 mx-auto card p-5 mt-5">
				<h2>Employee Registration</h2>
				<hr>
				<span class="text-success">${msg}</span>
				<form action="reg" method="post">
				<div class="form-group">
					<label>Name</label>
					<input type="text" name="name" class="form-control"
					value="<%=request.getParameter("name")!=null?request.getParameter("name"):""%>"
					> 
					<span class="text-danger">${unameErr}</span>
				</div>
				<div class="form-group">
					<label>Email</label>
					<input type="text" name="email" class="form-control"
					value="<%=request.getParameter("email")!=null?request.getParameter("email"):""%>"
					> 
					<span class="text-danger">${emailErr}</span>
				</div>
				<div class="form-group">
					<label>Phone</label>
					<input type="text" name="phone" class="form-control"
					value="<%=request.getParameter("phone")!=null?request.getParameter("phone"):""%>"
					> 
					<span class="text-danger">${phoneErr}</span>
				</div>
				<br>
				<input type="submit" class="btn btn-success">
				<input type="reset" class="btn btn-primary">
				
				</form>
				</div>
				</div>
</body>
</html>