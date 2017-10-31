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
	href='<spring:url value="/assets/css/formcategory.css"></spring:url>'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand"
					href='<spring:url value="/admin/home"></spring:url>'>GoGo</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a
					href='<c:url value="/adminpanel"></c:url>'>Home</a></li>
				<li><a href='<spring:url value="/adminpanel/stock"></spring:url>'>Products</a></li>
				<li><a href='<spring:url value="/adminpanel/"></spring:url>'>Users</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button"> Add Category<span
						class="caret"></span>
				</a>
					<div class="dropdown-menu" id="formLogin">
						<div class="row">
							<div class="container-fluid">
								<form action='<spring:url value="/adminpanel/addcategory"></spring:url>' method="post">
									<div class="form-group">
										<label class="control-label col-lg-2" for="id"><spring:message
												code="addProduct.form.productId.label" /></label> <input
											id="categoryName" type="text" name="categoryName"
											class="form:input-large" />
									</div>
									<button type="submit" id="btnLogin"
										class="btn btn-success btn-sm">Add</button>
								</form>
							</div>
						</div>
					</div></li>
			</ul>
			<button class="btn btn-info navbar-btn">Logout</button>
		</div>
	</nav>
</body>
</html>