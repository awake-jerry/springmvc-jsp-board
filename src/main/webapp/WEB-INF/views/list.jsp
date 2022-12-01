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
		<h2 class="text-center">Board</h2>
		<table class="table table-boardered table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>등록일</th>
				</tr>
			</thead>

			<tbody class="boardBody">
				<c:forEach var="board" items="${list}">
					<tr>
						<td>${board.wr_uid}</td>
						<%-- <td><a href="javascript:fn_viewCount((${board.wr_uid}) => location.href = '/board/view?wr_uid=${board.wr_uid}');">${board.subject}</a></td> --%>
						<td><a href="javascript:fn_viewCount(${board.wr_uid})">${board.subject}</a></td>
						<td>${board.name}</td>
						<td>${board.viewcnt}</td>
						<td>${board.regdate}</td>
				</c:forEach>

				<tr>
					<td colspan="5" class="text-center">
						<button onclick="location.href='/board/write'">신규등록</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
<script>
	const fn_viewCount = (wr_uid) => {
		fn_viewCountReq(wr_uid);
	}
	
	fn_viewCountReq = (wr_uid) => {
		fetch('/board/viewCount', {
			method : 'post',
			headers : {
				'Content-Type' : 'application/json'
			},
			body : JSON.stringify({
				'wr_uid': wr_uid
			})
		})
		.then(response => response.json())
		.then((data) => {
			if(data == 1) {
				
			}
		}
		.catch(err => console.log('err ::: ' + err));
	}

</script>
</body>
</html>