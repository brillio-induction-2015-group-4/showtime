
	<%@ include file="header.txt"	%>


	<div id="main">

		<h3>Enter Your Username and Password</h3>

		<form method="POST" action="admin">
			<div>
				<label>EmployeeId</label> <input type="text" id="employeeId"
					name="employeeId" />
			</div>
			<div>
				<label>Password</label> <input type="password" id="password"
					name="password" />
			</div>
			<div>
				<label></label>
				<button>
					Login</a>
				</button>
			</div>

		</form>

	</div>

	<%@ include file="footer.txt"	%>
