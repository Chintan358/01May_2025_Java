<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home</h1>
<a href="logout">logout</a>

<%
	int cu = (Integer)application.getAttribute("cu");
	int tu = (Integer)application.getAttribute("tu");
%>

<h1>Current user = <%=cu%></h1>
<h1>Total user = <%=tu%></h1>
</body>
</html>