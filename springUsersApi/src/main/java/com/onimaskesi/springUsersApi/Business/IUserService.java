package com.onimaskesi.springUsersApi.Business;

import com.onimaskesi.springUsersApi.Entities.User;

public interface IUserService {

	void update(User user);

	void delete(User user);

	User login(String email, String password);

	String signup(User user);
}
