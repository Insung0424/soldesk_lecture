<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	public class user{
	String id;
	String pw1;
	String pw2;
	String email;
	String tel;
	String[] hobby;
	String age;
	String movie;
	String info;
	String ho="";
	
		user(String id,String pw1,
				String pw2,
				String email,
				String tel,
				String[] hobby,
				String age,
				String movie,
				String info){
			this.id=id;
			this.pw1=pw1;
			this.pw2=pw2;
			this.email=email;
			this.tel=tel;
			this.hobby=hobby;
			this.age=age;
			this.movie=movie;
			this.info=info;
		}
		
		public String getHobby(){
			for(int i=0;i<hobby.length;i++){
				ho+=hobby[i];
				ho+=" ";
			}
			return ho;
		}
		
		public String toString(){
			return id+" "+pw1
					+" "+pw2
					+" "+email
					+" "+getHobby()
					+" "+age
					+" "+movie
					+" "+info;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<style>
	
</style>
</head>
<body>


<%
	//데이터가 넘어올 때 한글이 깨지지 않기위해 인코딩해줌
	request.setCharacterEncoding("UTF-8");
	//사용자로부터 넘어온 데이터 저장
	String id = request.getParameter("id");
	String pw1 = request.getParameter("pw1");
	String pw2 = request.getParameter("pw2");
	String email = request.getParameter("em");
	String tel = request.getParameter("tel");
	String[] hobby = request.getParameterValues("ho");
	String age = request.getParameter("age");
	String movie = request.getParameter("mov");
	String info = request.getParameter("info");
	
	if(!pw1.equals(pw2)){
%>
	<script type="text/javascript">
		alert("비밀 번호가 틀립니다");
		history.go(-1); // 이전페이지로 돌아간다
	</script>	
<% 
	}	
	user u = new user(id,pw1,
			pw2,email,tel,hobby,
			age,movie,info);
%>

<%= u.toString()%>

</body>
</html>