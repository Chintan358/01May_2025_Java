package com.example.demo.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BlogDto;
import com.example.demo.dto.UserDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Blog;
import com.example.demo.model.BlogCategory;
import com.example.demo.model.User;
import com.example.demo.repo.BlogCategoryRepo;
import com.example.demo.repo.BlogRepo;
import com.example.demo.repo.UserRepo;
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
	
	@Autowired
	BlogCategoryRepo blogCategoryRepo;
	
	@Autowired
	UserRepo repo;
	
	
	@Override
	public BlogDto addBlog(BlogDto blogDto, int catid, String username) {
		
		blogDto.setImage(null);
		blogDto.setUser(mapper.map(repo.findByUsername(username), UserDto.class));
		blogDto.setCategory(blogCategoryService.blogcategoryById(catid));	
		return mapper.map(blogRepo.save(mapper.map(blogDto, Blog.class)), BlogDto.class);
	}


	@Override
	public List<BlogDto> blogs() {
		
		List<Blog> blogs = blogRepo.findAll();
		List<BlogDto> dtos = blogs.stream().map(blog->mapper.map(blog, BlogDto.class)).collect(Collectors.toList());
		return dtos;
	}


	@Override
	public BlogDto blog(int id) {
		
		Blog b =  blogRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Blog", "Id", id));
		return mapper.map(b, BlogDto.class);
	}


	@Override
	public BlogDto updateBlog(BlogDto blogDto, int catid, int userid, int bid) {
		
		
		Blog b =  blogRepo.findById(bid).orElseThrow(()->new ResourceNotFoundException("Blog", "Id", bid));
		b.setTitle(blogDto.getTitle());
		b.setContent(blogDto.getContent());
		b.setCategory(mapper.map(blogCategoryService.blogcategoryById(catid), BlogCategory.class));
		b.setUser(mapper.map(userService.userById(userid), User.class));
		
		
		
		return mapper.map(blogRepo.save(b), BlogDto.class);
	}


	@Override
	public void deleteBlog(int bid) {
		// TODO Auto-generated method stub
		Blog b =  blogRepo.findById(bid).orElseThrow(()->new ResourceNotFoundException("Blog", "Id", bid));
		blogRepo.delete(b);
	}


	@Override
	public List<BlogDto> blogbyCategory(int catid) {
		
		List<Blog> blogs =  blogRepo.findByCategory(mapper.map(blogCategoryService.blogcategoryById(catid), BlogCategory.class));
		List<BlogDto> dtos = blogs.stream().map(blog->mapper.map(blog, BlogDto.class)).collect(Collectors.toList());
		
		return dtos;
	}


	@Override
	public List<BlogDto> blogByUser(int userid) {
		
		List<Blog> blogs =  blogRepo.findByUser(mapper.map(userService.userById(userid), User.class));
		List<BlogDto> dtos = blogs.stream().map(blog->mapper.map(blog, BlogDto.class)).collect(Collectors.toList());
		
		return dtos;

	}


	@Override
	public BlogDto uploadImage(BlogDto dto) {
		
		Blog b = mapper.map(dto, Blog.class);
		
		
		return mapper.map(blogRepo.save(b), BlogDto.class);
	}

	
}
