package com.onimaskesi.springUsersApi.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping("/update")
	public void update(@RequestBody User user) {
		userService.update(user);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody User user) {
		userService.delete(user);
	}

	@PostMapping("/login")
	public User login(@RequestParam("email") String email, @RequestParam("password") String password) {

		return userService.login(email, password);
	}

	@PostMapping("/signup")
	public String signup(@RequestBody User user) {

		return userService.signup(user);
	}
}
