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
			<div class="col-6 mx-auto mt-5 p-5 card">
			<h2>Registration form</h2>
			<hr>
			<span class="text-success">${msg }</span>
			<form action="reg" method="post">
			
			<div class="form-group">
			<label>Username</label>
			<input type="text" name="name" class="form-control">
			</div>
			
			
			<div class="form-group">
			<label>Email</label>
			<input type="text" name="email" class="form-control">
			</div>
			
			<div class="form-group">
			<label>Phone</label>
			<input type="number" name="phone" class="form-control">
			</div>
			
			
			<div class="form-group">
			<label>Password</label>
			<input type="password" name="pass" class="form-control">
			</div>
			
			<br>
			
			<input type="submit" class="btn btn-success">
			<input type="reset" class="btn btn-primary">
			</form>
			
			</div>
			</div>
</body>
</html>