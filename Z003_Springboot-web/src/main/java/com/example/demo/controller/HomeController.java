package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;



@Controller
public class HomeController {
	
		@Autowired
		UserService service;
	
		@RequestMapping("/")
		public String index(Model model)
		{
			User u  =new User();
			model.addAttribute("user", u);
			model.addAttribute("users", service.allUsers());
			return "index";
		}
		
		@RequestMapping("/display")
		public String display()
		{
			return "display";
		}
		
//		@RequestMapping(value = "/adduser", method = RequestMethod.POST)
		@PostMapping("/adduser")
		public String adduser(@Valid @ModelAttribute("user") User u,BindingResult br,Model model)
		{
			if(br.hasErrors())
			{
				User user  =new User();
				model.addAttribute("user", u);
				model.addAttribute("users", service.allUsers());
				return "index";
			}
			else
			{
				service.addOrUpdateUser(u);
				return "redirect:/";
			}
			
		}
		
		@GetMapping("/delete")
		public String delete(@RequestParam("did") int did)
		{
			service.deleteUser(did);
			return "redirect:/";
		}
		
		@GetMapping("/update")
		public String update(@RequestParam("uid") int uid,Model model)
		{
			User user = service.userById(uid);
			model.addAttribute("user", user);
			model.addAttribute("users", service.allUsers());
			return "index";
		}
}
