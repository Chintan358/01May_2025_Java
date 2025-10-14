package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	
	
		@Autowired
		StudentService service;
	
		@GetMapping("/")
		public String index(Model model)
		{
			Student st = new Student();
			model.addAttribute("student", st);
			model.addAttribute("students",service.allStudents());
			return "index";
		}
		
		@PostMapping("/addstudent")
		public String addStudent(@ModelAttribute("student") Student st)
		{
			service.addorUpdate(st);
			return "redirect:/";
		}
		
		@GetMapping("/delete")
		public String delete(@RequestParam("did") int id)
		{
			service.deleteStudent(id);
			return "redirect:/";
		}
		
		@GetMapping("/update")
		public String update(@RequestParam("uid") int id,Model model)
		{
			Student st = service.studentById(id);
			model.addAttribute("student", st);
			model.addAttribute("students",service.allStudents());
			return "index";
		}
}
