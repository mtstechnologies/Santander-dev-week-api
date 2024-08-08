package com.mts.service;

import com.mts.domain.model.User;

public interface UserService {
	
	User findById(Long id);

	User create(User userToCreate);
	
	
}
