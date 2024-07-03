<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
	<h1>New Book</h1>
	<form:form action="/books" method="post" modelAttribute="book">
		<form:errors class="text-danger" path="*" />
		<p>
			<form:label path="title">Title</form:label>
			<form:input path="title" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:textarea path="description" />
		</p>
		<p>
			<form:label path="language">Language</form:label>
			<form:input path="language" />
		</p>
		<p>
			<form:label path="numberOfPages">Pages</form:label>
			<form:input type="number" path="numberOfPages" />
		</p>
		<p>
			<form:select path="library">
			<c:forEach items="${libList }" var="oneLib">
			
			<form:option value="${oneLib.id }">${oneLib.name }</form:option>
			
			</c:forEach>

			</form:select>
		</p>  
    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>