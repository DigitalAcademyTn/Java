<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>book info</title>
</head>
<body>

	<h1>
		<c:out value="${book.title }"></c:out>
	</h1>
	<ul>
		<li>Author: <c:out value="${book.author }"></c:out></li>
		<li>Language: <c:out value="${book.language }"></c:out></li>
		<li># of pages: <c:out value="${book.numberOfPages }"></c:out></li>
		<li>Description: <c:out value="${book.description }"></c:out></li>

	</ul>

</body>
</html>