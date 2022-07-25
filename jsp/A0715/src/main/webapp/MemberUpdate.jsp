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
	<h2>수정하기</h2>
	<table width="400" border="1">
		<form action="Updateproc.jsp" method="post">
			<tr height="50">
			<td width="150" align="center">아이디</td>
			<td width="250"><%=member.getId() %></td>
			</tr>
			
			<tr height="50">
			<td width="150" align="center">이메일</td>
			<td width="250">
			<input type="email" name="email" 
			value="<%=member.getEmail() %>"></td>
			</tr>
			
			<tr height="50">
			<td width="150" align="center">전화번호</td>
			<td width="250">
			<input type="tel" name="tel" 
			value="<%=member.getTel() %>"></td>
			</tr>
			
			<tr height="50">
			<td width="150" align="center">비밀번호</td>
			<td width="250">
			<input type="password" name="pass1"></td>
			</tr>
			
			<tr height="50">
			<td colspan="2" align="center">
			<input type="hidden" name="id" value="<%=member.getId() %>">
			<input type="submit" value="정보 수정">
		</form>
			<button onclick="location.href='MemberArray.jsp'">회원목록</button>
			</td>
			</tr>
			
	</table>
</center>
</body>
</html>