package com.ravi.service;

import java.util.List;

import com.ravi.exception.ProductException;
import com.ravi.modal.Review;
import com.ravi.modal.User;
import com.ravi.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
