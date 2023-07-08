<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<jsp:useBean id="user" class="pojoclasses.User" scope="request"/>
		<jsp:useBean id="address" class="pojoclasses.Address" scope="request"/>
		<h1>Welcome <jsp:getProperty property="fname" name="user"/>
					<jsp:getProperty property="lname" name="user"/>
		</h1>
		Email : <jsp:getProperty property="email" name="user"/><br/>
		Age : <jsp:getProperty property="age" name="user"/> <br/>
		City : <jsp:getProperty property="city" name="address"/>

</body>
</html>