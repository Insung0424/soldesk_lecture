<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = "sky";
	String pw = "12324";
	String name = "blue";

	request.setCharacterEncoding("UTF-8");
	if(id.equals(request.getParameter("id")) &&
			pw.equals(request.getParameter("pwd"))){
	
		response.sendRedirect("main.jsp?name="+ URLEncoder.encode(name,"UTF-8"));
		// ? => 쿼리 스트링
	}
	else{
		response.sendRedirect("res.jsp");
	}
%>


</body>
</html>