<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NCS</title>
<style>
	body label {
		display: inline-block;
		width: 150px;
	}
	body span{
		color: pink;
	}
	body .bu {
		text-align: center;
	}
</style>
<script defer src="good.js"></script>
</head>
<body>
<form name="f" action="joinServlet" method="post" onsubmit="return on()">
	<label>이름</label> <span>*</span><input type="text" name="name" required><br>
	<label>주민등록번호</label> <span>*</span><input type="number" name="hnum" required>
	- <input type="number" name="hnum2" required><br>
	<label>아이디</label> <span>*</span><input type="text" name="id" required><br>
	<label>비밀번호</label> <span>*</span><input type="password" name="pw" required><br>
	<label>비밀번호확인</label> <span>*</span><input type="password" name="pwc" required><br>
	<label>이메일</label> <input type="text" name="email"> @ 
	<input type="text" name="email2" id="email2">
	<select name="email3" id="email3"
	onchange="select()">
		<option value="naver.com">naver.com
		<option value="daum.net">daum.net
		<option value="nate.com">nate.com
	</select><br>
	<label>우편번호</label> <input type="text" name="paddr"><br>
	<label>주소</label> <input type="text" name="addr"> 
	<input type="text" name="addr2"><br>
	<label class="job">직업</label>
	<select name="job" multiple="multiple">
		<option value="student">학생
		<option value="computer">컴퓨터
		<option value="journal">언론
	</select><br>
	<label>메일/SMS 정보수신</label>
	<input type="radio" name="agree" value="agree">수신
	<input type="radio" name="agree" value="disagree">수신거부<br>
	<div class="bu">
		<input type="submit" value="회원가입">
		<input type="reset" value="취소"> 
	</div>
</form>
</body>
</html>