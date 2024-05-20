<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Form</h1>
	<form action="/product/saveB3" method="post">
		<label for="name">Product Name: </label>
		<input id="name" name="name" type="text" required value="${product.name}"> 
		<br> 
		<label for="price">Product Price: </label> 
		<input id="price" name="price" type="number" step="0.01" required value="${product.price}">
		<br>
		<button type="submit">Save</button>
	</form>
	<h2>Product Details:</h2>
	<ul>
		<li>Product Name: ${product.name}</li>
		<li>Product Price: ${product.price}</li>
	</ul>
</body>
</html>