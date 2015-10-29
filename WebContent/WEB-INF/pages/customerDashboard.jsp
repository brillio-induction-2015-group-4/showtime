<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ include file="header.txt"%>

<h2> Customer Details</h2>
<li>
	<ul><a href="customerForm">Add Customer</a></ul>
	<ul><a href="searchCustomer">Search</a></ul>
	<ul><a href="updateCustomer">Update</a></ul>
	<ul><a href="allCustomers">All Customers</a></ul>
</li>
<s:form action="getAllCustomersBy">
<s:select label="All Customers By : " name="searchBy" 
					list="{'Id', 'City','Membership Type','Status','Phone No','Full Name'}" />
<s:textfield></s:textfield>
<s:submit></s:submit>
</s:form>
<%@ include file="footer.txt"%>