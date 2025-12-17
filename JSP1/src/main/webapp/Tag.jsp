<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Addition File</h1>
	<%!int a, b;%>
	<%
	a = 10;
	b = 20;
	%>
	<h1>
		Value 1:<%=a%></h1>
	<h1>
		Value 2:<%=b%></h1>
	<h1>
		Addtion:<%=a + b%></h1>

	<%!int age;%>
	<%
	age = 45;
	%>
	<%
	if (age >= 18) {
	%>
	<form action="">
		<input type="text" palceholder="Enter a name"> <br> <input
			type="text" placeholder="Enter ypur mail"> <br> <input
			type="submit" value="SUBMIT">

	</form>
	<h1 style="color: red">
		<%="Eligible for vote"%></h1>

	<%
	} else {
	%>
	<h1>
		<%="Not eligible for vote"%></h1>
	<%
	}
	%>
</body>
</html>