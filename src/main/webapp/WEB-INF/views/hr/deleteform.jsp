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
	
	<style>
		body {
			background-color: DimGray;
		}
	</style>
	
	<body>
		<h1 class="mb-3 text-white font-weight-bold">[사원정보 삭제]</h1>
		<p class="text-warning"><b>${emp.employeeId}사원 ${emp.firstName} ${emp.lastName}</b>의 정보를 삭제합니다!</p>
		<p class="text-warning">삭제한 후, 데이터는 복구될 수 없습니다!!!!😥</p>
		<p class="text-warning"><b>${emp.employeeId}</b> 사원의 이메일을 입력하세요!😁</p>
		<form action="./delete" method="post">
		  <table class="table table-dark table-striped">
		      <tr>
		        <th>이메일: </th>
		        <td>
		        	<input type="text" name="email" />
		        	<input type="hidden" name="empid" value="${emp.employeeId}" />
		        	<input class="btn btn-danger" type="submit" value="삭제" />
		        </td>
		      </tr>
		    </table>
		  </form>
	</body>
</html>