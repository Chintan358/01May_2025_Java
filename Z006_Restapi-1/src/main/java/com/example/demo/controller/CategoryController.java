package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@RestController
public class CategoryController {
	
	
		@Autowired
		CategoryService categoryService;
		
		@Autowired
		ModelMapper modelMapper;
		
		@PostMapping("/categories")
		public ResponseEntity<CategoryDto> addCategory(@RequestBody Category c)
		{
			Category createdCategory =  categoryService.addCategory(c);
			
			CategoryDto dto = modelMapper.map(createdCategory, CategoryDto.class);
			
			return new ResponseEntity<>(dto,HttpStatus.CREATED);
		}
		
		
		@GetMapping("/categories")
		public ResponseEntity<List<CategoryDto>> viewCategory()
		{
			List<Category> categories = categoryService.viewCategory();
			
			List<CategoryDto> dtos = 
					categories.stream().map((category)->modelMapper.map(category, CategoryDto.class)).collect(Collectors.toList());
			
			return new ResponseEntity<>(dtos,HttpStatus.OK);
		}
		
		
//		public CategoryDto categoryToDto(Category c)
//		{
//			CategoryDto dt  =new CategoryDto();
//			dt.setId(c.getId());
//			dt.setName(c.getName());
//			
//			modelMapper.map(c,CategoryDto.class);
//			
//			return dt;
//		}
		
		
		
		
}
