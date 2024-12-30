package com.ravi.service;

import com.ravi.exception.ProductException;
import com.ravi.modal.Cart;
import com.ravi.modal.CartItem;
import com.ravi.modal.User;
import com.ravi.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
