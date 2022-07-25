<%@page import="member.BoardBean"%>
<%@page import="member.BoardBeanDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateForm</title>
</head>
<body>
<h2>게시글 수정</h2>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	BoardBeanDAO bdao = new BoardBeanDAO();
	BoardBean board = bdao.oneupdateBoard(num);
%>
<form action="UpdateProc.jsp" method="post">
	<table width="600" border="1" bordercolor="yellow" bgcolor="pink">
		<tr height="40">
			<td width="150" align="center">작성자</td>
			<td width="150"><%=board.getWriter() %></td>
			<td width="150" align="center">작성일</td>
			<td width="150"><%=board.getReg_date() %></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">제목</td>
			<td width="450" colspan="3">&nbsp;
				<input type="text" name="subject" value="<%=board.getSubject() %>">
			</td>
		</tr>
		<tr height="40">
			<td width="150" align="center">글내용</td>
			<td width="450" colspan="3">&nbsp;
				<textarea rows="10" cols="50" name="content">
				<%=board.getContent() %></textarea>
			</td>
		</tr>
		<tr height="40">
			<td width="150" align="center">비밀번호</td>
			<td width="450" colspan="3">&nbsp;
				<input type="password" name="password" value="<%=board.getPassword() %>">
			</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
			<input type="hidden" name="num" value="<%=board.getNum() %>">
			<input type="submit" value="글수정">&nbsp;
			<input type="button" value="전체글보기" onclick="location.href='BoardList.jsp'">
			</td> 
		</tr>
	</table>
</form>
</body>
</html>