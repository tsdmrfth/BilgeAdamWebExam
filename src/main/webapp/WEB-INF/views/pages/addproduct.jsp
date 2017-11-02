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
<title>Add Product</title>
</head>
<body>
	<section class="container"
		style="position: absolute-center; background-color: lightblue; align-items: center;">
		<form:errors path="*" cssClass="alert alert-danger" element="div" />
		<form:form name="addForm" modelAttribute="productToAdd"
			enctype="multipart/form-data" class="form-horizontal" method="post"
			action="${pageContext.request.contextPath}/adminpanel/addproduct">
			<fieldset>
				<legend>
					<spring:message code="addProduct.for.addNewProduct"></spring:message>
				</legend>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="name"><spring:message
							code="addProduct.form.productName.label" /></label>
					<form:input id="name" path="name" type="text"
						class="form:input-medium" />
					<form:errors path="name" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="brand"><spring:message
							code="addProduct.form.productBrand.label" /></label>
					<form:input id="brand" path="brand" type="text"
						class="form:input-medium" />
						<form:errors path="brand" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="model"><spring:message
							code="addProduct.form.productModel.label" /></label>
					<form:input id="model" path="model" type="text"
						class="form:input-medium" />
						<form:errors path="model" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="price"><spring:message
							code="addProduct.form.productPrice.label" /></label>
					<form:input id="price" path="price" type="text"
						class="form:input-medium" />
						<form:errors path="price" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productCategory"><spring:message
							code="addProduct.form.productCategory.label" /></label>
					<form:input id="productCategory" path="productCategory"
						class="form:input-medium" />
						<form:errors path="productCategory" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="producedYear"><spring:message
							code="addProduct.form.productProducedYear.label" /></label>
					<form:input id="producedYear" path="producedYear"
						class="form:input-medium" />
						<form:errors path="producedYear" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="availableStock"><spring:message
							code="addProduct.form.productAvailableStock.label" /></label>
					<form:input id="availableStock" path="availableStock"
						class="form:input-medium" />
						<form:errors path="availableStock" cssClass="text-danger" />
				</div>
			</fieldset>
			<form:form modelAttribute="productDetail" name="detailForm"
				enctype="multipart/form-data" class="form-horizontal">
				<div class="form-group">
					<label class="control-label col-lg-2" for="batteryPower"><spring:message
							code="addProduct.form.productDetailBatteryPower.label" /></label>
					<form:input id="batteryPower" path="batteryPower"
						class="form:input-medium" />
						<form:errors path="batteryPower" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="processor"><spring:message
							code="addProduct.form.productDetailProcessor.label" /></label>
					<form:input id="processor" path="processor"
						class="form:input-medium" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="weight"><spring:message
							code="addProduct.form.productDetailWeight.label" /></label>
					<form:input id="weight" path="weight" class="form:input-medium" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="color"><spring:message
							code="addProduct.form.productDetailColor.label" /></label>
					<form:input id="color" path="color" class="form:input-medium" />
					<form:errors path="color" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="storage"><spring:message
							code="addProduct.form.productDetailStorage.label" /></label>
					<form:input id="storage" path="storage" class="form:input-medium" />
					<form:errors path="storage" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="resolution"><spring:message
							code="addProduct.form.productDetailResolution.label" /></label>
					<form:input id="resolution" path="resolution"
						class="form:input-medium" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="display"><spring:message
							code="addProduct.form.productDetailDisplay.label" /></label>
					<form:input id="display" path="display" class="form:input-medium" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="ram"><spring:message
							code="addProduct.form.productDetailRam.label" /></label>
					<form:input id="ram" path="ram" class="form:input-medium" />
					<form:errors path="ram" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productImage"> <spring:message
							code="addProdcut.form.productImage.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="productImage" path="productImage" type="file"
							class="form:input-large" />
					</div>
				</div>
				<div class="col-md-2 col-md-offset-3">
					<form:button class="btn btn-success">
						<spring:message code="addProduct.form.addProductButton.label"></spring:message>
					</form:button>
				</div>
			</form:form>
		</form:form>
	</section>
</body>
</html>