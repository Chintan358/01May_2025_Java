package com.example.demo.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RoleDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Role;
import com.example.demo.repo.RoleRepo;
import com.example.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public RoleDto addRole(RoleDto roleDto) {
		
		Role createRole =  repo.save(mapper.map(roleDto, Role.class));	
		return mapper.map(createRole, RoleDto.class);
	}

	@Override
	public List<RoleDto> roles() {
		
		List<Role> roles = repo.findAll();
		List<RoleDto> roleDetos = 
				roles.stream().map(role->mapper.map(role,RoleDto.class)).collect(Collectors.toList());
		
		return roleDetos;
	}

	@Override
	public RoleDto role(int id) {
		
		Role role = repo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Role", "Id", id));
		
		return mapper.map(role, RoleDto.class);
	}

	@Override
	public RoleDto updateRole(RoleDto dto, int id) {
		
		Role role = repo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Role", "Id", id));
	
		
		role.setName(dto.getName());
		Role updatedrole =  repo.save(role);
		return mapper.map(updatedrole, RoleDto.class);
	}

	@Override
	public void deleteRole(int id) {
		
		Role role = repo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Role", "Id", id));
		
		repo.delete(role);
		
	}

}
