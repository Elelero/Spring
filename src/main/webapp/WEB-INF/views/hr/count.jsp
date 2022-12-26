<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
		<!-- 방법1 -->
		<h1>사원의 수는 ${count}</h1>
		<a href="<c:url value='/hr/insert'/>">사원 정보 입력하기</a>
		
		<!-- 방법2 -->
<%-- 		<c:url var="insertURI" value="/hr/insert"/> --%>
<%-- 		<a href="${insertURI}">사원정보 입력하기</a> --%>
	</body>
</html>