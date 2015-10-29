package com.brillio.showtime.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.brillio.showtime.dao.CustomerDao;
import com.brillio.showtime.dao.DaoException;
import com.brillio.showtime.entity.Customer;

public class JpaCustomerDao implements CustomerDao {

	private EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nwind-pu");
		return emf.createEntityManager();
	}

	@Override
	public void addCustomer(Customer customer) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			try {
				tx.begin();
				em.persist(customer);
				tx.commit();
			} finally {
				em.close();
			}
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public Customer getCustomer(int customerId) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			Customer p = em.find(Customer.class, customerId);
			em.close();
			return p;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void updateCustomer(Customer customer) throws DaoException {
		System.out.println("custeomerid:"+customer.getId());
		try {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			String jql = "update Customer c set c.firstName = ?, c.lastName=?, c.gender=?, c.memberType=?,"
					+ "c.phone1=?, c.phone2=?, c.addressLine1=?, c.addressLine2=?, c.landmark=?,"
					+ "c.city=?, c.pincode=?, c.idProof=?, c.custStatus=?, c.initialAmount=?  where c.id=?";
			Query qry = em.createQuery(jql);
			qry.setParameter(1, customer.getFirstName());
			qry.setParameter(2, customer.getLastName());
			qry.setParameter(3, customer.getGender());
			qry.setParameter(4, customer.getMemberType());
			qry.setParameter(5, customer.getPhone1());
			qry.setParameter(6, customer.getPhone2());
			qry.setParameter(7, customer.getAddressLine1());
			qry.setParameter(8, customer.getAddressLine2());
			qry.setParameter(9, customer.getLandmark());
			qry.setParameter(10, customer.getCity());
			qry.setParameter(11, customer.getPincode());
			qry.setParameter(12, customer.getIdProof());
			qry.setParameter(13, customer.getCustStatus());
			qry.setParameter(14, customer.getInitialAmount());
			qry.setParameter(15, customer.getId());
			
			qry.executeUpdate();
			tx.commit();
			em.close();
			
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void deleteCustomer(int customerId) throws DaoException {
		throw new DaoException("Deletion of Customer prohibited");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomers() throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Customer p";
			Query qry = em.createQuery(jql);
			List<Customer> list = qry.getResultList();
			em.close();

			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomersByMembershipType(String id) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Customer p where p.membership_id = ?";
			Query qry = em.createQuery(jql);
			qry.setParameter(1, id);
			List<Customer> list = qry.getResultList();
			em.close();
			return list;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Customer> getCustomerDetailsByFullName(String fullName) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Customer p where p.membership_id = ?";
			Query qry = em.createQuery(jql);
			qry.setParameter(1, fullName);
			List<Customer> list = qry.getResultList();
			em.close();
			return list;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Customer> getCustomersByCity(String city) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Customer p where p.city = ?";
			Query qry = em.createQuery(jql);
			qry.setParameter(1, city);
			List<Customer> list = qry.getResultList();
			em.close();
			return list;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Customer> getCustomersByStatus(String status) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Customer p where p.status = ?";
			Query qry = em.createQuery(jql);
			qry.setParameter(1, status);
			List<Customer> list = qry.getResultList();
			em.close();
			return list;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Customer> getCustomersByPhoneNo(long phoneNo) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Customer p where p.phone_1 = ? or p.phone_2 = ?";
			Query qry = em.createQuery(jql);
			qry.setParameter(1, phoneNo);
			List<Customer> list = qry.getResultList();
			em.close();
			return list;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

}
