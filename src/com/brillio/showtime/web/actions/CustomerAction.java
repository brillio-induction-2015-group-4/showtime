package com.brillio.showtime.web.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.brillio.showtime.dao.CustomerDao;
import com.brillio.showtime.dao.DaoException;
import com.brillio.showtime.dao.DaoFactory;
import com.brillio.showtime.entity.Customer;

public class CustomerAction {

	private Customer customer;
	private int id;
	private List<Customer> customers = new ArrayList<>();

	public String getCustomerById() {

		HttpServletRequest request = ServletActionContext.getRequest();
		id = (int) request.getAttribute("id");
		
		System.out.println(id);
		try {
			CustomerDao dao = DaoFactory.getCustomerDao();
			customer=dao.getCustomer(id);
			customers.add(customer);
			System.out.println(customer);
			return "success";
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}

	}
	
	public String getAllCustomers() {
		try {
			CustomerDao dao = DaoFactory.getCustomerDao();
		    customers=dao.getAllCustomers();
			System.out.println(customers);
			return "success";
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}

	}
	
	public String updateCustomer(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		customer = (Customer) request.getAttribute("customer");
		System.out.println("update     "+customer);
		try {
			CustomerDao dao = DaoFactory.getCustomerDao();
			dao.updateCustomer(customer);
			return "success";
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomer(Customer Customer) {
		this.customer = Customer;
	}

	public String addCustomer() {

		HttpServletRequest request = ServletActionContext.getRequest();

		customer = (Customer) request.getAttribute("customer");
		
		try {
			CustomerDao dao = DaoFactory.getCustomerDao();
			dao.addCustomer(customer);
			return "success";
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}
	}
}
