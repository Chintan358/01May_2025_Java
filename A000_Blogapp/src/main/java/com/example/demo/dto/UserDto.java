package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

	int id;
	String username;
	String password;
	RoleDto roleDto;
}
