package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RoleDto;
import com.example.demo.exception.APIResponse;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.RoleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private final UserRepo userRepo;

		@Autowired
		RoleService roleService;

    RoleController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
	
		@PostMapping("/")
		public ResponseEntity<RoleDto> addRole(@Valid @RequestBody RoleDto dto)
		{
			RoleDto savedRole = roleService.addRole(dto);
			return new ResponseEntity<>(savedRole,HttpStatus.CREATED);
		}
		
		@GetMapping("/")
		public ResponseEntity<List<RoleDto>> allRoles() {
			List<RoleDto> dtos = roleService.roles();
			return new ResponseEntity<>(dtos, HttpStatus.OK);
		}
		
		@PutMapping("/{id}")
		public ResponseEntity<RoleDto> updateEmployee(@RequestBody RoleDto role,@PathVariable("id") int id) {
			RoleDto updatedRole = roleService.updateRole(role, id);
			return new ResponseEntity<>(updatedRole, HttpStatus.CREATED);
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<APIResponse> deleteRole(@PathVariable("id") int id) {
			roleService.deleteRole(id);
			
			APIResponse api = new APIResponse();
			api.setMessage("Role Delete");
			api.setSuccess("True");
			
			return new ResponseEntity<>(api,HttpStatus.OK);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<RoleDto> roleById(@PathVariable("id") int id) {
			RoleDto role = roleService.role(id);
		
			return new ResponseEntity<>(role, HttpStatus.OK);
		}

}
