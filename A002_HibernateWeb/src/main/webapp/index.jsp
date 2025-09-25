<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
				
				<div class="container">
				<div class="col-5 mx-auto card p-5 mt-5">
				<h2>User Registration</h2>
				<hr>
				<span class="text-success">${msg}</span>
				<form action="reg" method="post">
				<div class="form-group">
					<label>Name</label>
					<input type="text" name="name" class="form-control"> 
				</div>
				<div class="form-group">
					<label>Email</label>
					<input type="text" name="email" class="form-control"> 
				</div>
				
				<br>
				<input type="submit" class="btn btn-success">
				<input type="reset" class="btn btn-primary">
<!-- 				<a href="display" class="btn btn-warning">View All Emp</a> -->
				</form>
				</div>
				</div>
				
</body>
</html>