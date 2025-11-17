package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;

public interface RoleService {
		
	public RoleDto addRole(RoleDto roleDto);
	public List<RoleDto> roles();
	public RoleDto role(int id);
	public RoleDto updateRole(RoleDto dto, int id);
	public void deleteRole(int id);
}
