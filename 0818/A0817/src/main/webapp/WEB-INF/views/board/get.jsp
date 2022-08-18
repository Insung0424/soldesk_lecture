<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">게시글</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">게시글</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<form>
					<div class="form-group">
						<label>번호</label> <input class="form-control" name="bnum" readonly="readonly" value="${board.bnum }">
					</div>
				
					<div class="form-group">
						<label>제목</label> <input class="form-control" name="title" readonly="readonly" value="${board.title }">
					</div>
					<div class="form-group">
						<label>내용</label>
						<textarea rows="5" cols="30" name="content" class="form-control" readonly="readonly">
						<c:out value="${board.content }"/>
						</textarea>
					</div>
					<div class="form-group">
						<label>글쓴이</label> <input class="form-control" name="writer" readonly="readonly" value="${board.writer }"/>
					</div>
					<button data-oper="list" class="btn btn-default">글목록</button>
					<button data-oper="modify" class="btn btn-default">수정하기</button>
					<button data-oper="delete" class="btn btn-default">글삭제</button>
				</form>
			</div>
		</div>
	</div>
</div>
<script>
$(document).ready(function(){
	var formObj = $("form");
	$('button').on("click",function(e){
		e.preventDefault();
		var oper = $(this).data("oper");
		if(oper=== 'delete'){
			formObj.attr("action","/board/delete").attr("method","post");
		}
		else if(oper==='list'){
			self.location="/board/list";
			return;
		}
		else if(oper==='modify'){
			self.location="/board/modify?bnum=${board.bnum}";
			return;
		}
		formObj.submit();
	})
})
</script>
<%@include file="../includes/footer.jsp"%>