<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginProc</title>
</head>
<body>
<%
	String id="in";
	String pw="123";
	if(id.equals(request.getParameter("id")) 
			&& pw.equals(request.getParameter("pw"))){
		System.out.print("통과");
		session.setAttribute("user", id);
		response.sendRedirect("loginProc2.jsp");
	}else{
		response.sendRedirect("loginForm.jsp");
	}
%>
</body>
</html>