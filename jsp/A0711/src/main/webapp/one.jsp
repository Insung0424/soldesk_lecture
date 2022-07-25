<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One</title>
</head>
<body>
<form action="two.jsp" name="aa" onsubmit="return on()">
	숫자:<input name="num">
	<input type="submit" value="입력완료">	
</form>
	<script type="text/javascript">
	function on(){
		if(isNaN(document.aa.num.value)){
			alert("문자열을 입력함")
			return false;
		}
		else return true;
	}
	</script>
	
	
</body>
</html>