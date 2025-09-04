<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>

<div class="container">
<div class=" col-6 card mx-auto mt-5">

<h2>Login </h2>

<hr>
		
		<form action="login" method="post">
		<span>${err}</span>
		<div class="form-group">
		<label>username</label>
		<input type="text" name="uname" class="form-control">
		</div>
		<br>
		
		<div class="form-group">
		<label>password</label>
		<input type="text" name="pass" class="form-control">
		</div>
		<br>
		
		<input type="submit">
		
		<input type="reset">
		
		
		</form>
		
	</div>
</div>
</body>	
</html>