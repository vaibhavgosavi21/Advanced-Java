<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!ArrayList list = new ArrayList();%>
	<%
	list.add("Mango");
	list.add("Apple");
	list.add("Banana");
	list.add("Cherry");
	%>

	<%
	for (Object obj : list) {
	%>
	<h1 style="color: red"><%=obj%></h1>
	<%
	}
	%>
</body>
</html>