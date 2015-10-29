package com.brillio.showtime.web.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.brillio.showtime.dao.DaoException;
import com.brillio.showtime.dao.DaoFactory;
import com.brillio.showtime.dao.EmployeeDao;
import com.brillio.showtime.entity.Employee;

public class EmployeeAction {
	
	Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@SuppressWarnings("unchecked")
	public String checkCredentials(){
		
		String action;
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		
		List<Employee> list = (List<Employee>) session.getAttribute("employee");
		
		if(list == null){
			
			list = new ArrayList<>();
			action = checkCredentialsNotInSession();
			if(action.equals("success")){
			session.setAttribute("employee", list);
			}
		}else{
			action = "success";
		}
		list.add(employee);
		
		return action;
	}
	
	public String checkCredentialsNotInSession(){
		HttpServletRequest request = ServletActionContext.getRequest();

		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		
		String password = request.getParameter("password");
		System.out.println(employeeId+ password);
		try {
			EmployeeDao dao = (EmployeeDao) DaoFactory.getEmployeeDao();
			
			employee = dao.getEmployee(employeeId);
			if(employee.getPassword().equals(password)){
			return "success";
			}else{
				return "failure";
			}
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}
		
	}
	
	public String addEmployee() {

		HttpServletRequest request = ServletActionContext.getRequest();

		employee = (Employee) request.getAttribute("employee");
		
		try {
			EmployeeDao dao = (EmployeeDao) DaoFactory.getEmployeeDao();
			
			dao.addEmployee(employee);
			return "success";
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}
	}
	
	public String getEmployeeById(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		
		try {
			EmployeeDao dao = (EmployeeDao) DaoFactory.getEmployeeDao();
			
			employee = dao.getEmployee(employeeId);
			System.out.println("in get"+employee);
			return "success";
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}

	}
	
	public String updateEmployeeByAdmin(){
	
		
		System.out.println("In update"+employee);
		try {
			EmployeeDao dao = (EmployeeDao) DaoFactory.getEmployeeDao();		
			dao.updateEmployee(employee);
			return "success";
		} catch (DaoException e) {
			e.printStackTrace();
			return "failure";
		}
	}
}