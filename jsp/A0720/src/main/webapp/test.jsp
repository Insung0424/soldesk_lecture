<%@page import="test1.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
<c:out value="hi"/><br> 

<c:set var="msg" value="hello" scope="page"/>
<!-- var:변수명 선언(String형) value:저장할값 scope:값이 존재할 범위 -->
set으로 값을 저장하면 el 언어로만 출력할 수 있다 ${msg }<br>

<c:set var="age">30</c:set>
${age }<br>

<c:set var="add" value="${1+2 }"/>
${add } value에서 계산이 가능하다 <br>

<c:set var="a" value="${1>2 }"/>
${a } 논리연산자도 가능하다<br>

<c:set var="m" value="<%=new test1.MemberBean() %>"/>
<c:set target="${m }" property="name" value="jin"/>
<c:set target="${m }" property="userid" value="name"/>
${m }<br>


</body>
</html>