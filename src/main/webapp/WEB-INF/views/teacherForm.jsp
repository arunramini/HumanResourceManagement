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

	<c:url var="addAction" value="/saveTeacher"></c:url>


	<form:form action="${addAction}" modelAttribute="teacher">

		<div>
			<table align="center">

				<form:hidden path="id" />


				<tr>
					<td>First Name</td>
					<td><form:input path="first_name" /></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><form:input path="last_name" /></td>
				</tr>

				<tr>
					<td>CompanyName</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>course Name</td>
					<td>
					<form:checkbox path="course" value="Java" />Java
						<form:checkbox path="course" value="C++" />C++ 
						<form:checkbox path="course" value=".Net" />.Net
					</td>
				</tr>

				<tr>

					<td><input type="submit" value="submit" /></td>
				</tr>
			</table>

		</div>
	</form:form>


</body>
</html>