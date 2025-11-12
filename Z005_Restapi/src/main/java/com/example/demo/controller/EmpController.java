package com.example.demo.controller;

import java.util.List;
import com.example.demo.serviceimpl.EmpServiceImpl;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
     
import com.example.demo.model.Employee;
import com.example.demo.repo.EmpRepo;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/employees")
public class EmpController /*~~(Could not parse as Java)~~>*/{

   
		@Autowired
		EmpService empService;
	
		@GetMapping("")
		public ResponseEntity<List<Employee>> getAllemp(
				@RequestParam(value = "pagenumber",defaultValue = "1" ) int pagenumber,
				@RequestParam(value = "pagesize", defaultValue = "1" ) int pagesize,
				@RequestParam(value = "sortby", defaultValue = "id") String sortby,
				@RequestParam(value = "sorttype", defaultValue = "asc") String sorttype
				)
		{
			 List<Employee> emps =  empService.allEmps(pagenumber,pagesize,sortby, sorttype);	 
			 return new ResponseEntity<>(emps,HttpStatus.OK);
		}
		
		@PostMapping("")
		public ResponseEntity<Employee> addemp(@Valid @RequestBody Employee emp)
		{
			Employee createdemp =  empService.addEmp(emp);
			return new ResponseEntity<>(createdemp,HttpStatus.CREATED);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Employee> empbyid(@PathVariable("id") int id)
		{
			Employee e = empService.empById(id);
			return new ResponseEntity<>(e,HttpStatus.OK);
		}
		
		@PutMapping("/{id}")
		public ResponseEntity<Employee> updateEmp(@RequestBody Employee e,@PathVariable("id") int id)
		{
			Employee updatedEmp =  empService.updateEmp(e, id);
			return new ResponseEntity<>(updatedEmp,HttpStatus.CREATED);
		}
		
		@DeleteMapping("/{id}")
		public String deleteEmp(@PathVariable("id") int id)
		{
			empService.deleteEmp(id);
			return "Emp delete successfully";
		}
		
	
}
