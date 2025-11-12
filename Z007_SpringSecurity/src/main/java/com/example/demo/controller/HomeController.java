package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
		
		@GetMapping("/public")
		public String index()
		{
			return "This is public request";
		}
		
		@GetMapping("/public/user")
		public String index1()
		{
			return "This is public1 request";
		}
		
		
		@GetMapping("/user")
		public String user()
		{
			return "This is user request";
		}
		

		@GetMapping("/admin")
		public String admin()
		{
			return "This is admin request";
		}
		

		@GetMapping("/addcategory")
		public String addcategory()
		{
			return "This is add category request";
		}
		
		
		
		
}
