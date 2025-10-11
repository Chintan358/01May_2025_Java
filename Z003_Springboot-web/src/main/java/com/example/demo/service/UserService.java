package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
		public void addOrUpdateUser(User u);
		public List<User> allUsers();
		public User userById(int id);
		public void deleteUser(int id);
}
