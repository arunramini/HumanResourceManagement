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

	<c:url var="addAction" value="/saveWife"></c:url>


	<form:form action="${addAction}" modelAttribute="wife">

		<div>
			<table align="center">

				<form:hidden path="id" />
				<tr>
					<td>Name</td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td>lastName</td>
					<td><form:input path="lastName" /></td>
				</tr>

				<tr>
					<td>Hobby</td>
					<td><form:input path="instructorDetailId.hobby" /></td>
				</tr>
				<tr>
					<td>YoutubeChannel</td>
					<td><form:input path="instructorDetailId.youtubeChannel" /></td>
				</tr>
				

				<tr>
					<td><input type="submit" /></td>

				</tr>
			</table>

		</div>
	</form:form>
</body>
</html>