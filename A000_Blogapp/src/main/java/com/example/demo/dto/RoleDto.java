package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {

	int id;
	
	@NotBlank(message = "name should not blank")
	String name;

}
