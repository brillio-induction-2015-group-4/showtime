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
		$("#tblProducts").tablesorter();
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
	<h1>Products Data</h1>
	
	<c:if test="${param.minPrice!=null}">
		<h2>Products priced between $${param.minPrice} and $${param.maxPrice}</h2>
	</c:if>
	
	<table border="1" id="tblProducts" class="tablesorter">
		<thead>
			<tr>
				<th>Product Name</th>
				<th>Category Name</th>
				<th>Supplier Name</th>
				<th>Quantity Per Unit</th>
				<th>Unit Price</th>
				<th>Units in stock</th>
				<th>Discontinued</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="p">
				<tr>
					<td>${p.productName}</td>
					<td>${p.category.categoryName}</td>
					<td>${p.supplier.companyName}</td>
					<td>${p.quantityPerUnit}</td>
					<td>${p.unitPrice}</td>
					<td>${p.unitsInStock}</td>
					<td>${p.discontinued==1?"Yes":"No"}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>