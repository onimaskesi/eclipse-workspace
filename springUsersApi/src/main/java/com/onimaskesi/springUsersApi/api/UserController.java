package com.onimaskesi.springUsersApi.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onimaskesi.springUsersApi.Business.IUserService;
import com.onimaskesi.springUsersApi.Entities.User;

@RestController
@RequestMapping("/api")
public class UserController {

	private IUserService userService;

	public UserController(IUserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<User> get() {
		return userService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody User user) {
		userService.add(user);
	}

	@PostMapping("/update")
	public void update(@RequestBody User user) {
		userService.update(user);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody User user) {
		userService.delete(user);
	}
}
