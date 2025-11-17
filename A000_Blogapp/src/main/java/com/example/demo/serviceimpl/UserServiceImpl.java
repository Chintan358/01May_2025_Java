package com.example.demo.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RoleDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;

@Service
public  class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	RoleService roleService;
	
	@Override
	public UserDto addUser(UserDto dto,int roleid) {
		
		dto.setRoleDto(mapper.map(roleService.role(roleid), RoleDto.class));
		return mapper.map(repo.save(mapper.map(dto, User.class)),UserDto.class);
	}



}
