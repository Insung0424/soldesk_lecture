<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2022/07/11</title>
</head>
<body>
	<form action="join.jsp">
		<h1>커피메뉴</h1>
		<input type="radio" name="menu" value="아메리카노">아메리카노(4000원)<br>
		<input type="radio" name="menu" value="카페라떼">카페라떼(4500원)<br>
		<input type="radio" name="menu" value="카푸치노">카푸치노(4500원)<br>
		<input type="radio" name="menu" value="프라푸치노">프라푸치노(7000원)<br>
		수량: <input type="number" name="number" min="0"><br>
		입금액: <input type="text" name="money"><br>
		<input type="submit" value="주문">		
	</form>
</body>
</html>