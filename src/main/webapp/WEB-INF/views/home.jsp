<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>phone</th>
			<th>city</th>
			<th>postal</th>
			<th>state</th>
			<th>Action</th>
			<th>Action</th>
			<c:forEach var="customer" items="${listEmployee}">
				<tr>
					<td>${customer.name}</td>
					<td>${customer.email}</td>
					<td>${customer.phone}</td>
					<td>${customer.city}</td>
					<td>${customer.postal}</td>
					<td>${customer.state}</td>
				<td><a href="editEmployee/${customer.custId}">Edit</a>
				<td><a href="removeEmployee/${customer.custId}">Delete</a>
				</tr>

			</c:forEach>
		</table>
	</div>
</body>
</html>