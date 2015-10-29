package com.brillio.showtime.dao;

import java.util.List;

import com.brillio.showtime.entity.Employee;


public interface EmployeeDao {

	// Implementation of CRUD operations
	
	public void addEmployee(Employee employee) throws DaoException;
	
	public void deleteEmployee(int employeeId) throws DaoException;
	
	public Employee getEmployee(int employeeId) throws DaoException;
    
	public void updateEmployee(Employee employee) throws DaoException;	
	
	
	// Implementation of queries
	
	public List<Employee> getAllEmployees() throws DaoException;

	public List<Employee> getAllActiveEmployees() throws DaoException;
	
}
