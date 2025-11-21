package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Blog;
import com.example.demo.model.BlogCategory;
import com.example.demo.model.User;

public interface BlogRepo extends JpaRepository<Blog, Integer> {

	public List<Blog> findByCategory(BlogCategory c);
	public List<Blog> findByUser(User u);
}
