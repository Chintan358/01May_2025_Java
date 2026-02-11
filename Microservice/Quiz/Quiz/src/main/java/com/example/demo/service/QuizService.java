package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Quiz;


public interface QuizService {
		
		public Quiz add(Quiz quiz);
		public List<Quiz> get();
		public Quiz get(int id);
		
}
