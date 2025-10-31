package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

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
		
		@PostMapping("/categories")
		public ResponseEntity<CategoryDto> addCategory(@RequestBody Category c)
		{
			Category createdCategory =  categoryService.addCategory(c);
			
			CategoryDto dto = categoryToDto(createdCategory);
			
			return new ResponseEntity<>(dto,HttpStatus.CREATED);
		}
		
		
		@GetMapping("/categories")
		public ResponseEntity<List<CategoryDto>> viewCategory()
		{
			List<Category> categories = categoryService.viewCategory();
			
			List<CategoryDto> dtos = new ArrayList<>();
			
			for(Category c  :categories)
			{
				CategoryDto dt  = categoryToDto(c);
				dtos.add(dt);
			}
			
			
			return new ResponseEntity<>(dtos,HttpStatus.OK);
		}
		
		
		public static CategoryDto categoryToDto(Category c)
		{
			CategoryDto dt  =new CategoryDto();
			dt.setId(c.getId());
			dt.setName(c.getName());
			
			return dt;
		}
		
		
		
		
}
