<%@page import="com.telusko.model.Alien"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
    
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<body>

	<%
		List<Alien> aliens = (List<Alien>)request.getAttribute("aliens");
	
		for(Alien a : aliens)
			out.println(a + "<br>");
		
	%>
	<hr>

	<c:forEach items="${aliens}" var="a">
		${a.aname}<br>
	</c:forEach>
	
	<c:set var="myName" value="This is Manihas Reddy" />
	
	Check : ${fn:contains(myName,"Navin")}
	

	
	
</body>
</html>