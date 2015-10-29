package com.brillio.showtime.dao;

import java.util.List;

import com.brillio.showtime.entity.Customer;

public interface CustomerDao {


	// Implementation of CRUD methods
	
	public void addCustomer(Customer customer) throws DaoException;
	
	public void deleteCustomer(int customerId) throws DaoException;
	
	public Customer getCustomer(int customerId) throws DaoException;
    
	public void updateCustomer(Customer customer) throws DaoException;	
	

	// Implementation of queries
    
	public List<Customer> getAllCustomers() throws DaoException;

	public List<Customer> getAllCustomersByMembershipType(String id) throws DaoException;

	public List<Customer> getCustomerDetailsByFullName(String fullName) throws DaoException;

	public List<Customer> getCustomersByCity(String city) throws DaoException;

	public List<Customer> getCustomersByStatus(String status) throws DaoException;

	public List<Customer> getCustomersByPhoneNo(long phoneNo) throws DaoException;
}
