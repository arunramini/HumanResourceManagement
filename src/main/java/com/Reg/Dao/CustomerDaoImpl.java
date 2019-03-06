package com.Reg.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reg.Model.CustomerRegistration;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCustomer(CustomerRegistration customerRegistration) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(customerRegistration);
	}

	public void updateCustomer(CustomerRegistration customerRegistration) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(customerRegistration);
	}

	@SuppressWarnings("unchecked")
	public List<CustomerRegistration> getAllEmployees() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from CustomerRegistration").list();
	}

	public CustomerRegistration getEmployee(int custId) {
		// TODO Auto-generated method stub
		return (CustomerRegistration) sessionFactory.getCurrentSession().get(CustomerRegistration.class,custId);
	}

	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		CustomerRegistration customerID = (CustomerRegistration) session.load(CustomerRegistration.class, new Integer(id));
		if(customerID !=null){
			session.delete(customerID);
		}
	}

}
