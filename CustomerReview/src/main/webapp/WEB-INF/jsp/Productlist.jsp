<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Product Review service</h1>
	<div>
		<table border="1" cellpadding="2" cellspacing="2">
			<tr>
				<th scope="col">Customer_Id</th>
				<th scope="col">Product Name</th>
				<th scope="col">Payment method</th>
				<th scope="col">Product Review</th>
			</tr>
			<c:forEach var="Shopping" items="${shopping }">
				<tr>
					<td>${Shopping.customerId}</td>
					<td>${Shopping.product}</td>
					<td>${Shopping.paymentMethod}</td>
					<td>${Shopping.product_review}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>