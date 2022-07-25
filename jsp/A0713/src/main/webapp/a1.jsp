<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a1</title>
<script>
	function c(){
		if(q1.a1.value === ""){
			alert("공백");
			return false;
		}
		else if(isNaN(q1.a1.value)){
			alert("문자");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<form action="ans1.jsp" method="post" name="q1" onsubmit="return c()">
<input name="a1">
<input type="submit" value="확인"> 
</form>
</body>
</html>