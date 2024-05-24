<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart Information</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.img-fluid {
	max-width: 100%;
	height: auto;
}

.close {
	cursor: pointer;
}

.summary {
	background-color: #f8f9fa;
	padding: 20px;
	border-left: 1px solid #dee2e6;
}

.summary h5 {
	color: #343a40;
}

.summary p {
	margin-bottom: 5px;
}

.back-to-shop a {
	color: #606060;
}

.btn-checkout {
	background-color: #007bff;
	color: #fff;
	border: none;
	padding: 10px 20px;
	border-radius: 5px;
	cursor: pointer;
}

.btn-checkout:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="card container">
		<div class="row">
			<div class="col-md-8 cart">
				<div class="title">
					<div class="row">
						<div class="col">
							<h4>
								<b>Giỏ hàng</b>
							</h4>
						</div>
						<div class="col align-self-center text-right text-muted">
							${Count} Sản phẩm</div>
					</div>
				</div>
				<c:forEach var="item" items="${cart.items}">
					<form action="">
						<input type="hidden" name="id" value="${item.id}">
						<div class="row border-top border-bottom">
							<div class="col-2">
								<img class="img-fluid" src="/hinh/${item.img}">
							</div>
							<div class="col">
								<div class="row text-muted">ID: ${item.id}</div>
								<div class="row">${item.name}$ ${item.price}</div>
							</div>
							<div class="col">
								<a href="/cart/update/${item.id}/dis">-</a> <a href="#"
									class="border">${item.qty}</a> <a
									href="/cart/update/${item.id}/plus">+</a>
							</div>
							<div class="col">
								$ ${item.price * item.qty} <a href="/cart/remove/${item.id}">
									<span class="close">&#10005;</span>
								</a>
							</div>
						</div>
					</form>
				</c:forEach>
				<div class="back-to-shop">
					<a href="/item/index">&leftarrow;<span class="text-start">quay
							lại</span></a> <a href="/cart/clear" class="text-end">xóa hết</a>
				</div>

			</div>
			<div class="col-md-4 summary">
				<div>
					<h5>
						<b>Hóa đơn</b>
					</h5>
				</div>
				<div class="row">
					<div class="col row">
						<div class="col">tổng sản phẩm ${count}</div>
						<div class="col text-right">$ ${Amount}</div>
					</div>
				</div>
				<div class="col row">
					<div class="col">Phí Ship</div>
					<div class="col text-right">$ 5.0</div>
				</div>


				<div class="row"
					style="border-top: 1px solid rgba(0, 0, 0, .1); padding: 2vh 0;">

					<div class="col">Tổng tiền</div>
					<div class="col text-right">$ ${Amount+5}</div>
				</div>
				<button class="btn btn-checkout">CHECKOUT</button>
			</div>
		</div>
	</div>
</body>
</html>
