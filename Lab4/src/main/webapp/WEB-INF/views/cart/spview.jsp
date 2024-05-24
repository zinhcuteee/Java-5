<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page Products</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.tn {
	color: #650000;
	position: relative;
	bottom: 13px;
	right: 14px;
	background-color: #39c8c2ba;
}
</style>
</head>
<body>

	<h1 style="margin-left: 64px;">Scam Shop</h1>

	<div class="wrapper">
		<div class="container">
			<div class="row g-1">
				<c:forEach var="item" items="${items}">
					<div class="col-md-3">
						<div class="card p-3" style="height: 392px;">
							<div class="text-center" style="height: 202px;">
								<img src="/hinh/${item.img}" width="200">

							</div>
							<div class="product-details">
								<span class="font-weight-bold d-block">$ ${item.price}</span> <span>${item.name}</span>
								<div class="buttons d-flex flex-row">
									<a href="/cart/add/${item.id}"
										class="btn btn-success cart-button btn-block">Add to cart</a>
								</div>
								<div class="weight">
									<small>Made in Vietnam</small>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
				<a href="/cart/view"
					style="text-decoration: none; margin-top: 51px; text-align: center; color: orangered;">
					<div class="gio">
						<span class="badge tn">${count}</span>
						<div style="margin-top: 8px;">Giỏ Hàng</div>
					</div>
				</a>
			</div>
		</div>
	</div>

</body>
</html>
