<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
<h1>정보확인</h1>
현재 로그인한 id는 ${m.id }이며,<BR>
전화번호는 ${m.phone }입니다<BR>
<button onclick="location.href='delete'">로그아웃 및 세션 삭제</button>
</body>
</html>