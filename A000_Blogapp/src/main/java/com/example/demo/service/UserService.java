package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;

public interface UserService {
	
	public UserDto addUser(UserDto dto,int roleid);
	public List<UserDto> allUser();
	public UserDto userById(int id);
	public UserDto updateUser(UserDto dto,int id,int rid);
	public void deleteUser(int id);
	
	
}
