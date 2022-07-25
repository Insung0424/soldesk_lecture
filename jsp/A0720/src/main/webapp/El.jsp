<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
${"Hi"}<br>
<%= "Hi" %><br>
<% out.print("Hi"); %><br>

정수:${20}<br>
실수:${3.4 }<br>
문자열:${"문자" }<br>
논리:${true }<br>
null:${null} 은 당연히 비어보인다<br>

2==2 [${2==2 }]<br>
2 eq 2 [${2 eq 2 }]<br>
5+2 [${5+2 }]<br> 
5/2 [${5/2 }]<br>
5 div 2 [${5 d 2}]<br>
5 mod 2 [${5 mod 2 }]<br>
5>2 [${5>2 }]<br>
(5>2)? 5:2 [${(5>2)? 5:2 }]<br>
<%
	String str=null;
%>
empty str? [${empty str }]<br>
</body>
</html>