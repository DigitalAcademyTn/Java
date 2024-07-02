<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<link rel="stylesheet" type="text/css" href="/css/styles.css">
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>

	<h3>Login</h3>
	<form action='/login' method='POST'>
	
	
		<div>
			<label>Email:</label> <input type="text" name='email'>
		</div>
		<div>
		<p class="errorMsg">${errorMsg }</p> 
		<br>
			<label>Password:</label> <input type='text' name='password'>
		</div>

		<div>
			<button>Submit</button>
		</div>

	</form>


</body>
</html>