<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src='https://www.google.com/recaptcha/api.js'></script>
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServlet" method="post">

		Username: <input type="text" name="user"> <br> Password:<input
			type="password" name="pwd"> <br>
		<div class="g-recaptcha"
			data-sitekey="6LdtzW0UAAAAAKLQeKo5DALTFXPA7VtGQK-B6zbu"></div>
		<br> <input type="submit" value="Login">
	</form>
</body>
</html>