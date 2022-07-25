<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CookieForm</title>
</head>
<body>
<%
	//쿠키저장소로부터 쿠키 값을 읽는다
	Cookie[] c = request.getCookies();
	String id = "";
	if(c!=null){
		for(int i=0;i<c.length;i++){
			if(c[i].getName().equals("id")){
				id=c[i].getValue();
				break;
			}
		}
	}
%>
<form action="CookieProc.jsp" method="post">
	id: <input type="text" name="id"><br>
	pw: <input type="password" name="pw"><br>
	<input type="checkbox" name="save" value="1">아이디저장<br>
	<input type="submit" value="전송">
</form>
</body>
</html>