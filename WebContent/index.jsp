<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>Bootstrap Example</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	
	<style>
		body {
			background-image: url("hello.jpg");
		}
		
		.btn {
			width: 170px;
		}
	</style>
	
	<body>
		<div style="height:300px;"></div>
		<div style="text-align: center; justify-content: center;"><h1 class="text-danger font-weight-bold">게시판</h1></div>
		<div class="border border-5 border-danger mx-auto" style="width:200px; height:150px; text-align: center;">
			<a class="btn btn-danger mt-3" href="boardList.do">게시판 목록 보기</a> <br>
			<a class="btn btn-outline-danger mb-2" href="boardInsert.do">게시판 글 입력</a>
		</div>
	</body>
</html>