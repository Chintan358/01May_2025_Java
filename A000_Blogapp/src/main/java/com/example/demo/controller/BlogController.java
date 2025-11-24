package com.example.demo.controller;


import java.io.InputStream;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.BlogDto;
import com.example.demo.exception.APIResponse;
import com.example.demo.service.BlogService;
import com.example.demo.service.ImageService;

@RestController
@RequestMapping("/blogs")
public class BlogController {

   
	
	@Autowired
	BlogService blogService;
	
	@Autowired
	ImageService imageService;
	
	@Value("${project.image}")
	String path;

    

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
	
	@PostMapping("/upload/{blogid}")
	public ResponseEntity<BlogDto> uploadImage(@PathVariable("blogid") int blogid,
			@RequestParam("file") MultipartFile file
			)
	{
		String imagename =  imageService.uploadImage(path, file);
		BlogDto dto =   blogService.blog(blogid);
		dto.setImage(imagename);
		 BlogDto upladted =  blogService.uploadImage(dto);
		 return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	@GetMapping(produces = MediaType.IMAGE_JPEG_VALUE,value = "/image/{imgname}")
	public ResponseEntity<Resource> getImage(@PathVariable("imgname") String imagename)
	{
		InputStream is =  imageService.getImage(path, imagename);
		Resource resource = new InputStreamResource(is);
		return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(resource);
	}
	

}
