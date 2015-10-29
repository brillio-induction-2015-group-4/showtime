
	<%@ include file="header.txt"	%>


	<div id="main">

		<h3>Enter Your Username and Password</h3>

		<form method="POST" action="updateEmployee">
			<div>
				<label>EmployeeId</label> <input type="text" id="employeeId"
					name="employeeId" />
			</div>

			<div>
				<button>
					Login
				</button>
			</div>

		</form>

	</div>

	<%@ include file="footer.txt"	%>
