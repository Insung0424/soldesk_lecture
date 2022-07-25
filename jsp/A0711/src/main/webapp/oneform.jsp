<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="twoform.jsp" method="post">

      <label for="user">아이디 : </label> 
      <input type="text" name="id" id="user"><br> 
      <label for="userpw">비번 : </label> 
      <input type="password" name="pwd" id="userpw"><br> 

   <input type="radio" name="aa" value="user" checked="checked">사용자
   <input type="radio" name="aa" value="manager">관리자
   
   <input type="submit" value="로그인">
</form>
</body>
</html>