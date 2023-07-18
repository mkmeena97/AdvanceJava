<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Emp data </h1>
	<table border="1" border-collapse: collapse; >
		<c:forEach var="emp" items="${emplist }">
			<tr>
				<td>EMP NO.</td>
				<td>EMP NAME</td>
				<td>JOB</td>
				<td>MANAGER</td>
				<td>HIRE DATE</td>
				<td>SALARY</td>
				<td>DEPT NO.</td>
			</tr>
			<tr>
				<td> ${emp.empno } </td>
				<td> ${emp.ename } </td>
				<td> ${emp.job } </td>
				<td> ${emp.mgr } </td>
				<td> ${emp.hiredate } </td>
				<td> ${emp.sal } </td>
				<td> ${emp.deptno } </td>
				<td> <a href="edit?empid=${emp.empno }"> edit </a></td>
				<td> <a href="delete?empid=${emp.empno }"> delete </a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="insert"> Insert new ? </a>

</body>
</html>