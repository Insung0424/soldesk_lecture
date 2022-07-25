<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="co.jis.javabeans.Memberbean">
<jsp:setProperty property="*" name="member"/>
</jsp:useBean>
<body>
이름: 
<jsp:getProperty property="name" name="member"/><br>
아이디: 
<jsp:getProperty property="userId" name="member"/><br>
별명: 
<jsp:getProperty property="nickname" name="member"/><br>
비밀번호: 
<jsp:getProperty property="pwwd" name="member"/><br>
이메일: 
<jsp:getProperty property="email" name="member"/><br>
전화번호: 
<jsp:getProperty property="phone" name="member"/><br>

</body>
</html>