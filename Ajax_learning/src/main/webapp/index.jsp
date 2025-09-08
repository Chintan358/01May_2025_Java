<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<script type="text/javascript">

	$(document).ready(function(){
		countries()
	})
	
	const countries = ()=>{
		$.get('countries',{},function(rt){
			$("#country").html(rt)
		})
	}
	
	const states = (cid)=>{
		$.get('states',{cid},function(rt){
			$("#state").html(rt)
		})
	}
	
	const hello = ()=>{
		
			var data = $("#data").val()
			
			$.get('home',{data},function(rt){
				$("#resp").html(rt)
			})
		
	}
	
	const search = (val)=>{
		
		$.get("search",{val},function(rt){
			$("#result").html(rt)
		})
	}

</script>

</head>
<body>

	<input type="text" id="data" onkeyup="hello()">
	<button onclick="hello()">Click me</button>
	<div id="resp"></div>
	
	<hr>
	
	<input type="text" placeholder="search here..." onkeyup="search(value)">
	<div id="result"></div>
		
		<hr>
		
		<select id="country" name="country" onchange="states(value)">
		<option>---select country---</option>
		</select>
		
		<select id="state" name="state">
		<option>---select state---</option>
		</select>
		
		<select id="city" name="city">
		<option>---select City---</option>
		</select>
	
</body>
</html>