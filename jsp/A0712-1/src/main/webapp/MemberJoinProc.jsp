<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberJoinProc</title>
</head>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="stu" class="co.jis.javabeans.StuBean">
	<jsp:setProperty property="*" name="stu"/>
</jsp:useBean>
<body>
아이디:<jsp:getProperty property="id" name="stu"/><br>
비밀번호:<jsp:getProperty property="pass" name="stu"/><br>
이메일:<jsp:getProperty property="email" name="stu"/><br>
전화번호:<%= stu.getTel() %><br>
주소:<%= stu.getAddr() %><br>
</body>
</html>