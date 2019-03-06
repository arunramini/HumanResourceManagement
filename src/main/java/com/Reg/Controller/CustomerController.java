package com.Reg.Controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Reg.Model.CustomerRegistration;
import com.Reg.Service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/register")
	public ModelAndView showform(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("customer", new CustomerRegistration());
		modelAndView.setViewName("registrationForm");
		return modelAndView;
	}

	@RequestMapping(value = "/saveCustomer")
	public ModelAndView saveEmployee(@Valid @ModelAttribute("customer") CustomerRegistration customerRegistration,
			BindingResult result) {
		System.out.println(customerRegistration.getName());
		ModelAndView modelAndView = new ModelAndView();
		customerService.addCustomer(customerRegistration);
		modelAndView.setViewName("success");
		return modelAndView;
	}

	@RequestMapping(value = "/listCustomers")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<CustomerRegistration> listEmployee = customerService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/editEmployee/{id}")
	public ModelAndView editContact(@PathVariable int id) {

		System.out.println(id + " custIDddddddddddddddddddddddddddd");
		CustomerRegistration customerRegistration = customerService.getEmployee(id);
		ModelAndView model = new ModelAndView("registrationForm");
		model.addObject("customer", customerRegistration);
		return model;
	}
	@RequestMapping(value="/removeEmployee/{id}")
	public String remove(@PathVariable int id)
	{
		customerService.removeEmployee(id);
		return "success";
	};

}
