package com.mts.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	boolean existsByAccountNumber(String accountNumber);
}
