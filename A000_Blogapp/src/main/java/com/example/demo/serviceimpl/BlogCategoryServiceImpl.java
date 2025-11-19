package com.example.demo.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BlogcategoryDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.BlogCategory;
import com.example.demo.repo.BlogCategoryRepo;
import com.example.demo.service.BlogCategoryService;

@Service
public class BlogCategoryServiceImpl implements BlogCategoryService {

	@Autowired
	BlogCategoryRepo repo;
	
	@Autowired
	ModelMapper mapper;

	@Override
	public List<BlogcategoryDto> allBlogcategory() {
		// TODO Auto-generated method stub
		List<BlogCategory> categories = repo.findAll();
		List<BlogcategoryDto> categoryDto = 
				categories.stream().map((ele)->mapper.map(ele, BlogcategoryDto.class)).collect(Collectors.toList());
		
		return categoryDto;
	}

	@Override
	public BlogcategoryDto addBlgCategory(BlogcategoryDto dto) {
		// TODO Auto-generated method stub
		
		BlogCategory blgcat = mapper.map(dto, BlogCategory.class);
		repo.save(blgcat);
		
		return mapper.map(blgcat, BlogcategoryDto.class);
	}

	@Override
	public BlogcategoryDto blogcategoryById(int id) {
		// TODO Auto-generated method stub
		BlogCategory blogcategory = 
				repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("BlogCategory", "id", id));
		
		return mapper.map(blogcategory, BlogcategoryDto.class);
	}

	@Override
	public BlogcategoryDto update(BlogcategoryDto dto, int id) {
		// TODO Auto-generated method stub
		BlogCategory blogCategory = 
				repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("BlogCategory", "id", id));
		blogCategory.setName(dto.getName());
		
		BlogCategory updatedBlgcat = repo.save(blogCategory);
		
		return mapper.map(updatedBlgcat, BlogcategoryDto.class);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		BlogCategory blogCat = 
				repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("BlogCategory", "id", id));
		
		repo.deleteById(id);
		
	}

}
