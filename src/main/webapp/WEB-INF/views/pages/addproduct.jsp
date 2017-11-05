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
		<form:form name="addForm" modelAttribute="formData"
			class="form-horizontal" method="post" enctype="multipart/form-data">
			<form:errors path="*" cssClass="alert alert-danger" element="div" />
			<fieldset>
				<legend>
					<spring:message code="addProduct.form.addNewProduct"></spring:message>
				</legend>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="product.name"><spring:message
							code="addProduct.form.productName.label" /></label>
					<form:input id="product.name" path="product.name" type="text"
						value="Galaxy S8 +EDGE" class="form:input-medium" />
					<form:errors path="product.name" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="product.brand"><spring:message
							code="addProduct.form.productBrand.label" /></label>
					<form:input id="product.brand" path="product.brand" type="text"
						value="Samsung" class="form:input-medium" />
					<form:errors path="product.brand" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="product.model"><spring:message
							code="addProduct.form.productModel.label" /></label>
					<form:input id="product.model" path="product.model" type="text"
						value="Galaxy S8" class="form:input-medium" />
					<form:errors path="product.model" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="product.price"><spring:message
							code="addProduct.form.productPrice.label" /></label>
					<form:input id="product.price" path="product.price" type="text"
						value="4400" class="form:input-medium" />
					<form:errors path="product.price" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="product.productCategory"><spring:message
							code="addProduct.form.productCategory.label" /></label>
					<form:input id="product.productCategory"
						path="product.productCategory" type="text" value="Phone"
						class="form:input-medium" />
					<form:errors path="product.productCategory" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="product.producedYear"><spring:message
							code="addProduct.form.productProducedYear.label" /></label>
					<form:input id="product.producedYear" path="product.producedYear"
						type="text" value="2017" class="form:input-medium" />
					<form:errors path="product.producedYear" cssClass="text-danger" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="availableStock"><spring:message
							code="addProduct.form.productAvailableStock.label" /></label>
					<form:input id="product.availableStock"
						path="product.availableStock" type="text" value="1000"
						class="form:input-medium" />
					<form:errors path="product.availableStock" cssClass="text-danger" />
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2"
						for="productDetail.batteryPower"><spring:message
							code="addProduct.form.productDetailBatteryPower.label" /></label>
					<form:input id="productDetail.batteryPower"
						path="productDetail.batteryPower" type="text" value="4400"
						class="form:input-medium" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productDetail.processor"><spring:message
							code="addProduct.form.productDetailProcessor.label" /></label>
					<form:input id="productDetail.processor"
						path="productDetail.processor" type="text" value="3"
						class="form:input-medium" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productDetail.weight"><spring:message
							code="addProduct.form.productDetailWeight.label" /></label>
					<form:input id="productDetail.weight" path="productDetail.weight"
						class="form:input-medium" type="text" value="117" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productDetail.color"><spring:message
							code="addProduct.form.productDetailColor.label" /></label>
					<form:input id="productDetail.color" path="productDetail.color"
						class="form:input-medium" type="text" value="Gray" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productDetail.storage"><spring:message
							code="addProduct.form.productDetailStorage.label" /></label>
					<form:input id="productDetail.storage" path="productDetail.storage"
						class="form:input-medium" type="text" value="64" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2"
						for="productDetail.resolution"><spring:message
							code="addProduct.form.productDetailResolution.label" /></label>
					<form:input id="productDetail.resolution"
						path="productDetail.resolution" type="text" value="687"
						class="form:input-medium" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productDetail.display"><spring:message
							code="addProduct.form.productDetailDisplay.label" /></label>
					<form:input id="productDetail.display" path="productDetail.display"
						class="form:input-medium" type="text" value="7" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="productDetail.ram"><spring:message
							code="addProduct.form.productDetailRam.label" /></label>
					<form:input id="productDetail.ram" path="productDetail.ram"
						class="form:input-medium" type="text" value="8" />
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2"
						for="productDetail.productImage"> <spring:message
							code="addProdcut.form.productImage.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="productDetail.productImage"
							path="productDetail.productImage" type="file"
							class="form:input-large" />
					</div>
				</div>
				<div class="col-md-2 col-md-offset-3">
					<form:button class="btn btn-success">
						<spring:message code="addProduct.form.addProductButton.label"></spring:message>
					</form:button>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>