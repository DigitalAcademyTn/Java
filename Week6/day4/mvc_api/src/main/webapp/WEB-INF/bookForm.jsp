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

    <h3>Create new book</h3>
<form action='/create/form' method='POST'>

	<label>title:</label>
    <input type="text" name='title'><br>
    
	<label>description:</label>
    <input type='text' name='description'><br>
    
    <label>number of pages:</label>
    <input type="number" name='numberOFPage'><br>
    
    
    <label>language:</label>
    <input name='language'><br>
    
    
    <input type='submit' value='create'>
</form>


</body>
</html>