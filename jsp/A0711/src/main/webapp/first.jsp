<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
    pageContext.setAttribute("name", "yellow"); 
	request.setAttribute("name", "red");
	session.setAttribute("name", "blue");
	application.setAttribute("name", "green");
	
	System.out.println(pageContext.getAttribute("name"));
	System.out.println(request.getAttribute("name"));
	System.out.println(session.getAttribute("name"));
	System.out.println(application.getAttribute("name"));
	
	request.getRequestDispatcher("second.jsp").forward(request,response);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first</title>
</head>
<body>

</body>
</html>