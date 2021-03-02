package com.onimaskesi.springUsersApi.DataAccess;

import com.onimaskesi.springUsersApi.Entities.User;

public interface IUserDal {

	void update(User user);

	void delete(User user);

	User login(String email, String password);

	String signup(User user);

}
