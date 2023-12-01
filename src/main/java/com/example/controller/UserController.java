package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/check")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/add")
	public int add() {
	int	a = 6;
	int	b = 9;
	int c=a+b;

		return c;
	}

	@RequestMapping("/getUser")
	public List<User> getUser(@RequestBody User user) {
		return userService.getUser(user);
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);

	}

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User updateUser) {
		User user = userService.getUserById(id);
		if (user != null) {
			user.setAddress(updateUser.getAddress());
			user.setEmail(updateUser.getEmail());
			user.setFirstName(updateUser.getFirstName());
			user.setLastName(updateUser.getLastName());

			return userService.saveUser(user);
		}
		return null;
	}

	@DeleteMapping("/id")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

}
