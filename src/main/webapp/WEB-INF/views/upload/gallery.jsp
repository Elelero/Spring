<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>UploadGallery</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	
	<script type="text/javaScript">
		window.onload = funtion() {
			var deleteButtons = document.querySelectorAll(".delete");
			
			for(var i=0; i<deleteButtons.length; i++){
				if(confirm("파일을 삭제하시겠습니까?")) {
					return true;
				} else {
					return false;
				}
			}
		}
	</script>
	
	<body>
		<c:url var="actionURL" value='/upload/updatedir'/>
		<form action="${actionURL}" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<th>ID</th>
					<td>경로</td>
					<td>이미지</td>
					<td>크기</td>
					<td>유형</td>
					<td>날짜</td>
					<td>삭제</td>
				</tr>
				
				<c:forEach var="file" items="${fileList}">
					<tr>
						<td>
							<input type="checkbox" name="fileIds" value="${file.fileId}">${file.fileId}
						</td>
						<td>${file.directoryName}</td>
						<td>
							<c:set var="len" value="${fn:length(file.fileName)}"/>
							<c:set var="filetype" value="${fn:toUpperCase(fn:substring(file.fileName, len-4, len))}"/>
							<c:if test="${(filetype eq '.JPG') or (filetype eq '.JPEG') or (filetype eq '.PNG') or (filetype eq '.GIF')}">
								<img src='<c:url value="/img/${file.fileId}"/>' width="100">
							</c:if>
						</td>
						<td>
							<fmt:formatNumber value="${file.fileSize/1024}" pattern="#,###"/>KB
						</td>
						<td>${file.fileContentType}</td>
						<td>${file.fileUploadDate}</td>
						<td>
							<c:url var="deletelink" value="/upload/delete/${file.fileId}"/>
							<a class="btn btn-warning delete" href="${deletelink}">삭제</a>
						</td>
					</tr>				
				</c:forEach>
			</table>
			
			선택한 파일을 <select name="directoryName">
				<option value="/">/
				<option value="/images">/이미지
				<option value="/data">/자료실
				<option value="/bigdata">/빅데이터
				<option value="/common">/공통
			</select>로 <input type="submit" value="이동"> <br>
			
			<a class="btn btn-warning" href='<c:url value="/upload/new"/>'>업로드</a>
			<a class="btn btn-warning" href='<c:url value="/upload/"/>'>처음으로</a>
			
		</form>
	</body>
</html>