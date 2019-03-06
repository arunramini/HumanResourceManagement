package com.Reg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reg.Dao.CustomerDao;
import com.Reg.Model.CustomerRegistration;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Autowired
	private CustomerDao customerDao;

	@Transactional
	public void addCustomer(CustomerRegistration customerRegistration) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customerRegistration);
	}

	@Transactional
	public void updateCustomer(CustomerRegistration customerRegistration) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(customerRegistration);
	}

	@Transactional
	public List<CustomerRegistration> getAllEmployees() {
		// TODO Auto-generated method stub
		return customerDao.getAllEmployees();
	}

	@Transactional
	public CustomerRegistration getEmployee(int custId) {
		// TODO Auto-generated method stub
		System.out.println(customerDao.getEmployee(custId) + " customerDao.getEmployee(custId)");
		return customerDao.getEmployee(custId);
	}

	@Transactional
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		customerDao.removeEmployee(id);
	}

}
