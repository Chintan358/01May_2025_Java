package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmpService {
	
			
		public List<Employee> allEmps(int pagenumber, int pagesize,String sortby, String sorttype);
		public Employee empById(int id);
		public Employee addEmp(Employee e);
		public Employee updateEmp(Employee e, int id);
		public void deleteEmp(int id);
	
}
