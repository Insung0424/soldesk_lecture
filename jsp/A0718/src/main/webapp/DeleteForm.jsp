<%@page import="member.BoardBean"%>
<%@page import="member.BoardBeanDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DeleteForm</title>
</head>
<body>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	BoardBeanDAO bdao = new BoardBeanDAO();
	BoardBean b = bdao.oneupdateBoard(num);
%>
<h2>게시글 삭제</h2>
<form action="DeleteProc.jsp" method="post">
	<table width="600" border="1" bordercolor="yellow" bgcolor="pink">
		<tr height="40">
			<td width="150" align="center">작성자</td>
			<td width="150"><%=b.getWriter() %></td>
			<td width="150" align="center">작성일</td>
			<td width="150"><%=b.getReg_date() %></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">제목</td>
			<td width="450" align="center"><%=b.getSubject() %>
			</td>
		</tr>
		<tr height="40">
			<td width="150" align="center">비밀번호</td>
			<td width="450" colspan="3">&nbsp;
				<input type="password" name="password" value="<%=b.getPassword() %>">
			</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
			<input type="hidden" name="num" value="<%=num %>">
			<input type="submit" value="삭제">&nbsp;
			<input type="button" value="전체글보기" onclick="location.href='BoardList.jsp'">
			</td> 
		</tr>
	</table>
</form>

</body>
</html>