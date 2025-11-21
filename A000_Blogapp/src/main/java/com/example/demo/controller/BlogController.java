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

import com.example.demo.dto.BlogDto;
import com.example.demo.exception.APIResponse;
import com.example.demo.service.BlogService;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    private final BlogCatController blogCatController;

    private final UserController userController;
	
	@Autowired
	BlogService blogService;

    BlogController(UserController userController, BlogCatController blogCatController) {
        this.userController = userController;
        this.blogCatController = blogCatController;
    }

	@PostMapping("/category/{id}")
	public ResponseEntity<BlogDto> addBlog(@RequestBody BlogDto blogDto,@PathVariable("id") int id)
	{
		BlogDto createBlog =  blogService.addBlog(blogDto, id, 3);
		return new ResponseEntity<>(createBlog,HttpStatus.CREATED);
	}
	
	@GetMapping("")
	public ResponseEntity<List<BlogDto>> allblogs()
	{
		List<BlogDto> blogs = blogService.blogs();
		return new ResponseEntity<>(blogs,HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<BlogDto> blogByid(@PathVariable("id") int id)
	{
		BlogDto blogdto = blogService.blog(id);
		return new ResponseEntity<>(blogdto,HttpStatus.OK);
	}
	
	@PutMapping("/category/{cid}/{bid}")
	public ResponseEntity<BlogDto> updateBlog(@RequestBody BlogDto dto, @PathVariable("cid") int cid,@PathVariable("bid") int bid)
	{
		BlogDto blogdto = blogService.updateBlog(dto, cid, 1, bid);
		return new ResponseEntity<>(blogdto,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> deleteBlog(@PathVariable("id") int id)
	{
		blogService.deleteBlog(id);
		APIResponse resp = new APIResponse();
		resp.setMessage("blog deleted successfully");
		resp.setSuccess("True");
		return new ResponseEntity<>(resp,HttpStatus.OK);
	}
	
	@GetMapping("/category/{id}")
	public ResponseEntity<List<BlogDto>> blogbyCategory(@PathVariable("id") int id)
	{
		List<BlogDto> all = blogService.blogbyCategory(id);
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<List<BlogDto>> blogByUser(@PathVariable("id") int id)
	{
		List<BlogDto> all = blogService.blogByUser(id);
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
	

}
