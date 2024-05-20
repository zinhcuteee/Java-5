<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<style>
.container {
	width: 300px;
	margin: 0 auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.form-group {
	margin-bottom: 15px;
}

.form-control {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

.btn {
	display: block;
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

.btn:hover {
	background-color: #0056b3;
}
</style>
<body>
	<div class="container">
		<h2>Login</h2>
		<form action="home" method="post">
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					class="form-control" id="username" name="username"
					placeholder="Enter username" required>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" name="password"
					placeholder="Enter password" required>
			</div>
			<button type="submit" class="btn btn-primary">Login</button>
		</form>
		<p>
			Tên đăng nhập: <span id="user">${user}</span>
		</p>
		<p>
			Mật khẩu: <span id="pass">${pass}</span>
		</p>
	</div>
</body>
</html>