<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libraries</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>


	<div class="container">
	<a href="/home">Home</a>
		<h1>Library List 🏢</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>name</th>
					<th>location</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${libList }" var="oneLib">
					<tr>
						<td><c:out value="${oneLib.id}" /></td>
						<td><c:out value="${oneLib.name}" /></td>
						<td><c:out value="${oneLib.location}" /></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<h1>New Library</h1>

		<form:form action="/library/new" method="post"
			modelAttribute="library">
			<form:errors class="text-danger" path="*" />
			<p>
				<form:label path="name">Name</form:label>
				<form:input path="name" />
			</p>
			<p>
				<form:label path="location">Location</form:label>
				<form:input path="location" />
			</p>

			<input type="submit" value="Submit" />
		</form:form>

	</div>

</body>
</html>