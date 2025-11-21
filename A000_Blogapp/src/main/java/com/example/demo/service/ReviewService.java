package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ReviewDto;

public interface ReviewService {

	public ReviewDto addReview(ReviewDto dto, int bid, int uid);
	public List<ReviewDto> reviews();
	public ReviewDto review(int id);
	public ReviewDto updateReview(ReviewDto dto, int rid);
	public void deleteReview(int id);
}
