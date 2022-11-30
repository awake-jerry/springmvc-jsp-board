<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">글 작성</h2>
		<div>
			<form method="post" action="writeOk">
				<table class="table table-boardered table table-hover">
					<tr>
						<td>작성자</td>
						<td><input type="text" name="name" /></td>
					</tr>
					<tr>
						<td>제목</td>
						<td><input type="text" name="subject" /></td>
					</tr>
					<tr>
						<td colspan="2">내용</td>
					</tr>
					<tr>
						<td colspan="2">
							<textarea rows="10" cols="150" name="content"></textarea>
						</td>
					</tr>
					
					<tr>
						<td colspan="2">
							<input type="submit" value="등록" />
						</td>
				</table>
			</form>
			
			<button onClick="location.href = '/board/list'">목록으로</button>
		</div>
	</div>
</body>
</html>