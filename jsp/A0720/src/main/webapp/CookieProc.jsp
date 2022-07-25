<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CookieProc</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String s = request.getParameter("save");
	String id = request.getParameter("id");
	
	if(s!=null){
		Cookie cookie = new Cookie("id", id);
		
		cookie.setMaxAge(60*3);
		//유효기간 3분
		response.addCookie(cookie); 
		//클라이언트에게 쿠키가 생성됨
		
		out.write("쿠키 생성");
	}
%>
</body>
</html>