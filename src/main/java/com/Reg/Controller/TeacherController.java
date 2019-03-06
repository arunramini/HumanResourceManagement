package com.Reg.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Reg.Model.CustomerRegistration;
import com.Reg.Model.Teacher;
import com.Reg.Service.CourseService;
import com.Reg.Service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	
	@Autowired
	CourseService courseService;
	
	
	@RequestMapping("/showOnetoMany")
	public ModelAndView showform(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("teacher", new Teacher());
		modelAndView.setViewName("teacherForm");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/saveTeacher")
	public ModelAndView saveEmployee(@Valid @ModelAttribute("teacher") Teacher teacher,
			BindingResult result) {
		System.out.println(teacher.getCourse().size());
		System.out.println(teacher.getFirst_name());
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(teacher);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	
	
	
}
