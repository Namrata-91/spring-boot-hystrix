<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Customer Information</h1>
	<div>
		<table border="1" cellpadding="2" cellspacing="2">
			<tr>
				<th scope="col">Customer_Id</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Address</th>
			</tr>
			<c:forEach var="Customer" items="${data}">
				<tr>
					<td>${Customer.id}</td>
					<td>${Customer.name}</td>
					<td>${Customer.email}</td>
					<td>${Customer.address}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>









