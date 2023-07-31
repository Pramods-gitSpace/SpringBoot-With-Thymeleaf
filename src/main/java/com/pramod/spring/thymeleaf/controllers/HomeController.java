package com.pramod.spring.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pramod.spring.thymeleaf.model.Student;

@Controller
public class HomeController {
    @RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("name", "Pramod");
		return mv;
	}
    @RequestMapping("/students")
	public ModelAndView objectCall() {
		ModelAndView mv = new ModelAndView("student");
		
		Student st=new Student();
		st.setName("vinod");
		st.setScore(225);
		Student st1=new Student();
		st1.setName("aruna");
		st1.setScore(300);
		List<Student> students= Arrays.asList(st,st1);
		mv.addObject("students", students);
		return mv;
	}
    @RequestMapping("/studentForm")
	public ModelAndView studentForm() {
		ModelAndView mv = new ModelAndView("studentForm");
		
		Student st=new Student();
		st.setName("vinod");
		st.setScore(225);
		mv.addObject("student", st);
		return mv;
	}
    @RequestMapping("/studentData")
	public ModelAndView studentData(@ModelAttribute Student student) {
		ModelAndView mv = new ModelAndView("studentData");
		System.out.println(student.getName());
		System.out.println(student.getScore());
		return mv;
	}
	
    
}
