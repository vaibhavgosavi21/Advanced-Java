<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String val = request.getParameter("course");
	if (val != null) {
		if (val.equals("java")) {
			response.sendRedirect("Java.jsp");
		}
		if (val.equals("javascript")) {
			response.sendRedirect("JavaScript.jsp");
		}
	} else {
	%>
	<%="Please Select Course"%>
	<%
	}
	%>

</body>
</html>