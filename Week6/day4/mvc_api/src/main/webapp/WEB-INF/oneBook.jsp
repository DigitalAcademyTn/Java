<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>title:  ${thisBook.title }</p>
<p>description:  ${thisBook.description }</p>
<p># of pages:  ${thisBook.numberOfPages }</p>
<p>language:  ${thisBook.language }</p>

</body>
</html>