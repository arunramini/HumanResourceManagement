package com.Reg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Reg.Model.User;
import com.Reg.Service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	
	@RequestMapping("/userFormMany")
	public ModelAndView showform(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("User", new User());
		User user= new User();
		System.out.println(user.toString());
		modelAndView.setViewName("userForm");
		return modelAndView;
	}
	
}
