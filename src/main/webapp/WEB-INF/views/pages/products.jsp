<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/
css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>All the available products in our store</p>
			</div>
		</div>
		<div class="pull-right" style="padding-right: 50px">
			<a href='<spring:url value="?language=en"></spring:url>'>English</a>|<a href='<spring:url value="?language=tr"></spring:url>'>Türkçe</a>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail" style="border-radius: 15px; padding: 10px;">
						<div class="caption">
							<p style="color: #A9A9A9"><strong>${product.brand}</strong></p>
							<p style="color: #A9A9A9">$${product.price}</p>
							<p style="color: #A9A9A9">
								Available <strong>${product.availableStock}</strong> units in
								stock
							</p>
							<h3>
								<a
									href='<c:url value="/products/product/${product.id}"></c:url>'>${product.name}</a>
							</h3>
							<a class="btn btn-primary"
								href='<spring:url value="/addtocart/${product.id}"></spring:url>'>Add
								to Cart <span class="glyphicon glyphicon-shopping-cart"></span>
							</a> <a class="btn btn-success"
								href='<c:url value="/buy/${product.id}"></c:url>'>Buy now! <span
								class="glyphicon glyphicon-gift"></span>
							</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>