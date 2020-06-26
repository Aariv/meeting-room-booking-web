package com.sai.mrb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.mrb.model.Login;
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

	public boolean validateUser(Login login) {
		System.out.println("Inside Validate");
		boolean flag = false;
		User users = repo.findByname(login.getName());
		if (users == null) {
			flag = false;
		}
		if (users.getPassword().equals(login.getPassword())) {
			flag = true;
		}
		if (!users.getPassword().equals(login.getPassword())) {
			flag = false;
		}
		return flag;
	}

}
