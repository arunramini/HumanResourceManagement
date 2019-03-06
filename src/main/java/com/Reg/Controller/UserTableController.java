package com.Reg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Reg.Model.Instructor;
import com.Reg.Model.UserTable;
import com.Reg.Service.UserTableService;

@Controller
public class UserTableController {

	@Autowired
	public UserTableService userTableService;

	@RequestMapping("/regForm")
	public ModelAndView regForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("UserTable", new UserTable());
		modelAndView.setViewName("UserRegistrationForm");
		return modelAndView;
	}

	@RequestMapping("/saveForm")
	public ModelAndView saveForm(@ModelAttribute("UserTable") UserTable userTable) {

		ModelAndView modelAndView = new ModelAndView();
		userTableService.save(userTable);
		modelAndView.setViewName("add");
		return modelAndView;
	}
}