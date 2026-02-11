package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Quiz;
import com.example.demo.repo.QuizRepo;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	QuizRepo quizRepo;
	
	@Override
	public Quiz add(Quiz quiz) {
		
		return quizRepo.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		return quizRepo.findAll();
	}

	@Override
	public Quiz get(int id) {
		// TODO Auto-generated method stub
		return quizRepo.findById(id).orElseThrow();
	}

}
