<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ include file="header.txt"%>

<s:form action="displayUpdateCustomer">
	<label>Enter ID : </label>
	<s:textfield name="id" />
	<s:submit label="Submit" />
</s:form>
<%@ include file="footer.txt"%>