<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.txt"	%>

	<div id="main">

		<h3>New Users Register Here</h3>

		<s:form method="POST" action="updateCustomerById">

			<div>
				<s:radio label="Membership Type" name="customer.memberType"
					title="Regular" list="{'Regular', 'Premium'}"/>
			</div>
			<div>
				<s:textfield name="customer.id" label="Id" />
			</div>
			<div>
				<s:textfield name="customer.firstName" label="firstName" />
			</div>

			<div>
				<s:textfield name="customer.middleName" label="middleName" />
			</div>

			<div>
				<s:textfield name="customer.lastName" label="lastName" />
			</div>

			<div>
				<s:radio label="Gender" name="customer.gender" list="{'Male', 'Female'}" />
			</div>

			<div>
				<s:textfield name="customer.phone1" label="phone1" />
			</div>

			<div>
				<s:textfield name="customer.phone2" label="phone2" />
			</div>

			<div>
				<s:textfield name="customer.addressLine1" label="addressLine1" />
			</div>

			<div>
				<s:textfield name="customer.addressLine2" label="addressLine2" />
			</div>
			<div>
				<s:textfield name="customer.landmark" label="landmark" />
			</div>
			<div>
				<s:textfield name="customer.city" label="city" />
			</div>

			<div>
				<s:textfield name="customer.pincode" label="pincode" />
			</div>

			<div>
				<s:textfield name="customer.idProof" label="idProof" />
			</div>

			<s:select label="Customer Status" name="customer.custStatus" 
					list="{'active', 'inactive'}" />

			<div>
				<s:textfield name="customer.initialAmount" label="initialAmount" />
			</div>

			<div>
				<s:submit label="Submit" />
			</div>

		</s:form>

	</div>
</body>
</html>

