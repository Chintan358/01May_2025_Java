package com.example.demo.controller;

import java.util.List;
import com.example.demo.serviceimpl.EmpServiceImpl;
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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/employees")
public class EmpController {

    	
		@Autowired
		EmpService empService;
	
		@GetMapping("")
		public ResponseEntity<List<Employee>> getAllemp()
		{
			 List<Employee> emps =  empService.allEmps();	 
			 return new ResponseEntity<>(emps,HttpStatus.OK);
		}
		
		@PostMapping("")
		public ResponseEntity<Employee> addemp(@RequestBody Employee emp)
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
