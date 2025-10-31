package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {
		
		public Category addCategory(Category c);
		public List<Category> viewCategory();
		public Category catByid(int id);
}
