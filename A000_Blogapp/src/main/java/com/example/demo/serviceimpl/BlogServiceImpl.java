package com.example.demo.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BlogDto;
import com.example.demo.model.Blog;
import com.example.demo.repo.BlogRepo;
import com.example.demo.service.BlogCategoryService;
import com.example.demo.service.BlogService;
import com.example.demo.service.UserService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepo blogRepo;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	UserService userService;
	
	@Autowired
	BlogCategoryService blogCategoryService;
	
	
	@Override
	public BlogDto addBlog(BlogDto blogDto, int catid, int userid) {
		
		blogDto.setImage(null);
		blogDto.setUser(userService.userById(userid));
		blogDto.setCategory(blogCategoryService.blogcategoryById(catid));	
		return mapper.map(blogRepo.save(mapper.map(blogDto, Blog.class)), BlogDto.class);
	}

	
}
