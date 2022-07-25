<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN</title>
</head>
<body>
	<h1>주문 계산 결과</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		int sum=0;
		int price=0;
		String menu = request.getParameter("menu");
		String num = request.getParameter("number");
		String text = request.getParameter("money");
		
		switch (menu){
		case "아메리카노":
			price = 4000;
			break;
		case "카페라떼":
		case "카푸치노":
			price = 4500;
			break;
		case "프라푸치노":
			price = 7000;
			break;
		}
		sum= price * Integer.parseInt(num);
		int c = Integer.parseInt(text) - sum;
	%>
커피메뉴	<%= menu %><br>
1개 가격	<%= price %><br>
수량		<%= num %><br>
총금액	<%= sum %><br>
입금액	<%= text %><br>
거스름돈  <%= c %>
</body>
</html>