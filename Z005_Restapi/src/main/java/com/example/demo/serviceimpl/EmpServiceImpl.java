package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmpRepo;
import com.example.demo.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpRepo empRepo;

	@Override
	public List<Employee> allEmps() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee empById(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).orElseThrow();
	}

	@Override
	public Employee addEmp(Employee e) {
		// TODO Auto-generated method stub
		return empRepo.save(e);
	}

	@Override
	public Employee updateEmp(Employee e, int id) {
		
		Employee emp = empRepo.findById(id).orElseThrow();
		emp.setName(e.getName());
		emp.setEmail(e.getEmail());
		emp.setAge(e.getAge());
		return empRepo.save(emp);
	}

	@Override
	public void deleteEmp(int id) {
		
		empRepo.deleteById(id);
	}

}
