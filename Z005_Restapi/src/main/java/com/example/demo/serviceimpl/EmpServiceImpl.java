package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmpRepo;
import com.example.demo.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpRepo empRepo;

	@Override
	public List<Employee> allEmps(int pagenumber, int pagesize,String sortby, String sorttype) {
		// TODO Auto-generated method stub
		
		Sort sort = null;
		if(sorttype.equalsIgnoreCase("asc"))
		{
			sort = Sort.by(sortby).ascending();
		}
		else if(sorttype.equalsIgnoreCase("desc"))
		{
			sort = Sort.by(sortby).descending();
		}
		
		Pageable pageble = PageRequest.of(pagenumber, pagesize, sort);
		Page<Employee> pages = empRepo.findAll(pageble);
		
		List<Employee> allEmps = pages.getContent();
		return allEmps;
	}

	@Override
	public Employee empById(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
	}

	@Override
	public Employee addEmp(Employee e) {
		// TODO Auto-generated method stub
		return empRepo.save(e);
	}

	@Override
	public Employee updateEmp(Employee e, int id) {
		
		Employee emp = empRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		emp.setName(e.getName());
		emp.setEmail(e.getEmail());
		emp.setAge(e.getAge());
		return empRepo.save(emp);
	}

	@Override
	public void deleteEmp(int id) {
		
		Employee e =  empRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
		empRepo.delete(e);
	}

}
