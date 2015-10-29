package com.brillio.showtime.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.brillio.showtime.dao.DaoException;
import com.brillio.showtime.dao.EmployeeDao;
import com.brillio.showtime.entity.Employee;

public class JpaEmployeeDao implements EmployeeDao {

	
	private EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nwind-pu");
		return emf.createEntityManager();
	}
	
	@Override
	public void addEmployee(Employee employee) throws DaoException {
		System.out.println("hhhhh "+employee);
		try {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			try {
				tx.begin();
				em.persist(employee);
				tx.commit();
			} finally {
				em.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(e);
		}
	}

	@Override
	public void deleteEmployee(int employeeId) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployee(int employeeId) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			Employee e = em.find(Employee.class, employeeId);
			em.close();
			return e;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void updateEmployee(Employee employee) throws DaoException {
		
			try {
				EntityManager em = getEntityManager();
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				String jql = "update Employee e set e.firstName = ? where e.id=?";
				Query qry = em.createQuery(jql);
				qry.setParameter(1, employee.getFirstName());
				qry.setParameter(2, employee.getemployeeId());
				qry.executeUpdate();
				tx.commit();
				em.close();
				
			} catch (Exception e) {
				throw new DaoException(e);
			}
		

	}

	@Override
	public List<Employee> getAllEmployees() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllActiveEmployees() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
