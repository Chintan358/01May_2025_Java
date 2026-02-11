package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer>  {
	
	public List<Question> findByQuizId(int qid);
}
