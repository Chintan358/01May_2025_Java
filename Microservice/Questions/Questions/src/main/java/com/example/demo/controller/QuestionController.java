package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@PostMapping("/question")
	public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
		Question question2 =  questionService.addQuestion(question);
		return new ResponseEntity<>(question2,HttpStatus.CREATED);
	}
	
	@GetMapping("/question")
	public ResponseEntity<List<Question>> allQuestion() {
		List<Question> allquestion = questionService.all();
		return new ResponseEntity<>(allquestion, HttpStatus.OK);
	}
	
	@GetMapping("/question/{id}")
	public ResponseEntity<Question> getById(@PathVariable("id") int id) {
		Question q = questionService.get(id);
		return new ResponseEntity<>(q, HttpStatus.OK);
	}
	
	@GetMapping("/question/quiz/{id}")
	public ResponseEntity<List<Question>> getbyquiz(@PathVariable("id") int id)
	{
		List<Question> allQ = questionService.byQuiz(id);
		return new ResponseEntity<>(allQ,HttpStatus.OK);
	}
	
}
