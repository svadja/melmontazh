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
		<form:form modelAttribute="contact">
			<label for="nameInput">Name: </label>
			<form:input path="name" id="nameInput" />
			<br />

			<label for="aboutInput">About: </label>
			<form:input path="about" id="aboutInput" />
			<br />

			<label for="addressInput">Adress: </label>
			<form:input path="address" id="addressInput" />
			<br />

			<label for="phoneInput">Phone: </label>
			<form:input path="phone" id="phoneInput" />
			<br />

			<label for="imgInput">Image: </label>
			<form:input path="img" id="imgInput" />
			<br />


			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>