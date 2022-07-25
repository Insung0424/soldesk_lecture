<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addmember</title>
</head>
<body>
<form action="add" method="post">
이름: <input type="text" name="name"><br>
아이디: <input type="text" name="userId"><br>
별명: <input type="text" name="nickname"><br>
비밀번호: <input type="password" name="pwwd"><br>
이메일: <input type="email" name="email"><br>
전화번호: <input type="tel" name="phone"><br>
<input type="submit" value="전송">
<input type="reset" value="취소"><br>
</form>

</body>
</html>