package com.simplevaliation.validationprogram.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplevaliation.validationprogram.model.User;
import com.simplevaliation.validationprogram.repository.UserRepository;

@Service
public class CrudServices {
	
	@Autowired
	private UserRepository repo;
	
	public User save(User user) {
		return repo.save(user);
		
	}
	
	
	public List<User> getall(){
		return repo.findAll();
	}
	
	
	public Optional<User> getbyid(int id) {
		return repo.findById(id);
	}
	
	public void deleatByid(int id) {
		 repo.deleteById(id);
	}
	
	
	public User updated(User user) {
		
		User existuser= repo.findById(user.getId()).orElse(null);
		
		existuser.setUsername(user.getUsername());
		existuser.setPassword(user.getPassword());
		
		
		return repo.save(existuser);
		
		
		
	}

}
