<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
<style type="text/css">
	table {width: 700px; border-collapse: collapse; margin-bottom: 20px} 
	table tr { height: 30px; border-bottom: 1px solid #eee;}
</style>
<script type="text/javascript">
	function open_zip() {
		//우편번호 검색 클릭 시 zip.jsp 페이지를 띄운다.
		//검색 결과 없이 창만 띄우면 n, 검색 결과가 있으면 y
		url = "zip.jsp?search=n";
		window.open(url, "ZipCodeSearch", "width=500,height=300,scrollbars=yes");
	}
</script>
</head>
<body>

<h1>프로젝트 첫 페이지</h1>
<p>id를 입력하고 [중복확인]버튼을 클릭하면 새로운 창이뜨면서 처리된다.</p>

<!-- 우편번호 찾기 
	검색 버튼 클릭 시 open_zip()함수를 호출해서 zip.jsp 파일을 띄운다
-->
<form name="zipFrm" method="post">
<table>
	<tr>
		<td>우편번호</td>
		<td>
			<input name="zipcode" size="5" readonly>
			<input type="button" value="우편번호검색" onclick="open_zip()">
		</td>
	</tr>
	<tr>
		<td>주소</td>
		<td>
			<input name="address" size="50" readonly>
		</td>
	</tr>
</table>
</form>
<!-- 우편번호 찾기 끝 -->

</body>
</html>