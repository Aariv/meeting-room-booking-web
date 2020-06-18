package com.sai.mrb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sai.mrb.model.User;
import com.sai.mrb.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> listAll() {
		return (List<User>) repo.findAll();
	}
	
	public User addUser(User user) {
		user = repo.save(user);
		
		return user;
	}

}
