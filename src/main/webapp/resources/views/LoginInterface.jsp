<%@ page trimDirectiveWhitespaces="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="LoginPage" method="post">
				
			UserName <input type="text" name="username"/>
			<br></br>
			
			Password <input type="text" name="password"/>
			<br></br>
			
			<input type="submit"/>		
		</form> 
 
		
		 
<!--		
<br></br>New Registration<br></br><br></br>
	
		 <form action="RegPage" method="post">
				
			First Name <input type="text" name="firstname"/>
			<br></br>
			
			Last Name <input type="text" name="lastname"/>
			<br></br>
			
			Sur Name <input type="text" name="surname"/>
			<br></br>
			
			User Name <input type="text" name="username"/>
			<br></br>
			
			Password <input type="text" name="password"/>
			<br></br>
			
			Address <input type="text" name="address"/>
			<br></br>
			
			Contact No <input type="text" name="contactnumber"/>
			<br></br>
			<input type="submit"/>		
		</form> 
		 -->
		 <!-- The session should only be used for data that is true for the entire life of the session,
		  for example storing the name of the logged in user. --> 
</body>
</html>