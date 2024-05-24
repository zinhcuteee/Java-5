<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h2>Login</h2>
	<form action="${pageContext.request.contextPath}/account/login"
		method="post" enctype="multipart/form-data">
		<label for="username">Username:</label><br> <input type="text"
			id="username" name="username"><br> <label for="password">Password:</label><br>
		<input type="password" id="password" name="password"><br>
		<label for="attach">Attach:</label><br> <input type="file"
			id="attach" name="attach"><br> <input type="checkbox"
			name="remember" value="true">Remember me <input type="submit"
			value="Login">
	</form>
</body>
</html>
