package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ReviewDto;
import com.example.demo.exception.APIResponse;
import com.example.demo.service.ReviewService;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

	@Autowired
	ReviewService reviewService;

	@PostMapping("/blog/{id}")
	public ResponseEntity<ReviewDto> addReview(@RequestBody ReviewDto dto, @PathVariable("id") int bid) {
		ReviewDto created = reviewService.addReview(dto, bid, 3);
		return new ResponseEntity<>(created, HttpStatus.CREATED);
	}

	@GetMapping("")
	public ResponseEntity<List<ReviewDto>> allReview() {
		List<ReviewDto> reviews = reviewService.reviews();
		return new ResponseEntity<>(reviews, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ReviewDto> reviewById(@PathVariable("id") int id) {
		ReviewDto dto = reviewService.review(id);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PutMapping("/{rid}")
	public ResponseEntity<ReviewDto> update(@RequestBody ReviewDto dto, @PathVariable("rid") int rid) {
		ReviewDto updatedDto = reviewService.updateReview(dto, rid);
		return new ResponseEntity<>(updatedDto, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse> delete(@PathVariable("id") int id) {
		reviewService.deleteReview(id);
		
		APIResponse resp = new APIResponse();
		resp.setMessage("review deleted successfully");
		resp.setSuccess("True");
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}

}
