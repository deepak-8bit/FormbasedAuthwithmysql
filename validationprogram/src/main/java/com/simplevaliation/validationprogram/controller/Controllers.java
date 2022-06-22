package com.simplevaliation.validationprogram.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplevaliation.validationprogram.model.User;
import com.simplevaliation.validationprogram.service.CrudServices;



@RestController
public class Controllers {
	
	@Autowired
  private CrudServices service;
	
	
	@RequestMapping("/hello")
	private String login()
	{
		return "login";
	}
	
	@PostMapping("/save")
	public User saveuser(@RequestBody User user) {
		return service.save(user);
	}
	
	@GetMapping("/users")
	public List<User> getalluser(){
		return service.getall();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getbyids(@PathVariable int id) {
		return service.getbyid(id);
	}
	
	@DeleteMapping("/delete")
	public String deletebyid(@PathVariable int id) {
		 service.deleatByid(id);
		 
		 return "delete success ==="+id;
	}
	
	@PatchMapping("/update")
	public User updated(@RequestBody User user) {
		return service.updated(user);
	}
	

}
