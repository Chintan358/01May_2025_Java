package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BlogcategoryDto;

public interface BlogCategoryService {
	
	public List<BlogcategoryDto> allBlogcategory();
	
	public BlogcategoryDto addBlgCategory(BlogcategoryDto dto);
	
	public BlogcategoryDto blogcategoryById(int id);
	
	public BlogcategoryDto update(BlogcategoryDto dto,int id);
	
	public void delete(int id);

}
