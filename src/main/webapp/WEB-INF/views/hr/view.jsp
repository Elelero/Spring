<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
		<h1 class="mb-3 text-white font-weight-bold">[사원 상세조회]</h1>
		  <table class="table table-dark table-striped">
		      <tr>
		        <th>EMPLOYEE_ID</th>
		        <td>${emp.employeeId}</td>
		      </tr>
		      <tr>
		        <th>FIRST_NAME</th>
		        <td>${emp.firstName}</td>
		      </tr>
		      <tr>
		        <th>LAST_NAME</th>
		        <td>${emp.lastName}</td>
		      </tr>
		      <tr>
		        <th>EMAIL</th>
		        <td>${emp.email}</td>
		      </tr>
		      <tr>
		        <th>PHONE_NUMBER</th>
		        <td>${emp.phoneNumber}</td>
		      </tr>
		      <tr>
		        <th>HIRE_DATE</th>
		        <td>${emp.hireDate}</td>
		      </tr>
		      <tr>
		        <th>JOB_ID</th>
		        <td>${emp.jobId}</td>
		      </tr>
		      <tr>
		        <th>SALARY</th>
		        <td>${emp.salary}</td>
		      </tr>
		      <tr>
		        <th>COMMISSION_PCT</th>
		        <td>${emp.commissionPct}</td>
		      </tr>
		      <tr>
		        <th>MANAGER_ID</th>
		        <td>${emp.managerId}</td>
		      </tr>
		      <tr>
		        <th>DEPARTMENT_ID</th>
		        <td>${emp.departmentId}</td>
		      </tr>
		  </table>
		  <a class="btn btn-warning" href="update?empid=${emp.employeeId}">수정하기</a>
		  <a class="btn btn-danger" href="delete?empid=${emp.employeeId}">삭제하기</a>
	</body>
</html>