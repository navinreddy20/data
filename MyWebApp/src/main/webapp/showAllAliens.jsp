<%@page import="com.telusko.model.Alien"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<%
		List<Alien> aliens = (List<Alien>)request.getAttribute("aliens");
	
		for(Alien a : aliens)
			out.println(a + "<br>");
		
	
	
	%>
	
	
</body>
</html>