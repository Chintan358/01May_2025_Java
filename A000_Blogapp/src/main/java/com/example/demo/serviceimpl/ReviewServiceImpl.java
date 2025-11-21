package com.example.demo.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ReviewDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Review;
import com.example.demo.repo.ReviewRepo;
import com.example.demo.service.BlogService;
import com.example.demo.service.ReviewService;
import com.example.demo.service.UserService;

@Service
public class ReviewServiceImpl  implements ReviewService{

	@Autowired
	ReviewRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	BlogService blogService;
	
	@Autowired
	UserService userService;
	
	@Override
	public ReviewDto addReview(ReviewDto dto, int bid, int uid) {
		// TODO Auto-generated method stub
		dto.setBlog(blogService.blog(bid));
		dto.setUser(userService.userById(uid));
		
		
		return mapper.map(repo.save(mapper.map(dto, Review.class)),ReviewDto.class);
	}

	@Override
	public List<ReviewDto> reviews() {
		List<Review> allReviews = repo.findAll();
		return allReviews.stream().map(review->mapper.map(review, ReviewDto.class)).collect(Collectors.toList());

	}

	@Override
	public ReviewDto review(int id) {
		
		Review review = repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Review", "ID", id));
	
		return mapper.map(review, ReviewDto.class);
	}

	@Override
	public ReviewDto updateReview(ReviewDto dto ,int rid) {
		
		Review review = repo.findById(rid).orElseThrow(()->new ResourceNotFoundException("Review", "ID", rid));
		review.setTitle(dto.getTitle());
		
		
		
		return mapper.map(repo.save(review), ReviewDto.class);
	}

	@Override
	public void deleteReview(int rid) {
		// TODO Auto-generated method stub
		Review review = repo.findById(rid).orElseThrow(()->new ResourceNotFoundException("Review", "ID", rid));
		repo.delete(review);
	}



}
