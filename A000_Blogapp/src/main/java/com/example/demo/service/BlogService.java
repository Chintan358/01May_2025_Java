package com.example.demo.service;

import com.example.demo.dto.BlogDto;

public interface BlogService {
	
	public BlogDto addBlog(BlogDto blogDto, int catid, int userid);

}
