package com.example.demo.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RoleDto;
import com.example.demo.dto.UserDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repo.RoleRepo;
import com.example.demo.repo.RoleRepo;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    

	@Autowired
	UserRepo repo;
	
	@Autowired
	ModelMapper mapper;

	@Autowired
	RoleRepo roleRepo;

	@Autowired
	RoleService roleService;
	

  

	@Override
	public UserDto addUser(UserDto dto, int roleid) {
		// TODO Auto-generated method stub
		dto.setRole(roleService.role(roleid));
		
		
		return mapper.map(repo.save(mapper.map(dto, User.class)), UserDto.class);
		
	}

	@Override
	public List<UserDto> allUser() {
		
		List<User> users = repo.findAll(); 
		
		List<UserDto> allusers = 
				users.stream().map((ele)->mapper.map(ele, UserDto.class)).collect(Collectors.toList());
		
		return allusers;
	}

	@Override
	public UserDto userById(int id) {
		// TODO Auto-generated method stub
		
		UserDto dto = 
				mapper.map
				(repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", "id", id)), UserDto.class);
		
		return dto;
	}

	@Override
	public UserDto updateUser(UserDto dto, int id,int rid) {
		
		User user = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "id", id));
		UserDto createdDto = mapper.map(user, UserDto.class);
		
		createdDto.setUsername(dto.getUsername());
		createdDto.setPassword(dto.getPassword());
		createdDto.setRole(roleService.role(rid));
		
		User updateUser = repo.save(mapper.map(createdDto, User.class));
		
		return mapper.map(updateUser, UserDto.class);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		User user = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("User", "id", id));
		
		repo.deleteById(id);
		
	}

}
