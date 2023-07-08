<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%-- create or access the bean --%>
		<jsp:useBean id="user" class="pojoclasses.User"  scope="request"  ></jsp:useBean>
		<jsp:useBean id="address" class="pojoclasses.Address"  scope="request"  ></jsp:useBean>
		
		<%-- No need to set one by one --%>
		<%-- 
		<jsp:setProperty property="uid" name="user" param="" />
		<jsp:setProperty property="pwd" name="user" param="pwd" />
		<jsp:setProperty property="fname" name="user" param="fname" />
		
		<jsp:setProperty property="lname" name="user" param="lname" />
		<jsp:setProperty property="email" name="user" param="email" />
		<jsp:setProperty property="contact" name="user" param="contact" />
		<jsp:setProperty property="age" name="user" param="age" />
		--%>
		
		<%--All the bean properties should be populated with the request parameteres having the same name as that of properties --%>
		<jsp:setProperty property="*" name="user"/>
		<jsp:setProperty property="*" name="address"/>
		
		<jsp:forward page="/displayBean.jsp"></jsp:forward>
		





</body>
</html>