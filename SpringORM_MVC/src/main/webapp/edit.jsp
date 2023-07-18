<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="" modelAttribute="edit_emp">
		<f:input path="empno"/> <br/>
		<f:input path="ename" /> <br/>
		<f:input path="deptno" /> <br/>
		<f:input path="sal" /> <br/>
	</f:form>
	
</body>
</html>