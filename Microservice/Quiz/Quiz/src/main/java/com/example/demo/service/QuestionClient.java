package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Question;



@FeignClient(name="QUESTIONS")
public interface QuestionClient {
		
		@GetMapping("/question/quiz/{id}")
		public List<Question> QuestionByQuiz(@PathVariable("id") int id);
}
