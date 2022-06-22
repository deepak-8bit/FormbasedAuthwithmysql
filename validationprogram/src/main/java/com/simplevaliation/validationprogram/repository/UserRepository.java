package com.simplevaliation.validationprogram.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplevaliation.validationprogram.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
	
	 Optional<User> findByUsername(String username);

}
