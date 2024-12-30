package com.ravi.service;

import com.ravi.exception.UserException;
import com.ravi.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
