<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class=" col-md-2 col-md-offset-9">
		<div class="row">
			<a class="btn btn-primary" href='<spring:url value="/adminpanel/addproduct"></spring:url>'>Add
				Product</a><hr/> <input type="text" id="search" class="form-control"
				onkeyup="searchFunction()" placeholder="Search by product name">
			<hr />
		</div>
	</div>
	<a href='<spring:url value="/admin/addproduct"></spring:url>'></a>
	<div class="col-md-10 col-md-offset-1">
		<table class="table table-striped table-bordered" id="productTable">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Brand</th>
					<th>Model</th>
					<th>Barcode</th>
					<th>Price</th>
					<th>Category</th>
					<th>Produced Year</th>
					<th>Available Stock</th>
					<th>Detail</th>
					<th>Edit</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.brand}</td>
						<td>${product.model}</td>
						<td>${product.barcode}</td>
						<td>${product.price}</td>
						<td>${product.productCategory.name}</td>
						<td>${product.producedYear}</td>
						<td>${product.availableStock}</td>
						<td>Detail</td>
						<td><span><a class="btn btn-primary"
								href='<spring:url value="/admin/stock/update${product.id}"></spring:url>'>
									<span class="glyphicon glyphicon-pencil"></span>
							</a></span> <span><a class="btn btn-danger"
								href='<c:url value="/admin/stock/delete/${product.id}"></c:url>'>
									<span class="glyphicon glyphicon-trash"></span>
							</a></span></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script>
		function searchFunction() {
			var input, filter, table, tr, td, i;
			input = document.getElementById("search");
			filter = input.value.toUpperCase();
			table = document.getElementById("productTable");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[1];
				if (td) {
					if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}
	</script>
</body>
</html>