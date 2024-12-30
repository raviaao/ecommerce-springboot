package com.ravi.service;

import java.util.List;

import com.ravi.exception.ProductException;
import com.ravi.modal.Rating;
import com.ravi.modal.User;
import com.ravi.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
