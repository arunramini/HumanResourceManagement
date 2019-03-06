package com.Reg.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Reg.Model.Instructor;
import com.Reg.Service.InstructorService;

@Controller
public class InstructorController {

	@Autowired
	public InstructorService instructorService;

	@RequestMapping("/save")
	public ModelAndView showform(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("wife", new Instructor());
		modelAndView.setViewName("husbandandwife");
		return modelAndView;
	}

	@RequestMapping(value = "/saveWife")
	public ModelAndView saveEmployee(@Valid @ModelAttribute("wife") Instructor instructor, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		instructorService.save(instructor);
		modelAndView.setViewName("add");
		return modelAndView;
	}

}
