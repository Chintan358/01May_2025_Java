<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
		<script type="text/javascript">
		
		$(document).ready(function(){
			viewUsers()
		})
		
		
		const viewUsers = ()=>{
			$.get("display",{},function(rt){
			
				const alldata = JSON.parse(rt)
				var rows=""
				alldata.map(ele=>{
					rows+="<tr><td>"+ele.id+"</td><td>"+ele.uname+"</td><td>"+ele.email+"</td></tr>"
				})
				
				$("#tdata").html(rows)
			})
		}
		
		const addUser = ()=>{
			var uname = $("#uname").val()
			var email = $("#email").val()
			var pass = $("#pass").val()
			
			$.post("reg",{uname,email,pass},function(rt){
				alert(rt)
				
				$("#uname").val("")
				$("#email").val("")
				$("#pass").val("")
				viewUsers()
			})
			
		}
		
		
		</script>
</head>
<body>
				<div class="container">
				<div class="row">
					<div class="col-4  p-5 card mx-auto mt-5">
					<h2>User Registration</h2>
					<hr>
					
					<label>Uname</label>
					<input type="text" name="uname" id="uname" class="form-control" placeholder="Enter Uname">
					<label>Email</label>
					<input type="text" name="email" id="email" class="form-control" placeholder="Enter Email">
					<label>Password</label>
					<input type="text" name="pass" id="pass" class="form-control" placeholder="Enter Password">
					<hr>
					<button class="btn btn-success" onclick="addUser()">Submit</button>
					</br>
					<button class="btn btn-primary">Reset</button>
					
					</div>
					<div class="col-1"></div>
					<div class="col-7 p-5 card mx-auto mt-5">
					<h2>User Details</h2>
					<hr>
					<table class="table">
					<thead>
					<tr>
					<th>ID</th>
					<th>Username</th>
					<th>Email</th>
					
					</tr>
					</thead>
					
					<tbody id="tdata">
					
					</tbody>
					
					</table>
					</div>
				
				</div>
				</div>
</body>
</html>