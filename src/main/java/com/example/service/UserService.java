package com.example.service;

import java.util.List;

import com.example.dao.User;

public interface UserService {

	List<User> getUser(User user);

	User getUserById(Long id);

	User saveUser(User user);

	void deleteUser(Long id);

	

}
