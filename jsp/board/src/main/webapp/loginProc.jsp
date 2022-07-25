<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="mgr" class="DB.MemberMgr"/>
<%
	  request.setCharacterEncoding("UTF-8");
	  String cPath = request.getContextPath();
	  String id = request.getParameter("id");
	  String pass = request.getParameter("pwd");
	  String msg = "로그인에 실패함";	  
	  boolean result = mgr.loginMember(id,pass);
	  if(result){
	    session.setAttribute("idKey",id);
	    msg = "로그인 성공";
	  }
%>
<script>
	alert("<%=msg%>");
	location.href = "login.jsp";
</script>