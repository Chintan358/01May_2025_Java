<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

</head>
<body>
<div class="container">
				<div class="row">
				<div class="col-5 card p-5 mx-auto mt-5">
			
				<h2>Login Form</h2>
				<hr>
				<form action="login" method="post">
				
				<input type="text" name="uname" placeholder="enter username" class="form-control">
				<br>
			
				<input type="text" name="pass" placeholder="enter password" class="form-control">
				<br>
				<input type="submit" class="btn btn-success">
				<input type="reset" class="btn btn-primary">
				<a href="reg.jsp">New user? register here</a>
				</form>
				
				
				</div>
				</div>
				</div>
</body>
</html>