<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Data</title>

<script type="text/javascript" src="jquery/jquery-1.11.3.js"></script>
<script type="text/javascript" src="jquery/jquery.tablesorter.js"></script>

<script type="text/javascript">
	$(function() {
		$("#tblcustomers").tablesorter();
		// or $("table").tablesorter();
		$("table thead tr").addClass("header");
		//$("table tbody tr:even").addClass("even");
		//$("table tbody tr:odd").addClass("odd");
	});
</script>

<style type="text/css">
	table{
		border-spacing: 0px;
		border-collapse: collapse;
	}
	td,th{
		padding: 5px;
		border: 1px solid blue;
	}
	th{
		background-color: blue;
		cursor: pointer;
		color:white;
	}
</style>
</head>
<body>
	<h1>customers Data</h1>
	
	<table border="1" id="tblcustomers" class="tablesorter">
		<thead>
			<tr>
				<th>Customer Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Membership Type</th>
				<th>Phone1</th>
				<th>Phone2</th>
				<th>Gender</th>
				<th>Address Line1</th>
				<th>Address Line2</th>
				<th>Landmark</th>
				<th>City</th>
				<th>Pin code</th>
				<th>Id_proof</th>
				<th>Customer Status</th>
				<th>Initial Amount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customers}" var="c">
				<tr>
					<td>${c.id}</td>
					<td>${c.firstName}</td>
					<td>${c.lastName}</td>
					<td>${c.memberType}</td>
					<td>${c.phone1}</td>
					<td>${c.phone2}</td>
					<td>${c.gender}</td>
					<td>${c.addressLine1}</td>
					<td>${c.addressLine2}</td>
					<td>${c.landmark}</td>
					<td>${c.city}</td>
					<td>${c.pincode}</td>
					<td>${c.idProof}</td>
					<td>${c.custStatus}</td>
					<td>${c.initialAmount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>