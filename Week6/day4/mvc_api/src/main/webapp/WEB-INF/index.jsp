<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Books List 📖📖📖</h1>
<c:forEach items="${booksList }" var="oneBook">
<p>title:  <a href="/book/${oneBook.id}">${oneBook.title}</a> </p>

</c:forEach>



</body>
</html>