package com.brillio.showtime.dao;

import java.util.ResourceBundle;

public class DaoFactory {

	// do not let anyone instantiate
	private DaoFactory() {
	}
	
	public static CustomerDao getCustomerDao() throws DaoException{
		
		try{
			String baseName = "com.brillio.showtime.dao.impl";
			ResourceBundle rb = ResourceBundle.getBundle(baseName);
			String implClass = rb.getString("CustomerDao.impl");
			
			return  (CustomerDao) Class.forName(implClass).newInstance();
		}
		
		catch(Exception e){
			
			throw new DaoException(e);
		}
	}
	
	public static EmployeeDao getEmployeeDao() throws DaoException{
		
		try{
			String baseName = "com.brillio.showtime.dao.impl";
			ResourceBundle rb = ResourceBundle.getBundle(baseName);
			String implClass = rb.getString("EmployeeDao.impl");
			
			return  (EmployeeDao) Class.forName(implClass).newInstance();
		}
		
		catch(Exception e){
			
			throw new DaoException(e);
		}
	}
	
}
