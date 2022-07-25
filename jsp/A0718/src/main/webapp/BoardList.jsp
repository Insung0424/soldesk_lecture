<%@page import="member.BoardBean"%>
<%@page import="java.util.Vector"%>
<%@page import="member.BoardBeanDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>
</head>
<body>
	<h2>전체 게시글</h2>
	<% 
		int pageSize=10; // 해당페이지에서 나올 글의 최대 개수
	
		String pageNum = request.getParameter("pageNum");
		
		if(pageNum==null){
			pageNum="1";
		}
		int count = 0; // 글의 전체 개수
		int number = 0;  // 해당 페이지에서 시작될 글의 번호
		
		BoardBeanDAO bdao = new BoardBeanDAO();
		count = bdao.getAllCount();
		//전체 게시글을 읽어오는 메소드
		
		int currentPage = Integer.parseInt(pageNum);
		//현재 페이지의 번호
		
		int startRow = (currentPage-1)*pageSize+1; 
		//시작번호			(2-1)*10+1
		int endRow = currentPage*pageSize;
		//끝번호			(2*10)
		Vector<BoardBean> vec = bdao.allBoard(startRow, endRow);
	
		number = count - (currentPage - 1) * pageSize;
	%>
<table width="800" border="1" bgcolor="pink">
	<tr height="40">
		<td width="50" align="center">번호</td>
		<td width="420" align="center">제목</td>
		<td width="100" align="center">작성자</td>
		<td width="150" align="center">작성날짜</td>
		<td width="80" align="center">조회수</td>
	</tr>
	<%
		for(int i=0;i<vec.size();i++){
			BoardBean board = vec.get(i);
			%>
			<tr height="40">
			<td width="50" align="center"><%=number--%></td>
			<td width="420" align="center">
			<a href="BoardIn.jsp?num=<%=board.getNum() %>" style="text-decoration:none">
			<%
				if(board.getRe_step()>1){
					for(int j=0;j<(board.getRe_step()-1)*5;j++){
						%>
							&nbsp;
						<%
					}
				}
			%><%=board.getSubject() %></a></td>
			<td width="100" align="center"><%=board.getWriter() %></td>
			<td width="150" align="center"><%=board.getReg_date() %></td>
			<td width="80" align="center"><%=board.getReadcount() %></td>
			</tr>
			<%
		}
	%>
	<tr height="40">
		<td align="center" colspan="5">
		<input type="button" value="글작성" onclick="location.href='BoardForm.jsp'">
		</td>
	</tr>

</table>

<%
	if(count>0){
		//총 페이지 수
		int pageCount=count/pageSize + (count % pageSize == 0 ? 0:1);
		
		//시작페이지 설정
		int startPage = 1;
		if(currentPage % 10 != 0){
			startPage = (int)(currentPage/10) * 10 + 1;
		}
		else{
			startPage = ((int)(currentPage/10)-1) * 10 + 1;
		}
		
		int pageBlock=10; // 페이지 번호 10개 단위 끊기
		int endPage=startPage + pageBlock - 1; 
		
		if(endPage > pageCount)
			endPage=pageCount;
		
		//'이전' 하이퍼링크
		if(startPage>10){
%>
		<a href="BoardList.jsp?pageNum=<%=startPage-10 %>">[이전]</a>
<% 
		}
		for(int i=startPage;i<=endPage;i++){
%>
		<a href="BoardList.jsp?pageNum=<%=i %>">[<%=i %>]</a>
<%
		}
		//'다음' 하이퍼 링크
		if(endPage<pageCount){
%>
		<a href="BoardList.jsp?pageNum=<%=startPage+10 %>">[다음]</a>
<%
		}
	}
%>
</body>
</html>