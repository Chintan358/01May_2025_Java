package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BlogDto;
import com.example.demo.dto.UserDto;

public interface BlogService {
	
	public BlogDto addBlog(BlogDto blogDto, int catid, int userid);
	public List<BlogDto> blogs();
	public BlogDto blog(int id);
	public BlogDto updateBlog(BlogDto blogDto, int catid, int userid,int bid);
	public void deleteBlog(int id);
	public List<BlogDto> blogbyCategory(int catid);
	public List<BlogDto> blogByUser(int userid);
}
