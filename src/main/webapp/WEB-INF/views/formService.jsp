<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<h2>Service</h2>
		<form:form modelAttribute="service">
			<label for="nameInput">Name: </label>
			<form:input path="name" id="nameInput" />
			<br />

			<label for="descriptionInput">Description: </label>
			<form:input path="description" id="descriptionInput" />
			<br />

			<label for="priceInput">Price: </label>
			<form:input path="price" id="priceInput" />
			<br />

			<label for="existenceCheckbox">Existence: </label>
			<form:checkbox path="existence" id="existenceCheckbox" />
			<br />

			<label for="imgInput">Image: </label>
			<form:input path="img" id="imgInput" />
			<br />


			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>