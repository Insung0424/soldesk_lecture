<%@page import="member.BoardBean"%>
<%@page import="member.BoardBeanDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardIn</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardBeanDAO bdao = new BoardBeanDAO();
		BoardBean board = bdao.oneBoard(num);
	%>
	
<table width="600" border="1" bgcolor="pink">
	<tr height="40">
		<td width="150" align="center">번호</td>
		<td width="150" align="center"><%=board.getNum() %></td>
		<td width="150" align="center">작성자</td>
		<td width="150" align="center"><%=board.getWriter() %></td>
	</tr>
	<tr height="40">
		<td width="150" align="center">작성날짜</td>
		<td width="150" align="center"><%=board.getReg_date() %></td>
		<td width="150" align="center">조회수</td>
		<td width="150" align="center"><%=board.getReadcount() %></td>
	</tr>
	<tr height="40">
		<td width="150" align="center" colspan="2">제목</td>
		<td width="150" align="center" colspan="2"><%=board.getSubject() %></td>
	</tr>
	<tr height="40">
		<td width="150" align="center" colspan="2">글내용</td>
		<td width="150" align="center" colspan="2"><%=board.getContent() %></td>
	</tr>
	<tr>
		<td colspan="4">
		<input type="button" value="댓글쓰기" 
		onclick="location.href='ReWriteForm.jsp?num=<%=board.getNum()%>&ref=<%=board.getRef() %>&re_level=<%=board.getRe_level() %>&re_step=<%=board.getRe_step() %>'">
		<input type="button" value="수정" onclick="location.href='UpdateForm.jsp?num=<%=board.getNum() %>'">
		<input type="button" value="삭제" onclick="location.href='DeleteForm.jsp?num=<%=board.getNum() %>'">
		
		<input type="button" value="목록" onclick="location.href='BoardList.jsp'">
		</td>
	</tr>
</table>


</body>
</html>