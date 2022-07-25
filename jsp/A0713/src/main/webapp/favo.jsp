<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>favo</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="fa" class="co.jis.a.favoBean">
	<jsp:setProperty property="*" name="fa"/>
</jsp:useBean>

좋아하는 색은 
<jsp:getProperty property="color" name="fa"/>
이고 <br>
좋아하는 음악은 
<jsp:getProperty property="music" name="fa"/>
입니다
<br>
</body>
</html>