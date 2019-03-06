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

	<c:url var="addAction" value="/saveForm"></c:url>


	<form:form action="${addAction}" modelAttribute="UserTable">

		<div>
			<table align="center">

				<form:hidden path="id" />
				
				
				<tr>
					<td>First Name</td>
					<td><form:input path="customerAustrailaId.firstName" /></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><form:input path="customerAustrailaId.lastName" /></td>
				</tr>

				<tr>
					<td>CompanyName</td>
					<td><form:input path="customerAustrailaId.CompanyName" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><form:input path="customerAustrailaId.address" /></td>
				</tr>

				<tr>
					<td>City</td>
					<td><form:input path="customerAustrailaId.City" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><form:input path="customerAustrailaId.country" /></td>
				</tr>
				<tr>
					<td>Postal</td>
					<td><form:input path="customerAustrailaId.postal" /></td>
				</tr>
				<tr>
					<td>Phone1</td>
					<td><form:input path="customerAustrailaId.phone1" /></td>
				</tr>
				<tr>
					<td>Phone2</td>
					<td><form:input path="customerAustrailaId.phone2" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="customerAustrailaId.email" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password"  path="password" /></td>
				</tr>

				<tr>
					<td>Role</td>
					<td><form:input path="role" /></td>
				</tr>
				
				<tr>
					<td>Web</td>
					<td><form:input path="customerAustrailaId.web" /></td>
				</tr>

                </br>
				
				<tr>
				  
					<td><input type="submit" value="submit" /></td>
				</tr>
			</table>

		</div>
	</form:form>


</body>
</html>