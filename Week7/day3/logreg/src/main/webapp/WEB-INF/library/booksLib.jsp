<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${library.name } Books List:</h1>
	<ul>
		<c:forEach items="${library.books }" var="oneBook">
			<li>${oneBook.title }</li>
		</c:forEach>
	</ul>

</body>
</html>