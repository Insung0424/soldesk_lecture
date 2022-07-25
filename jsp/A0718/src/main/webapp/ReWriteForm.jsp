<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ReWriteForm</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("num"));
	int ref = Integer.parseInt(request.getParameter("ref"));
	int re_step = Integer.parseInt(request.getParameter("re_step"));
	int re_level = Integer.parseInt(request.getParameter("re_level"));
%>
<form action="ReWriteProc.jsp" method="post">
<table width="600" border="1" bordercolor="yellow" bgcolor="pink">
		<tr height="40">
			<td width="150" align="center">작성자</td>
			<td width="450"><input type="text" name="writer" size="50" /></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">제목</td>
			<td width="450"><input type="text" name="subject" size="50" /></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">이메일</td>
			<td width="450"><input type="email" name="email" size="50" /></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">비밀번호</td>
			<td width="450"><input type="password" name="password" size="50" /></td>
		</tr>
		<tr height="40">
			<td width="150" align="center">글내용</td>
			<td width="450"><textarea rows="10" cols="50" name="content"></textarea></td>
		</tr>
		<tr height="40">
			<td align="center" colspan="2">
				<input type="hidden" name="ref" value="<%=ref %>">
				<input type="hidden" name="re_step" value="<%=re_step %>">
				<input type="hidden" name="re_level" value="<%=re_level %>">
				<input type="submit" value="작성완료">
				<input type="reset" value="취소">
				<input type="button" value="글목록" onclick="location.href='BoardList.jsp'">
			</td>
		</tr>
</table>	
</form>

</body>
</html>