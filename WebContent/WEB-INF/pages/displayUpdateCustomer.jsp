<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.txt"%>

<div>
	<s:radio label="Membership Type" name="customer.memberType"
		value=${customer.memberType } title="Regular"
		list="{'Regular', 'Premium'}" />
</div>
<div>
	<s:textfield name="customer.firstName" value="customer.firstName"
		label="firstName" />
</div>

<%@ include file="footer.txt"%>