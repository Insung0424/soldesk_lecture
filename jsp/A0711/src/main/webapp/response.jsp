<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response</title>
</head>
<body>
<form action="LoginCheck.jsp" method="post">

 <label for="user">아이디 : 

 <input type="text" name="id" id="user"></label><br>


 <label for="userpw">비번 : 

 <input type="password" name="pwd" id="userpw"></label><br>

 <input type="submit" value="로그인">

</form>
</body>
</html>