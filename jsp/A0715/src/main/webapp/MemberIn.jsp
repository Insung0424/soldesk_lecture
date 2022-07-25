<%@page import="bean.MemberBean"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberIn</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	MemberDAO mdao = new MemberDAO();
	MemberBean member = mdao.oneMember(id);
%>
<center>
	<h2>회원정보보기</h2>
	<table width="400" border="1">
	<tr height="50">
	<td width="150" align="center">아이디</td>
	<td width="250"><%=member.getId() %></td>
	</tr>
	<tr height="50">
	<td width="150" align="center">비밀번호</td>
	<td width="250"><%=member.getPass1() %></td>
	</tr>
	<tr height="50">
	<td width="150" align="center">이메일</td>
	<td width="250"><%=member.getEmail() %></td>
	</tr>
	<tr height="50">
	<td width="150" align="center">전화번호</td>
	<td width="250"><%=member.getTel() %></td>
	</tr>
	<tr height="50">
	<td width="150" align="center">취미</td>
	<td width="250"><%=member.getHobby() %></td>
	</tr>
	<tr height="50">
	<td width="150" align="center">직업</td>
	<td width="250"><%=member.getJob() %></td>
	</tr>
	<tr height="50">
	<td width="150" align="center">나이</td>
	<td width="250"><%=member.getAge() %></td>
	</tr>
	<tr height="50">
	<td width="150" align="center">정보</td>
	<td width="250"><%=member.getInfo() %></td>
	</tr>
	<tr height="50">
	<td colspan="2" align="center">
	<button onclick="location.href='MemberUpdate.jsp?id=<%=member.getId() %>'">수정</button>
	<button onclick="location.href='MemberDelete.jsp?id=<%=member.getId() %>'">삭제</button>
	<button onclick="location.href='MemberArray.jsp'">이전화면</button>
	<button onclick="location.href='memberjoin.jsp'">첫화면</button>
	</table>
</center>
</body>
</html>