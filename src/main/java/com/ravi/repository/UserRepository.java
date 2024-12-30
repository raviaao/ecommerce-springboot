package com.ravi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
