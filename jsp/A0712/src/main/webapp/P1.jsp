<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P</title>
</head>
<body>
<script>
	function on(){
		if(aa.n.value === ""){
			alert("데이터입력");
			return false;
		}
		else if(isNaN(aa.n.value)){
			alert("문자열은 안됨");
			return false;
		}
		else{
			return true;
		}
	}
</script>
<form action="ans.jsp" name="aa" onsubmit="return on()">
	숫자 : <input type="text" name="n"/>
	<input type="submit"/>
</form> 
</body>
</html>