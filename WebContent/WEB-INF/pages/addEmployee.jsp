<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.txt"	%>

	<div id="main">

		<h3>New Users Register Here</h3>

		<s:form method="POST" action="addEmployeeByAdmin">
			
			<div>
				<s:textfield name="employee.firstName" label="firstName" />
			</div>


			<div>
				<s:textfield name="employee.lastName" label="lastName" />
			</div>


			<div>
				<s:textfield name="employee.mailId" label="Email" />
			</div>

			<div>
				<s:password name="employee.password" label="Password" />
			</div>
			<div>
				<s:radio label="Active" name="employee.active"
					 list="{'true', 'false'}"/>
			</div>
			<div>
				<s:textfield name="employee.role" label="Role" />
			</div>
			<div>
				<s:submit label="Submit" />
			</div>

		</s:form>

	</div>
</body>
</html>

