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
		
	})
	
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
	
	
</body>
</html>