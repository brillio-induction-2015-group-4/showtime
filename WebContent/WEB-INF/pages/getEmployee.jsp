<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Data</title>


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
	<div id="main">

		<h3>New Users Register Here</h3>

		<s:form method="POST" >
			
			<div>
				<s:textfield name="employee.firstName" id="employee.firstName" label="firstName" />
			</div>


			<div>
				<s:textfield name="employee.lastName" label="lastName" />
			</div>


			<div>
				<s:textfield name="employee.mailId" label="Email" />
			</div>
			<div>
				<s:radio label="Active" name="employee.active"
					 list="{'true', 'false'}"/>
			</div>
			<div>
				<s:textfield name="employee.role" label="Role" />
			</div>

		</s:form>

	</div>
</body>
</html>

