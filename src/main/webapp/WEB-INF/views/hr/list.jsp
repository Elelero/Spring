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
		<h1 class="mb-3 text-white font-weight-bold">[사원 목록]</h1>
		<a class="btn btn-warning mb-3" href="./insert" class="btn btn-warning">신규 사원 정보 입력</a>
		<table class="table table-dark table-striped">
		    <thead>
		      <tr>
		        <th>Employee_ID</th>
		        <th>FIRST_NAME</th>
		        <th>LAST_NAME</th>
		        <th>EMAIL</th>
		        <th>PHONE_NUMBER</th>
		        <th>HIRE_DATE</th>
		        <th>JOB_ID</th>
		        <th>SALARY</th>
		        <th>COMMISSION_PCT</th>
		        <th>MANAGER_ID</th>
		        <th>DEPARTMENT_ID</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="emp" items="${empList}">
		      	<tr>
		        	<td><a class="btn btn-outline-secondary" href="./${emp.employeeId}">${emp.employeeId}</a></td>
		        	<td>${emp.firstName}</td>
		        	<td>${emp.lastName}</td>
		        	<td>${emp.email}</td>
		        	<td>${emp.phoneNumber}</td>
		        	<td>${emp.hireDate}</td>
		        	<td>${emp.jobId}</td>
		        	<td>${emp.salary}</td>
		        	<td>${emp.commissionPct}</td>
		        	<td>${emp.managerId}</td>
		        	<td>${emp.departmentId}</td>
				</tr>		      
		      </c:forEach>
		    </tbody>
		</table>
	</body>
</html>