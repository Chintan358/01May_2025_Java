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

import com.example.demo.dto.BlogcategoryDto;
import com.example.demo.exception.APIResponse;
import com.example.demo.service.BlogCategoryService;

@RestController
@RequestMapping("/blogcategories")
public class BlogCatController {
	
	@Autowired
	BlogCategoryService service;
	
	@PostMapping("")
	public ResponseEntity<BlogcategoryDto> addBlogCategory(@RequestBody BlogcategoryDto dto) {
		
		BlogcategoryDto createdDto = service.addBlgCategory(dto);
		
		return new ResponseEntity<>(createdDto,HttpStatus.CREATED);
		
	}
	
	@GetMapping("")
	public ResponseEntity<List<BlogcategoryDto>> allBlogcategory() {
		
		List<BlogcategoryDto> allDtos = service.allBlogcategory();
		
		return new ResponseEntity<>(allDtos,HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BlogcategoryDto> blogCatById(@PathVariable("id") int id) {
		
		BlogcategoryDto dto = service.blogcategoryById(id);
		
		return new ResponseEntity<>(dto,HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<BlogcategoryDto> update(@RequestBody BlogcategoryDto dto,@PathVariable("id") int id) {
		
		BlogcategoryDto createdDto = service.update(dto, id);
		
		return new ResponseEntity<>(createdDto,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> deleteBlogCategory(@PathVariable("id")int id) {
		
		service.delete(id);
		
		APIResponse api = new APIResponse();
		api.setMessage("BlogCategory Deleted");
		api.setSuccess("success");
		
		return new ResponseEntity<>(api,HttpStatus.OK);
		
	}

}
