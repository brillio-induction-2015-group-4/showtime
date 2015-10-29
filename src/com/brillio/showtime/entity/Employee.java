package com.brillio.showtime.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
	 private int id;
	@Column(name="first_name")
	 private String firstName;
	@Column(name="last_name")
	 private String lastName;
	
	 private String password;
	 private boolean active;
	 private String role;
	 private String mailId;
	 
	 public Employee() {
	}

	public Employee(int employeeId, String firstName, String lastName, String password, boolean active, String role,
			String mailId) {
		super();
		this.id = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.active = active;
		this.role = role;
		this.mailId = mailId;
	}

	public int getemployeeId() {
		return id;
	}

	public void setemployeeId(int employeeId) {
		this.id = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "employees [employeeId=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", active=" + active + ", role=" + role + ", mailId=" + mailId + "]";
	}
	 
	 
}
