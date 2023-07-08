<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Welcome to JSP </h1>
		<br/>
		This is template text.
		<br/>
		<!-- This is HTML comment -->
		<br/>
		<%-- This is JSP comment --%>
		<br/>
		<% int n = 0 ;
			out.print("value of n :"+(++n));
		%>
		<br/>
		<% out.print(Calendar.getInstance().getTime()); %>  <br/>
		<%= Calendar.getInstance().getTime() %>
		<br/>
		<%! int ivar ; %>
		<%= "value of ivar : "+(++ivar) %>
</body>
</html>