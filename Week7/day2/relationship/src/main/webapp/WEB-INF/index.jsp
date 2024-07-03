<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<h1>Books List 📚</h1>
		<div class="d-flex justify-content-between">
			<a href="/book">Create New Book ➕</a>
			<a href="/library">Create New Library ➕</a>
		</div>

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>title</th>
					<th>language</th>
					<th>Library</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${booksList }" var="oneBook">
					<tr>
						<td><c:out value="${oneBook.id}" /></td>
						<td><c:out value="${oneBook.title}" /></td>
						<td><c:out value="${oneBook.language}" /></td>
						<td><a href="/library/${oneBook.library.id}"><c:out value="${oneBook.library.name}" /></a></td> 
						<td><a href="/book/${oneBook.id}/edit">edit</a> |
							<form action="/books/${book.id}/delete" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>

</body>
</html>