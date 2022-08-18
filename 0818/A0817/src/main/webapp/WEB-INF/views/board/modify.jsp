<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">수정</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">작성 글 수정</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<form>
					<div class="form-group">
						<label>번호</label> <input class="form-control" name="bnum"
							readonly="readonly" value="${board.bnum }">
					</div>

					<div class="form-group">
						<label>제목</label> <input class="form-control" name="title"
							value="${board.title }">
					</div>
					<div class="form-group">
						<label>내용</label>
						<textarea rows="5" cols="30" name="content" class="form-control">
						<c:out value="${board.content }" />
						</textarea>
					</div>
					<div class="form-group">
						<label>글쓴이</label> <input class="form-control" name="writer"
							readonly="readonly" value="${board.writer }" />
					</div>
					<button data-oper="modify" class="btn btn-default">수정</button>
					<button data-oper="del" class="btn btn-default">삭제</button>
					<button data-oper="list" class="btn btn-default">목록</button>
				</form>
			</div>
		</div>
	</div>
</div>
<script>
	$(document).ready(
			function() {
				var formObj = $("form");

				$('button').on(
						"click",
						function(e) {

							e.preventDefault(); // 버튼 기본동작 방지 

							var oper = $(this).data("oper");
							if (oper === 'del') {
								if (confirm("삭제하시겠습니까?")) {
									formObj.attr("action", "/board/delete")
											.attr("method", "post");
								}
							} else if (oper === 'list') {
								self.location = "/board/list";
								return;
							} else if (oper === 'modify') {
								formObj.attr("action", "/board/modi").attr(
										"method", "post");
							}

							formObj.submit();
						})
			})
</script>
<%@include file="../includes/footer.jsp"%>