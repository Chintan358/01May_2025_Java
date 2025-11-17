package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService service;

	@PostMapping("/role/{id}")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto dto, @PathVariable("id") int roleid)
	{
		UserDto createduser =  service.addUser(dto, roleid);
		return new ResponseEntity<>(createduser,HttpStatus.CREATED);
	}
	

}
