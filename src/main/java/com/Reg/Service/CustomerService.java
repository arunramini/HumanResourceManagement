package com.Reg.Service;

import java.util.List;

import com.Reg.Model.CustomerRegistration;

public interface CustomerService {

	public void addCustomer(CustomerRegistration customerRegistration);

	public List<CustomerRegistration> getAllEmployees();

	public void updateCustomer(CustomerRegistration customerRegistration);

	public CustomerRegistration getEmployee(int custId);

	public void removeEmployee(int id);
}
