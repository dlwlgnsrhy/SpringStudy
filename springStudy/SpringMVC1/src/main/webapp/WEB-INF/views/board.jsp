<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="jumbotron">
		<h1>빅데이터 23차 게시판</h1>
		<p>bootstrap을 사용하여 간단하게 게시판을 만들어보자</p>
	</div>
	<!-- WEB-INF안에 속하기 때문에  ctrl +F11을 사용 불가 
 Spring 은 무조건 dispatcher servlet을 통해야한다!!
  -->
	<div class="container">
		<div class="card"></div>
		<div class="card-header">게시판 연습</div>
		<div class="card-body">
			<table class="table table-bordered table-hover" border="1">
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>작성일</td>
				</tr>
				<c:forEach items="${list}" var="board">
					<tr>
						<td>${board.idx}</td>
						<td>${board.title}</td>
						<td>${board.writer}</td>
						<td>${board.indate}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>