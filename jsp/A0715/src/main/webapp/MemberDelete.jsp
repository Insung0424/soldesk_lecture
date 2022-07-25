<%@page import="bean.MemberBean"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	MemberDAO mdao = new MemberDAO();
	MemberBean member = mdao.oneMember(id);
%>
<center>
<h2>회원삭제</h2>
<table width="400" border="1">
	<form action="DeleteProc.jsp" method="get">
		<tr height="50">
		<td width="" align="center">아이디</td>
		<td width="250"><%=request.getParameter("id") %></td>
		</tr>
		
		<tr height="50">
		<td width="" align="center">비밀번호</td>
		<td width="250"><input type="password" name="pass1"></td>
		</tr>
		
		<tr height="50">
		<td colspan="2" align="center">
		<input type="hidden" name="id" value="<%=request.getParameter("id") %>">
		<input type="submit" value="회원삭제">
	</form>
		<button onclick="location.href='MemberArray.jsp'">회원목록</button>
		</td>
		</tr>
</table>
</center>
</body>
</html>