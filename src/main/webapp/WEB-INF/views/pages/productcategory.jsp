<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/
bootstrap.min.css">
<title>Category</title>
</head>
<body>
	<form:form name="addForm" modelAttribute="productCategory"
		action="${pageContext.request.contextPath}/adminpanel/addcategory"
		class="form-horizontal" method="post">
		<fieldset>
			<legend>Add New Category</legend>
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="name"><spring:message
						code="addProduct.form.categoryName.label" /></label>
				<form:input id="name" path="name" type="text"
					class="form:input-large" />
			</div>
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit" id="btnAdd" class="btn btn-primary"
						value="Add" />
				</div>
			</div>
		</fieldset>
	</form:form>
</body>
</html>