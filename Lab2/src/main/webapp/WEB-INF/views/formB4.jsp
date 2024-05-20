<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <form action="/product/saveB4" method="post">
        <label for="name">Product Name:</label>
        <input id="name" name="name" type="text" required value="${product.name}">
        <label for="price">Product Price:</label>
        <input id="Price" name="price" type="number" step="0.01" required value="${product.price}">
        <button type="submit">Save</button>
    </form>
    <ul>
        <h2>Product detail:</h2>
        <li>${product.name}</li>
        <li>${product.price}</li>
    </ul>
    <ul>
        <h2>Product List</h2>
        <ul>
            <c:forEach var="item" items="${products}" varStatus="status">
                <li>Product Name: ${item.name}</li>
                <li>Product Price: ${item.price}</li>
                <li><a href="/product/edit?index=${status.index}">Edit</a></li>
            </c:forEach>
        </ul>
    </ul>
</body>
</html>