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
<spring:url value="/resources/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />

</head>
<body>
	<c:url var="addAction" value="/saveCustomer"></c:url>


	<form:form action="${addAction}" modelAttribute="customer">

		<div id="addEmployeeDiv">
			<table align="center">

				<form:hidden path="custId" />
				<tr>
					<td>Name</td>
					<td><form:input path="name" cssClass="focus1" /></td>
				<tr>
					<td>email</td>
					<td><form:input path="email" cssClass="focus1" /></td>

				</tr>
				<tr>
					<td>password(*)</td>
					<td><form:input path="password" cssClass="focus1" /></td>

				</tr>
				<tr>
					<td>phone(*)</td>
					<td><form:input path="phone" cssClass="focus1" /></td>

				</tr>
				<tr>
					<td>city</td>
					<td><form:input path="city" cssClass="focus1" /></td>

				</tr>
				<tr>
					<td>postal</td>
					<td><form:input path="postal" cssClass="focus1" /></td>

				</tr>

				<tr>
					<td>state</td>
					<td><form:input path="state" cssClass="focus1" /></td>
				<tr>
					<td><input type="submit" /></td>

				</tr>
			</table>

		</div>
	</form:form>
	
</body>
</html>