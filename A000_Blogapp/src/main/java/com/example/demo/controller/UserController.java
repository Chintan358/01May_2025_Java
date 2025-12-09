package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.exception.APIResponse;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService service;
	
	@Autowired
	PasswordEncoder encoder;

	@PostMapping("/role/{id}")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto dto, @PathVariable("id") int roleid)
	{
		dto.setPassword(encoder.encode(dto.getPassword()));
		UserDto createduser =  service.addUser(dto, roleid);
		return new ResponseEntity<>(createduser,HttpStatus.CREATED);
	}
	
	
	@GetMapping("")
	public ResponseEntity<List<UserDto>> allUser() {
		
		List<UserDto> dtos = service.allUser();
		
		return new ResponseEntity<>(dtos,HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> userById(@PathVariable("id") int id) {
		
		UserDto dto = service.userById(id);
		
		return new ResponseEntity<>(dto,HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto dto,@PathVariable("id") int id,@RequestParam("role") int rid) {
		
		UserDto userDto = service.updateUser(dto, id,rid);
		
		return new ResponseEntity<>(userDto,HttpStatus.CREATED);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> deleteUser(@PathVariable("id") int id) {
		
		service.deleteUser(id);
		
		APIResponse api = new APIResponse();
		api.setMessage("User Deleted Successfully");
		api.setSuccess("Success");
		
		return new ResponseEntity<>(api,HttpStatus.OK);
		
	}

}
