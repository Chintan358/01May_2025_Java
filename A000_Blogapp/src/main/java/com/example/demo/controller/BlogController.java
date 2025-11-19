package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BlogDto;
import com.example.demo.service.BlogService;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    private final UserController userController;
	
	@Autowired
	BlogService blogService;

    BlogController(UserController userController) {
        this.userController = userController;
    }

	@PostMapping("/category/{id}")
	public ResponseEntity<BlogDto> addBlog(@RequestBody BlogDto blogDto,@PathVariable("id") int id)
	{
		BlogDto createBlog =  blogService.addBlog(blogDto, id, 1);
		return new ResponseEntity<>(createBlog,HttpStatus.CREATED);
	}

}
